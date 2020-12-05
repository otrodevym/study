/*
 * BinarySearch.c
 *
 *  Created on: 2019. 1. 5.
 *      Author: otrodevym
 */

#include "BinarySearch.h"

Score* BinarySearch(Score ScoreList[], int Size, double Target) {
	int Left, Right, Mid;
	Left = 0;

	Right = Size - 1;

	while (Left <= Right) {
		Mid = (Left + Right) / 2;

		if (Target == ScoreList[Mid].Score) {
			return &(ScoreList[Mid]);
		} else if (Target > ScoreList[Mid].Score) {
			Left = Mid + 1;
		} else {
			Right = Mid - 1;
		}
	}
	return NULL;
}

int CompareScore2(const void *_elem1, const void *_elem2) {
	Score* elem1 = (Score*) _elem1;
	Score* elem2 = (Score*) _elem2;

	if (elem1->Score > elem2->Score) {
		return 1;
	} else if (elem1->Score < elem2->Score) {
		return -1;
	} else {
		return 0;
	}
}

int BinarySearchMain() {
	int Length = sizeof(DataSet) / sizeof(DataSet[0]);

	Score* Found = NULL;

	qsort((void *) DataSet, Length, sizeof(Score), CompareScore2);

	Found = BinarySearch(DataSet, Length, 10);

	printf("found : %d %f \n", Found->Number, Found->Score);
	return 0;

}
