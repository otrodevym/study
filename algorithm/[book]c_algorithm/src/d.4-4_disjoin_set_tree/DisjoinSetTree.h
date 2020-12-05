/*
 * DisjoinSetTree.h
 *
 *  Created on: 2019. 1. 2.
 *      Author: otrodevym
 */

#ifndef DISJOINSETTREE_H_
#define DISJOINSETTREE_H_
#define NULL (void *) 0

#include <stdio.h>
#include <stdlib.h>


typedef struct tagDisjoinSet{
	struct tagDisjoinSet* Parent;
	void* Data;
} DisjoinSet;


void DS_UnionSet(DisjoinSet* Set1, DisjoinSet* Set2);
DisjoinSet* DS_FindSet(DisjoinSet* Set);
DisjoinSet* DS_MakeSet(void* NewData);
void DS_DestroySet(DisjoinSet* Set);

#endif /* 4_4_DISJOIN_SET_TREE_DISJOINSETTREE_H_ */
