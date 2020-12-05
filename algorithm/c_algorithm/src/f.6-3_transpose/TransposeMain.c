/*
 * Transpose.c
 *
 *  Created on: 2019. 1. 5.
 *      Author: otrodevym
 */
#include "Transpose.h"

int TransposeMain() {
	int i = 0;
	Node* List = NULL;
	Node* NewNode = NULL;
	Node* Result = NULL;

	for (i = 0; i < 10; i++) {
		NewNode = SLL_CreateNode(i);
		SLL_AppendNode(&List, NewNode);
	}

	Result = SLL_Transpose(&List, 5);
	printf("%d", Result->Data);
	printf("\n");

	for (i = 0; i < 10; i++) {
		printf("%d  ", List->Data);
		List = List->NextNode;
	}
}
