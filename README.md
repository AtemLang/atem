# The Atem Programming Language

## Introduction

Atem is a minimalist, general-purpose, and modern programming language focusing on providing a fine-grained powerful metaprogramming system.

Atem is originally based on the "freedom of programming paradigms" provided by C++ metaprogramming system, and it also takes inspirations from many other languages like [Cpp2](https://github.com/hsutter/cppfront), [Circle](circle-lang.org), [Carbon](https://github.com/carbon-language/carbon-lang), [Rust](https://www.rust-lang.org/), [Swift](https://www.swift.org/documentation/), [D](https://dlang.org/) and [Zig](https://ziglang.org/).

**WARNING: Atem is a highly experimental and is still in the proof-of-concept stage.**

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

The simple `if` example shows us the unlimited power of Atem. Actually the `if` statement is implemented by the standard library!

*How is it possible?*

Well, Atem gives users the ability to introspect, modify and even extend the language constructs by a powerful AST-level metaprogramming system. Consider the implementation of `if`:

```atem
module std.infrastructure.keywords;

import std.__low_level.language_construct;
import std.meta;
import std.reflection;

if_impl: 
@language_construct(
    construct_type = if_ast_node_impl,
    pattern = <fragment::pattern>{
        `if`(${cond: ^Expression})
            {true_branch: () -> ()}
        `else`
            {false_branch: () -> ()}
    }
) 
@expect(cond.valueof().typeof().is_convertible_to(bool))
@constant_evaluated
func = {
    __builtin_if_statement(cond.is_constant_expression() {
        __builtin_if_statement(cond.value()) {
            return true_branch;
        } false: {
            return false_branch;
        }
    } false: {
        return __builtin_if_statement($cond, true_branch, false_branch)
    }
}
```

*You mean we can define our unique keywords and statements?*

Not only keywords and statements, Atem also provides a rich set of tools to define your *own* operators, types, expressions, or even extension to the metaprogramming system! The unique capacity of Atem enable us to transform our favorite programming paradigms and models into a *real* language that use your favorite syntaxes. For example, we could build a different generics model that has complete type-checking and uses witness table based boxing to implement (The default generics model of Atem is compile-time duck-typed and uses template based monomorphization to implement), or even implement a borrow checker that ensures strict memory safety in a Rust-like way.

## Design Goals

What should the "Programming Language of Future" looks like?

Should it support low-level assembly-like operations like C?

Should it support a flexible dynamic system like Python?

Should it support zero-overhead abstraction like C++?

Should it support functional programming like Haskell?

Should it support safety-by-construction like Rust?

...

There are so many potential designs to the problem, and all of them have their own advantages and disadvantages. Is there a way to combine all designs together and avoid their drawbacks?

Atem has a answer: A "Programming Language of Programming Language".

## How to...

**WIP**

### Seek Help and Solution to Specific Problem?

### Submit a Suggestion?

### Join us

