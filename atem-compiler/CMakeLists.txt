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
find_package(matchit CONFIG REQUIRED)

include_directories ("${LLVM}/include")
include_directories("/")
link_directories ("${LLVM}/lib")

add_executable (atem "main.cpp")

target_link_libraries(atem
        PRIVATE
            clipp::clipp
            matchit::matchit
        )

if (CMAKE_VERSION VERSION_GREATER 3.12)
    set_property(TARGET atem PROPERTY CXX_STANDARD 20)
endif()