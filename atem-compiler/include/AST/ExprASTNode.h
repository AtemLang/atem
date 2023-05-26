#ifndef META_EXPRASTNODE_H
#define META_EXPRASTNODE_H

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

#endif //META_EXPRASTNODE_H
