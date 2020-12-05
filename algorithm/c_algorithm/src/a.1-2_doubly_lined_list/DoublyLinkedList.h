/*
 * DoublyLinedList.h
 *
 *  Created on: 2018. 12. 30.
 *      Author: otrodevym
 */

#ifndef DOUBLYLINKEDLIST_H_
#define DOUBLYLINKEDLIST_H_
#define NULL (void *)0

#include <stdio.h>
#include <stdlib.h>

typedef int ElementType;

typedef struct tagNode{
	ElementType Data;
	struct tagNode* PrevNode;
	struct tagNode* NextNode;
} Node;

Node* DLL_CreateNode(ElementType NewData);
void DLL_DestroyNode(Node* Node);
void DLL_AppendNode(Node** Head, Node* NewNode);
void DLL_InsertAfter(Node* Current, Node* NewNode);
void DLL_RemoveNode(Node** Head, Node* Remove);
Node* DLL_GetNodeAt(Node* Head, int Location);
int DLL_GetNodeCount(Node* Head);


#endif /* DOUBLYLINKEDLIST_H_ */
