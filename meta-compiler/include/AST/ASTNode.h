#ifndef META_ASTNODE_H
#define META_ASTNODE_H

#include "llvm/IR/DerivedTypes.h"
#include "llvm/IR/IRBuilder.h"
#include "llvm/IR/LLVMContext.h"
#include "llvm/IR/Module.h"
#include "llvm/IR/Verifier.h"

namespace meta {
    class ASTNode {
    public:
        virtual ~ASTNode() {}
        virtual auto CodeGen() -> llvm::Value* = 0;
    };
}

#endif //META_ASTNODE_H
