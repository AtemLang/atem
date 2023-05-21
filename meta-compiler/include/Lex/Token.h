#ifndef META_TOKEN_H
#define META_TOKEN_H

#include "meta-compiler/include/Lex/TokenEnum.h"

namespace meta {
    class Token {
    private:
        TokenEnum tok_type_;

    public:
        explicit Token(TokenEnum type);
        auto Is(TokenEnum tok) const noexcept -> bool;
        auto IsNot(TokenEnum tok) const noexcept -> bool;
    };

    class AbstractToken {
    public:
        virtual ~AbstractToken() = 0;
    };

    class
}

#endif //META_TOKEN_H
