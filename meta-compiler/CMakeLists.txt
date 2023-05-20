set (LLVM "E:/llvm-project/llvm")

include_directories ("${LLVM}/include")
link_directories ("${LLVM}/lib")

add_executable (meta "main.cpp" include/utils/boolean.h)

if (CMAKE_VERSION VERSION_GREATER 3.12)
    set_property(TARGET meta PROPERTY CXX_STANDARD 20)
endif()