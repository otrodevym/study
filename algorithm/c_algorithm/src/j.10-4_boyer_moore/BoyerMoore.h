/*
 * BoyerMoore.h
 *
 *  Created on: 2019. 1. 11.
 *      Author: otrodevym
 */

#ifndef BOYERMOORE_H_
#define BOYERMOORE_H_

#include <stdio.h>
#include <string.h>
#define MAX_BUFFER 512

int BoyerMoore(char* Text, int TextSize, int Start, char* Pattern, int PatternSize);

void BuildGST(char* Pattern, int PatternSize, int* Suffix, int* GST);
void BuildBCT(char* Pattern, int PatternSize, int* BCT);

int Max(int A, int B);

#endif /* J10_4_BOYER_MOORE_BOYERMOORE_H_ */
