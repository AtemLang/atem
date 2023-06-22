parser grammar AtemParser;

options {
	tokenVocab = AtemLexer;
}

TopLevel: Statements? EOF;

Statement: Colon;

Statements: Statement+;