#!/bin/sh
git submodule update --init

cd example-tree-sitter && ./setup.sh && cd ..
