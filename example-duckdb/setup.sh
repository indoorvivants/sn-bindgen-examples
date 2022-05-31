#!/bin/sh

cd duckdb && \
GEN=ninja make debug -j4 && \
cd ../../
