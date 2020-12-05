

#ifndef LINKEDLIST_H
#define LINKEDLIST_H
#define NULL (void *)0

#include <stdio.h>
#include <stdlib.h>

#include "Graph.h"
typedef Vertex* ElementTypeGraph;

typedef struct tagNode{
	ElementTypeGraph Data;
	struct tagNode* NextNode;
} Node;

Node* SLL_CreateNode(ElementTypeGraph NewData);
void SLL_DestroyNode(Node* Node);
void SLL_AppendNode(Node** Head, Node* NewNode);
void SLL_InsertAfter(Node* Current, Node* NewNode);
void SLL_InsertNewHead(Node** Head, Node* NewHead);
void SLL_RemoveNode(Node** Head, Node* Remove);
Node* SLL_GetNodeAt(Node* Head, int Location);
int SLL_GetNodeCount(Node* Head);

#endif
