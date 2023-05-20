#ifndef META_TOKEN_H
#define META_TOKEN_H

#include "meta-compiler/include/Lex/TokenEnum.h"

namespace meta {
    class Token {
    private:
        TokenEnum tok_type_;

    public:
        auto Is(TokenEnum tok) const noexcept -> bool;
        auto IsNot(TokenEnum tok) const noexcept -> bool;
    };
}

#endif //META_TOKEN_H
