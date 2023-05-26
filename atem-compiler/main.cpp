#include <iostream>
#include <string>
#include <memory>

#include "atem-compiler/include/Basic/RawSourceFile.h"
#include "atem-compiler/include/Lex/Lexer.h"

#include <clipp.h>

int main(int argc, char* argv[]) {
    using namespace std;
    using namespace clipp;

    string source_file_name{};
    group cli = (
                value("Source File Path", source_file_name),
                option("-r")
            );
    if(!parse(argc, argv, cli)) {
        cout << make_man_page(cli, argv[0]);
        return 0;
    }

    cout << "Starting compiling " << source_file_name << endl;

    auto rawsource = make_unique<atem::RawSourceFile>(std::filesystem::path{source_file_name});
    atem::Lexer lex(std::move(rawsource));
    while(true) {
        auto tok = lex.GetNextToken();
        if(!tok or tok->Is(atem::TokenEnum::TOK_EOF)) break;
    }
    return 0;
}
