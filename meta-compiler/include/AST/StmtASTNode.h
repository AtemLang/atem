#ifndef META_STMTASTNODE_H
#define META_STMTASTNODE_H

#include "meta-compiler/include/AST/ASTNode.h"

namespace meta {
    class StmtASTNode : public ASTNode {
    public:
        ~StmtASTNode() override {}
        auto CodeGen() -> llvm::Value* override = 0;
    };

    class ValueStmtASTNode : public StmtASTNode {
    public:
        ~ValueStmtASTNode() override {}
        auto CodeGen() -> llvm::Value* override = 0;
    };
}

#endif //META_STMTASTNODE_H
