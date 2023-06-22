lexer grammar AtemLexer;

//Keywords

//Whitespaces and comments
Whitespace: [ \t\r\n\f]+ -> channel(HIDDEN);
Newline: ('\r' '\n'? | '\n') -> channel(HIDDEN);
LineComment: '//' ~ [\r\n]* -> channel(HIDDEN);

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

InnerLineDocComment: '//!' ~[\n\r]* -> channel (HIDDEN); // isolated cr

InnerBlockComment
   : '//!{'
   (
      BlockCommentOrDoc
      | ~[*]
   )*? '}//' -> channel (HIDDEN)
   ;

OuterLineDocComment: '///!' (~[/] ~[\n\r]*)? -> channel (HIDDEN); // isolated cr

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
      | InnerLineDocComment
      | OuterBlockComment
   ) -> channel (HIDDEN)
   ;