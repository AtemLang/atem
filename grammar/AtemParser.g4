parser grammar AtemParser;

options {
	tokenVocab = AtemLexer;
}

program: statements? EOF;

statement: 
	((
		loop_statement |
		declaration_statement |
		control_transfer_statement |
		branch_statement |
		import_statement |
		defer_statement |
		expression
	) Semicolon?) | Semicolon;

statements: statement+;

loop_statement:
	for_statement |
	while_statement;

for_statement:
	KeywordFor LeftParenthese Identifier Colon attributes? KeywordIn expression RightParenthese code_block;

while_statement:
	KeywordWhile LeftParenthese expression RightParenthese code_block;

branch_statement:
	if_statement;

if_statement:
	(KeywordIf LeftParenthese expression RightParenthese code_block
	(KeywordElse code_block)? ) |
	(KeywordIf LeftParenthese expression RightParenthese code_block
	(KeywordElse if_statement)*?
	(KeywordElse code_block)?);

declaration_statement:
	declarator declaration;

declarator:
	access_level_specifier? declarator_name Colon type? Assign;

declarator_name: path_expression;

declaration:
	package_declaration 	|
	project_declaration		|
	module_declaration		|
	function_declaration 	|
	variable_declaration 	|
	constant_declaration	|
	import_alias_declaration|
	typealias_declaration
	;

import_alias_declaration:
	import_expression;

import_expression:
	KeywordImport import_kind? attributes? import_path_expression_list;

import_statement:
	KeywordImport import_kind? attributes? import_path_expression_list;

import_path_expression_list:
	import_path_expression |
	LeftCurly import_path_expression+ RightCurly;
import_path_expression:
	import_path_expression_element (Dot import_path_expression_element)+ (Dot Mul)?;
import_path_expression_element:
	Identifier |
	import_element_list;
import_element_list: LeftCurly import_path_expression_element (Comma import_path_expression_element)+ Comma? RightCurly;

import_kind:
	KeywordAlias
	| KeywordStruct
	| KeywordClass
	| KeywordEnum
	| KeywordConcept
	| KeywordConst
	| KeywordMutable
	| KeywordFunc;

project_declaration:
	KeywordProject attributes? project_member_list;

project_member_list:
	KeywordThis | LeftCurly project_members RightCurly;

project_member:
	path_expression;

project_members: project_member+;

package_declaration:
	KeywordPackage attributes? package_member_list;

package_member_list:
	KeywordThis | LeftCurly package_members RightCurly;

package_member:
	path_expression;

package_members: package_member+;

module_declaration:
	(KeywordModule attributes?) | (KeywordModule attributes? code_block_no_label);

typealias_declaration:
	KeywordAlias KeywordType type_expression;

access_level_specifier:
	KeywordPrivate | KeywordFilePrivate | KeywordInternal | KeywordPublic | KeywordOpen;

function_declaration:
	KeywordFunc attributes? function_type? code_block;

function_name: Identifier;

function_type:
	function_parameter_clause KeywordThrows? function_result;

function_result:
	Arrow attributes? type_expression;

function_parameter_clause:
	LeftParenthese function_parameter_list? RightParenthese;

function_parameter_list: function_parameter (Comma function_parameter)*;

function_parameter:
	attributes? function_parameter_label? function_parameter_name (Colon type_annotation)? default_argument_clause?;

function_parameter_label: Identifier;
function_parameter_name: Identifier;
default_argument_clause: Assign expression;

type_annotation: attributes? type_expression;

variable_declaration:
	KeywordVar expression;

constant_declaration:
	KeywordConst? expression;

control_transfer_statement:
	return_statement;

return_statement:
	KeywordReturn expression?;

closure_expression:
	Colon closure_signature? Assign code_block;

closure_signature:
	capture_list? closure_parameter_clause KeywordThrows? function_result?;

capture_list: LeftSquare capture_list_items RightSquare;
capture_list_items: capture_list_item+;
capture_list_item: Identifier;

closure_parameter_clause: Identifier;

defer_statement:
	KeywordDefer code_block;

code_block_no_label:
	LeftCurly statements? RightCurly;

code_block:
	(Identifier Colon)? LeftCurly statements? RightCurly;

attribute: At attribute_name;
attributes: attribute+;
attribute_name: path_expression;

function_call_operator:
	function_call_argument_clause? trailing_closures | 
	function_call_argument_clause;

function_call_argument_clause:
	LeftParenthese function_call_argument_list? RightParenthese;

function_call_argument_list:
	function_call_argument (Comma function_call_argument)*;

function_call_argument:
	argument_name? (
		Identifier |
		expression
	);

argument_name:
	Identifier Assign;
argument_names: argument_name+;

trailing_closures:
	closure_expression labeled_trailing_closures+;

labeled_trailing_closure:
	Identifier Assign closure_expression;

labeled_trailing_closures: labeled_trailing_closure+;

type:
	parenthesized_type |
	simple_type |
	optional_type |
	tuple_type |
	function_type |
	static_array_type |
	dynamic_array_type |
	map_type |
	set_type |
	never_type
	;

parenthesized_type: RightParenthese type_expression LeftParenthese;

never_type: KeywordNever;

tuple_type:
    LeftParenthese ((tuple_type_element Comma)+ tuple_type_element?)? RightParenthese;

tuple_type_element:
    attributes? type_expression | Identifier Colon attributes? type_expression;

optional_type:
	Question type_expression;

static_array_type:
    LeftSquare (expression | Underscore) RightSquare (type_expression | Underscore);

dynamic_array_type:
    LeftSquare RightSquare (type_expression | Underscore);

map_type:
	LeftSquare (type_expression | Underscore) RightSquare (type_expression | Underscore);

set_type:
	LeftSquare (type_expression | Underscore) RightSquare;

simple_type:
	integer_type | floating_point_type | boolean_type | byte_type | unit_type | character_type | string_type | comptime_type;

integer_type:
	KeywordInt8 | KeywordInt16 | KeywordInt32 | KeywordInt64 | KeywordInt128 |
	KeywordUInt8 | KeywordUInt16 | KeywordUInt32 | KeywordUInt64 | KeywordUInt128;

floating_point_type:
	KeywordFloat16 | KeywordFloat32 | KeywordFloat64 | KeywordFloat80 | KeywordFloat128;

boolean_type: KeywordBool;

byte_type: KeywordByte;

unit_type: KeywordUnit;

character_type: KeywordChar8 | KeywordChar16 | KeywordChar32;

string_type: KeywordString;

comptime_type: KeywordCompileTimeChar | KeywordCompileTimeFloat | KeywordCompileTimeInt | KeywordCompileTimeString;

arithmetic_operator:
	Add | OverflowingAdd | SaturatingAdd |
	Sub | OverflowingSub | SaturatingSub |
	Mul | OverflowingMul | SaturatingMul |
	Divide | RemainderDivide |
	Power | OverflowingPower | SaturatingPower;

assignment_operator:
	Assign | 
	AddAssign | OverflowingAddAssign | SaturatingAddAssign |
	SubAssign | OverflowingSubAssign | SaturatingSubAssign |
	MulAssign | OverflowingMulAssign | SaturatingMulAssign |
	PowerAssign | OverflowingPowerAssign | SaturatingPowerAssign |
	DivideAssign | RemainderDivideAssign |
	BitLeftShiftAssign | SaturatingBitLeftShiftAssign | BitRightShiftAssign |
	BitAndAssign | BitOrAssign | BitNotAssign;

comparison_operator:
	GreaterThan | LessThan |
	GreaterThanOrEqual | LessThanOrEqual |
	Equal | NotEqual | ThreeWayComparison;

binary_boolean_operator:
	KeywordAnd | KeywordOr;

unary_boolean_operator:
	KeywordNot;

binary_bit_operator:
	BitAnd | BitOr |
	BitLeftShift | SaturatingBitLeftShift | BitRightShift;

unary_bit_operator:
	BitNot | BitXor;

pointer_operator:
	PointerType | PointerDeref | ObjectAddress;

reflect_operator:
	Reflect | Reify;

range_operator:
	ClosedRange | RightOpenRange | LeftOpenRange | OpenedRange;

optional_unwrapping_operator:
	DefaultUnwrapping | ThrowableUnwrapping | ForcedUnwrapping;
optional_chaining_operator:
	ForcedOptionalChaining | ThrowableOptionalChaining;

arrow_operator: Arrow;

try_operator: KeywordTry (Question | Bang)?;

type_casting_operator: (KeywordIs | (KeywordAs (Question | Bang)?));

await_operator: KeywordAwait;

async_operator: KeywordAsync;

expression
	: LeftParenthese expression RightParenthese	#parentheses_expression_
	| literal_expression						#literal_expression_
	| expression Dot Identifier					#field_expression_
	| expression function_call_operator	#member_function_call_expression_
	| expression optional_unwrapping_operator	#optional_unwrapping_expression_
	| expression optional_chaining_operator Identifier		#optional_chaining_expression_
	| expression function_call_operator			#function_call_expresison_
	| expression arithmetic_operator expression #arithmetic_expression_
	| path_expression							#path_expression_
	| expression assignment_operator expression	#assignment_expression_
	| expression comparison_operator expression	#comparison_expression_
	| try_operator expression					#try_expression_
	| async_operator expression					#await_expression_
	| await_operator expression					#await_expression_
	| expression range_operator expression		#range_expression_
	| expression binary_bit_operator expression #bit_expression_
	| unary_bit_operator expression				#bit_expression_
	| expression binary_boolean_operator expression	#boolean_expression_
	| unary_boolean_operator expression			#boolean_expression_
	| KeywordIf LeftParenthese expression RightParenthese expression (KeywordElse expression)?	#if_expression_
	| KeywordDo LeftCurly statements RightCurly	#do_expression_
	| import_expression							#import_expression_
	| expression type_casting_operator expression	#type_cast_expression_
	| closure_expression						#closure_expression_
	| expression Dot KeywordInit					#init_expression_
	| expression Dot KeywordDeinit					#deinit_expression_
	| expression Dot KeywordSelf					#self_expression_
	| code_block_expression						#code_block_expression_
	;

code_block_expression: code_block;

type_expression:
    type;

tuple_expression:
	LeftParenthese RightParenthese |
	LeftParenthese tuple_element Comma tuple_element_list RightParenthese;

tuple_element_list:
	tuple_element (Comma tuple_element)*;

tuple_element:
	(Identifier Assign)? expression;

path_expression:
	(KeywordGlobal Dot)? path_expression_element (Dot path_expression_element)*?;
path_expression_element:
	Identifier |
	KeywordSuper |
	KeywordSelf |
	KeywordThis |
	KeywordOuter |
	KeywordModule |
	KeywordPackage;

literal_expression:
	literal;

literal:
	numeric_literal |
	boolean_literal |
	string_literal |
	null_literal |
	undefined_literal |
	default_literal;

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

default_literal: KeywordDefault;

// String Literals
string_literal:
	extended_string_literal
	| interpolated_string_literal
	| static_string_literal;

extended_string_literal:
	MultiLineExtendedStringOpen QuotedMultiLineExtendedText+
		MultiLineExtendedStringClose
	| SingleLineExtendedStringOpen QuotedSingleLineExtendedText+
		SingleLineExtendedStringClose;

static_string_literal:
	SingleLineStringOpen QuotedSingleLineText* SingleLineStringClose
	| MultiLineStringOpen QuotedMultiLineText* MultiLineStringClose;

interpolated_string_literal:
	SingleLineStringOpen (
		QuotedSingleLineText
		| InterpolataionSingleLine (
			expression
			| tuple_element Comma tuple_element_list
		) RightParenthese
	)* SingleLineStringClose
	| MultiLineStringOpen (
		QuotedMultiLineText
		| InterpolataionMultiLine (
			expression
			| tuple_element Comma tuple_element_list
		) RightParenthese
	)* MultiLineStringClose;