/*
 * NQeens.h
 *
 *  Created on: 2019. 1. 14.
 *      Author: otrodevym
 */

#ifndef NQEENS_H_
#define NQEENS_H_


#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void PrintSolution(int Columns[], int NumberOfQueens);
int IsThreatened(int Columns[], int NewRow);
void FindSolutionForQueen(int Columns[], int Row, int NumberOfQueens, int* SolutionCount);


#endif /* P_15_1_NQUEENS_NQEENS_H_ */
