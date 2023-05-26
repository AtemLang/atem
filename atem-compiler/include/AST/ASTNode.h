#ifndef ATEM_ASTNODE_H
#define ATEM_ASTNODE_H

#include "llvm/IR/DerivedTypes.h"
#include "llvm/IR/IRBuilder.h"
#include "llvm/IR/LLVMContext.h"
#include "llvm/IR/Module.h"
#include "llvm/IR/Verifier.h"

namespace atem {
    class ASTNode {
    public:
        virtual ~ASTNode() {}
        virtual auto CodeGen() -> llvm::Value* = 0;
    };
}

#endif //ATEM_ASTNODE_H
