#!/bin/sh
cd ..
cmake --build cmake-build-debug/ 1>/dev/null
cd ..
./c/cmake-build-debug/c_1_1 "$1"
