/*
 * NQeensMain.c
 *
 *  Created on: 2019. 1. 14.
 *      Author: otrodevym
 */


#include "NQeens.h"


int main(int argc, char* argv[]){
	int i = 0;
	int NumberOfQueens = 8;
	int SolutionCount = 0;
	int* Columns;

//	if(argc < 2){
//		printf("Usage : %s <Number of Queen>", argv[0]);
//	}

//	NumberOfQueens = atoi(argv[1]);

	Columns = (int*)calloc(NumberOfQueens, sizeof(int));

	for(i = 0; i < NumberOfQueens; i++){
		Columns[0] = i;
		FindSolutionForQueen(Columns, 0, NumberOfQueens, &SolutionCount);
	}

	free(Columns);
	return 0;

}
