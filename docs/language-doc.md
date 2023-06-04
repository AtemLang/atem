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

| Type      | Description                                                  | Default Initializer |
| --------- | ------------------------------------------------------------ | ------------------- |
| i8        | Signed 8-bit integer                                         | 0:i8                |
| i16       | Signed 16-bit integer                                        | 0:i16               |
| i32       | Signed 32-bit integer                                        | 0:i32               |
| i64       | Signed 64-bit integer                                        | 0:i64               |
| i128      | Signed 128-bit integer                                       | 0:i128              |
| u8        | Unsigned 8-bit integer                                       | 0:u8                |
| u16       | Unsigned 16-bit integer                                      | 0:u16               |
| u32       | Unsigned 32-bit integer                                      | 0:u32               |
| u64       | Unsigned 64-bit integer                                      | 0:u64               |
| u128      | Unsigned 128-bit integer                                     | 0:u128              |
| f16       | 16-bit floating point (10-bit mantissa) IEEE-754-2008 binary16 | 0.0:f16             |
| f32       | 32-bit floating point (23-bit mantissa) IEEE-754-2008 binary32 | 0.0:f32             |
| f64       | 64-bit floating point (52-bit mantissa) IEEE-754-2008 binary64 | 0.0:f64             |
| f80       | 80-bit floating point (64-bit mantissa) IEEE-754-2008 80-bit extended precision | 0.0:f80             |
| f128      | 128-bit floating point (112-bit mantissa) IEEE-754-2008 binary128 | 0.0:f128            |
| bool      | `true` or `false`                                            | false               |
| void      |                                                              | void{}              |
| c8        | UTF-8 code unit                                              | '\xFF'              |
| c16       | UTF-16 code unit                                             | '\uFFFF'            |
| c32       | UTF-32 code unit                                             | '\U0000FFFF'        |
| string    | Built-in runtime string type                                 | "":string           |
| ct_int    | Type of integer literals, used in compile-time integer operations | 0                   |
| ct_float  | Type of float literals, used in compile-time float operations | 0.0                 |
| ct_string | Type of string literals, used in compile-time string operations | ""                  |
| ct_char   | Type of char literals, used in compile-time char operations  | '\xFF'              |

### Built-in Values

| Value     | Description                                   |
| --------- | --------------------------------------------- |
| true      | `bool` value                                  |
| false     | `bool` value                                  |
| undefined | Used to leave variable's value undefined      |
| null      | The value of null optionals and pointers      |
| default   | Used to invoke variable's default initializer |

### Integer Literals

```atem
decimal := 114514;
hex := 0xff;
another_hex := 0xFF;
octal := 0o76;
binary := 0b100111;

//underscores may be placed between two digits as a visual separator
underscore_separator := 100_000_000;
```

### Float Literals

```atem
floating_point := 123.0E+77;
another_float := 123.0;
yet_another := 123.0e+77;

hex_floating_point := 0x103.70p-5;
another_hex_float := 0x103.70;
yet_another_hex_float := 0x103.70P-5;

//underscores may be placed between two digits as a visual separator
lightspeed := 299_792_458.000_000;
nanosecond := 0.000_000_001;
more_hex := 0x1234_5678.9ABC_CDEFp-10;
```

### Character Literals

A character literal is a character quote by `''`:

```atem
char : test "Character Literals" = {
	c := 'a':c8;
	nl := '\n':c8;
}
```

### String Literals

#### String Literals

A string literal is a character sequence quoted by `""`, the character sequence may contains [escape sequences](#escape-sequences):

```atem
string : test "String Literals" = {
	str1 := "Hello World!";
	escape := "next line\n";
}
```

#### Interpolated String Literals

A interpolated string literal is a character sequence which contains capture expressions. The interpolated string literal needs to be quoted by `""`:

```atem
fstring : test "Interpolated String Literals" = {
	i := 42:i32;
	b := true;
	arr : [_]i32 = {1, 1, 5};
	fstr := "i = i$, b = b$, arr = arr$";
	assert(fstr == "i = 42, b = true, arr = {1, 1, 5}");
}
```

#### Raw String Literals

A raw string literal is a character sequence quoted by `R"()"`:

```atem
raw_string : test "Raw String Literals" = {
	no_escape := R"(next line\n)";
	assert(no_escape == "next line\\n");
}
```

#### Interpolated Raw String Literals

A raw string literal is a character sequence quoted by `R"()"`, the character sequence contains capture expressions:

```atem
raw_fstring : test "Interpolated Raw String Literals" = {
	i := 42:i32;
	b := true;
	arr : [_]i32 = {1, 1, 5};
	fstr := R"(i = "i$", b = "b$", arr = "arr$")";
	assert(fstr == "i = \"42\", b = \"true\", arr = \"{1, 1, 5}\"");
}
```

#### Multiline String Literals

Multiline string literals have no escapes and can span across multiple lines. To start a multiline string literal, use the `\\` token. Just like a comment, the string literal goes until the end of the line. The end of the line is not included in the string literal. However, if the next line begins with `\\` then a newline is appended and the string literal continues.

```atem
multiline_string : test "Multiline String Literals" = {
	multiline_str := 
	\\#include <stdio.h>
    \\
    \\int main(int argc, char **argv) {
    \\    printf("hello world\n");
    \\    return 0;
    \\}
    ;
}
```

#### Escape Sequences

| Escape Sequence | Description                                                  |
| --------------- | ------------------------------------------------------------ |
| `\\'`           | Single quote                                                 |
| `\\"`           | Double quote                                                 |
| `\\?`           | Question mark                                                |
| `\\\\`          | Backslash                                                    |
| `\\a`           | Audible bell                                                 |
| `\\b`           | Backspace                                                    |
| `\\f`           | Form feed - new page                                         |
| `\\n`           | Line feed - new line                                         |
| `\\r`           | Carriage return                                              |
| `\\t`           | Horizontal tab                                               |
| `\\v`           | Vertical tab                                                 |
| `\\o{NN}`       | Arbitrary octal value                                        |
| `\\x{NN}`       | Arbitrary hexadecimal value                                  |
| `\\b{NN}`       | Arbitrary binary value                                       |
| `\\u{NNN}`      | Arbitrary [Unicode](https://en.wikipedia.org/wiki/Unicode) value |

## Variables

### No Identifier Shadowing

Variable identifiers are never allowed to shadow the identifiers from outer scope:

```atem
foo := 1;
{
	foo := 2;	//compile error
}
```

If you can confirm that you really need name shadowing(why?), you can annotate the variable with `@shadowing`:

```atem
foo := 1;
{
	foo @shadowing := 2;	//good
}
```

Or you can just turn the compile-time safety check off by using the `@compileTimeSafetyProfile()`(but again, why you need this?):

```atem
foo := 1;
@compileTimeSafetyProfile(safety.compiletime.ruleset.no_shadowing, false);
{
	foo @shadowing := 2;	//good
}
```

### Long Identifiers

Normal identifiers can only contains numbers, characters, and underscores. You can make the identifier to be regular string by using `@""`s to quote them:

```atem
@"hey i am a variable with a very long identifier!" := "Hello";
```

The long identifiers are also allowed to be the same as keywords:

```atem
@"true" := true;
assert(@"true" == true);
```

### Variables and Constants

You can specify the mutability of variables by adding a `const/mutable` specifier to it, you can't modify variable that is `const`:

```atem
foo := 1;
//equals to:
foo const := 1;
foo = 2;	//error! try to assign a constant

bar mutable := 2;
bar = 42;	//good
```

`const/mutable` will be part of the variable's type:

```atem
foo const := 1:i32;
bar mutable := 2:i32;
//equals to:
foo : const i32 := 1;
bar : mutable i32 := 1;
//or
bar : i32 := 1;
```

You can remove the `const` in type by type traits:

```atem
foo : const i32 = 1;
BarType := foo~getType()~removeConst();
bar : BarType = 2;
bar = 42;	//good
```

### Storage Duration Specifiers

#### Global Storage Duration Specifier

The global variables have static lifetime and order-independent. Their initializer are implicitly compile-time. The variables declares in the module level are implicitly global.

#### Static Storage Duration Specifier

The static variables also have static lifetime and order-independent. Their initializer are implicitly compile-time. Only the variables declares in the block level can be static.

#### Thread-Local Storage Duration Specifier

#### Local Storage Duration Specifier

## Integers

## Floats

## Strings

### Compile-time String Operations

### Runtime String Operations

## Arrays

### Array Literals

### Fixed-sized Arrays

You can create fixed-sized arrays by using `[size]Type`, the `size` must be a compile-time known positive integer:

```atem
arr: [5]i32 = {1, 2, 3, 4, 5};
```

You can also let the length of array to be deduced by using `[_]Type`:

```atem
arr: [_]bool = {true, false, false, true, true, true};
```

If you want to access the nth elements in the array, you can use `arr[index]` :

```atem
arr: [5]i32 = {1, 2, 3, 4, 5};
foo := arr[3];
bar := arr[foo];
```

The array element access is bound-checked when `@runtimeSafety` is on.

#### Fixed-sized Array Members

| Name            | Type                  | Description                                |
| --------------- | --------------------- | ------------------------------------------ |
| .length()       | Const Member Function | Return the length of the array             |
| .memoryLayout() | Const Member Function | Return the memory layout type of the array |
|                 |                       |                                            |

### Multidimension Arrays

Adding multiple square bracket will make a multidimension array, e.g. `[1][2][3]i32` will create a 1×2×3 array.

```atem
multi_arr: [2][4]i32 = { {1, 2}, {4, 8}, {16, 32}, {64, 128} };
```

To access the elements in the multidimension array, use `[a, b, c...]arr` syntax:

```atem
multi_arr: [2][4]i32 = { {1, 2}, {4, 8}, {16, 32}, {64, 128} };
foo := multi_arr[1, 2];
```

#### Multidimension Array Members

| Name | Type | Description |
| ---- | ---- | ----------- |
|      |      |             |
|      |      |             |
|      |      |             |



### Dynamic-sized Arrays

You can create dynamic-sized arrays by using `[]Type`:

```atem
dynarr: []i32 = {1, 2, 3};
```

The length of dynamic-sized arrays can be modified by using the `setArrayLength()` member function:

```atem
dynarr mutable: []i32 = {1, 2, 3};
dynarr.setArrayLength(8);
dynarr[7] = 5;	//good
```

#### Dynamic-sized Array Members

| Name | Type | Description |
| ---- | ---- | ----------- |
|      |      |             |
|      |      |             |
|      |      |             |



### Associative Arrays

You can create associative arrays by `[IndexType]ValueType`:

```atem
map mutable: [string]i32 = { {"world": 1}, {"!": 2} };
map["hello"] = 42;
foo = map["hello"];
```

To remove a key-value pair from associative arrays, use the `remove` member function:

```atem
map mutable: [string]i32 = { {"hello": 0}, {"world": 1}, {"!": 2} };
map.remove("hello");
```

#### Associative Array Members

| Name | Type | Description |
| ---- | ---- | ----------- |
|      |      |             |
|      |      |             |
|      |      |             |



### Partial Accessing

```atem
multiarr: [3][3]i32 = 
{
	{1, 2, 3},
	{2, 3, 1},
	{3, 2, 1}
};
arr := multiarr[1];
//arr == {2, 3, 1}
```

### Negative Indexing

### Slicing

### Modifying Memory Layout

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

| Syntax           | Description                                  | Operator Category            | Overloadable | Example |
| ---------------- | -------------------------------------------- | ---------------------------- | ------------ | ------- |
| `a as TypeB`     | Type Casting                                 | stdatem.operator.misc.binary | Yes          |         |
| `TypeA is TypeB` | Type Querying                                | stdatem.operator.misc.binary | Yes          |         |
| `a.b`            | Member Access                                | stdatem.operator.misc.binary | Yes          |         |
| `a ?? b`         | Unwrapping with Default Value                | stdatem.operator.misc.binary | Yes          |         |
| `a.?`            | Unwrapping, equivalent to `a ?? unreachable` | stdatem.operator.misc.unary  | Yes          |         |
| `a[b]`           | Array Element Access                         | stdatem.operator.misc.binary | Yes          |         |
| `a.[b]`          | Pack Value Element Access                    | stdatem.operator.misc.binary | Yes          |         |
| `a::[b]`         | Pack Type Element Access                     | stdatem.operator.misc.binary | Yes          |         |
| `new TypeA`      | Memory Allocation                            | stdatem.operator.misc.unary  | Yes          |         |
| `delete a`       | Memory Deallocation                          | stdatem.operator.misc.unary  | Yes          |         |
| `?TypeA`         | Optional Type                                | stdatem.operator.misc.unary  | **NO**       |         |
| `a~b`            | Type Trait                                   | stdatem.operator.misc.binary | **NO**       |         |

### Precedence

## Functions

### Normal Functions

### Lambdas

## Namespaces

## Modules

### Declaring Modules

### Exporting

### Importing

## Blocks

### Labelled Blocks

## User-Defined Types

### Structs

### Enums

### Unions

### Choices

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

## Traits

### Reflection Traits

### Pack Traits

### Type Traits

### Universal Traits

## Generics

### Introducing std-atem Generic Model

## Metaprogramming

### Static Reflection

### Static Code Injection

## Safety

### Safety Profiles

### Runtime Safety Check

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