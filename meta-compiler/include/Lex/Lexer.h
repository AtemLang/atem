#ifndef META_LEXER_H
#define META_LEXER_H

#include "meta-compiler/include/Lex/Token.h"

#include <optional>

namespace meta {
    class Lexer {
    public:
        auto GetNextToken() -> std::optional<Token>;
    };
}

#endif //META_LEXER_H
