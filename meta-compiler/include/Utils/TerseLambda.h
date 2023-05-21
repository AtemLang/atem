#ifndef META_TERSELAMBDA_H
#define META_TERSELAMBDA_H

#include "meta-compiler/include/Utils/fwd.h"
#include "meta-compiler/include/Utils/declval.h"

namespace meta::tl_detail {
    class no_argument_provided {
        ~no_argument_provided() = default;

        no_argument_provided() = default;

        no_argument_provided(no_argument_provided &&) = delete;

    public:
        static no_argument_provided instance;
    };

    inline no_argument_provided no_argument_provided::instance;

    template<int>
    constexpr no_argument_provided &nth_arg() noexcept {
        return no_argument_provided::instance;
    }

    template<int I, typename A, typename... Tail>
    constexpr decltype(auto) nth_arg(A &&first [[maybe_unused]], Tail &&... tail [[maybe_unused]]) {
        if constexpr (I == 0) {
            return NEO_FWD(first);
        } else {
            return nth_arg<I - 1>(NEO_FWD(tail)...);
        }
    }

    template<int I, typename... TlArgs>
    using nth_arg_t = decltype(nth_arg<I>(DECLVAL(TlArgs)...));
}

#define TL_REQUIRES(...)                                                                       \
    requires(::meta::tl_detail::nth_arg_t<0, TlArgs...> _1 [[maybe_unused]],                        \
             ::meta::tl_detail::nth_arg_t<1, TlArgs...> _2 [[maybe_unused]],                        \
             ::meta::tl_detail::nth_arg_t<2, TlArgs...> _3 [[maybe_unused]],                        \
             ::meta::tl_detail::nth_arg_t<3, TlArgs...> _4 [[maybe_unused]]) {                      \
        __VA_ARGS__;                                                                               \
    }
// clang-format on

// Roughly based on https://github.com/Quincunx271/TerseLambda
#if defined(_MSC_VER)
#define CTL(...)                                                                               \
    <typename... TlArgs>(TlArgs && ... _args)                                                      \
        ->decltype(auto) requires(NEO_TL_REQUIRES(__VA_ARGS__)) {                                  \
        [[maybe_unused]] auto&& _1 = ::meta::tl_detail::nth_arg<0>(FWD(_args)...);              \
        [[maybe_unused]] auto&& _2 = ::meta::tl_detail::nth_arg<1>(FWD(_args)...);              \
        [[maybe_unused]] auto&& _3 = ::meta::tl_detail::nth_arg<2>(FWD(_args)...);              \
        [[maybe_unused]] auto&& _4 = ::meta::tl_detail::nth_arg<3>(FWD(_args)...);              \
        return (__VA_ARGS__);                                                                      \
    }
#else
#define CTL(...)                                                                               \
    <typename... TlArgs>(TlArgs && ... _args) noexcept(TL_REQUIRES({ __VA_ARGS__ } noexcept))  \
        ->decltype(auto) requires(TL_REQUIRES(__VA_ARGS__)) {                                  \
        [[maybe_unused]] auto&& _1 = ::meta::tl_detail::nth_arg<0>(FWD(_args)...);              \
        [[maybe_unused]] auto&& _2 = ::meta::tl_detail::nth_arg<1>(FWD(_args)...);              \
        [[maybe_unused]] auto&& _3 = ::meta::tl_detail::nth_arg<2>(FWD(_args)...);              \
        [[maybe_unused]] auto&& _4 = ::meta::tl_detail::nth_arg<3>(FWD(_args)...);              \
        return (__VA_ARGS__);                                                                      \
    }
#endif

#define TL [&] CTL

#endif //META_TERSELAMBDA_H