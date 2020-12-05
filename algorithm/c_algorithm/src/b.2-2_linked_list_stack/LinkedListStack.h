/*
 * linked_list_stack.h
 *
 *  Created on: 2018. 12. 31.
 *      Author: otrodevym
 */

#ifndef LINKED_LIST_STACK_H_
#define LINKED_LIST_STACK_H_
#define NULL (void *) 0

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct tagNode{
	char* Data;
	struct tagNode* NextNode;
} Node;

typedef struct tagLinkedListStack{
	Node* List;
	Node* Top;
} LinkedListStack;


void LLS_CreateStack(LinkedListStack** Stack);
void LLS_DestroyStack(LinkedListStack* Stack);

Node* LLS_CreateNode(char* Data);
void LLS_DestroyNode(Node* _Node);

void LLS_Push(LinkedListStack* Stack, Node* NewNode);
Node* LLS_Pop(LinkedListStack* Stack);

Node* LLS_Top(LinkedListStack* Stack);
int LLS_GetSize(LinkedListStack* Stack);
int LLS_IsEmpty(LinkedListStack* Stack);


#endif /* 2_2_LINKED_LIST_STACK_LINKED_LIST_STACK_H_ */
