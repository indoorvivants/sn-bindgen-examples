#!/bin/sh

cd cmark && \
rm -rf build && \
mkdir build && \
cd build && \
cmake .. && \
make && \
cd ../../
