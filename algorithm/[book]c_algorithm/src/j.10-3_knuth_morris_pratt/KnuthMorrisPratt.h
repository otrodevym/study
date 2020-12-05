/*
 * KnuthMorrisPratt.h
 *
 *  Created on: 2019. 1. 10.
 *      Author: otrodevym
 */

#ifndef KNUTHMORRISPRATT_H_
#define KNUTHMORRISPRATT_H_

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_BUFFER 512

int KnuthMorrisPratt(char* Text, int TextSize, int Start, char* Pattern, int PatternSize);

void Preprocess(char* Pattern, int PatternSize, int* Border);




#endif /* J_10_3_KNUTH_MORRIS_PRATT_KNUTHMORRISPRATT_H_ */
