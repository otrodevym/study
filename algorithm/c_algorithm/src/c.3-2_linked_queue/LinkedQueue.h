/*
 * LinkedQueue.h
 *
 *  Created on: 2019. 1. 2.
 *      Author: otrodevym
 */

#ifndef LINKEDQUEUE_H_
#define LINKEDQUEUE_H_
#define NULL <void *>0

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct tagNode{
	char* Data;
	struct tagNode* NextNode;
} Node;

typedef struct LinkedQueue{
	Node* Front;
	Node* Rear;
	int Count;
} LinkedQueue;


void LQ_CreateQueue(LinkedQueue** Queue);
void LQ_DestroyQueue(LinkedQueue* Queue);

Node* LQ_CreateNode(char* NewData);
void LQ_DestroyNode(Node* _Node);
void LQ_Enqueue(LinkedQueue* Queue, Node* NewData);
Node* LQ_Dequeue(LinkedQueue* Queue);

int LQ_IsEmpty(LinkedQueue* Queue);


#endif /* 3_2_LINKED_QUEUE_LINKEDLIST_H_ */
