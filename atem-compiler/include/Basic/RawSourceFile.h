#ifndef META_RAWSOURCEFILE_H
#define META_RAWSOURCEFILE_H

#include <filesystem>
#include <memory_resource>
#include <fstream>
#include <string>

namespace atem {
    namespace fs = std::filesystem;
    class RawSourceFile {
    private:
        fs::path source_file_path_;
        size_t source_file_size_;
        std::pmr::polymorphic_allocator<char> alloc_;
        char* low_level_buffer_;
        std::string_view buffer_view_;

    public:
        explicit RawSourceFile(const fs::path& source_file_path);

        ~RawSourceFile();

        auto GetSourceFileSize() const noexcept -> size_t { return this->source_file_size_; }
        auto GetSourceFilePath() const noexcept -> fs::path { return this->source_file_path_; }
        auto GetSourceFileBuffer() const noexcept -> std::string_view { return this->buffer_view_; }
    };
}

#endif //META_RAWSOURCEFILE_H
