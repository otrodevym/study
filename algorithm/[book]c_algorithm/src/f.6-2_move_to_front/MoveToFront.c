/*
 * MoveToFront.c
 *
 *  Created on: 2019. 1. 5.
 *      Author: otrodevym
 */
#include "MoveToFront.h"

Node* SLL_MoveToFront(Node** Head, int Target){
	Node* Current = (*Head);
	Node* Previous = NULL;
	Node* Match = NULL;


	while(Current != NULL){
		if(Current->Data == Target){
			Match = Current;
			if(Previous != NULL){
				Previous->NextNode = Current->NextNode;
				Current->NextNode = (*Head);
				(*Head) = Current;
			}
				break;

		}else{
			Previous = Current;
			Current = Current->NextNode;
		}
	}
	return Match;
}
