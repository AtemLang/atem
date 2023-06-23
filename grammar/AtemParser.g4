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
	function_name Colon attributes+? function_signature? KeywordFunc Assign code_block;

function_name: Identifier | operator;

function_signature:
	function_parameter_clause KeywordThrows? function_result;

function_result:
	Arrow attributes? type;

function_parameter_clause:
	LeftParenthese function_parameter_list? RightParenthese;

function_parameter_list: function_parameter (Comma function_parameter)*;

function_parameter:
	attributes? function_parameter_label? function_parameter_name type_annotation default_argument_clause?;

function_parameter_label: Identifier;
function_parameter_name: Identifier;
default_argument_clause: Assign expression;

type_annotation: Colon attributes? type;

type: Identifier;

control_transfer_statement:
	return_statement;

return_statement:
	KeywordReturn expression?;

operator:
	operator_head operator_characters? |
	dot_operator_head dot_operator_characters;

operator_head:
	(Divide |
	Assign |
	Sub |
	Add |
	Bang |
	Mul |
	RemainderDivide |
	LessThan |
	GreaterThan |
	Reflect |
	Question) |
	OperatorHeadOther;

operator_character:
	operator_head | OperatorFollowingCharacter;

operator_characters: (
		{_input.get(_input.index()-1).getType() != Whitespace}? operator_character
	)+;

dot_operator_head: Dot;
dot_operator_character: Dot | operator_character;
dot_operator_characters: (
		{_input.get(_input.index()-1).getType() != Whitespace}? dot_operator_character
	)+;

try_operator:
	KeywordTry (Question | Bang)?;

as_operator:
	KeywordAs (Question | Bang)?;

is_operator:
	KeywordIs;

conditional_operator:
	KeywordIf LeftParenthese expression RightParenthese expression KeywordElse expression;

assignment_operator:
	Assign;

prefix_operator:
	;

binary_operator:
	;

postfix_operator:
	;

closure_expression:
	Colon closure_signature? Assign statements? RightCurly;

closure_signature:
	capture_list? closure_parameter_clause KeywordThrows? function_result? |;

capture_list: LeftSquare capture_list_items RightSquare;
capture_list_items: capture_list_item+;
capture_list_item: Identifier;

closure_parameter_clause: Identifier;

code_block:
	(Identifier Colon)? LeftCurly statements? RightCurly;

attribute: At attribute_name;
attributes: attribute+;
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
	try_operator? prefix_expression binary_expressions?;

expressions:
	expression (Comma expression)*;

prefix_expression:
	prefix_operator? postfix_expression;

binary_expressions:
	binary_operator prefix_expression |
	(assignment_operator | conditional_operator) try_operator? prefix_expression |
	as_operator |
	is_operator;

postfix_expression:
	primary_expression (
		function_call_suffix
	)* 
	postfix_operator*?
	;

function_call_suffix:
	function_call_argument_clause? trailing_closures | 
	function_call_argument_clause;

function_call_argument_clause:
	LeftParenthese function_call_argument_list? RightParenthese;

function_call_argument_list:
	function_call_argument (Comma function_call_argument)*;

function_call_argument:
	argument_name? (
		Identifier |
		expression |
		operator
	);

argument_name:
	Identifier assignment_operator;
argument_names: argument_name+;

trailing_closures:
	closure_expression labeled_trailing_closures+;

labeled_trailing_closure:
	Identifier Assign closure_expression;

labeled_trailing_closures: labeled_trailing_closure+;

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