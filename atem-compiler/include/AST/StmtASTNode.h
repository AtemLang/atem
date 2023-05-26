#ifndef ATEM_STMTASTNODE_H
#define ATEM_STMTASTNODE_H

#include "atem-compiler/include/AST/ASTNode.h"

namespace atem {
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

#endif //ATEM_STMTASTNODE_H
