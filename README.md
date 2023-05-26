# The Atem Programming Language

## Introduction

Atem is a minimalist, general-purpose, and modern programming language focusing on providing a fine-grained powerful metaprogramming system.

Atem is originally based on the "freedom of programming paradigms" provided by C++ metaprogramming system, and it also takes inspirations from many other languages like [Cpp2](https://github.com/hsutter/cppfront), [Circle](circle-lang.org), [Carbon](https://github.com/carbon-language/carbon-lang), [Rust](https://www.rust-lang.org/), [Swift](https://www.swift.org/documentation/), [D](https://dlang.org/) and [Zig](https://ziglang.org/).

## *We limited us to a hilariously simple core language...*

At first glance, there's nothing new showed in the Atem "Hello World!" example...

```atem
module main;

import std.io.println;

main: func = {
	std.io.println("Hello World!");
}
```

...until when you want to write a simple if statement...

```atem
module main;

main: func = {
	if (//something...){
		//something...
	} 
	else {
		//something...
	}
}
```

...then you will find the compiler says there is no identifier named "`if`"!

To make the if example well-formed, all we need to do is to add a simple `import`.

```atem
module main;

import std.infrastructure.keywords;

main: func = {
	if (//something...){
		//something...
	} 
	else {
		//something...
	}
}
```

Now the compiler will compile it happily!

## *...to get unlimited possibilities*

*But what really happens?*

The simple `if` example shows us the unlimited power of Atem. Actually
