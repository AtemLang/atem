#ifndef META_DECLASTNODE_H
#define META_DECLASTNODE_H

#include "meta-compiler/include/AST/ASTNode.h"

namespace meta {
    class DeclASTNode : public ASTNode {
    public:
        ~DeclASTNode() override {}
        auto CodeGen() -> llvm::Value* override = 0;
    };
}

#endif //META_DECLASTNODE_H
