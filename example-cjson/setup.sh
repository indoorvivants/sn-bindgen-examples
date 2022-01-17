#!/bin/sh

cd cJSON && \
rm -rf build && \
mkdir build && \
cd build && \
cmake .. && \
make && \
cd ../../
