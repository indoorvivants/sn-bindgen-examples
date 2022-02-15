import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.string.strlen
import scala.scalanative.libc.stdio

import treesitter.functions.*
import treesitter.types.*

def tree_sitter_scala(): Ptr[TSLanguage] = extern

@main def hello_tree_sitter =
  Zone { implicit z =>
    val parser = ts_parser_new();
    ts_parser_set_language(parser, tree_sitter_scala())

    val source = c"""
      object Hello {
        def main(args: Array[String]) = println("yo!")
      }
      """

    val tree =
      ts_parser_parse_string(
        parser,
        null,
        source,
        strlen(source).toUInt
      )

    val root_node = ts_tree_root_node(tree)

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
