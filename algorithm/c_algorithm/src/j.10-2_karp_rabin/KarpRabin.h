/*
 * KarpRabin.h
 *
 *  Created on: 2019. 1. 10.
 *      Author: otrodevym
 */

#ifndef KARPRABIN_H_
#define KARPRABIN_H_

int KarpRabin(char* Text, int TextSize, int Start, char* Pattern, int PatternSize);
int Hash(char* String, int Size);
int ReHash(char* String, int Start, int Size, int HashPrev, int Coefficient);


#endif /* J_10_2_KARP_RABIN_KARPRABIN_H_ */
