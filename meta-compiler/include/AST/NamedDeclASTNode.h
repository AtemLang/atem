#ifndef META_NAMEDDECLASTNODE_H
#define META_NAMEDDECLASTNODE_H

#include "meta-compiler/include/AST/DeclASTNode.h"

namespace meta {
    class NamedDeclASTNode : public DeclASTNode {
    public:
        ~NamedDeclASTNode() override {}
        auto CodeGen() -> llvm::Value* override = 0;
    };
}

#endif //META_NAMEDDECLASTNODE_H
