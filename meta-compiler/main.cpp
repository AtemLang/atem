#include <iostream>
#include "meta-compiler/include/Utils/co_resource.h"

int main() {
    auto coro = []() -> meta::co_resource<int> {
        std::cout << "cores test" << std::endl;
        co_yield 1;
        std::cout << "test done" << std::endl;
    }();
    std::cout << *coro << std::endl;
    return 0;
}
