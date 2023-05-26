#include "atem-compiler/include/Lex/Lexer.h"

#include <iostream>

namespace atem {
    Lexer::Lexer(std::unique_ptr<RawSourceFile> source_file_ptr)
        :
        source_file_ptr_(std::move(source_file_ptr)),
        it(this->source_file_ptr_->GetSourceFileBuffer().begin())
    {

    }

    auto Lexer::GetNextToken() -> std::optional<Token> {
        using std::cout, std::endl;
        bool maybe_comment = false;
        const auto end = this->source_file_ptr_->GetSourceFileBuffer().end();
        for(;it < end; it++) {
            if(std::isspace(*it)) continue;

            if(std::isalpha(*it) or *it == '_') {
                std::string identifier_str{};
                while(std::isalnum(*it) or *it == '_') {
                    identifier_str += *it;
                    it++;
                    if(it >= end or *it == '\0') break;
                }

                if(identifier_str == "func") {
                    cout << "Got a TOK_FUNC" << endl;
                    return Token{TokenEnum::TOK_FUNC};
                }
                if(identifier_str == "type") {
                    cout << "Got a TOK_TYPE" << endl;
                    return Token{TokenEnum::TOK_TYPE};
                }
                if(identifier_str == "import") {
                    cout << "Got a TOK_IMPORT" << endl;
                    return Token{TokenEnum::TOK_IMPORT};
                }
                if(identifier_str == "export") {
                    cout << "Got a TOK_EXPORT" << endl;
                    return Token{TokenEnum::TOK_EXPORT};
                }
                if(identifier_str == "module") {
                    cout << "Got a TOK_MODULE" << endl;
                    return Token{TokenEnum::TOK_MODULE};
                }
                if(identifier_str == "null") {
                    cout << "Got a TOK_NULL" << endl;
                    return Token{TokenEnum::TOK_NULL};
                }
                if(identifier_str == "return") {
                    cout << "Got a TOK_RETURN" << endl;
                    return Token{TokenEnum::TOK_RETURN};
                }
                if(identifier_str == "namespace") {
                    cout << "Got a TOK_NAMESPACE" << endl;
                    return Token{TokenEnum::TOK_NAMESPACE};
                }
                if(identifier_str == "auto") {
                    cout << "Got a TOK_AUTO" << endl;
                    return Token{TokenEnum::TOK_AUTO};
                }
                if(identifier_str == "self") {
                    cout << "Got a TOK_SELF" << endl;
                    return Token{TokenEnum::TOK_SELF};
                }
                cout << "Got a TOK_IDENTIFIER : " << identifier_str << endl;
                return Token{TokenEnum::TOK_IDENTIFIER};
            }

            if(std::isdigit(*it)) {
                std::string digit_str{};
                do {
                    digit_str += *it;
                    it++;
                } while ((isdigit(*it) or *it == '.') and (it < end or *it != '\0'));
                cout << "Got a TOK_NUMBER_LITERAL " << strtod(digit_str.c_str(), nullptr) << endl;
                return Token{TokenEnum::TOK_NUMBER_LITERAL};
            }

            if(*it == '/') {
                if(maybe_comment) {
                    cout << "Got a comment" << endl;
                    while (it < end or *it != '\0' or *it != '\n') {
                        it++;
                    }
                    maybe_comment = false;
                } else {
                    maybe_comment = true;
                }
            }

            if(it == end) {
                cout << "Got a TOK_EOF" << endl;
                return Token{TokenEnum::TOK_EOF};
            }
        }
        return {};
    }
}