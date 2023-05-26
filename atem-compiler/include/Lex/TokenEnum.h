#ifndef ATEM_TOKENENUM_H
#define ATEM_TOKENENUM_H

namespace atem {
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

#endif //ATEM_TOKENENUM_H
