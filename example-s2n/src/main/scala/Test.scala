import s2n.functions.*
import s2n.types.*

import scalanative.unsafe.*

@main def hello_s2n =
  val init = s2n_init()
  if init == 0 then println("Ah ok amigo")
  else println(fromCString(s2n_strerror(init, c"EN")))
