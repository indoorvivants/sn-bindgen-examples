#!/bin/sh

VERSION=3370200
TARGET_FOLDER=sqlite-amalgamation-$VERSION

curl -Lo sqlite.zip https://sqlite.org/2022/sqlite-amalgamation-$VERSION.zip && \
unzip sqlite.zip && \
mv $TARGET_FOLDER sqlite && \
cd sqlite && \
clang -dynamiclib sqlite3.c -o libsqlite3.dylib
