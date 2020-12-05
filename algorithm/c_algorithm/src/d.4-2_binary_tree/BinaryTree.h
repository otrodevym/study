/*
 * binary_tree.h
 *
 *  Created on: 2019. 1. 2.
 *      Author: otrodevym
 */

#ifndef BINARY_TREE_H_
#define BINARY_TREE_H_
#define NULL (void *) 0

#include <stdio.h>
#include <stdlib.h>

typedef char ElementType;

typedef struct tagSBTNode{
	struct tagSBTNode* Left;
	struct tagSBTNode* Right;

	ElementType Data;
} SBTNode;


SBTNode* SBT_CreateNode(ElementType NewData);
void SBT_DestroyNode(SBTNode* Node);
void SBT_DestroyTree(SBTNode* Root);

void SBT_PreorderPrintTree(SBTNode* Node);
void SBT_InorderPrintTree(SBTNode* Node);
void SBT_PostorderPrintTree(SBTNode* Node);



#endif /* 4_2_BINARY_TREE_BINARY_TREE_H_ */
