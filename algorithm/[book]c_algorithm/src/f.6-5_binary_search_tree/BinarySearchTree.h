/*
 * BinarySearchTree.h
 *
 *  Created on: 2019. 1. 5.
 *      Author: otrodevym
 */

#ifndef BINARYSEARCHTREE_H_
#define BINARYSEARCHTREE_H_
#define NULL (void*) 0

#include <stdio.h>
#include <stdlib.h>

typedef int ElementType;

typedef struct tagBSTNode{
	struct tagBSTNode* Left;
	struct tagBSTNode* Right;

	ElementType Data;
} BSTNode;


BSTNode* BST_CreateNode(ElementType NewData);
void BST_DestroyNode(BSTNode* Node);
void BST_DestroyTree(BSTNode* Node);

BSTNode* BST_SearchNode(BSTNode* Tree, ElementType Target);
BSTNode* BST_SearchMinNode(BSTNode* Tre);
void BST_InsertNode(BSTNode* Tree, BSTNode *Child);
BSTNode* BST_RemoveNode(BSTNode* Tree, BSTNode* Parent, ElementType Target);
void BST_InorderPrintTree(BSTNode* Node);

#endif /* 6_5_BINARY_SEARCH_TREE_BINARYSEARCHTREE_H_ */
