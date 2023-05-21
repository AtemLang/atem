#ifndef META_INTEGERLITERALASTNODE_H
#define META_INTEGERLITERALASTNODE_H

#include "meta-compiler/include/AST/ExprASTNode.h"

namespace meta {
    class IntegerLiteralASTNode : ExprASTNode {
    public:
        ~IntegerLiteralASTNode() override {}
        auto CodeGen() -> llvm::Value* override {}
    };
}

#endif //META_INTEGERLITERALASTNODE_H
