/*
 * SequentialSearch.c
 *
 *  Created on: 2019. 1. 5.
 *      Author: otrodevym
 */

#include <stdio.h>
#include <stdlib.h>
#include "SequentialSearch.h"

int SequentialSearchMain() {
	Node* List = NULL;
	Node* NewNode = NULL;
	Node* SearchNode = NULL;
	int i = 0;

	for (i = 0; i < 10; i++) {
		NewNode = SLL_CreateNode(i);
		SLL_AppendNode(&List, NewNode);
	}

	SearchNode = SLL_SequentialSearch(List, 2);

	printf("%d", SearchNode->Data);

	printf("\n");

	for (i = 0; i < 10; i++) {
		printf("%d  ", List->Data);
		List = List->NextNode;
	}

	return 0;
}

