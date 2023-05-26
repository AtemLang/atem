cmake_minimum_required (VERSION 3.8)

project ("atem")

set (LLVM "E:/llvm-project/build/")

include_directories ("${LLVM}/include")
include_directories ("${CMAKE_CURRENT_SOURCE_DIR} ")
link_directories ("${LLVM}/lib")

add_subdirectory ("atem-compiler")
