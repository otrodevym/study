/*
 * main.c
 *
 *  Created on: 2018. 12. 31.
 *      Author: otrodevym
 */

#include "CalculatorStack.h"

int CalcularStackMain(){
	printf("hello");
	char InfixExpression[100];
	char PostfixExpression[100];

	double Result = 0.0;
	memset(InfixExpression, 0, sizeof(InfixExpression));
	memset(PostfixExpression, 0, sizeof(PostfixExpression));

	printf("Enter Infix Expression: " );
	scanf("%s", InfixExpression);

	GetPostfix(InfixExpression, PostfixExpression);

	printf("Infix: %s \n Postfix: %s \n", InfixExpression, PostfixExpression);

	Result = Calculate(PostfixExpression);

	printf("Calcualtion Result : %f \n", Result );

	return 0;
}
