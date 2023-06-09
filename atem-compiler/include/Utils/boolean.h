#ifndef ATEM_BOOLEAN_H
#define ATEM_BOOLEAN_H

#include <concepts>
#include <compare>

namespace atem {
    struct boolean final {
        bool _val;

        // [1]
        template <std::convertible_to<bool> T>
        explicit(!std::same_as<T, bool>)
        constexpr boolean(T b) noexcept
                : _val(b) {}

        // [2]
        template <std::constructible_from<bool> T>
        explicit(!std::same_as<bool, T>)
        constexpr operator T() const noexcept
        { return T(_val); }

        // [3]
        constexpr boolean operator!() const noexcept
        { return !_val; }

        // [4]
        constexpr boolean operator==(bool other) const noexcept
        { return bool(*this) == other; }
        constexpr boolean operator!=(bool other) const noexcept
        { return bool(*this) != other; }

        // [5]
        constexpr auto operator<=>(bool other) const noexcept
        { return bool(*this) <=> other; }
    };
}

#endif //ATEM_BOOLEAN_H
