lexer grammar AtemLexer;

//Keywords

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