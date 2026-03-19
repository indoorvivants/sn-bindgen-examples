import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.string.strlen
import scala.scalanative.libc.stdio

import treesitter.functions.*
import treesitter.types.*

def tree_sitter_scala(): Ptr[TSLanguage] = extern

@main def hello_tree_sitter =
  Zone {
    val parser = ts_parser_new();
    val lang = tree_sitter_scala()
    ts_parser_set_language(parser, lang)

    val source = c"""
      object Hello:
        def main(args: Array[String]) = 
          for 
            x <- 1 to 20
          do 
            println("yo!")
      """

    val tree =
      ts_parser_parse_string(
        parser,
        null,
        source,
        strlen(source).toUInt
      )

    val root_node = ts_tree_root_node(tree)

    val newValue = c"(type_identifier) @type"
    val erroffset = stackalloc[UInt]()
    val err = stackalloc[TSQueryError]()
    val query =
      ts_query_new(
        lang,
        newValue,
        strlen(newValue).toUInt,
        erroffset,
        err
      )

    val cursor = ts_query_cursor_new()
    ts_query_cursor_exec(cursor, query, root_node);

    val mtch = stackalloc[TSQueryMatch]()
    var hasNext = true
    while { hasNext = ts_query_cursor_next_match(cursor, mtch); hasNext } do
      val captures = !((!mtch).captures)
      val node = captures.node
      println(fromCString(ts_node_type(node)))

    def printChildren(start: TSNode): Unit =
      def go(node: TSNode, level: Int): Unit =
        val nodeType = fromCString(ts_node_type(node))
        print(" " * level)
        println(nodeType)
        // asInstanceOf is a bug in codegen
        val childrenCount = ts_node_child_count(node)
        if childrenCount != 0.toUInt then
          for childId <- 0 until childrenCount.toInt do
            val childNode =
              ts_node_child(node, childId.toUInt)
            go(childNode, level + 1)
      end go

      go(start, 0)
    end printChildren

    printChildren(root_node)
  }
