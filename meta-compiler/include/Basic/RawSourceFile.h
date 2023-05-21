#ifndef META_RAWSOURCEFILE_H
#define META_RAWSOURCEFILE_H

#include <filesystem>

namespace meta {
    namespace fs = std::filesystem;
    class RawSourceFile {
    private:
        
        fs::path source_file_path_;
    public:
        explicit RawSourceFile(const fs::path& source_file_path);
    };
}

#endif //META_RAWSOURCEFILE_H
