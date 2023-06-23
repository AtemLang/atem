parser grammar AtemParser;

options {
	tokenVocab = AtemLexer;
}

top_level: statements? EOF;

statement: 
	(
		loop_statement |
		declaration |
		control_transfer_statement |
		expression
	)? Semicolon;

statements: statement+;

loop_statement:
	for_statement |
	while_statement;

for_statement:
	KeywordFor;

while_statement:
	KeywordWhile;

declaration:
	function_declaration |
	variable_declaration
	;

function_declaration:
	function_name Colon attributes? function_signature? KeywordFunc Assign code_block;

function_name: Identifier;

function_signature:
	function_parameter_clause KeywordThrows? function_result;

function_result:
	Arrow attributes? type;

function_parameter_clause:
	LeftParenthese function_parameter_list? RightParenthese;

function_parameter_list: function_parameter (Comma function_parameter)*;

function_parameter:
	attributes? function_parameter_label? function_parameter_name (Colon type_annotation)? default_argument_clause?;

function_parameter_label: Identifier;
function_parameter_name: Identifier;
default_argument_clause: Assign expression;

type_annotation: attributes? type;

variable_declaration:
	variable_name? Colon type_annotation? Assign expression;

variable_name: Identifier;

control_transfer_statement:
	return_statement;

return_statement:
	KeywordReturn expression?;

closure_expression:
	Colon closure_signature? Assign LeftCurly statements? RightCurly;

closure_signature:
	capture_list? closure_parameter_clause KeywordThrows? function_result?;

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
	basic_type |
	optional_type;

optional_type:
	Question type;

basic_type:
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
	| expression Dot path_expression function_call_operator	#member_function_call_expression_
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
	;

tuple_expression:
	LeftParenthese RightParenthese |
	LeftParenthese tuple_element Comma tuple_element_list RightParenthese;

tuple_element_list:
	tuple_element (Comma tuple_element)*;

tuple_element:
	(Identifier Assign)? expression;

path_expression:
	(KeywordGlobal Dot)? path_expression_element (Dot path_expression_element)*;
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