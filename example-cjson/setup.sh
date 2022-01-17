#!/bin/sh

cd cJSON && \
mkdir build && \
cd build && \
cmake .. && \
make && \
cd ../../
