#ifndef ATEM_EXPRASTNODE_H
#define ATEM_EXPRASTNODE_H

#include "atem-compiler/include/AST/StmtASTNode.h"

namespace atem {
    class ExprASTNode : public ValueStmtASTNode {
    public:
        ~ExprASTNode() override {}
        auto CodeGen() -> llvm::Value* override = 0;
    };

    class IntegerLiteralASTNode : ExprASTNode {
    public:
        ~IntegerLiteralASTNode() override {}
        auto CodeGen() -> llvm::Value* override {}
    };
}

#endif //ATEM_EXPRASTNODE_H
