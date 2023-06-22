parser grammar AtemParser;

options {
	tokenVocab = AtemLexer;
}

top_level: statements? EOF;

statement: 
	(
		loop_statement |
		declaration |
		control_transfer_statement
	) Semicolon;

statements: statement+;

loop_statement:
	for_statement |
	while_statement;

for_statement:
	KeywordFor;

while_statement:
	KeywordWhile;

declaration:
	function_declaration
	;

function_declaration:
	Identifier Colon KeywordFunc Assign code_block;

control_transfer_statement:
	return_statement;

return_statement:
	KeywordReturn expression?;

try_operator:
	KeywordTry (Question | Bang)?;

code_block:
	(Identifier Colon)? LeftCurly statements? RightCurly;

attribute: At attribute_name;
attribute_name: simple_path;

simple_path:
	Dot? simple_path_element (Dot simple_path_element)*;

simple_path_element:
	Identifier |
	KeywordSuper |
	KeywordOuter |
	KeywordThis |
	KeywordSelf;

expression:
	try_operator? primary_expression;

primary_expression:
	literal_expression;

literal_expression:
	literal;

literal:
	numeric_literal |
	boolean_literal |
	null_literal |
	undefined_literal;

numeric_literal:
	integer_literal |
	floating_point_literal;

integer_literal:
	DecimalDigits |
	DecimalLiteral |
	BinaryLiteral |
	OctalLiteral |
	HexadecimalLiteral;

floating_point_literal: FloatingPointLiteral;

boolean_literal: KeywordTrue | KeywordFalse;

null_literal: KeywordNull;

undefined_literal: KeywordUndefined;