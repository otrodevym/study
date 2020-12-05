/*
 * SimpleHashTable.c
 *
 *  Created on: 2019. 1. 7.
 *      Author: otrodevym
 */

#include "SimpleHashTable.h"

HashTable* SHT_CreateHashTable(int TableSize){
	HashTable* HT = (HashTable*) malloc(sizeof(HashTable));
	HT->Table = (Node*)malloc(sizeof(Node)*TableSize);
	HT->TableSize = TableSize;

	return HT;
}
void SHT_Set(HashTable* HT, KeyType Key, ValueType Value){
	int Address = SHT_Hash(Key, HT->TableSize);
	HT->Table[Address].Key = Key;
	HT->Table[Address].Value = Value;
}
ValueType SHT_Get(HashTable* HT, KeyType Key){
	int Address = SHT_Hash(Key, HT->TableSize);
	return HT->Table[Address].Value;
}
void SHT_DestroyHashTable(HashTable* HT){
	free(HT->Table);
	free(HT);
}
int SHT_Hash(int Key, int TableSize){
	return Key % TableSize;
}

int MyHash(char* ChKey, int KeyLength, int TableSize){
	int i = 0;
	int HashValue = 0;

	for(i = 0; i < KeyLength; i++){
		HashValue += (HashValue<<3) + ChKey[i];
	}
	return HashValue % TableSize;
}
