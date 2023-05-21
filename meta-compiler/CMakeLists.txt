set (LLVM "E:/llvm-project/llvm")

set(Boost_USE_STATIC_LIBS ON)
set(Boost_USE_STATIC_RUNTIME ON)
set(Boost_INCLUDE_DIR ${_VCPKG_INSTALLED_DIR}/x64-windows/include)
set_property(GLOBAL PROPERTY USE_FOLDERS ON)

find_package(Boost COMPONENTS system REQUIRED)
if (Boost_FOUND)
    include_directories(${Boost_INCLUDE_DIRS})
    link_directories(${Boost_LIBRARY_DIRS})
endif ()

find_package(Boost REQUIRED)
find_package(clipp CONFIG REQUIRED)

include_directories ("${LLVM}/include")
include_directories("/")
link_directories ("${LLVM}/lib")

add_executable (meta "main.cpp" include/Utils/boolean.h src/Lex/Lexer.cpp include/Lex/Lexer.h include/Lex/Token.h src/Lex/Token.cpp include/Lex/TokenEnum.h include/Basic/SourceLocation.h src/Basic/SourceLocation.cpp include/Basic/Source.h src/Basic/Source.cpp src/AST/ASTNode.cpp include/AST/ASTNode.h include/AST/ExprASTNode.h include/Utils/TerseLambda.h include/Utils/declval.h include/Utils/fwd.h include/Utils/Lift.h include/AST/StmtASTNode.h include/AST/ValueStmtASTNode.h include/AST/IntegerLiteralASTNode.h include/AST/DeclASTNode.h include/AST/NamedDeclASTNode.h include/AST/ValueDeclASTNode.h include/AST/FunctionDeclASTNode.h include/Basic/RawSourceFile.h src/Basic/RawSourceFile.cpp include/Utils/co_resource.h include/Utils/addressof.h include/Exception/Exception.h)

target_link_libraries(meta
        PRIVATE
            clipp::clipp
        )

if (CMAKE_VERSION VERSION_GREATER 3.12)
    set_property(TARGET meta PROPERTY CXX_STANDARD 20)
endif()