#include "meta-compiler/include/Basic/RawSourceFile.h"
#include "meta-compiler/include/Exception/Exception.h"

#include <boost/leaf.hpp>

namespace meta {
    RawSourceFile::RawSourceFile(const fs::path &source_file_path)
        : source_file_path_(source_file_path)
    {
        if(this->source_file_path_.extension() != "metalang") {
            boost::leaf::new_error(
                    exception::open_error{},
                    exception::error_description{"The extension of META source file must be \".metalang\""},
                    exception::file_description{this->source_file_path_}
                    );
        }

    }
}