#ifndef META_FUNCTIONDECLASTNODE_H
#define META_FUNCTIONDECLASTNODE_H

#include "meta-compiler/include/AST/ValueDeclASTNode.h"

namespace meta {
    class FunctionDeclASTNode : ValueDeclASTNode {
    public:
        ~FunctionDeclASTNode() override {}
        auto CodeGen() -> llvm::Value* override {}
    };
}

#endif //META_FUNCTIONDECLASTNODE_H
