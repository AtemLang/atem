set (LLVM "E:/llvm-project/llvm")

include_directories ("${LLVM}/include")
include_directories("/")
link_directories ("${LLVM}/lib")

add_executable (meta "main.cpp" include/Utils/boolean.h src/Lex/Lexer.cpp include/Lex/Lexer.h)

if (CMAKE_VERSION VERSION_GREATER 3.12)
    set_property(TARGET meta PROPERTY CXX_STANDARD 20)
endif()