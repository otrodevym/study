/*
 * BinarySearch.c
 *
 *  Created on: 2019. 1. 5.
 *      Author: otrodevym
 */

#include "BinarySearch2.h"


int CompareScore3(const void *_elem1, const void *_elem2) {
	Score2* elem1 = (Score2*) _elem1;
	Score2* elem2 = (Score2*) _elem2;

	if (elem1->Score > elem2->Score) {
		return 1;
	} else if (elem1->Score < elem2->Score) {
		return -1;
	} else {
		return 0;
	}
}

int BinarySearch2Main() {
	int Length = sizeof(DataSet2) / sizeof(DataSet2[0]);

	Score2* Found = NULL;
	Score2 Target;

	qsort((void *) DataSet2, Length, sizeof(Score2), CompareScore3);

	Target.Number= 0;
	Target.Score = 10;

	Found = bsearch((void*)&Target, (void*)DataSet2, Length, sizeof(Score2), CompareScore3);
	printf("found : %d %f \n", Found->Number, Found->Score);
	return 0;

}
