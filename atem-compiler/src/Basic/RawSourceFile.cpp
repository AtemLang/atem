#include "atem-compiler/include/Basic/RawSourceFile.h"
#include "atem-compiler/include/Exception/Exception.h"

#include <boost/leaf.hpp>
#include <iostream>

namespace atem {
    RawSourceFile::RawSourceFile(const fs::path &source_file_path)
        :
        source_file_path_(source_file_path),
        source_file_size_(0),
        alloc_{},
        low_level_buffer_{nullptr}
    {
        std::cout << "Reading Source File " << this->source_file_path_.string() << std::endl;
        if(this->source_file_path_.extension() != "mt") {
            boost::leaf::new_error(
                    exception::open_error{},
                    exception::error_description{"The extension of META source file must be \".mt\""},
                    exception::file_description{this->source_file_path_}
                    );
        }

        std::ifstream ifs(this->source_file_path_, std::ios::in | std::ios::ate);
        this->source_file_size_ = ifs.tellg();

        if(this->source_file_size_ <= 0) {
            boost::leaf::new_error(
                    exception::open_error{},
                    exception::error_description{"File reading error"},
                    exception::file_description{this->source_file_path_}
            );
        }

        ifs.seekg(0, std::ios::beg);
        this->low_level_buffer_ = this->alloc_.allocate(this->source_file_size_);
        memset(this->low_level_buffer_, '\0', this->source_file_size_);
        if(ifs.is_open()) {
            ifs.read(this->low_level_buffer_, this->source_file_size_);
        }
        this->buffer_view_ = this->low_level_buffer_;
        std::cout << "Source File Read Successfully!" << std::endl;
    }

    RawSourceFile::~RawSourceFile() {
        this->alloc_.deallocate(this->low_level_buffer_, this->source_file_size_);
    }
}