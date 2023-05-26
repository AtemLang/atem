#ifndef META_TOKEN_H
#define META_TOKEN_H

#include "atem-compiler/include/Lex/TokenEnum.h"

namespace atem {
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

    class LiteralToken : virtual public AbstractToken {
    public:
        virtual ~LiteralToken() = 0;
    };

    class IntegerLiteralToken : virtual public LiteralToken {
    public:
        virtual ~IntegerLiteralToken() = 0;
    };

    class FloatingPointLiteralToken : virtual public LiteralToken {
    public:
        virtual ~FloatingPointLiteralToken() = 0;
    };

    class StringLiteralToken : virtual public LiteralToken {
    public:
        virtual ~StringLiteralToken() = 0;
    };

    class IdentifierToken : virtual public AbstractToken {
    public:
        virtual ~IdentifierToken() = 0;
    };

    class KeywordToken : virtual public IdentifierToken {
    public:
        virtual ~KeywordToken() = 0;
    };

    class BuiltinTypeToken : virtual public KeywordToken {
    public:
        virtual ~BuiltinTypeToken() = 0;
    };

    class BooleanLiteralToken : virtual public LiteralToken, virtual public KeywordToken {
    public:
        virtual ~BooleanLiteralToken() = 0;
    };

    class ModuleIdentifierToken : virtual public IdentifierToken {
    public:
        virtual ~ModuleIdentifierToken() = 0;
    };

    class FunctionIdentifierToken : virtual public IdentifierToken {
    public:
        virtual ~FunctionIdentifierToken() = 0;
    };

    class TypeIdentifierToken : virtual public IdentifierToken {
    public:
        virtual ~TypeIdentifierToken() = 0;
    };

    class EOFToken : virtual public AbstractToken {
    public:
        virtual ~EOFToken() = 0;
    };
}

#endif //META_TOKEN_H
