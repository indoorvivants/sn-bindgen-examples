#!/bin/sh

cd libgit2 && \
rm -rf build && \
mkdir build && \
cd build && \
cmake .. && \
cmake --build . && \
cd ../../
