import libsodium.functions.*
import libsodium.types.*

import scalanative.unsafe.*

@main def hello =
  Zone:
    val buf = alloc[Char]()
    println("yp")
