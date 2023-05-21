#ifndef META_VALUESTMTASTNODE_H
#define META_VALUESTMTASTNODE_H

#include "meta-compiler/include/AST/StmtASTNode.h"

namespace meta {
    class ValueStmtASTNode : public StmtASTNode {
    public:
        ~ValueStmtASTNode() override {}
        auto CodeGen() -> llvm::Value* override = 0;
    };
}

#endif //META_VALUESTMTASTNODE_H
