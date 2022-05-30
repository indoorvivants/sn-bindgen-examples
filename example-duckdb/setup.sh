#!/bin/sh

cd duckdb && \
GEN=ninja make -j4 && \
cd ../../
