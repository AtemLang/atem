#include "meta-compiler/include/AST/ASTNode.h"

namespace meta {
    ASTNode::~ASTNode() {}
    auto ASTNode::CodeGen() -> llvm::Value * {}
}