#ifndef META_EXCEPTION_H
#define META_EXCEPTION_H

#include <filesystem>
#include <string>

namespace meta::exception {
    namespace fs = std::filesystem;

    struct error_description {
        std::string what;
    };

    struct open_error {

    };

    struct file_description {
        fs::path file_path;
    };
}

#endif //META_EXCEPTION_H
