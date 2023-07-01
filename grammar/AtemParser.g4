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
	while_statement |
	repeat_while_statement;

for_statement:
	KeywordFor attributes? Identifier KeywordIn expression code_block (KeywordElse code_block)?;

while_statement:
	KeywordWhile expression code_block (KeywordElse code_block)?;

repeat_while_statement:
	KeywordRepeat code_block KeywordWhile expression (KeywordElse code_block)?;

branch_statement:
	if_statement |
	match_statement;

if_statement:
	(KeywordIf expression code_block (KeywordElse code_block)? ) |
	(KeywordIf expression code_block (KeywordElse if_statement)*? (KeywordElse code_block)?);

match_statement:
	KeywordMatch;

declaration_statement:
	declarator declaration;

declarator:
	access_level_specifier? declarator_name declare_operator;

declare_operator: Colon (attributes? type_expression)? Assign;
empty_declare_operator: Colon Assign;

declarator_name: path_expression;

declaration
	: package_declaration
	| project_declaration
	| module_declaration
	| function_declaration
	| variable_declaration
	| constant_declaration
	| import_alias_declaration
	| typealias_declaration
	| udt_declaration
	;

udt_declaration
	: struct_declaration
	| class_declaration
	| protocol_declaration
	| union_declaration
	| enum_declaration;

struct_declaration: KeywordStruct;

class_declaration: KeywordClass extension_list? initializer_list? deinitializer_list? member_list;

extension_list: KeywordExtend LeftCurly extension_item+ RightCurly;
extension_item: inherit_clause | impl_clause;

inherit_clause: KeywordInherit inherit_list;
inherit_list: LeftCurly inherit_item (Comma inherit_item)+ Comma? RightCurly;
inherit_item: path_expression;

impl_clause: KeywordImpl;
impl_list: LeftCurly impl_items RightCurly;
impl_item: path_expression impl_with_clause;
impl_items: impl_item+;
impl_with_clause: KeywordWith impl_member_list;
impl_member_list: LeftCurly impl_members RightCurly;
impl_member
	: associated_type_impl
	| associated_variable_impl
	| associated_constant_impl
	| associated_function_impl
	;
impl_members: impl_member+;
associated_type_impl: KeywordOverride associated_declarator typealias_declaration;
associated_variable_impl: KeywordOverride associated_declarator variable_declaration;
associated_constant_impl: KeywordOverride associated_declarator constant_declaration;
associated_function_impl: KeywordOverride associated_declarator function_declaration;
associated_declarator: access_level_specifier? associated_name declare_operator;
associated_name: Identifier;

initializer_list: KeywordInit initializer_member_list;
initializer_member_list: LeftCurly initializer_members RightCurly;
initializer_member: empty_declare_operator initializer_type function_body;
initializer_type: function_parameter_clause? function_specifiers? contract_list?;
initializer_members: initializer_member+;

deinitializer_list: KeywordDeinit deinitializer_member_list;
deinitializer_member_list: LeftCurly deinitializer_members RightCurly;
deinitializer_member: empty_declare_operator deinitializer_type function_body;
deinitializer_type: function_parameter_clause? function_specifiers? contract_list?;
deinitializer_members: deinitializer_member+;

member_list: LeftCurly members RightCurly;
member 
	: member_type
	| member_variable
	| member_constant
	| member_function
	;
members: member+;
member_type: member_declarator typealias_declaration;
member_variable: member_declarator storage_level_specifier? variable_declaration getter_and_setter_list?;
member_constant: member_declarator storage_level_specifier? constant_declaration getter_list?;
member_function: member_declarator storage_level_specifier? function_declaration;
member_declarator: access_level_specifier? member_name declare_operator;
member_name: Identifier;
getter_and_setter_list: KeywordWith LeftCurly getter_and_setter_items RightCurly;
getter_list: KeywordWith LeftCurly getter_declaration RightCurly;
getter_and_setter_item
	: getter_declaration
	| setter_declaration
	;
getter_and_setter_items: getter_and_setter_item+;
getter_declaration: empty_declare_operator KeywordGet getter_type function_body;
getter_type: function_specifiers? contract_list?;
setter_declaration: empty_declare_operator KeywordSet setter_type function_body;
setter_type: setter_parameter_clause? function_specifiers? contract_list?;
setter_parameter_clause: RightParenthese setter_parameter LeftParenthese;
setter_parameter: setter_parameter_name (Colon type_annotation)?;
setter_parameter_name: Identifier;

protocol_declaration: KeywordProtocol;

union_declaration: KeywordUnion;

enum_declaration: KeywordEnum enumerator_list;

enumerator_list: LeftCurly enumerator (Comma enumerator)+ Comma? RightCurly;

enumerator: enumerator_name enumerator_associated_value_clause? enumerator_representation?;

enumerator_associated_value_clause: Colon LeftParenthese enumerator_associated_value_list? RightParenthese;

enumerator_associated_value_list: enumerator_associated_value (Comma enumerator_associated_value)*;

enumerator_associated_value:
	attributes? enumerator_associated_value_name (Colon type_annotation)? default_argument_clause?;

enumerator_associated_value_name: Identifier;

enumerator_representation: Assign expression;

enumerator_name: Identifier;

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
	| KeywordUnion
	| KeywordEnum
	| KeywordProtocol
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
	KeywordFunc attributes? function_type? function_body;

function_body: code_block | Assign expression;

contract_list: KeywordRequire LeftCurly contract+ RightCurly | KeywordRequire contract;

contract:
	contract_precondition | contract_postcondition;

contract_precondition: KeywordExpect expression;

contract_postcondition: KeywordEnsure (KeywordWith return_value_name declare_operator KeywordReturn) expression;

return_value_name: Identifier;

function_name: Identifier;

function_type:
	function_parameter_clause function_result function_specifiers? contract_list?;

function_specifier
	: KeywordRecursive
	| KeywordThrows
	| KeywordPure
	;

function_specifiers: function_specifier+;

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
	KeywordVar storage_level_specifier? expression;

constant_declaration:
	KeywordConst? storage_level_specifier? expression;

storage_level_specifier
	: KeywordGlobal
	| KeywordStatic
	| KeywordThreadLocal
	;

control_transfer_statement:
	return_statement;

return_statement:
	KeywordReturn expression?;

closure_expression:
	KeywordFunc? capture_list? function_type? code_block;

capture_list: LeftSquare capture_list_items RightSquare;
capture_list_items: capture_list_item+;
capture_list_item: Identifier;

defer_statement:
	KeywordDefer defer_kind? code_block;

defer_kind: KeywordSuccess | KeywordFail;

code_block_no_label:
	LeftCurly statements? RightCurly;

code_block:
	code_block_name? LeftCurly statements? RightCurly;

code_block_name: Identifier Colon;

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

arithmetic_operator:
	Add | OverflowingAdd | SaturatingAdd |
	Sub | OverflowingSub | SaturatingSub |
	Mul | OverflowingMul | SaturatingMul |
	Divide | RemainderDivide |
	Power | OverflowingPower | SaturatingPower;

negation_operator:
	Sub | OverflowingSub;

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

binary_optional_unwrapping_operator:
	DefaultUnwrapping;
unary_optional_unwrapping_operator:
	Question | Bang;

arrow_operator: Arrow;

try_operator: KeywordTry (Question | Bang)?;

type_casting_operator: (KeywordIs | (KeywordAs (Question | Bang)?));

await_operator: KeywordAwait;

async_operator: KeywordAsync;

expression
	: LeftParenthese expression RightParenthese											#parentheses_expression_
	| literal_expression																#literal_expression_
	| expression Dot Identifier															#field_expression_
	| expression function_call_operator													#member_function_call_expression_
	| expression unary_optional_unwrapping_operator										#unary_optional_unwrapping_expression_
	| expression binary_optional_unwrapping_operator expression							#binary_optional_unwrapping_expression_
	| expression function_call_operator													#function_call_expresison_
	| expression arithmetic_operator expression 										#arithmetic_expression_
	| negation_operator expression														#negation_expression_
	| path_expression																	#path_expression_
	| expression assignment_operator expression											#assignment_expression_
	| expression comparison_operator expression											#comparison_expression_
	| try_operator expression															#try_expression_
	| async_operator expression															#async_expression_
	| await_operator expression															#await_expression_
	| expression range_operator expression												#range_expression_
	| expression binary_bit_operator expression 										#bit_expression_
	| unary_bit_operator expression														#bit_expression_
	| expression binary_boolean_operator expression										#boolean_expression_
	| unary_boolean_operator expression													#boolean_expression_
	| KeywordIf expression KeywordThen expression (KeywordElse expression)?				#if_expression_
	| KeywordWhile expression KeywordThen expression (KeywordElse expression)?			#while_expression_
	| KeywordRepeat expression KeywordWhile expression (KeywordElse expression)?		#repeat_while_expression_
	| KeywordFor Identifier KeywordIn attributes? KeywordIn expression 
	  expression (KeywordElse expression)?												#for_expression_
	| import_expression																	#import_expression_
	| expression type_casting_operator type_expression									#type_cast_expression_
	| closure_expression																#closure_expression_
	| expression Dot KeywordInit														#init_expression_
	| expression Dot KeywordDeinit														#deinit_expression_
	| expression Dot KeywordSelf														#self_expression_
	| code_block_expression																#code_block_expression_
	| type_expression																	#type_expression_
	| KeywordUnreachable																#unreachable_expression_
	| KeywordThrow expression															#throw_expression_
	| KeywordReturn expression?															#return_expression_
	| KeywordBreak code_block_name? (KeywordWith expression)?							#break_expression_
	| KeywordContinue code_block_name?													#continue_expression_
	| KeywordAssert function_call_operator												#assert_expression_
	| KeywordComptime expression														#comptime_expression_
	| reflect_operator expression														#reflection_expression_
	| expression PointerDeref															#derefence_expression_
	| expression ObjectAddress															#object_address_expression_
	| declaration_expression															#declaration_expression_
	;

declaration_expression
	: function_declaration
	| udt_declaration
	| project_declaration
	| package_declaration
	| module_declaration
	;

code_block_expression: code_block;

type_expression
	: Identifier
	| RightParenthese type_expression LeftParenthese
	| path_expression
	| basic_type
	| tuple_type
	| optional_type
	| collection_type
	| any_type
	| some_type
	| type_expression PointerType
	| KeywordIf expression KeywordThen type_expression (KeywordElse type_expression)?
	| KeywordWhile expression KeywordThen type_expression (KeywordElse type_expression)?
	| KeywordRepeat type_expression KeywordWhile expression (KeywordElse type_expression)?
	| KeywordFor Identifier KeywordIn attributes? KeywordIn expression type_expression (KeywordElse type_expression)?
	| code_block_expression
	| KeywordUnreachable
	| KeywordThrow expression
	| KeywordReturn type_expression?
	| KeywordBreak code_block_name? (KeywordWith type_expression)?
	| KeywordContinue code_block_name?
	| KeywordComptime type_expression
	;

basic_type
	: never_type
	| integer_type
	| floating_point_type
	| boolean_type
	| byte_type
	| unit_type
	| character_type
	| string_type
	| unit_type
	| comptime_type
	| type_type
	;

collection_type
	: static_array_type
	| dynamic_array_type
	| map_type
	| set_type
	;

never_type: KeywordNever;

tuple_type:
    LeftParenthese ((tuple_type_element Comma)+ tuple_type_element?)? RightParenthese;

tuple_type_element:
    attributes? type_expression | Identifier Colon attributes? type_expression;

optional_type:
	Question type_expression;

any_type: KeywordAny type_expression;

some_type: KeywordSome type_expression;

static_array_type:
    LeftSquare (expression | Underscore) (Comma	expression | Underscore)+ Comma? RightSquare (type_expression | Underscore);

dynamic_array_type:
    LeftSquare RightSquare (type_expression | Underscore);

map_type:
	LeftSquare (type_expression | Underscore) Colon (type_expression | Underscore) RightSquare;

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

type_type: KeywordType;

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