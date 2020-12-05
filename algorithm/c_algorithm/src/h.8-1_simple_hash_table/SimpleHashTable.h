/*
 * SimpleHashTable.h
 *
 *  Created on: 2019. 1. 7.
 *      Author: otrodevym
 */

#ifndef SIMPLEHASHTABLE_H_
#define SIMPLEHASHTABLE_H_

#include <stdio.h>
#include <stdlib.h>

typedef int KeyType;
typedef int ValueType;

typedef struct tagNode{
	KeyType Key;
	ValueType Value;
} Node;

typedef struct tagHashTable{
	int TableSize;
	Node* Table;

} HashTable;


HashTable* SHT_CreateHashTable(int TableSize);
void SHT_Set(HashTable* HT, KeyType Key, ValueType Value);
ValueType SHT_Get(HashTable* HT, KeyType Key);
void SHT_DestroyHashTable(HashTable* HT);
int SHT_Hash(int Key, int TableSize);
int MyHash(char* ChKey, int keyLength, int TableSize);


#endif /* 8_1_SIMPLE_HASH_TABLE_SIMPLEHASHTABLE_H_ */
