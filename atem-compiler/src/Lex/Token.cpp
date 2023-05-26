#include <atem-compiler/include/Lex/Token.h>

namespace atem {
    Token::Token(atem::TokenEnum type)
        :
        tok_type_(type)
    {

    }

    auto Token::Is(atem::TokenEnum tok) const noexcept -> bool {
        if(tok != this->tok_type_) {
            return false;
        }
        return true;
    }

    auto Token::IsNot(atem::TokenEnum tok) const noexcept -> bool {
        if(tok == this->tok_type_) {
            return false;
        }
        return true;
    }
}