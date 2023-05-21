#ifndef META_DECLASTNODE_H
#define META_DECLASTNODE_H

#include "meta-compiler/include/AST/ASTNode.h"

namespace meta {
    class DeclASTNode : public ASTNode {
    public:
        ~DeclASTNode() override {}
        auto CodeGen() -> llvm::Value* override = 0;
    };

    class NamedDeclASTNode : public DeclASTNode {
    public:
        ~NamedDeclASTNode() override {}
        auto CodeGen() -> llvm::Value* override = 0;
    };

    class ValueDeclASTNode : NamedDeclASTNode {
    public:
        ~ValueDeclASTNode() override {}
        auto CodeGen() -> llvm::Value* override {}
    };

    class FunctionDeclASTNode : ValueDeclASTNode {
    public:
        ~FunctionDeclASTNode() override {}
        auto CodeGen() -> llvm::Value* override {}
    };
}

#endif //META_DECLASTNODE_H
