import scalanative.unsafe.*
import scalanative.unsigned.*

import lua.types.*
import lua.functions.*
import lua.aliases.lua_KContext

@main def hello =
  Zone:
    val stats = alloc[CStruct2[Long, Long]](1)

    val luaAllocator = lua_Alloc.apply {
      CFuncPtr4.fromScalaFunction { (ud, ptr, osize, nsize) =>
        val state = ud.asInstanceOf[Ptr[CStruct2[Long, Long]]]

        if nsize.toInt == 0 then
          (!state)._2 = (!state)._2 + osize.toLong
          scalanative.libc.stdlib.free(ptr)
          null
        else
          (!state)._1 = (!state)._1 + nsize.toLong
          scalanative.libc.stdlib.realloc(ptr, nsize)
      }
    }

    val state = lua_newstate(luaAllocator, stats.asInstanceOf[Ptr[Byte]])

    luaL_openlibs(state)

    val scalaSum = lua_CFunction {
      CFuncPtr1.fromScalaFunction { L =>
        val numberOfArguments = lua_gettop(L)

        var sum = 0L

        for i <- 1 to numberOfArguments do
          if lua_isnumber(L, i) != 1 then
            lua_pushstring(L, c"incorrect argument")
            lua_error(L)

          sum = sum + lua_tointegerx(L, i, null).value

        lua_pushnumber(L, lua_Number(sum))

        1
      }
    }

    val luaCode = c"""
  for i = 1, 10, 1 do
    print("1 + 42 + ", i, " = ", scalaSum(1, 42, i))
  end
  """

    // register our function under the name of `scalaSum`
    lua_pushcclosure(state, scalaSum, 0)
    lua_setglobal(state, c"scalaSum")

    val str = luaL_loadstring(state, luaCode)

    lua_pcallk(
      state,
      0,
      -1,
      0,
      0L.toSize.asInstanceOf[lua_KContext],
      lua_KFunction(null)
    )
    sys.exit(0)

    lua_close(state)

    println(
      s"Lua execution allocated ${(!stats)._1} bytes and deallocated ${(!stats)._2}"
    )
end hello
