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

//Literals

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