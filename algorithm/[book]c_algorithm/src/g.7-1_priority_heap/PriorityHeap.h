/*
 * Heap.h
 *
 *  Created on: 2019. 1. 7.
 *      Author: otrodevym
 */

#ifndef PRIORITY_HEAP_H_
#define PRIORITY_HEAP_H_

#include <stdio.h>
#include <memory.h>
#include <stdlib.h>

typedef int ElementType;

typedef struct tagHeapNode{
	ElementType Data;
} HeapNode;


typedef struct tagNode{
	HeapNode* Nodes;
	int Capacity;
	int UsedSize;
} Heap;



Heap* HEAP_Create(int initialSize);
void HEAP_Destroy(Heap* H);
void HEAP_Insert(Heap* H, ElementType NewData);
void HEAP_DeleteMin(Heap* H, HeapNode* Root);
int HEAP_GetParent(int Index);
int HEAP_GetLeftChild(int Index);
void HEAP_SwapNodes(Heap* H, int Index1, int Index2);
void HEAP_PrintNodes(Heap* H);



#endif /* 7_PRIORITY_HEAP_AND_QUEUE_HEAP_H_ */
