#ifndef ATEM_LIFT_H
#define ATEM_LIFT_H

#include "atem-compiler/include/Utils/fwd.h"

#define LIFT(func) \
[&](auto&& ...args)\
noexcept(noexcept(func(FWD(args)...)))\
-> decltype(func(FWD(args)...)) {\
    return func(FWD(args)...);\
}

#endif //ATEM_LIFT_H