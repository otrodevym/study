/*
 * KnuthMorrisPrattMain.c
 *
 *  Created on: 2019. 1. 10.
 *      Author: otrodevym
 */

#include "KnuthMorrisPratt.h"


int main(int argc, char** argv){
	char* FilePath = "kjv.txt";
	FILE* fp;

	char Text[MAX_BUFFER];
	char* Pattern = "The Prince of Peace";
	int PatternSize = 0;
	int Line = 0;
//
//	if(argc<3){
//		printf("Usage : %s <FilePath> <Pattren> \n", argv[0]);
//		return 0;
//	}
//
//	FilePath = argv[1];
//	Pattern = argv[2];

	PatternSize = strlen(Pattern);

	if(( fp = fopen(FilePath, "r")) == NULL){
		printf("Cannot open file : %s\n", FilePath);
		return 1;
	}


	while(fgets(Text,MAX_BUFFER,fp ) != NULL){
		int Position = KnuthMorrisPratt(Text, strlen(Text), 0, Pattern, PatternSize);
		Line++;

		if(Position >= 0){
			printf("Line %d, column : %d : %s", Line, Position, Text);
		}
	}

	fclose(fp);

	return 0;
}
