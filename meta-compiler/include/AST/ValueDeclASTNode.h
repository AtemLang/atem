#ifndef META_VALUEDECLASTNODE_H
#define META_VALUEDECLASTNODE_H

#include "meta-compiler/include/AST/NamedDeclASTNode.h"

namespace meta {
    class ValueDeclASTNode : NamedDeclASTNode {
    public:
        ~ValueDeclASTNode() override {}
        auto CodeGen() -> llvm::Value* override {}
    };
}

#endif //META_VALUEDECLASTNODE_H
