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

expression:
	try_operator;

try_operator:
	KeywordTry (Question | Bang)?;

code_block:
	(Identifier Colon)? LeftCurly statements? RightCurly;

attribute: At attribute_name;
attribute_name: Identifier (Dot Identifier)*;