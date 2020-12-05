/*
 * MazeSolver.c
 *
 *  Created on: 2019. 1. 13.
 *      Author: otrodevym
 */


#include "MazeSolver.h"

int Solve(MazeInfo* Maze){
	int i = 0;
	int j = 0;
	int StartFound = FAIL;
	int Result = FAIL;
	Position Start;
	for(i = 0; i < Maze->RowSize; i++){
		for(j = 0; j < Maze->ColumnSize; j++){
			if(Maze->Data[i][j] == START){
				Start.x = j;
				Start.y = i;
				StartFound = SUCCEED;
				break;
			}
		}
	}

	if(StartFound == FAIL){
		return FAIL;
	}


	if(MoveTo(Maze, &Start, NORTH)){
		Result = SUCCEED;
	}else if(MoveTo(Maze, &Start, SOUTH)){
		Result = SUCCEED;
	}else if(MoveTo(Maze, &Start, EAST)){
		Result = SUCCEED;
	}else if(MoveTo(Maze, &Start, WEST)){
		Result = SUCCEED;
	}else{

	}

	Maze->Data[Start.y][Start.x] = START;

	return Result;


}
int MoveTo(MazeInfo* Maze, Position* Current, int Direction){
	int i = 0;

	int Dirs[] = {NORTH, SOUTH, WEST, EAST};

	Position Next;

	if(Maze->Data[Current->y][Current->x] == GOAL){
		return SUCCEED;
	}

	Maze->Data[Current->y][Current->x] = MARKED;

	for(i =0; i < 4; i++){
		if(GetNextStep(Maze, Current, Dirs[i], &Next) == FAIL){
			continue;
		}

		if(MoveTo(Maze, &Next, NORTH) == SUCCEED){
			return SUCCEED;
		}
	}
	Maze->Data[Current->y][Current->x] = WAY;

	return FAIL;

}
int GetNextStep(MazeInfo* Maze, Position* Current, int Direction, Position* Next){
	switch(Direction){
	case NORTH :
		Next->x = Current->x;
		Next->y = Current->y -1;
		if(Next->y == -1) return FAIL;
		break;
	case SOUTH :
		Next->x = Current->x;
		Next->y = Current->y +1;
		if(Next->y == Maze->RowSize) return FAIL;
		break;
	case WEST:
		Next->x = Current->x-1;
		Next->y = Current->y;
		if(Next->x == -1) return FAIL;
		break;
	case EAST:
		Next->x = Current->x+1;
		Next->y = Current->y;
		if(Next->x == Maze->ColumnSize) return FAIL;
		break;
	}
	if(Maze->Data[Next->y][Next->x] == WALL) return FAIL;
	if(Maze->Data[Next->y][Next->x] == MARKED) return FAIL;

	return SUCCEED;
}

int GetMaze(char* FilePath, MazeInfo* Maze){
	int i = 0;
	int j = 0;
	int RowSize = 0;
	int ColumnSize = INIT_VALUE;

	FILE* fp;
	char buffer[MAX_BUFFER];

	if((fp = fopen(FilePath, "r")) == NULL){
		printf("Cannot open file : %s \n", FilePath	);
		return FAIL;
	}


	while(fgets(buffer, MAX_BUFFER, fp) != NULL){
		RowSize++;
		if(ColumnSize == INIT_VALUE){
			ColumnSize = strlen(buffer) -1;
		}else if(ColumnSize != strlen(buffer) -1){
			printf("Maze data in file : %s is not valid. %d \n", FilePath,strlen(buffer));
			fclose(fp);
			return FAIL;
		}
	}

	Maze->RowSize 		=	RowSize;
	Maze->ColumnSize	=	ColumnSize;
	Maze->Data			=	(char**)malloc(sizeof(char*) *RowSize);

	for(i = 0; i< RowSize; i++){
		Maze->Data[i] = (char*)malloc(sizeof(char) * ColumnSize);
	}


	rewind(fp);

	for(i = 0; i < RowSize; i++){
		fgets(buffer,MAX_BUFFER,fp);

		for( j = 0; j < ColumnSize; j++){
			Maze->Data[i][j] = buffer[j];
		}
	}
	fclose(fp);
	return SUCCEED;
}
