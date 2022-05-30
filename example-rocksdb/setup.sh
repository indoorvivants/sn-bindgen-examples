#!/bin/sh

cd rocksdb && \
make shared_lib -j4 && \
cd ../../
