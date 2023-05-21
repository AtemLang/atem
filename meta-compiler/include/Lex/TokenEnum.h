#ifndef META_TOKENENUM_H
#define META_TOKENENUM_H

namespace meta {
    enum class TokenEnum {
        TOK_EOF,
        TOK_IDENTIFIER,
        TOK_NUMBER_LITERAL,
        TOK_FUNC,
        TOK_TYPE,
        TOK_RETURN,
        TOK_NULL,
        TOK_IMPORT,
        TOK_EXPORT,
        TOK_MODULE,
        TOK_NAMESPACE,
        TOK_AUTO,
        TOK_SELF
    };
}

#endif //META_TOKENENUM_H
