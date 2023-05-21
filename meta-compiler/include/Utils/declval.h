#ifndef META_DECLVAL_H
#define META_DECLVAL_H

namespace meta::declval_detail {
    template<typename T>
    using add_rref_t = T &&;
}

#define DECLVAL(...) (((::meta::declval_detail::add_rref_t<__VA_ARGS__>(*)())(void*)(nullptr))())

#endif //META_DECLVAL_H
