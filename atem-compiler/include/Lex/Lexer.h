#ifndef META_LEXER_H
#define META_LEXER_H

#include "atem-compiler/include/Lex/Token.h"
#include "atem-compiler/include/Basic/RawSourceFile.h"

#include <optional>
#include <memory>

namespace atem {
    class Lexer {
    private:
        using SourceFilePtrT = std::unique_ptr<RawSourceFile>;
        SourceFilePtrT source_file_ptr_;
        std::string_view::iterator it;

    public:
        explicit Lexer(std::unique_ptr<RawSourceFile> source_file_ptr);
        auto GetNextToken() -> std::optional<Token>;
    };
}

#endif //META_LEXER_H
