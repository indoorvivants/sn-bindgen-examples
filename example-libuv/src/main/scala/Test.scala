import libuv.functions.*
import libuv.types.*

import scalanative.unsafe.*
import scalanative.unsigned.*
import scalanative.libc.*

@main def hello =
  given Zone = Zone.open()

  val loop = alloc[uv_loop_t]()
  uv_loop_init(loop)

  inline def setTimer(inline delay: Int) =
    val timer = stackalloc[uv_timer_t]()
    uv_timer_init(loop, timer)
    val cb = uv_timer_cb {
      CFuncPtr1.fromScalaFunction { (t: Ptr[uv_timer_t]) =>
        println(s"hello $delay")
      }
    }
    uv_timer_start(timer, cb, delay.toULong, 0.toULong)
  end setTimer

  setTimer(500)
  setTimer(600)
  setTimer(1000)

  uv_run(loop, uv_run_mode.UV_RUN_DEFAULT)

  uv_loop_close(loop)
end hello
