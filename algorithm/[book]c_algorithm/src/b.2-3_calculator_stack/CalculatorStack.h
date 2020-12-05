/*
 * calculatorStack.h
 *
 *  Created on: 2018. 12. 31.
 *      Author: otrodevym
 */

#ifndef CALCULATORSTACK_H_
#define CALCULATORSTACK_H_

#define NULL (void *) 0

#include <stdio.h>
#include <stdlib.h>

#include "../b.2-2_linked_list_stack/LinkedListStack.h"

typedef enum{
	LEFT_PARENTHESIS = '(', RIGHT_PARENTHESIS =')',
	PLUS = '+', MINUS = '-',
	MULTIPLY = '*', DIVIDE = '/',
	SPACE = ' ', OPERAND
} SYMBOL;


int IsNumber(char Cipher);
unsigned int GetNextToken(char* Expression, char* Token, int* TYPE);
int IsPrior(char Operator1, char Operator2);
void GetPostfix(char* InfixExpression, char* PostfixExpression);
double Calculate(char* PostfixExpression);



#endif /* 2_3_CALCULATOR_STACK_CALCULATORSTACK_H_ */
