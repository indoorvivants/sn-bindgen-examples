package cmark

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[cmark] trait CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
      inline def int: CInt = eq.apply(t).toInt
      inline def uint: CUnsignedInt = eq.apply(t)
      inline def value: CUnsignedInt = eq.apply(t)

object enumerations:
  import predef.*

  /** */
  opaque type cmark_delim_type = CUnsignedInt
  object cmark_delim_type extends CEnumU[cmark_delim_type]:
    given _tag: Tag[cmark_delim_type] = Tag.UInt
    inline def define(inline a: Long): cmark_delim_type = a.toUInt
    val CMARK_NO_DELIM = define(0)
    val CMARK_PERIOD_DELIM = define(1)
    val CMARK_PAREN_DELIM = define(2)
    inline def getName(inline value: cmark_delim_type): Option[String] =
      inline value match
        case CMARK_NO_DELIM     => Some("CMARK_NO_DELIM")
        case CMARK_PERIOD_DELIM => Some("CMARK_PERIOD_DELIM")
        case CMARK_PAREN_DELIM  => Some("CMARK_PAREN_DELIM")
        case _                  => None
    extension (a: cmark_delim_type)
      inline def &(b: cmark_delim_type): cmark_delim_type = a & b
      inline def |(b: cmark_delim_type): cmark_delim_type = a | b
      inline def is(b: cmark_delim_type): Boolean = (a & b) == b
  end cmark_delim_type

  /** ## Iterator
    */
  opaque type cmark_event_type = CUnsignedInt
  object cmark_event_type extends CEnumU[cmark_event_type]:
    given _tag: Tag[cmark_event_type] = Tag.UInt
    inline def define(inline a: Long): cmark_event_type = a.toUInt
    val CMARK_EVENT_NONE = define(0)
    val CMARK_EVENT_DONE = define(1)
    val CMARK_EVENT_ENTER = define(2)
    val CMARK_EVENT_EXIT = define(3)
    inline def getName(inline value: cmark_event_type): Option[String] =
      inline value match
        case CMARK_EVENT_NONE  => Some("CMARK_EVENT_NONE")
        case CMARK_EVENT_DONE  => Some("CMARK_EVENT_DONE")
        case CMARK_EVENT_ENTER => Some("CMARK_EVENT_ENTER")
        case CMARK_EVENT_EXIT  => Some("CMARK_EVENT_EXIT")
        case _                 => None
    extension (a: cmark_event_type)
      inline def &(b: cmark_event_type): cmark_event_type = a & b
      inline def |(b: cmark_event_type): cmark_event_type = a | b
      inline def is(b: cmark_event_type): Boolean = (a & b) == b
  end cmark_event_type

  /** */
  opaque type cmark_list_type = CUnsignedInt
  object cmark_list_type extends CEnumU[cmark_list_type]:
    given _tag: Tag[cmark_list_type] = Tag.UInt
    inline def define(inline a: Long): cmark_list_type = a.toUInt
    val CMARK_NO_LIST = define(0)
    val CMARK_BULLET_LIST = define(1)
    val CMARK_ORDERED_LIST = define(2)
    inline def getName(inline value: cmark_list_type): Option[String] =
      inline value match
        case CMARK_NO_LIST      => Some("CMARK_NO_LIST")
        case CMARK_BULLET_LIST  => Some("CMARK_BULLET_LIST")
        case CMARK_ORDERED_LIST => Some("CMARK_ORDERED_LIST")
        case _                  => None
    extension (a: cmark_list_type)
      inline def &(b: cmark_list_type): cmark_list_type = a & b
      inline def |(b: cmark_list_type): cmark_list_type = a | b
      inline def is(b: cmark_list_type): Boolean = (a & b) == b
  end cmark_list_type

  /** ## Node Structure
    */
  opaque type cmark_node_type = CUnsignedInt
  object cmark_node_type extends CEnumU[cmark_node_type]:
    given _tag: Tag[cmark_node_type] = Tag.UInt
    inline def define(inline a: Long): cmark_node_type = a.toUInt
    val CMARK_NODE_NONE = define(0)
    val CMARK_NODE_DOCUMENT = define(1)
    val CMARK_NODE_BLOCK_QUOTE = define(2)
    val CMARK_NODE_LIST = define(3)
    val CMARK_NODE_ITEM = define(4)
    val CMARK_NODE_CODE_BLOCK = define(5)
    val CMARK_NODE_HTML_BLOCK = define(6)
    val CMARK_NODE_CUSTOM_BLOCK = define(7)
    val CMARK_NODE_PARAGRAPH = define(8)
    val CMARK_NODE_HEADING = define(9)
    val CMARK_NODE_THEMATIC_BREAK = define(10)
    val CMARK_NODE_FIRST_BLOCK = define(1)
    val CMARK_NODE_LAST_BLOCK = define(10)
    val CMARK_NODE_TEXT = define(11)
    val CMARK_NODE_SOFTBREAK = define(12)
    val CMARK_NODE_LINEBREAK = define(13)
    val CMARK_NODE_CODE = define(14)
    val CMARK_NODE_HTML_INLINE = define(15)
    val CMARK_NODE_CUSTOM_INLINE = define(16)
    val CMARK_NODE_EMPH = define(17)
    val CMARK_NODE_STRONG = define(18)
    val CMARK_NODE_LINK = define(19)
    val CMARK_NODE_IMAGE = define(20)
    val CMARK_NODE_FIRST_INLINE = define(11)
    val CMARK_NODE_LAST_INLINE = define(20)
    inline def getName(inline value: cmark_node_type): Option[String] =
      inline value match
        case CMARK_NODE_NONE           => Some("CMARK_NODE_NONE")
        case CMARK_NODE_DOCUMENT       => Some("CMARK_NODE_DOCUMENT")
        case CMARK_NODE_BLOCK_QUOTE    => Some("CMARK_NODE_BLOCK_QUOTE")
        case CMARK_NODE_LIST           => Some("CMARK_NODE_LIST")
        case CMARK_NODE_ITEM           => Some("CMARK_NODE_ITEM")
        case CMARK_NODE_CODE_BLOCK     => Some("CMARK_NODE_CODE_BLOCK")
        case CMARK_NODE_HTML_BLOCK     => Some("CMARK_NODE_HTML_BLOCK")
        case CMARK_NODE_CUSTOM_BLOCK   => Some("CMARK_NODE_CUSTOM_BLOCK")
        case CMARK_NODE_PARAGRAPH      => Some("CMARK_NODE_PARAGRAPH")
        case CMARK_NODE_HEADING        => Some("CMARK_NODE_HEADING")
        case CMARK_NODE_THEMATIC_BREAK => Some("CMARK_NODE_THEMATIC_BREAK")
        case CMARK_NODE_FIRST_BLOCK    => Some("CMARK_NODE_FIRST_BLOCK")
        case CMARK_NODE_LAST_BLOCK     => Some("CMARK_NODE_LAST_BLOCK")
        case CMARK_NODE_TEXT           => Some("CMARK_NODE_TEXT")
        case CMARK_NODE_SOFTBREAK      => Some("CMARK_NODE_SOFTBREAK")
        case CMARK_NODE_LINEBREAK      => Some("CMARK_NODE_LINEBREAK")
        case CMARK_NODE_CODE           => Some("CMARK_NODE_CODE")
        case CMARK_NODE_HTML_INLINE    => Some("CMARK_NODE_HTML_INLINE")
        case CMARK_NODE_CUSTOM_INLINE  => Some("CMARK_NODE_CUSTOM_INLINE")
        case CMARK_NODE_EMPH           => Some("CMARK_NODE_EMPH")
        case CMARK_NODE_STRONG         => Some("CMARK_NODE_STRONG")
        case CMARK_NODE_LINK           => Some("CMARK_NODE_LINK")
        case CMARK_NODE_IMAGE          => Some("CMARK_NODE_IMAGE")
        case CMARK_NODE_FIRST_INLINE   => Some("CMARK_NODE_FIRST_INLINE")
        case CMARK_NODE_LAST_INLINE    => Some("CMARK_NODE_LAST_INLINE")
        case _                         => None
    extension (a: cmark_node_type)
      inline def &(b: cmark_node_type): cmark_node_type = a & b
      inline def |(b: cmark_node_type): cmark_node_type = a | b
      inline def is(b: cmark_node_type): Boolean = (a & b) == b
  end cmark_node_type
end enumerations

object aliases:
  import _root_.cmark.enumerations.*
  import _root_.cmark.predef.*
  import _root_.cmark.aliases.*
  import _root_.cmark.structs.*
  type FILE = libc.stdio.FILE
  object FILE:
    val _tag: Tag[FILE] = summon[Tag[libc.stdio.FILE]]
    inline def apply(inline o: libc.stdio.FILE): FILE = o
    extension (v: FILE) inline def value: libc.stdio.FILE = v

  type size_t = libc.stddef.size_t
  object size_t:
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t) inline def value: libc.stddef.size_t = v
end aliases

object structs:
  import _root_.cmark.enumerations.*
  import _root_.cmark.predef.*
  import _root_.cmark.aliases.*
  import _root_.cmark.structs.*

  /** */
  opaque type cmark_iter = CStruct0
  object cmark_iter:
    given _tag: Tag[cmark_iter] = Tag.materializeCStruct0Tag

  /** Defines the memory allocation functions to be used by CMark when parsing
    * and allocating a document tree
    */
  opaque type cmark_mem =
    CStruct3[CFuncPtr2[size_t, size_t, Ptr[Byte]], CFuncPtr2[Ptr[
      Byte
    ], size_t, Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit]]
  object cmark_mem:
    given _tag: Tag[cmark_mem] = Tag.materializeCStruct3Tag[CFuncPtr2[
      size_t,
      size_t,
      Ptr[Byte]
    ], CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit]]
    def apply()(using Zone): Ptr[cmark_mem] =
      scala.scalanative.unsafe.alloc[cmark_mem](1)
    def apply(
        calloc: CFuncPtr2[size_t, size_t, Ptr[Byte]],
        realloc: CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]],
        free: CFuncPtr1[Ptr[Byte], Unit]
    )(using Zone): Ptr[cmark_mem] =
      val ____ptr = apply()
      (!____ptr).calloc = calloc
      (!____ptr).realloc = realloc
      (!____ptr).free = free
      ____ptr
    end apply
    extension (struct: cmark_mem)
      def calloc: CFuncPtr2[size_t, size_t, Ptr[Byte]] = struct._1
      def calloc_=(value: CFuncPtr2[size_t, size_t, Ptr[Byte]]): Unit =
        !struct.at1 = value
      def realloc: CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]] = struct._2
      def realloc_=(value: CFuncPtr2[Ptr[Byte], size_t, Ptr[Byte]]): Unit =
        !struct.at2 = value
      def free: CFuncPtr1[Ptr[Byte], Unit] = struct._3
      def free_=(value: CFuncPtr1[Ptr[Byte], Unit]): Unit = !struct.at3 = value
  end cmark_mem

  /** */
  opaque type cmark_node = CStruct0
  object cmark_node:
    given _tag: Tag[cmark_node] = Tag.materializeCStruct0Tag

  /** */
  opaque type cmark_parser = CStruct0
  object cmark_parser:
    given _tag: Tag[cmark_parser] = Tag.materializeCStruct0Tag
end structs

@extern
private[cmark] object extern_functions:
  import _root_.cmark.enumerations.*
  import _root_.cmark.predef.*
  import _root_.cmark.aliases.*
  import _root_.cmark.structs.*

  /** Consolidates adjacent text nodes.
    */
  def cmark_consolidate_text_nodes(root: Ptr[cmark_node]): Unit = extern

  /** Returns a pointer to the default memory allocator.
    */
  def cmark_get_default_mem_allocator(): Ptr[cmark_mem] = extern

  /** Frees the memory allocated for an iterator.
    */
  def cmark_iter_free(iter: Ptr[cmark_iter]): Unit = extern

  /** Returns the current event type.
    */
  def cmark_iter_get_event_type(iter: Ptr[cmark_iter]): cmark_event_type =
    extern

  /** Returns the current node.
    */
  def cmark_iter_get_node(iter: Ptr[cmark_iter]): Ptr[cmark_node] = extern

  /** Returns the root node.
    */
  def cmark_iter_get_root(iter: Ptr[cmark_iter]): Ptr[cmark_node] = extern

  /** Creates a new iterator starting at 'root'. The current node and event type
    * are undefined until 'cmark_iter_next' is called for the first time. The
    * memory allocated for the iterator should be released using
    * 'cmark_iter_free' when it is no longer needed.
    */
  def cmark_iter_new(root: Ptr[cmark_node]): Ptr[cmark_iter] = extern

  /** Advances to the next node and returns the event type (`CMARK_EVENT_ENTER`,
    * `CMARK_EVENT_EXIT` or `CMARK_EVENT_DONE`).
    */
  def cmark_iter_next(iter: Ptr[cmark_iter]): cmark_event_type = extern

  /** Resets the iterator so that the current node is 'current' and the event
    * type is 'event_type'. The new current node must be a descendant of the
    * root node or the root node itself.
    */
  def cmark_iter_reset(
      iter: Ptr[cmark_iter],
      current: Ptr[cmark_node],
      event_type: cmark_event_type
  ): Unit = extern

  /** Convert 'text' (assumed to be a UTF-8 encoded string with length 'len')
    * from CommonMark Markdown to HTML, returning a null-terminated,
    * UTF-8-encoded string. It is the caller's responsibility to free the
    * returned buffer.
    */
  def cmark_markdown_to_html(
      text: CString,
      len: size_t,
      options: CInt
  ): CString = extern

  /** Adds 'child' to the end of the children of 'node'. Returns 1 on success, 0
    * on failure.
    */
  def cmark_node_append_child(
      node: Ptr[cmark_node],
      child: Ptr[cmark_node]
  ): CInt = extern

  /** Returns the first child of 'node', or NULL if 'node' has no children.
    */
  def cmark_node_first_child(node: Ptr[cmark_node]): Ptr[cmark_node] = extern

  /** Frees the memory allocated for a node and any children.
    */
  def cmark_node_free(node: Ptr[cmark_node]): Unit = extern

  /** Returns the column at which 'node' ends.
    */
  def cmark_node_get_end_column(node: Ptr[cmark_node]): CInt = extern

  /** Returns the line on which 'node' ends.
    */
  def cmark_node_get_end_line(node: Ptr[cmark_node]): CInt = extern

  /** Returns the info string from a fenced code block.
    */
  def cmark_node_get_fence_info(node: Ptr[cmark_node]): CString = extern

  /** Returns the heading level of 'node', or 0 if 'node' is not a heading.
    */
  def cmark_node_get_heading_level(node: Ptr[cmark_node]): CInt = extern

  /** Returns the list delimiter type of 'node', or `CMARK_NO_DELIM` if 'node'
    * is not a list.
    */
  def cmark_node_get_list_delim(node: Ptr[cmark_node]): cmark_delim_type =
    extern

  /** Returns starting number of 'node', if it is an ordered list, otherwise 0.
    */
  def cmark_node_get_list_start(node: Ptr[cmark_node]): CInt = extern

  /** Returns 1 if 'node' is a tight list, 0 otherwise.
    */
  def cmark_node_get_list_tight(node: Ptr[cmark_node]): CInt = extern

  /** Returns the list type of 'node', or `CMARK_NO_LIST` if 'node' is not a
    * list.
    */
  def cmark_node_get_list_type(node: Ptr[cmark_node]): cmark_list_type = extern

  /** Returns the string contents of 'node', or an empty string if none is set.
    * Returns NULL if called on a node that does not have string content.
    */
  def cmark_node_get_literal(node: Ptr[cmark_node]): CString = extern

  /** Returns the literal "on enter" text for a custom 'node', or an empty
    * string if no on_enter is set. Returns NULL if called on a non-custom node.
    */
  def cmark_node_get_on_enter(node: Ptr[cmark_node]): CString = extern

  /** Returns the literal "on exit" text for a custom 'node', or an empty string
    * if no on_exit is set. Returns NULL if called on a non-custom node.
    */
  def cmark_node_get_on_exit(node: Ptr[cmark_node]): CString = extern

  /** Returns the column at which 'node' begins.
    */
  def cmark_node_get_start_column(node: Ptr[cmark_node]): CInt = extern

  /** Returns the line on which 'node' begins.
    */
  def cmark_node_get_start_line(node: Ptr[cmark_node]): CInt = extern

  /** Returns the title of a link or image 'node', or an empty string if no
    * title is set. Returns NULL if called on a node that is not a link or
    * image.
    */
  def cmark_node_get_title(node: Ptr[cmark_node]): CString = extern

  /** Returns the type of 'node', or `CMARK_NODE_NONE` on error.
    */
  def cmark_node_get_type(node: Ptr[cmark_node]): cmark_node_type = extern

  /** Like 'cmark_node_get_type', but returns a string representation of the
    * type, or `"<unknown>"`.
    */
  def cmark_node_get_type_string(node: Ptr[cmark_node]): CString = extern

  /** Returns the URL of a link or image 'node', or an empty string if no URL is
    * set. Returns NULL if called on a node that is not a link or image.
    */
  def cmark_node_get_url(node: Ptr[cmark_node]): CString = extern

  /** Returns the user data of 'node'.
    */
  def cmark_node_get_user_data(node: Ptr[cmark_node]): Ptr[Byte] = extern

  /** Inserts 'sibling' after 'node'. Returns 1 on success, 0 on failure.
    */
  def cmark_node_insert_after(
      node: Ptr[cmark_node],
      sibling: Ptr[cmark_node]
  ): CInt = extern

  /** Inserts 'sibling' before 'node'. Returns 1 on success, 0 on failure.
    */
  def cmark_node_insert_before(
      node: Ptr[cmark_node],
      sibling: Ptr[cmark_node]
  ): CInt = extern

  /** Returns the last child of 'node', or NULL if 'node' has no children.
    */
  def cmark_node_last_child(node: Ptr[cmark_node]): Ptr[cmark_node] = extern

  /** Creates a new node of type 'type'. Note that the node may have other
    * required properties, which it is the caller's responsibility to assign.
    */
  def cmark_node_new(`type`: cmark_node_type): Ptr[cmark_node] = extern

  /** Same as `cmark_node_new`, but explicitly listing the memory allocator used
    * to allocate the node. Note: be sure to use the same allocator for every
    * node in a tree, or bad things can happen.
    */
  def cmark_node_new_with_mem(
      `type`: cmark_node_type,
      mem: Ptr[cmark_mem]
  ): Ptr[cmark_node] = extern

  /** Returns the next node in the sequence after 'node', or NULL if there is
    * none.
    */
  def cmark_node_next(node: Ptr[cmark_node]): Ptr[cmark_node] = extern

  /** Returns the parent of 'node', or NULL if there is none.
    */
  def cmark_node_parent(node: Ptr[cmark_node]): Ptr[cmark_node] = extern

  /** Adds 'child' to the beginning of the children of 'node'. Returns 1 on
    * success, 0 on failure.
    */
  def cmark_node_prepend_child(
      node: Ptr[cmark_node],
      child: Ptr[cmark_node]
  ): CInt = extern

  /** Returns the previous node in the sequence after 'node', or NULL if there
    * is none.
    */
  def cmark_node_previous(node: Ptr[cmark_node]): Ptr[cmark_node] = extern

  /** Replaces 'oldnode' with 'newnode' and unlinks 'oldnode' (but does not free
    * its memory). Returns 1 on success, 0 on failure.
    */
  def cmark_node_replace(
      oldnode: Ptr[cmark_node],
      newnode: Ptr[cmark_node]
  ): CInt = extern

  /** Sets the info string in a fenced code block, returning 1 on success and 0
    * on failure.
    */
  def cmark_node_set_fence_info(node: Ptr[cmark_node], info: CString): CInt =
    extern

  /** Sets the heading level of 'node', returning 1 on success and 0 on error.
    */
  def cmark_node_set_heading_level(node: Ptr[cmark_node], level: CInt): CInt =
    extern

  /** Sets the list delimiter type of 'node', returning 1 on success and 0 on
    * error.
    */
  def cmark_node_set_list_delim(
      node: Ptr[cmark_node],
      delim: cmark_delim_type
  ): CInt = extern

  /** Sets starting number of 'node', if it is an ordered list. Returns 1 on
    * success, 0 on failure.
    */
  def cmark_node_set_list_start(node: Ptr[cmark_node], start: CInt): CInt =
    extern

  /** Sets the "tightness" of a list. Returns 1 on success, 0 on failure.
    */
  def cmark_node_set_list_tight(node: Ptr[cmark_node], tight: CInt): CInt =
    extern

  /** Sets the list type of 'node', returning 1 on success and 0 on error.
    */
  def cmark_node_set_list_type(
      node: Ptr[cmark_node],
      `type`: cmark_list_type
  ): CInt = extern

  /** Sets the string contents of 'node'. Returns 1 on success, 0 on failure.
    */
  def cmark_node_set_literal(node: Ptr[cmark_node], content: CString): CInt =
    extern

  /** Sets the literal text to render "on enter" for a custom 'node'. Any
    * children of the node will be rendered after this text. Returns 1 on
    * success 0 on failure.
    */
  def cmark_node_set_on_enter(node: Ptr[cmark_node], on_enter: CString): CInt =
    extern

  /** Sets the literal text to render "on exit" for a custom 'node'. Any
    * children of the node will be rendered before this text. Returns 1 on
    * success 0 on failure.
    */
  def cmark_node_set_on_exit(node: Ptr[cmark_node], on_exit: CString): CInt =
    extern

  /** Sets the title of a link or image 'node'. Returns 1 on success, 0 on
    * failure.
    */
  def cmark_node_set_title(node: Ptr[cmark_node], title: CString): CInt = extern

  /** Sets the URL of a link or image 'node'. Returns 1 on success, 0 on
    * failure.
    */
  def cmark_node_set_url(node: Ptr[cmark_node], url: CString): CInt = extern

  /** Sets arbitrary user data for 'node'. Returns 1 on success, 0 on failure.
    */
  def cmark_node_set_user_data(
      node: Ptr[cmark_node],
      user_data: Ptr[Byte]
  ): CInt = extern

  /** Unlinks a 'node', removing it from the tree, but not freeing its memory.
    * (Use 'cmark_node_free' for that.)
    */
  def cmark_node_unlink(node: Ptr[cmark_node]): Unit = extern

  /** Parse a CommonMark document in 'buffer' of length 'len'. Returns a pointer
    * to a tree of nodes. The memory allocated for the node tree should be
    * released using 'cmark_node_free' when it is no longer needed.
    */
  def cmark_parse_document(
      buffer: CString,
      len: size_t,
      options: CInt
  ): Ptr[cmark_node] = extern

  /** Parse a CommonMark document in file 'f', returning a pointer to a tree of
    * nodes. The memory allocated for the node tree should be released using
    * 'cmark_node_free' when it is no longer needed.
    */
  def cmark_parse_file(f: Ptr[FILE], options: CInt): Ptr[cmark_node] = extern

  /** Feeds a string of length 'len' to 'parser'.
    */
  def cmark_parser_feed(
      parser: Ptr[cmark_parser],
      buffer: CString,
      len: size_t
  ): Unit = extern

  /** Finish parsing and return a pointer to a tree of nodes.
    */
  def cmark_parser_finish(parser: Ptr[cmark_parser]): Ptr[cmark_node] = extern

  /** Frees memory allocated for a parser object.
    */
  def cmark_parser_free(parser: Ptr[cmark_parser]): Unit = extern

  /** Creates a new parser object.
    */
  def cmark_parser_new(options: CInt): Ptr[cmark_parser] = extern

  /** Creates a new parser object with the given memory allocator
    */
  def cmark_parser_new_with_mem(
      options: CInt,
      mem: Ptr[cmark_mem]
  ): Ptr[cmark_parser] = extern

  /** Render a 'node' tree as a commonmark document. It is the caller's
    * responsibility to free the returned buffer.
    */
  def cmark_render_commonmark(
      root: Ptr[cmark_node],
      options: CInt,
      width: CInt
  ): CString = extern

  /** Render a 'node' tree as an HTML fragment. It is up to the user to add an
    * appropriate header and footer. It is the caller's responsibility to free
    * the returned buffer.
    */
  def cmark_render_html(root: Ptr[cmark_node], options: CInt): CString = extern

  /** Render a 'node' tree as a LaTeX document. It is the caller's
    * responsibility to free the returned buffer.
    */
  def cmark_render_latex(
      root: Ptr[cmark_node],
      options: CInt,
      width: CInt
  ): CString = extern

  /** Render a 'node' tree as a groff man page, without the header. It is the
    * caller's responsibility to free the returned buffer.
    */
  def cmark_render_man(
      root: Ptr[cmark_node],
      options: CInt,
      width: CInt
  ): CString = extern

  /** Render a 'node' tree as XML. It is the caller's responsibility to free the
    * returned buffer.
    */
  def cmark_render_xml(root: Ptr[cmark_node], options: CInt): CString = extern

  /** The library version as integer for runtime checks. Also available as macro
    * CMARK_VERSION for compile time checks.
    */
  def cmark_version(): CInt = extern

  /** The library version string for runtime checks. Also available as macro
    * CMARK_VERSION_STRING for compile time checks.
    */
  def cmark_version_string(): CString = extern
end extern_functions

object functions:
  import _root_.cmark.enumerations.*
  import _root_.cmark.predef.*
  import _root_.cmark.aliases.*
  import _root_.cmark.structs.*
  import extern_functions.*
  export extern_functions.*

object types:
  export _root_.cmark.structs.*
  export _root_.cmark.aliases.*
  export _root_.cmark.enumerations.*

object all:
  export _root_.cmark.enumerations.cmark_delim_type
  export _root_.cmark.enumerations.cmark_event_type
  export _root_.cmark.enumerations.cmark_list_type
  export _root_.cmark.enumerations.cmark_node_type
  export _root_.cmark.aliases.FILE
  export _root_.cmark.aliases.size_t
  export _root_.cmark.structs.cmark_iter
  export _root_.cmark.structs.cmark_mem
  export _root_.cmark.structs.cmark_node
  export _root_.cmark.structs.cmark_parser
  export _root_.cmark.functions.cmark_consolidate_text_nodes
  export _root_.cmark.functions.cmark_get_default_mem_allocator
  export _root_.cmark.functions.cmark_iter_free
  export _root_.cmark.functions.cmark_iter_get_event_type
  export _root_.cmark.functions.cmark_iter_get_node
  export _root_.cmark.functions.cmark_iter_get_root
  export _root_.cmark.functions.cmark_iter_new
  export _root_.cmark.functions.cmark_iter_next
  export _root_.cmark.functions.cmark_iter_reset
  export _root_.cmark.functions.cmark_markdown_to_html
  export _root_.cmark.functions.cmark_node_append_child
  export _root_.cmark.functions.cmark_node_first_child
  export _root_.cmark.functions.cmark_node_free
  export _root_.cmark.functions.cmark_node_get_end_column
  export _root_.cmark.functions.cmark_node_get_end_line
  export _root_.cmark.functions.cmark_node_get_fence_info
  export _root_.cmark.functions.cmark_node_get_heading_level
  export _root_.cmark.functions.cmark_node_get_list_delim
  export _root_.cmark.functions.cmark_node_get_list_start
  export _root_.cmark.functions.cmark_node_get_list_tight
  export _root_.cmark.functions.cmark_node_get_list_type
  export _root_.cmark.functions.cmark_node_get_literal
  export _root_.cmark.functions.cmark_node_get_on_enter
  export _root_.cmark.functions.cmark_node_get_on_exit
  export _root_.cmark.functions.cmark_node_get_start_column
  export _root_.cmark.functions.cmark_node_get_start_line
  export _root_.cmark.functions.cmark_node_get_title
  export _root_.cmark.functions.cmark_node_get_type
  export _root_.cmark.functions.cmark_node_get_type_string
  export _root_.cmark.functions.cmark_node_get_url
  export _root_.cmark.functions.cmark_node_get_user_data
  export _root_.cmark.functions.cmark_node_insert_after
  export _root_.cmark.functions.cmark_node_insert_before
  export _root_.cmark.functions.cmark_node_last_child
  export _root_.cmark.functions.cmark_node_new
  export _root_.cmark.functions.cmark_node_new_with_mem
  export _root_.cmark.functions.cmark_node_next
  export _root_.cmark.functions.cmark_node_parent
  export _root_.cmark.functions.cmark_node_prepend_child
  export _root_.cmark.functions.cmark_node_previous
  export _root_.cmark.functions.cmark_node_replace
  export _root_.cmark.functions.cmark_node_set_fence_info
  export _root_.cmark.functions.cmark_node_set_heading_level
  export _root_.cmark.functions.cmark_node_set_list_delim
  export _root_.cmark.functions.cmark_node_set_list_start
  export _root_.cmark.functions.cmark_node_set_list_tight
  export _root_.cmark.functions.cmark_node_set_list_type
  export _root_.cmark.functions.cmark_node_set_literal
  export _root_.cmark.functions.cmark_node_set_on_enter
  export _root_.cmark.functions.cmark_node_set_on_exit
  export _root_.cmark.functions.cmark_node_set_title
  export _root_.cmark.functions.cmark_node_set_url
  export _root_.cmark.functions.cmark_node_set_user_data
  export _root_.cmark.functions.cmark_node_unlink
  export _root_.cmark.functions.cmark_parse_document
  export _root_.cmark.functions.cmark_parse_file
  export _root_.cmark.functions.cmark_parser_feed
  export _root_.cmark.functions.cmark_parser_finish
  export _root_.cmark.functions.cmark_parser_free
  export _root_.cmark.functions.cmark_parser_new
  export _root_.cmark.functions.cmark_parser_new_with_mem
  export _root_.cmark.functions.cmark_render_commonmark
  export _root_.cmark.functions.cmark_render_html
  export _root_.cmark.functions.cmark_render_latex
  export _root_.cmark.functions.cmark_render_man
  export _root_.cmark.functions.cmark_render_xml
  export _root_.cmark.functions.cmark_version
  export _root_.cmark.functions.cmark_version_string
end all
