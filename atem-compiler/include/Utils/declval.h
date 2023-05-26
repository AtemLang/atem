#ifndef META_DECLVAL_H
#define META_DECLVAL_H

namespace atem::declval_detail {
    template<typename T>
    using add_rref_t = T &&;
}

#define DECLVAL(...) (((::atem::declval_detail::add_rref_t<__VA_ARGS__>(*)())(void*)(nullptr))())

#endif //META_DECLVAL_H
