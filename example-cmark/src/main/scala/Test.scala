import cmark.types.*
import cmark.functions.*

import scala.scalanative.unsafe.*
import scala.scalanative.libc.*
import scala.scalanative.libc

@main def hello =
  Zone:
    val str = toCString(
      """
    |# Hello!
    |
    |*stuff*
    |## yo
    |```scala
    |val x = 1
    |```
    |### hi
    """.stripMargin
    )

    val node = cmark_parse_document(str, libc.string.strlen(str), 0)

    def iterateNodes(node: Ptr[cmark_node]): Unit =
      def go(nd: Ptr[cmark_node]): Unit =
        val iter = cmark_iter_new(nd)
        var ev_type: cmark_event_type = cmark_event_type.CMARK_EVENT_NONE

        while {
            ev_type = cmark_iter_next(iter); ev_type
          } != cmark_event_type.CMARK_EVENT_DONE
        do
          val cur = cmark_iter_get_node(iter)
          
          // stdio.printf(
          //   c"Node: %s, ev_type: %d, address: %p \n",
          //   // cmark_node_get_type_string(cur),
          //   ev_type,
          //   // cur
          // )

          println(s"Node: ${fromCString(cmark_node_get_type_string(cur))}, ev_type: ${ev_type}, address: ${cur}")

        end while

      end go

      go(node)
    end iterateNodes

    iterateNodes(node)
