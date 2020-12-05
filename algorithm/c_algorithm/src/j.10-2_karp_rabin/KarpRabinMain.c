/*
 * KarpRaBinMain.c
 *
 *  Created on: 2019. 1. 10.
 *      Author: otrodevym
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "KarpRabin.h"

#define MAX_BUFFER 512

int main(int argc, char** argv) {
	char* FilePath = "kjv.txt";
	FILE* fp;

	char Text[MAX_BUFFER];
	char* Pattern ="Righteousness";
	int PatternSize = 0;
	int Line = 0;
//
//	if (argc < 3) {
//		printf("Usage: %s <FilePath> <Pattern> \n", argv[0]);
//		return 1;
//	}
//
//	FilePath = argv[1];
//	Pattern = argv[2];

	PatternSize = strlen(Pattern);

	if ((fp = fopen(FilePath, "r")) == NULL) {
		printf("Cannot open file : %s \n", FilePath);
		return 1;
	}

	while (fgets(Text, MAX_BUFFER, fp) != NULL) {
		int Position = KarpRabin(Text, strlen(Text), 0, Pattern, PatternSize);

		Line++;

		if (Position >= 0) {
			printf("line : %d, column;%d : %s", Line++, Position, Text);
		}

	}

	fclose(fp);

}

