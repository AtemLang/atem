lexer grammar AtemLexer;

//Keywords

KeywordAbstract: 'abstract';
KeywordAnd: 'and';
KeywordAny: 'any';	
KeywordAs: 'as';	
KeywordAsm: 'asm';	
KeywordAsync: 'async';	
KeywordAt: 'at';
KeywordAwait: 'await';	
KeywordBreak: 'break';	
KeywordCase: 'case';	
KeywordCatch: 'catch';	
KeywordClass: 'class';	
KeywordComptime: 'comptime';	
KeywordConcept: 'concept';	
KeywordConst: 'const';	
KeywordContinue: 'continue';	
KeywordDefault: 'default';	
KeywordDefer: 'defer';	
KeywordDeinit: 'deinit';	
KeywordDelete: 'delete';	
KeywordDo: 'do';	
KeywordDyn: 'dyn';	
KeywordEnum: 'enum';	
KeywordExtend: 'extend';
KeywordExtern: 'extern';	
KeywordFalse: 'false';	
KeywordFilePrivate: 'filePrivate';	
KeywordFinal: 'final';	
KeywordFor: 'for';	
KeywordFunc: 'func';	
KeywordGet: 'get';	
KeywordImpl: 'impl';	
KeywordImport: 'import';	
KeywordIn: 'in';
KeywordInit: 'init';	
KeywordInternal: 'internal';	
KeywordIs: 'is';	
KeywordLazy: 'lazy';	
KeywordModule: 'module';	
KeywordMutable: 'mutable';	
KeywordNamespace: 'namespace';	
KeywordNew: 'new';	
KeywordNot: 'not';	
KeywordNull: 'null';	
KeywordOpen: 'open';	
KeywordOperator: 'operator';	
KeywordOr: 'or';	
KeywordOuter: 'outer';	
KeywordOverride: 'override';	
KeywordPackage: 'package';	
KeywordPrivate: 'private';	
KeywordProject: 'project';	
KeywordPublic: 'public';	
KeywordRequire: 'require';	
KeywordReturn: 'return';	
KeywordSelf: 'self';	
KeywordSet: 'set';	
KeywordSome: 'some';	
KeywordStatic: 'static';	
KeywordStruct: 'stuct';	
KeywordSuper: 'super';	
KeywordThis: 'this';	
KeywordThrow: 'throw';	
KeywordThrows: 'throws';	
KeywordTrue: 'true';	
KeywordTry: 'try';	
KeywordType: 'type';	
KeywordUndefined: 'undefined';	
KeywordUnion: 'union';	
KeywordUsing: 'using';	
KeywordVirtual: 'virtual';	
KeywordWhile: 'while';	

//Identifier

Identifier:	IdentifierHead IdentifierCharacters?;

fragment IdentifierHead:
	[a-zA-Z]
	| '_'
	| '\u00A8'
	| '\u00AA'
	| '\u00AD'
	| '\u00AF'
	| [\u00B2-\u00B5]
	| [\u00B7-\u00BA]
	| [\u00BC-\u00BE]
	| [\u00C0-\u00D6]
	| [\u00D8-\u00F6]
	| [\u00F8-\u00FF]
	| [\u0100-\u02FF]
	| [\u0370-\u167F]
	| [\u1681-\u180D]
	| [\u180F-\u1DBF]
	| [\u1E00-\u1FFF]
	| [\u200B-\u200D]
	| [\u202A-\u202E]
	| [\u203F-\u2040]
	| '\u2054'
	| [\u2060-\u206F]
	| [\u2070-\u20CF]
	| [\u2100-\u218F]
	| [\u2460-\u24FF]
	| [\u2776-\u2793]
	| [\u2C00-\u2DFF]
	| [\u2E80-\u2FFF]
	| [\u3004-\u3007]
	| [\u3021-\u302F]
	| [\u3031-\u303F]
	| [\u3040-\uD7FF]
	| [\uF900-\uFD3D]
	| [\uFD40-\uFDCF]
	| [\uFDF0-\uFE1F]
	| [\uFE30-\uFE44]
	| [\uFE47-\uFFFD]
	| [\u{10000}-\u{1FFFD}]
	| [\u{20000}-\u{2FFFD}]
	| [\u{30000}-\u{3FFFD}]
	| [\u{40000}-\u{4FFFD}]
	| [\u{50000}-\u{5FFFD}]
	| [\u{60000}-\u{6FFFD}]
	| [\u{70000}-\u{7FFFD}]
	| [\u{80000}-\u{8FFFD}]
	| [\u{90000}-\u{9FFFD}]
	| [\u{A0000}-\u{AFFFD}]
	| [\u{B0000}-\u{BFFFD}]
	| [\u{C0000}-\u{CFFFD}]
	| [\u{D0000}-\u{DFFFD}]
	| [\u{E0000}-\u{EFFFD}];

fragment IdentifierCharacter:
	[0-9]
	| [\u0300-\u036F]
	| [\u1DC0-\u1DFF]
	| [\u20D0-\u20FF]
	| [\uFE20-\uFE2F]
	| IdentifierHead;

fragment IdentifierCharacters: IdentifierCharacter+;

//Literals

BinaryLiteral: '0b' BinaryDigit BinaryLiteralCharacters?;
fragment BinaryDigit: [01];
fragment BinaryLiteralCharacter: BinaryDigit | '_';
fragment BinaryLiteralCharacters: BinaryLiteralCharacter+;

OctalLiteral: '0o' OctalDigit OctalLiteralCharacters?;
fragment OctalDigit: [0-7];
fragment OctalLiteralCharacter: OctalDigit | '_';
fragment OctalLiteralCharacters: OctalLiteralCharacter+;

DecimalDigits: DecimalDigit+;
DecimalLiteral: DecimalDigit DecimalLiteralCharacters?;
fragment DecimalDigit: [0-9];
fragment DecimalLiteralCharacter: DecimalDigit | '_';
fragment DecimalLiteralCharacters: DecimalLiteralCharacter+;

HexadecimalLiteral:
	'0x' HexadecimalDigit HexadecimalLiteralCharacters?;
fragment HexadecimalDigit: [0-9a-fA-F];
fragment HexadecimalLiteralCharacter: HexadecimalDigit | '_';
fragment HexadecimalLiteralCharacters:
	HexadecimalLiteralCharacter+;

FloatingPointLiteral:
	DecimalLiteral DecimalFraction? DecimalExponent?
	| HexadecimalLiteral HexadecimalFraction? HexadecimalExponent;
fragment DecimalFraction: '.' DecimalLiteral;
fragment DecimalExponent:
	FloatingPointE Sign? DecimalLiteral;
fragment HexadecimalFraction:
	'.' HexadecimalDigit HexadecimalLiteralCharacters?;
fragment HexadecimalExponent:
	FloatingPointP Sign? DecimalLiteral;
fragment FloatingPointE: [eE];
fragment FloatingPointP: [pP];
fragment Sign: [+-];

//Operators

LeftCurly: '{';
RightCurly: '}';
LeftParenthese: '(';
RightParenthese: ')';
LeftSquare: '[';
RightSquare: ']';

Dot: '.';
Colon: ':';
Semicolon: ';';

Add: '+';
OverflowAdd: '+&';
SaturatingAdd: '+|';
Sub: '-';
OverflowSub: '-&';
SaturatingSub: '-|';
Mul: '*';
OverflowMul: '*&';
SaturatingMul: '*|';
Divide: '/';
RemainderDivide: '%';
Power: '**';
OverflowingPower: '**&';
SaturatingPower: '**|';

Assign: '=';
AddAssign: '+=';
OverflowingAddAssign: '+&=';
SaturatingAddAssign: '+|=';
SubAssign: '-=';
OverflowingSubAssign: '-&=';
SaturatingSubAssign: '-|=';
MulAssign: '*=';
OverflowingMulAssign: '*&=';
SaturatingMulAssign: '*|=';
PowerAssign: '**=';
OverflowingPowerAssign: '**&=';
SaturatingPowerAssign: '**|=';
BitLeftShiftAssign: '<<=';
SaturatingBitLeftShiftAssign: '<<|=';
BitRightShiftAssign: '>>=';
BitAndAssign: '&=';
BitOrAssign: '|=';
BitNotAssign: '~=';

GreaterThan: '>';
LessThan: '<';
GreaterThanOrEqual: '>=';
LessThanOrEqual: '<=';
NotEqual: '!=';
ThreeWayComparison: '<=>';

BitNot: '~';
BitAnd: '&';
BitOr: '|';
BitXor: '^^';
BitLeftShift: '<<';
SaturatingBitLeftShift: '<<|';
BitRightShift: '>>';

PointerType: '.&';
PointerDeref: '.*';
ObjectAddress: '.@';

Reflect: '^';
Reify: '#';

ClosedRange: '...';
RightOpenRange: '..<';
LeftOpenRange: '<..';
OpenedRange: '<.<';

DefaultUnwrapping: '??';
ThrowableUnwrapping: '.?';
ForcedUnwrapping: '.!';
ThrowableOptionalChaining: '?.';
ForcedOptionalChaining: '!.';

//Whitespaces and comments
Whitespace: [ \t\r\n\f]+ -> channel(HIDDEN);
Newline: ('\r' '\n'? | '\n') -> channel(HIDDEN);
LineComment: ('//' (~[/!] | '//') ~[\r\n]* | '//') -> channel (HIDDEN);
InnerLineDocComment: '//!' ~[\n\r]* -> channel (HIDDEN);
OuterLineDocComment: '///!' (~[/] ~[\n\r]*)? -> channel (HIDDEN);

BlockComment
   :
   (
      '//{'
      (
         ~[*!]
         | '**'
         | BlockCommentOrDoc
      )
      (
         BlockCommentOrDoc
         | ~[*]
      )*? '}//'
      | '//{}//'
   ) -> channel (HIDDEN)
   ;

InnerBlockComment
   : '//!{'
   (
      BlockCommentOrDoc
      | ~[*]
   )*? '}//' -> channel (HIDDEN)
   ;

OuterBlockComment
   : '///!{'
   (
      ~[*]
      | BlockCommentOrDoc
   )
   (
      BlockCommentOrDoc
      | ~[*]
   )*? '}///' -> channel (HIDDEN)
   ;

BlockCommentOrDoc
   :
   (
      BlockComment
      | InnerBlockComment
      | OuterBlockComment
   ) -> channel (HIDDEN)
   ;