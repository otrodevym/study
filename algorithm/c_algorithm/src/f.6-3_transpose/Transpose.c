/*
 * Transpose.c
 *
 *  Created on: 2019. 1. 5.
 *      Author: otrodevym
 */
#include "Transpose.h"

Node* SLL_Transpose(Node** Head, int Target) {
	Node* Current = (*Head);
	Node* Match = NULL;
	Node* PPrevious = NULL;
	Node* Previous = NULL;

	while (Current != NULL) {
		if (Current->Data == Target) {
			Match = Current;
			if (Previous != NULL) {
				if (PPrevious != NULL) {
					PPrevious->NextNode = Current;

				} else {
					(*Head) = Current;
				}
				Previous->NextNode = Current->NextNode;

				Current->NextNode = Previous;
			}
			break;

		} else {
			if(Previous != NULL){
				PPrevious = Previous;
			}
				Previous = Current;
				Current = Current->NextNode;
		}
	}
	return Match;
}
