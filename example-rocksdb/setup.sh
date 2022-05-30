#!/bin/sh

cd rocksdb && \
make shared_lib -j8 && \
cd ../../
