/*
 * Chining.h
 *
 *  Created on: 2019. 1. 7.
 *      Author: otrodevym
 */

#ifndef CHINING_H_
#define CHINING_H_

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef char* KeyType;
typedef char* ValueType;

typedef struct tagNode{
	KeyType Key;
	ValueType Value;
	struct tagNode* Next;
}Node;


typedef Node* List;

typedef struct tagHashTable{
	int TableSize;
	List* Table;
} HashTable;

HashTable* CHT_CreateHashTable(int TableSize);
void CHT_DestroyHashTable(HashTable* HT);

Node* CHT_CreateNode(KeyType Key, ValueType Value);
void CHT_DestroyNode(Node* TheNode);

void CHT_Set(HashTable* HT, KeyType Key, ValueType Value);
ValueType CHT_Get(HashTable* HT, KeyType Key);
int CHT_Hash(KeyType Key, int KeyLength, int TableSize);

void CHT_DestroyHashTable(HashTable* HT);
void CHT_DestroyList(List L);


#endif /* 8_2_CHAINING_CHINING_H_ */
