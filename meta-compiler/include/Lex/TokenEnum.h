#ifndef META_TOKENENUM_H
#define META_TOKENENUM_H

namespace meta {
    enum class TokenEnum {
        TOK_EOF,
        TOK_FUNC,
        TOK_TYPE,
        TOK_RETURN,
        TOK_NULL,
        TOK_IMPORT,
        TOK_EXPORT,
        TOK_MODULE,
        TOK_OPERATOR,
        TOK_NAMESPACE,
        TOK_AUTO,
        TOK_SELF
    };
}

#endif //META_TOKENENUM_H
