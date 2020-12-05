/*
 * BoyerMooreMain.c
 *
 *  Created on: 2019. 1. 11.
 *      Author: otrodevym
 */


#include "../j.10-4_boyer_moore/BoyerMoore.h"

int main(int argc, char** argv){

	char* FilePath = "kjv.txt";
	FILE* fp;

	char Text[MAX_BUFFER];
	char* Pattern = "Lord of lords";
	int PatternSize = 0;
	int Line = 0;

	if(argc < 3){
		printf("Usage : %s <FilePath> <Pattern> \n", argv[0]);
		return 1;
	}

	while(fgets(Text, MAX_BUFFER, fp) != NULL){
		int Position = BoyerMoore(Text, strlen(Text), 0, Pattern, PatternSize);

		Line++;

		if(Position >= 0 ){
			printf("Line : %d, column : %d, Text : %s", Line, Position, Text);
		}
	}
	fclose(fp);

	return 0;

}
