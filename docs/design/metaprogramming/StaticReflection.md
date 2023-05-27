# Atom Design Note: Static Reflection

## Introduction

## Reflection Types Hierarchies (With std-style)

```mermaid
---
title: "Reflection Types Hierarchies - User Interfaces"
---
classDiagram
	Reflect <|-- Object
	
	Object <|-- Named
	
	Named <|-- Function
	Function <|-- OrdinaryFunction
	Function <|-- Lambda
	Function <|-- Annotation
	Function <|-- LanguageConstructImpl
	
	Named <|-- Variable
	Variable <|-- Constant
	Constant <|-- Enumerator
	
	Named <|-- Namespace
	Namespace <|-- NamespaceAlias
	
	Named <|-- Type
	Type <|-- Enum
	Type <|-- TypeAlias
	Type <|-- Record
	Record <|-- Class
	Record <|-- Struct
```

```mermaid
---
title: "Reflection Types Hierarchies - AST Nodes"
---
classDiagram
	Reflect <|-- ASTNode
	
	ASTNode <|-- Declaration
	Declaration <|-- NamedDeclaration
	NamedDeclaration <|-- ValueDeclaration
	ValueDeclaration <|-- FunctionDeclaration
	ValueDeclaration <|-- VariableDeclaration
	ValueDeclaration <|-- TypeDeclaration
	TypeDeclaration <|-- ClassDeclaration
	TypeDeclaration <|-- StructDeclaration
	TypeDeclaration <|-- EnumDeclaration
	TypeDeclaration <|-- ConceptDeclaration
	TypeDeclaration <|-- ImplDeclaration
	
	ASTNode <|-- Statement
	
	Statement <|-- ValueStatement
	ValueStatement <-- Expression
	Expression <|-- Literal
	Expression <|-- StatementExpression
	Expression <|-- AsE
```

