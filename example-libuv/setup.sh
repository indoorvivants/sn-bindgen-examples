#!/bin/sh

cd libuv && \
rm -rf build && \
mkdir build && \
cd build && \
cmake .. -DBUILD_TESTING=OFF && cd .. && \
cmake --build build -j 4 && \
cd ../../
