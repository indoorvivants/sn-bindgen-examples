#!/bin/sh

cd libgit2 && \
rm -rf build && \
mkdir build && \
cd build && \
cmake .. -DBUILD_TESTS=OFF && \
cmake --build . && \
cd ../../
