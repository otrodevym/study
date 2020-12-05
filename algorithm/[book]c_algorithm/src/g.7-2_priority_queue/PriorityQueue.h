/*
 * PriorityQueue.h
 *
 *  Created on: 2019. 1. 7.
 *      Author: otrodevym
 */

#ifndef PRIORITYQUEUE_H_
#define PRIORITYQUEUE_H_

#include <stdio.h>
#include <stdlib.h>
#include <memory.h>

typedef int PriorityType;

typedef struct tagePQNode{
	PriorityType Priority;
	void* Data;
} PQNode;


typedef struct tagPriorityQueue{
	PQNode* Nodes;
	int Capacity;
	int UsedSize;

} PriorityQueue;

PriorityQueue* PQ_Create(int InitialSize);
void PQ_Destroy(PriorityQueue* PQ);
void PQ_Enqueue(PriorityQueue* PQ, PQNode NewNode);
void PQ_Dequeue(PriorityQueue* PQ, PQNode* Root);
int PQ_GetParent(int Index);
int PQ_GetLeftChild(int Index);
void PQ_SwapNodes(PriorityQueue* PQ, int Index1, int Index2);
int PQ_IsEmpty(PriorityQueue* PQ);




#endif /* 7_2_PRIORITY_QUEUE_PRIORITYQUEUE_H_ */
