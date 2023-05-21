#include <meta-compiler/include/Lex/Token.h>

namespace meta {
    Token::Token(meta::TokenEnum type)
        :
        tok_type_(type)
    {

    }

    auto Token::Is(meta::TokenEnum tok) const noexcept -> bool {
        if(tok != this->tok_type_) {
            return false;
        }
        return true;
    }

    auto Token::IsNot(meta::TokenEnum tok) const noexcept -> bool {
        if(tok == this->tok_type_) {
            return false;
        }
        return true;
    }
}