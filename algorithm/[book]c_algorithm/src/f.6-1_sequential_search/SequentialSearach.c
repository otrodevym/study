/*
 * SequentialSearach.c
 *
 *  Created on: 2019. 1. 5.
 *      Author: otrodevym
 */

#include "SequentialSearch.h"


Node* SLL_SequentialSearch(Node* Head, int Target) {
	Node* Match = NULL;
	Node* Current = Head;
	while (Current != NULL) {
		if (Current->Data == Target) {
			Match = Current;
			break;
		}else{
			Current = Current->NextNode;
		}
	}
	return Match;
}
