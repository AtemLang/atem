# Standard Atem Sub-Language Document

## Introduction

Standard Atem Language(std-atem) is a general purpose programming sub-language built on the Atem Core Language(core-atem). std-atem takes inspiration from many other languages like C++,  [Cpp2](https://github.com/hsutter/cppfront), [Circle](circle-lang.org), [Carbon](https://github.com/carbon-language/carbon-lang), [Rust](https://www.rust-lang.org/), [Swift](https://www.swift.org/documentation/), [D](https://dlang.org/), and [Zig](https://ziglang.org/). You can use std-atem by importing the `std.stdatem` package.

## Design Goals

We expect that many sub-language, software and library will be built on the std-atem, so we set a few design goals for std-atem(in no particular order):

* **Performant**
* **Scalable**
* **Robust**
* **Extensible and Customizable**
* **Expressive**
* **Consistent**
* **Opt-in Safety**

## std-atem Standard Library

std-atem has its own standard library(called std-atem-lib) which contains commonly used algorithms, data structures,  and many other tools to help you build programs on std-atem. The std-atem-lib also has its own documentation, see [here]().

## Hello World

```
//hello.atem
import std.stdatem;
import std.stdatemlib;

main: func {
	std.stdatemlib.io.println("Hello World!");
}
```

The std-atem code sample above demonstrates how to create a program in std-atem that will output `"Hello World!"`.

## Comments

### Single-Line Comments

### Multiple-Line Comments

### Doc Comments

## Values and Types

### Built-in Types

### Built-in Values

### Integer Literals

### Float Literals

### String Literals

### Interpolated String Literals

### Multiline String Literals

## Variables

## Operators

## Functions

## Blocks

## if

## for

## while

## switch

## Generics

### Introducing std-atem Generic Model

## Metaprogramming

## Build Environment

## Appendix

### Keywords

### std-atem Module Structure

### std-atem Style Guide

* If `foo` is a type, then `foo` should be `TitleCase`.
* If `foo` is a callable object and `foo`'s return type is not `void`, then `foo` should be `TitleCase`.
* If `foo` is a callable object with `void` return type, then `foo` should be `camelCase`.
* Otherwise the `foo` should be `snake_case`.