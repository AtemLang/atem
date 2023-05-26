#ifndef ATEM_EXCEPTION_H
#define ATEM_EXCEPTION_H

#include <filesystem>
#include <string>

namespace atem::exception {
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

#endif //ATEM_EXCEPTION_H
