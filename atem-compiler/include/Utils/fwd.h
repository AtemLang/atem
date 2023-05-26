#ifndef META_FWD_H
#define META_FWD_H

namespace atem::move_detail {

    template <typename T>
    struct strip_type {
        using type = T;
    };

    template <typename T>
    struct strip_type<T&> {
        using type = T;
    };

    template <typename T>
    struct strip_type<T&&> {
        using type = T;
    };

#ifdef __GNUC__
#define _atem_typeof_noref(...) __typeof__((__VA_ARGS__))
#else
#define _atem_typeof_noref(...) typename ::atem::move_detail::strip_type<decltype(__VA_ARGS__)>::type
#endif

}  // namespace atem::move_detail

/**
 * @brief Like std::move, but less overhead
 */
#define MOVE(...) static_cast<_atem_typeof_noref(__VA_ARGS__) &&>(__VA_ARGS__)

/**
 * @brief Equivalent to std::forward<decltype(Expr)&&>(expr)
 */
#define FWD(...) static_cast<decltype(__VA_ARGS__)&&>(__VA_ARGS__)

#endif //META_FWD_H
