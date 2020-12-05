/*
 * CirtularLinkedList.c
 *
 *  Created on: 2018. 12. 30.
 *      Author: otrodevym
 */

#include "CircularLinkedList.h"

Node* CDLL_CreateNode(ElementType newData) {
	Node* NewNode = (Node*) malloc(sizeof(Node));

	NewNode->Data = newData;
	NewNode->PrevNode = NULL;
	NewNode->NextNode = NULL;
	return NewNode;
}

void CDLL_DestroyNode(Node* Node) {
	free(Node);
}

void CDLL_AppendNode(Node** Head, Node* NewNode) {
	if ((*Head) == NULL) {
		*Head = NewNode;
		(*Head)->NextNode = *Head;
		(*Head)->PrevNode = *Head;
	} else {
		Node *Tail = (*Head)->PrevNode;

		Tail->NextNode->PrevNode = NewNode;
		Tail->NextNode = NewNode;

		NewNode->NextNode = (*Head);
		NewNode->PrevNode = Tail;
	}
}

void CDLL_InsertAfter(Node* Current, Node* NewNode) {
	NewNode->NextNode = Current->NextNode;
	NewNode->PrevNode = Current;

	Current->NextNode->PrevNode = NewNode;
	Current->NextNode = NewNode;
}


void CDLL_RemoveNode(Node** Head, Node* Remove){
	if( *Head == NULL){
		(*Head)->PrevNode->NextNode = Remove->NextNode;
		(*Head)->NextNode->PrevNode = Remove->PrevNode;

		*Head = Remove->NextNode;

		Remove->PrevNode = NULL;
		Remove->NextNode = NULL;
	}else{
		Node* Temp = Remove;
		Remove->PrevNode->NextNode = Temp->NextNode;
		Remove->NextNode->PrevNode = Temp->PrevNode;

		Remove->PrevNode = NULL;
		Remove->NextNode = NULL;
	}
}

Node* CDLL_GetNodeAt(Node* Head, int Location){
	Node* Current = Head;
	while(Current != NULL && (--Location) >=0){
		Current = Current->NextNode;
	}
	return Current;
}

int CDLL_GetNodeCount(Node* Head){
	unsigned int Count = 0;
	Node* Current = Head;
	while(Current != NULL ){
		Current = Current->NextNode;
		Count++;
		if(Current == Head){
			break;
		}
	}
	return Count;
}


void PrintNode(Node* _Node){
	if(_Node->PrevNode == NULL){
		printf("prev : NULL");
	}else{
		printf("prev : %d ", _Node->PrevNode->Data);
	}
	printf(" Current : %d ", _Node->Data);

	if(_Node->NextNode == NULL){
		printf("Next : NULL \n");
	}else{
		printf("Next : %d \n", _Node->NextNode->Data);
	}
}






