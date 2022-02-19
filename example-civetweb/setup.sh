#!/bin/sh

cd civetweb && \
make lib WITH_IPV6=1 &&\
cd ../../
