import scalanative.unsafe.*
import scalanative.unsigned.*

import lua.types.*
import lua.functions.*

@main def hello =
  Zone { implicit z =>
    val stats = alloc[CStruct2[Long, Long]](1)

    val luaAllocator = lua_Alloc.apply {
      CFuncPtr4.fromScalaFunction { (ud, ptr, osize, nsize) =>
        val state = ud.asInstanceOf[Ptr[CStruct2[Long, Long]]]

        if nsize == 0.toULong then
          (!state)._2 = (!state)._2 + osize.value.toLong
          scalanative.libc.stdlib.free(ptr)
          null
        else
          (!state)._1 = (!state)._1 + nsize.value.toLong
          scalanative.libc.stdlib.realloc(ptr, nsize.value)
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

          sum = sum + lua_tointegerx(L, i, null).asInstanceOf[Long]

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
      0L.asInstanceOf[lua_KContext],
      lua_KFunction(null)
    )

    lua_close(state)

    println(
      s"Lua execution allocated ${(!stats)._1} bytes and deallocated ${(!stats)._2}"
    )
  }
end hello
