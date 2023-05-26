#ifndef META_ADDRESSOF_H
#define META_ADDRESSOF_H

#ifdef __has_builtin
#define HAS_BUILTIN(X) __has_builtin(X)
#elif defined(_MSC_VER)
#define HAS_BUILTIN(X) NEO_IS_EMPTY(NEO_CONCAT(NEO_MSVC_HAS_BUILTIN, X))
#else
#define HAS_BUILTIN(X) 0
#endif

#if (HAS_BUILTIN(__builtin_addressof) || defined(_MSC_VER))
#define HAS_ADDROF_INTRIN 1
#endif
// clang-format on

#ifndef HAS_ADDROF_INTRIN
#include <memory>
#endif

namespace atem {

/**
 * @brief Obtain a pointer to the given argument, even if that object overloads the address-of
 * operator
 */
    template <typename T>
    constexpr T* addressof(T& arg) noexcept {
#if HAS_ADDROF_INTRIN
        return __builtin_addressof(arg);
#else
        return std::addressof(arg);
#endif
    }

    template <typename T>
    const T& addressof(const T&&) = delete;

#if HAS_ADDROF_INTRIN
#define ADDRESSOF(X) __builtin_addressof((X))
#else
#define ADDRESSOF(X) std::addressof((X))
#endif

}  // namespace atem

#ifdef HAS_ADDROF_INTRIN
#undef HAS_ADDROF_INTRIN
#endif

#endif //META_ADDRESSOF_H
