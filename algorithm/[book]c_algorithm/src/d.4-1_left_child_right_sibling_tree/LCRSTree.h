/*
 * LCRSTree.h
 *
 *  Created on: 2019. 1. 2.
 *      Author: otrodevym
 */

#ifndef LCRSTREE_H_
#define LCRSTREE_H_
#define NULL (void *) 0

#include <stdio.h>
#include <stdlib.h>

typedef char ElementType;

typedef struct tagLCRSNode{
	struct tagLCRSNode* LeftChild;
	struct tagLCRSNode* RightSibling;
	ElementType Data;
} LCRSNode;

LCRSNode* LCRS_CreateNode(ElementType NewData);
void LCRS_DestroyNode(LCRSNode* Node);
void LCRS_DestroyTree(LCRSNode* Root);

void LCRS_AddChildNode(LCRSNode* ParentNode, LCRSNode* ChildNode);
void LCRS_PrintTree(LCRSNode* Node, int Depth);


#endif /* 4_1_LCRSTREE_LCRSTREE_H_ */
