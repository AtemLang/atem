# Standard Atem Sub-Language Document

## Table of Contents

[TOC]

## Introduction

**WARNING: Standard Atem Sub-language is highly experimental.**

Standard Atem Sub-language(std-atem) is a general purpose programming sub-language built on the Atem Core Language(core-atem). std-atem takes inspiration from many other languages like C++,  [Cpp2](https://github.com/hsutter/cppfront), [Circle](circle-lang.org), [Carbon](https://github.com/carbon-language/carbon-lang), [Rust](https://www.rust-lang.org/), [Swift](https://www.swift.org/documentation/), [D](https://dlang.org/), and [Zig](https://ziglang.org/). You can use std-atem by importing the `std.stdatem` module.

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

A single-line comment starts with two slashes `//` in std-atem:

```atem
import std.stdatem;
import std.stdatemlib;

main: func {
	//A program that will output "Hello World" to the console
	std.stdatemlib.io.println("Hello World!");	//Using println function to print
}
```

### Multiple-Line Comments

A multiple-line comment is contained in `//{...}//` block:

```atem
//{
importing the std-atem modules

:)
}//
import std.stdatem;
import std.stdatemlib;

main: func {
	std.stdatemlib.io.println("Hello World!");
}
```

### Doc Comments

## Values and Types

### Built-in Types

| Type | Description                                                  |
| ---- | ------------------------------------------------------------ |
| i8   | Signed 8-bit integer                                         |
| i16  | Signed 16-bit integer                                        |
| i32  | Signed 32-bit integer                                        |
| i64  | Signed 64-bit integer                                        |
| i128 | Signed 128-bit integer                                       |
| u8   | Unsigned 8-bit integer                                       |
| u16  | Unsigned 16-bit integer                                      |
| u32  | Unsigned 32-bit integer                                      |
| u64  | Unsigned 64-bit integer                                      |
| u128 | Unsigned 128-bit integer                                     |
| f16  | 16-bit floating point (10-bit mantissa) IEEE-754-2008 binary16 |
| f32  | 32-bit floating point (23-bit mantissa) IEEE-754-2008 binary32 |
| f64  | 64-bit floating point (52-bit mantissa) IEEE-754-2008 binary64 |
| f80  | 80-bit floating point (64-bit mantissa) IEEE-754-2008 80-bit extended precision |
| f128 | 128-bit floating point (112-bit mantissa) IEEE-754-2008 binary128 |
| bool | `true` or `false`                                            |
| void |                                                              |
|      |                                                              |
|      |                                                              |
|      |                                                              |
|      |                                                              |
|      |                                                              |
|      |                                                              |
|      |                                                              |

### Built-in Values

| Value     | Description                              |
| --------- | ---------------------------------------- |
| true      | `bool` value                             |
| false     | `bool` value                             |
| undefined | Used to leave variables' value undefined |
| null      | The value of null optionals and pointers |

### Integer Literals

### Float Literals

### String Literals

### Interpolated String Literals

### Multiline String Literals

## Variables

## Arrays

### Array Literals

### Fixed-size Arrays

### Dynamic-size Arrays

### Associative Arrays

## Pointers

### Raw Pointers

### Unique Pointers

### Shared Pointers

## Operators

### Table of Operators

#### Arithmetic Operators

| Syntax     | Description               | Operator Category                  | Overloadable | Example |
| ---------- | ------------------------- | ---------------------------------- | ------------ | ------- |
| `a + b`    | Addition                  | stdatem.operator.arithmetic.binary | Yes          |         |
| `a +% b`   | Wrapping Addition         | stdatem.operator.arithmetic.binary | Yes          |         |
| `a +\| b`  | Saturating Addition       | stdatem.operator.arithmetic.binary | Yes          |         |
| `a - b`    | Subtraction               | stdatem.operator.arithmetic.binary | Yes          |         |
| `a -% b`   | Wrapping Subtraction      | stdatem.operator.arithmetic.binary | Yes          |         |
| `a -\| b`  | Saturating Subtraction    | stdatem.operator.arithmetic.binary | Yes          |         |
| `a * b`    | Multiplication            | stdatem.operator.arithmetic.binary | Yes          |         |
| `a *% b`   | Wrapping Multiplication   | stdatem.operator.arithmetic.binary | Yes          |         |
| `a *\| b`  | Saturating Multiplication | stdatem.operator.arithmetic.binary | Yes          |         |
| `a / b `   | Division                  | stdatem.operator.arithmetic.binary | Yes          |         |
| `a % b`    | Remainder Division        | stdatem.operator.arithmetic.binary | Yes          |         |
| `-a`       | Negation                  | stdatem.operator.arithmetic.unary  | Yes          |         |
| `-%a`      | Wrapping Negation         | stdatem.operator.arithmetic.unary  | Yes          |         |
| `a ** b`   | Power                     | stdatem.operator.arithmetic.binary | Yes          |         |
| `a **% b`  | Wrapping Power            | stdatem.operator.arithmetic.binary | Yes          |         |
| `a **\| b` | Saturating Power          | stdatem.operator.arithmetic.binary | Yes          |         |

#### Assignment Operators

| Syntax     | Description                              | Operator Category                  | Overloadable | Example |
| ---------- | ---------------------------------------- | ---------------------------------- | ------------ | ------- |
| `a = b`    | Simple Assignment                        | stdatem.operator.assignment.binary | Yes          |         |
| `a += b`   | Addition Assignment                      | stdatem.operator.assignment.binary | Yes          |         |
| `a +&= b`  | Wrapping Addition Assignment             | stdatem.operator.assignment.binary | Yes          |         |
| `a +\|= b` | Saturating Addition Assignment           | stdatem.operator.assignment.binary | Yes          |         |
| `a -= b`   | Subtraction Assignment                   | stdatem.operator.assignment.binary | Yes          |         |
| `a -%= b`  | Wrapping Subtraction Assignment          | stdatem.operator.assignment.binary | Yes          |         |
| `a -\|= b` | Saturating Subtraction Assignment        | stdatem.operator.assignment.binary | Yes          |         |
| `a *= b`   | Multiplication Assignment                | stdatem.operator.assignment.binary | Yes          |         |
| `a *%= b`  | Wrapping Multiplication Assignment       | stdatem.operator.assignment.binary | Yes          |         |
| `a *\|= b` | Saturating Multiplication Assignment     | stdatem.operator.assignment.binary | Yes          |         |
| `a /= b`   | Division Assignment                      | stdatem.operator.assignment.binary | Yes          |         |
| `a %= b`   | Remainder Division Assignment            | stdatem.operator.assignment.binary | Yes          |         |
| `<<=`      | Bitwise Left Shift Assignment            | stdatem.operator.assignment.binary | Yes          |         |
| `<<\|=`    | Saturating Bitwise Left Shift Assignment | stdatem.operator.assignment.binary | Yes          |         |
| `>>=`      | Bitwise Right Shift Assignment           | stdatem.operator.assignment.binary | Yes          |         |
| `&=`       | Bitwise AND Assignment                   | stdatem.operator.assignment.binary | Yes          |         |
| `\|=`      | Bitwise OR Assignment                    | stdatem.operator.assignment.binary | Yes          |         |
| `^=`       | Bitwise NOT Assignment                   | stdatem.operator.assignment.binary | Yes          |         |

#### Comparison Operators

| Syntax    | Description              | Operator Category                  | Overloadable | Example |
| --------- | ------------------------ | ---------------------------------- | ------------ | ------- |
| `a > b`   | Greater than             | stdatem.operator.comparison.binary | Yes          |         |
| `a < b`   | Less than                | stdatem.operator.comparison.binary | Yes          |         |
| `a >= b`  | Greater than or Equal to | stdatem.operator.comparison.binary | Yes          |         |
| `a <= b`  | Less than or Equal to    | stdatem.operator.comparison.binary | Yes          |         |
| `a != b`  | Not Equal to             | stdatem.operator.comparison.binary | Yes          |         |
| `a == b`  | Equal to                 | stdatem.operator.comparison.binary | Yes          |         |
| `a <=> b` | Three-way Comparison     | stdatem.operator.comparison.binary | Yes          |         |

#### Logical Operators

| Syntax    | Description | Operator Category               | Overloadable | Example |
| --------- | ----------- | ------------------------------- | ------------ | ------- |
| `not a`   | Logical NOT | stdatem.operator.logical.unary  | Yes          |         |
| `a and b` | Logical AND | stdatem.operator.logical.binary | Yes          |         |
| `a or b`  | Logical OR  | stdatem.operator.logical.binary | Yes          |         |

#### Bitwise Operators

| Syntax     | Description                   | Operator Category               | Overloadable | Example |
| ---------- | ----------------------------- | ------------------------------- | ------------ | ------- |
| `~a`       | Bitwise NOT                   | stdatem.operator.bitwise.unary  | Yes          |         |
| `a & b`    | Bitwise AND                   | stdatem.operator.bitwise.binary | Yes          |         |
| `a \| b`   | Bitwise OR                    | stdatem.operator.bitwise.binary | Yes          |         |
| `a ^ b`    | Bitwise XOR                   | stdatem.operator.bitwise.binary | Yes          |         |
| `a << b`   | Bitwise Left Shift            | stdatem.operator.bitwise.binary | Yes          |         |
| `a <<\| b` | Saturating Bitwise Left Shift | stdatem.operator.bitwise.binary | Yes          |         |
| `a >> b`   | Bitwise Right Shift           | stdatem.operator.bitwise.binary | Yes          |         |

#### Reflection Operators

| Syntax | Description | Operator Category                 | Overloadable | Example |
| ------ | ----------- | --------------------------------- | ------------ | ------- |
| `^a`   | Reflection  | stdatem.operator.reflection.unary | **NO**       |         |
| `#a`   | Reification | stdatem.operator.reflection.unary | **NO**       |         |

#### Other Operators

### Precedence

## Functions

### Normal Functions

### Lambdas

## Namespaces

## Modules

## Blocks

### Labelled Blocks

## User-Defined Types

### Structs

### Enums

### Unions

### Classes

### Concepts and Implements

## Statements

### if

### for

### while

### switch

## Expressions

### Typed Expression

## Exception Handling

### Throwing Exceptions

### Catching Exceptions

### Runtime-Attached Exceptions

## Debug and Test

## Packs

### Pack Literals

## Tuples

### Tuple Literals

## Generics

### Introducing std-atem Generic Model

## Metaprogramming

### Static Reflection

### Static Code Injection

## Safety

### Safety Profiles

## Undefined Behavior

## Build Environment

## Appendix

### Keywords

### std-atem Module Structure

### std-atem Style Guide

* If `foo` is a type, then `foo` should be `TitleCase`.
* If `foo` is a callable object and `foo`'s return type is not `void`, then `foo` should be `TitleCase`.
* If `foo` is a callable object with `void` return type, then `foo` should be `camelCase`.
* Otherwise the `foo` should be `snake_case`.

### Compiler Built-in Functions