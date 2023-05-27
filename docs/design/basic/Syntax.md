[TOC]

# std-style Basics Design Note

##Declarations

### Variables

Syntax for declaring variables:
$$
\textcolor{aqua}{variable\text{-}name}_{opt} : \textcolor{aqua}{type\text{-}id}  = \textcolor{aqua}{initializer}_{opt}; \\
\textcolor{aqua}{variable\text{-}name}_{opt} := \textcolor{aqua}{initializer}; \\
$$
Example:

```atem
Abc: type;
Xyz: type;
foo : (u: i32) -> Abc func;

a: i32 = 2;
b: = 2:i32;       // (:i32 = 2)
c: = a:Abc;       // (:Abc = a)
d: = ():Abc;      // Default Constructor
e: = (a + b):Abc; // (:Abc = a + b)
r: = foo(a):Abc;  // (:Abc = foo(a))
s: = foo(2):Abc.start():Xyz.value; // Function Chaining
t: = a++:Abc;     // (:Abc = a++)
u: = a:Abc++;     // (:Abc = a)++
x: = 2:i32:Abc;   // (:Abc = :i32 = 2) Constructor Chaining
y: = (2:i32 + 4:i32):Abc; // (:Abc = (:i32 = 2) + (:i32 = 4))
z: = ("text", 2:i32):Abc; // (:Abc = ("text", (:i32 = 2)))
```

### Functions

#### Ordinary Function

Syntax for declaring ordinary functions:
$$
\textcolor{aqua}{function\text{-}name}_{opt} : (\textcolor{aqua}{parameter\text{-}list})_{opt} \ \text{->} \ \textcolor{aqua}{return\text{-}type}_{opt} \ \textcolor{lime}{func} = \textcolor{yellow}{function\text{-}body}_{opt};
$$

#### Lambdas

Syntax for declaring lambdas:
$$
: [\textcolor{aqua}{lambda\text{-}catch\text{-}list}]_{opt} \ (\textcolor{aqua}{lambda\text{-}parameter\text{-}list}_{opt}) \ \text{->} \ {lambda\text{-}return\text{-}type}_{opt} = \textcolor{yellow}{lambda\text{-}body}_{opt}
$$

#### Expression Lambda

Syntax for declaring expression lambdas:
$$
: [\textcolor{aqua}{lambda\text{-}catch\text{-}list}_{opt}] = \textcolor{yellow}{expression\text{-}body}
$$

#### Language Construct Implementations

Syntax for declaring language construct implementations:
$$
\textcolor{aqua}{function\text{-}name}_{opt} : \textcolor{yellow}{syntax\text{-}pattern} \ \textcolor{lime}{lang\_impl} = \textcolor{yellow}{function\text{-}body}_{opt};
$$

### User-Defined Types

#### Structs

Syntax for declaring structs:
$$
\textcolor{aqua}{struct\text{-}name}_{opt} : \textcolor{lime}{struct} = \textcolor{yellow}{struct\text{-}body}_{opt};
$$


#### Classes

Syntax for declaring classes:
$$
\textcolor{aqua}{class\text{-}name}_{opt} : \textcolor{lime}{class} = \textcolor{yellow}{class\text{-}body}_{opt};
$$


#### Enums

Syntax for declaring enums:
$$
\textcolor{aqua}{enum\text{-}name}_{opt} : \textcolor{lime}{enum} = \textcolor{yellow}{enum\text{-}body}_{opt};
$$

#### Concepts

Syntax for declaring concepts:
$$
\textcolor{aqua}{concept\text{-}name}_{opt} : \textcolor{lime}{concept} = \textcolor{yellow}{concept\text{-}body}_{opt};
$$


#### Impls

Syntax for declaring impls:
$$
\textcolor{aqua}{type\text{-}name} \ \textcolor{yellow}{for} \ \textcolor{aqua}{concept\text{-}name}: \textcolor{lime}{impl} = \textcolor{yellow}{impl\text{-}body}_{opt};
$$

### Namespaces

## Operators

## Statements

#### `if` Statement

#### `for` Statement

#### `while` Statement

#### `break` Statement

#### `return` Statement

## Expression

### Call Expression

### Statement Expression

### Typed Expression

