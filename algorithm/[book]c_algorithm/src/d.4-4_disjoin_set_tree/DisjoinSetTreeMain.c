/*
 * DisjoinSetTreeMain.c
 *
 *  Created on: 2019. 1. 2.
 *      Author: otrodevym
 */


#include "DisjoinSetTree.h"


int DisjoinSetTreeMain(){
	int a = 1, b = 2, c = 3, d = 4;
	DisjoinSet* Set1 = DS_MakeSet(&a);
	DisjoinSet* Set2 = DS_MakeSet(&b);
	DisjoinSet* Set3 = DS_MakeSet(&c);
	DisjoinSet* Set4 = DS_MakeSet(&d);


	printf("Set1 == Set2 : %d \n", (DS_FindSet(&Set1) == DS_FindSet(&Set2)));

	DS_UnionSet(Set1, Set3);
	printf("Set1 == Set3 : %d \n", (DS_FindSet(&Set1) == DS_FindSet(&Set3)));


	DS_UnionSet(Set3, Set4);
	printf("Set3 == Set4 : %d \n", (DS_FindSet(&Set3) == DS_FindSet(&Set4)));

	return 0;
}
