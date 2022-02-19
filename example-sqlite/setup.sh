#!/bin/sh

set -e

VERSION=3370200
TARGET_FOLDER=sqlite-amalgamation-$VERSION

curl -Lo sqlite.zip https://sqlite.org/2022/sqlite-amalgamation-$VERSION.zip
unzip sqlite.zip
mv $TARGET_FOLDER sqlite
cd sqlite

PLATFORM="$(uname)"

if [ $PLATFORM == "Darwin" ]; then
  echo "It's a Mac"
  clang -dynamiclib sqlite3.c -o libsqlite3.dylib
else
  echo "It's a Linux"
  clang sqlite3.c -shared -o libsqlite3.so -fpic
fi

