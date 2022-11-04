#!/bin/sh
cd ..
cmake --build cmake-build-debug/ 1>/dev/null
cd ..
./c/cmake-build-debug/p1_ex1_naive "$1"
