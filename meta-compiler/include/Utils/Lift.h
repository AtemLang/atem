#ifndef META_LIFT_H
#define META_LIFT_H

#include "meta-compiler/include/Utils/fwd.h"

#define LIFT(func) \
[&](auto&& ...args)\
noexcept(noexcept(func(FWD(args)...)))\
-> decltype(func(FWD(args)...)) {\
    return func(FWD(args)...);\
}

#endif //META_LIFT_H