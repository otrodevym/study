/*
 * array_stack.h
 *
 *  Created on: 2018. 12. 31.
 *      Author: otrodevym
 */

#ifndef ARRAY_STACK_H_
#define ARRAY_STACK_H_
#define NULL (void *)0

#include <stdio.h>
#include <stdlib.h>

typedef int ElementType;

typedef struct tagNode{
	ElementType Data;
}Node;

typedef struct tagArrayStack{
	int Capacity;
	int Top;
	Node* Nodes;
} ArrayStack;

void AS_CreateStack(ArrayStack** Stack, int Capacity);
void AS_DestroyStack(ArrayStack* Stack);
void AS_Push(ArrayStack* Stack, ElementType Data);
ElementType AS_Pop(ArrayStack* Stack);
ElementType AS_Top(ArrayStack* Stack);
int AS_GetSize(ArrayStack* Stack);
int AS_IsEmpty(ArrayStack* Stack);

#endif /* 2_1_ARRAY_STACK_ARRAY_STACK_H_ */
