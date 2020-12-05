/*
 * DisjoinSetTree.c
 *
 *  Created on: 2019. 1. 2.
 *      Author: otrodevym
 */

#include "DisjoinSetTree.h"

void DS_UnionSet(DisjoinSet* Set1, DisjoinSet* Set2){
	Set2 = DS_FindSet(Set2);
	Set2->Parent = Set1;
}

DisjoinSet* DS_FindSet(DisjoinSet* Set){
	while(Set->Parent != NULL){
		Set = Set->Parent;
	}

	return Set;
}

DisjoinSet* DS_MakeSet(void* NewData){
	DisjoinSet* NewNode = (DisjoinSet*)malloc(sizeof(DisjoinSet));
	NewNode->Data = NewData;
	NewNode->Parent = NULL;

	return NewNode;
}

void DS_DestroySet(DisjoinSet* Set){
	free(Set);
}


