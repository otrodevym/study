/*
 * ExpressionTree.h
 *
 *  Created on: 2019. 1. 2.
 *      Author: otrodevym
 */

#ifndef EXPRESSIONTREE_H_
#define EXPRESSIONTREE_H_
#define NULL (void *) 0

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef char ElementType;

typedef struct tagETNode{
	struct tagETNode* Left;
	struct tagETNode* Right;

	ElementType Data;
} ETNode;

ETNode* ET_CreateNode(ElementType NewData);
void ET_DestroyNode(ETNode* Node);
void ET_DestroyTree(ETNode* Root);

void ET_PreorderPrintTree(ETNode* Node);
void ET_InorderPrintTree(ETNode* Node);
void ET_PostorderPrintTree(ETNode* Node);
void ET_BuildExpressionTree(char* PostfixExpression, ETNode** Node);
double ET_Evaluate(ETNode* Tree);


#endif /* 4_3_EXPRESSION_TREE_EXPRESSIONTREE_H_ */
