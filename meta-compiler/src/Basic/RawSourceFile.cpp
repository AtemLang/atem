#include "meta-compiler/include/Basic/RawSourceFile.h"

namespace meta {
    RawSourceFile::RawSourceFile(const fs::path &source_file_path)
        : source_file_path_(source_file_path)
    {
        if(this->source_file_path_.extension() != "metalang") {
            //todo: exception based on Boost.Leaf
        }
        
    }
}