#!/bin/sh

cd tree-sitter && make && cd -
cd tree-sitter-scala && npm install && npm run build && cd -
