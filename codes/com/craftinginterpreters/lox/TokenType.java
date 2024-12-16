package com.craftinginterpreters.lox;

enum TokenType {
  //�@�L���P�̃g�[�N��
  LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
  COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

  // �L���P�܂��͂Q�ɂ��g�[�N��
  BANG, BANG_EQUAL,
  EQUAL, EQUAL_EQUAL,
  GREATER, GREATER_EQUAL,
  LESS, LESS_EQUAL,

  // ���e����
  IDENTIFIER, STRING, NUMBER,

  // �L�[���[�h
  AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR,
  PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE,

  EOF
}