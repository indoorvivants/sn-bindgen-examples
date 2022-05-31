#!/bin/sh

cd duckdb && \
GEN=ninja DISABLE_SANITIZER=1 DISABLE_UNITY=1 make debug -j4 && \
cd ../../
