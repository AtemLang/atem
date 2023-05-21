#ifndef META_EXPRASTNODE_H
#define META_EXPRASTNODE_H

#include "meta-compiler/include/AST/ValueStmtASTNode.h"

namespace meta {
    class ExprASTNode : public ValueStmtASTNode {
    public:
        ~ExprASTNode() override {}
        auto CodeGen() -> llvm::Value* override = 0;
    };
}

#endif //META_EXPRASTNODE_H
