#!/bin/sh

if [ $PLATFORM == "Darwin" ]; then
  echo "It's a Mac"
  brew install libpq
else
  echo "It's a Linux"
  sudo apt update
  sudo apt install libpq-dev
fi

