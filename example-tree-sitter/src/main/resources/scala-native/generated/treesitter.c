#include <string.h>
#include "tree_sitter/api.h"

void __sn_wrap_treesitter_ts_node_child(TSNode *self, uint32_t child_index, TSNode *____return) {
  TSNode ____ret = ts_node_child(*self, child_index);
  memcpy(____return, &____ret, sizeof(TSNode));
}


void __sn_wrap_treesitter_ts_node_child_by_field_id(TSNode *self, TSFieldId field_id, TSNode *____return) {
  TSNode ____ret = ts_node_child_by_field_id(*self, field_id);
  memcpy(____return, &____ret, sizeof(TSNode));
}


void __sn_wrap_treesitter_ts_node_child_by_field_name(TSNode *self, const char * name, uint32_t name_length, TSNode *____return) {
  TSNode ____ret = ts_node_child_by_field_name(*self, name, name_length);
  memcpy(____return, &____ret, sizeof(TSNode));
}


uint32_t __sn_wrap_treesitter_ts_node_child_count(TSNode *self) {
 return ts_node_child_count(*self);
};


uint32_t __sn_wrap_treesitter_ts_node_descendant_count(TSNode *self) {
 return ts_node_descendant_count(*self);
};


void __sn_wrap_treesitter_ts_node_descendant_for_byte_range(TSNode *self, uint32_t start, uint32_t end, TSNode *____return) {
  TSNode ____ret = ts_node_descendant_for_byte_range(*self, start, end);
  memcpy(____return, &____ret, sizeof(TSNode));
}


void __sn_wrap_treesitter_ts_node_descendant_for_point_range(TSNode *self, TSPoint *start, TSPoint *end, TSNode *____return) {
  TSNode ____ret = ts_node_descendant_for_point_range(*self, *start, *end);
  memcpy(____return, &____ret, sizeof(TSNode));
}


uint32_t __sn_wrap_treesitter_ts_node_end_byte(TSNode *self) {
 return ts_node_end_byte(*self);
};


void __sn_wrap_treesitter_ts_node_end_point(TSNode *self, TSPoint *____return) {
  TSPoint ____ret = ts_node_end_point(*self);
  memcpy(____return, &____ret, sizeof(TSPoint));
}


_Bool __sn_wrap_treesitter_ts_node_eq(TSNode *self, TSNode *other) {
 return ts_node_eq(*self, *other);
};


const char * __sn_wrap_treesitter_ts_node_field_name_for_child(TSNode *self, uint32_t child_index) {
 return ts_node_field_name_for_child(*self, child_index);
};


void __sn_wrap_treesitter_ts_node_first_child_for_byte(TSNode *self, uint32_t byte, TSNode *____return) {
  TSNode ____ret = ts_node_first_child_for_byte(*self, byte);
  memcpy(____return, &____ret, sizeof(TSNode));
}


void __sn_wrap_treesitter_ts_node_first_named_child_for_byte(TSNode *self, uint32_t byte, TSNode *____return) {
  TSNode ____ret = ts_node_first_named_child_for_byte(*self, byte);
  memcpy(____return, &____ret, sizeof(TSNode));
}


TSSymbol __sn_wrap_treesitter_ts_node_grammar_symbol(TSNode *self) {
 return ts_node_grammar_symbol(*self);
};


const char * __sn_wrap_treesitter_ts_node_grammar_type(TSNode *self) {
 return ts_node_grammar_type(*self);
};


_Bool __sn_wrap_treesitter_ts_node_has_changes(TSNode *self) {
 return ts_node_has_changes(*self);
};


_Bool __sn_wrap_treesitter_ts_node_has_error(TSNode *self) {
 return ts_node_has_error(*self);
};


_Bool __sn_wrap_treesitter_ts_node_is_error(TSNode *self) {
 return ts_node_is_error(*self);
};


_Bool __sn_wrap_treesitter_ts_node_is_extra(TSNode *self) {
 return ts_node_is_extra(*self);
};


_Bool __sn_wrap_treesitter_ts_node_is_missing(TSNode *self) {
 return ts_node_is_missing(*self);
};


_Bool __sn_wrap_treesitter_ts_node_is_named(TSNode *self) {
 return ts_node_is_named(*self);
};


_Bool __sn_wrap_treesitter_ts_node_is_null(TSNode *self) {
 return ts_node_is_null(*self);
};


const TSLanguage * __sn_wrap_treesitter_ts_node_language(TSNode *self) {
 return ts_node_language(*self);
};


void __sn_wrap_treesitter_ts_node_named_child(TSNode *self, uint32_t child_index, TSNode *____return) {
  TSNode ____ret = ts_node_named_child(*self, child_index);
  memcpy(____return, &____ret, sizeof(TSNode));
}


uint32_t __sn_wrap_treesitter_ts_node_named_child_count(TSNode *self) {
 return ts_node_named_child_count(*self);
};


void __sn_wrap_treesitter_ts_node_named_descendant_for_byte_range(TSNode *self, uint32_t start, uint32_t end, TSNode *____return) {
  TSNode ____ret = ts_node_named_descendant_for_byte_range(*self, start, end);
  memcpy(____return, &____ret, sizeof(TSNode));
}


void __sn_wrap_treesitter_ts_node_named_descendant_for_point_range(TSNode *self, TSPoint *start, TSPoint *end, TSNode *____return) {
  TSNode ____ret = ts_node_named_descendant_for_point_range(*self, *start, *end);
  memcpy(____return, &____ret, sizeof(TSNode));
}


void __sn_wrap_treesitter_ts_node_next_named_sibling(TSNode *self, TSNode *____return) {
  TSNode ____ret = ts_node_next_named_sibling(*self);
  memcpy(____return, &____ret, sizeof(TSNode));
}


TSStateId __sn_wrap_treesitter_ts_node_next_parse_state(TSNode *self) {
 return ts_node_next_parse_state(*self);
};


void __sn_wrap_treesitter_ts_node_next_sibling(TSNode *self, TSNode *____return) {
  TSNode ____ret = ts_node_next_sibling(*self);
  memcpy(____return, &____ret, sizeof(TSNode));
}


void __sn_wrap_treesitter_ts_node_parent(TSNode *self, TSNode *____return) {
  TSNode ____ret = ts_node_parent(*self);
  memcpy(____return, &____ret, sizeof(TSNode));
}


TSStateId __sn_wrap_treesitter_ts_node_parse_state(TSNode *self) {
 return ts_node_parse_state(*self);
};


void __sn_wrap_treesitter_ts_node_prev_named_sibling(TSNode *self, TSNode *____return) {
  TSNode ____ret = ts_node_prev_named_sibling(*self);
  memcpy(____return, &____ret, sizeof(TSNode));
}


void __sn_wrap_treesitter_ts_node_prev_sibling(TSNode *self, TSNode *____return) {
  TSNode ____ret = ts_node_prev_sibling(*self);
  memcpy(____return, &____ret, sizeof(TSNode));
}


uint32_t __sn_wrap_treesitter_ts_node_start_byte(TSNode *self) {
 return ts_node_start_byte(*self);
};


void __sn_wrap_treesitter_ts_node_start_point(TSNode *self, TSPoint *____return) {
  TSPoint ____ret = ts_node_start_point(*self);
  memcpy(____return, &____ret, sizeof(TSPoint));
}


char * __sn_wrap_treesitter_ts_node_string(TSNode *self) {
 return ts_node_string(*self);
};


TSSymbol __sn_wrap_treesitter_ts_node_symbol(TSNode *self) {
 return ts_node_symbol(*self);
};


const char * __sn_wrap_treesitter_ts_node_type(TSNode *self) {
 return ts_node_type(*self);
};


void __sn_wrap_treesitter_ts_parser_logger(const TSParser * self, TSLogger *____return) {
  TSLogger ____ret = ts_parser_logger(self);
  memcpy(____return, &____ret, sizeof(TSLogger));
}


TSTree * __sn_wrap_treesitter_ts_parser_parse(TSParser * self, const TSTree * old_tree, TSInput *input) {
 return ts_parser_parse(self, old_tree, *input);
};


void __sn_wrap_treesitter_ts_parser_set_logger(TSParser * self, TSLogger *logger) {
 ts_parser_set_logger(self, *logger);
};


void __sn_wrap_treesitter_ts_query_cursor_exec(TSQueryCursor * self, const TSQuery * query, TSNode *node) {
 ts_query_cursor_exec(self, query, *node);
};


void __sn_wrap_treesitter_ts_query_cursor_set_point_range(TSQueryCursor * self, TSPoint *start_point, TSPoint *end_point) {
 ts_query_cursor_set_point_range(self, *start_point, *end_point);
};


void __sn_wrap_treesitter_ts_tree_cursor_copy(const TSTreeCursor * cursor, TSTreeCursor *____return) {
  TSTreeCursor ____ret = ts_tree_cursor_copy(cursor);
  memcpy(____return, &____ret, sizeof(TSTreeCursor));
}


void __sn_wrap_treesitter_ts_tree_cursor_current_node(const TSTreeCursor * self, TSNode *____return) {
  TSNode ____ret = ts_tree_cursor_current_node(self);
  memcpy(____return, &____ret, sizeof(TSNode));
}


int64_t __sn_wrap_treesitter_ts_tree_cursor_goto_first_child_for_point(TSTreeCursor * self, TSPoint *goal_point) {
 return ts_tree_cursor_goto_first_child_for_point(self, *goal_point);
};


void __sn_wrap_treesitter_ts_tree_cursor_new(TSNode *node, TSTreeCursor *____return) {
  TSTreeCursor ____ret = ts_tree_cursor_new(*node);
  memcpy(____return, &____ret, sizeof(TSTreeCursor));
}


void __sn_wrap_treesitter_ts_tree_cursor_reset(TSTreeCursor * self, TSNode *node) {
 ts_tree_cursor_reset(self, *node);
};


void __sn_wrap_treesitter_ts_tree_root_node(const TSTree * self, TSNode *____return) {
  TSNode ____ret = ts_tree_root_node(self);
  memcpy(____return, &____ret, sizeof(TSNode));
}


void __sn_wrap_treesitter_ts_tree_root_node_with_offset(const TSTree * self, uint32_t offset_bytes, TSPoint *offset_extent, TSNode *____return) {
  TSNode ____ret = ts_tree_root_node_with_offset(self, offset_bytes, *offset_extent);
  memcpy(____return, &____ret, sizeof(TSNode));
}