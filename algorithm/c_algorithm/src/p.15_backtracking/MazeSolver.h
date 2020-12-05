/*
 * MazeSolver.h
 *
 *  Created on: 2019. 1. 13.
 *      Author: otrodevym
 */

#ifndef MAZESOLVER_H_
#define MAZESOLVER_H_

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_BUFFER 1024
#define INIT_VALUE -1

#define START	'S' // 시작점
#define GOAL	'G' // 탈출구
#define WAY		' ' // 길
#define WALL	'#' // 벽
#define MARKED	'+' // 탈출로로 향하는 길 표식

enum DIRECTION	{ NORTH, SOUTH, EAST, WEST};
enum RESULT		{ FAIL, SUCCEED};

typedef struct tagPosition{
	int x;
	int y;
} Position;


typedef struct tagMazeInfo{
	int ColumnSize;
	int RowSize;
	char** Data;
} MazeInfo;


int Solve(MazeInfo* Maze);
int MoveTo(MazeInfo* Maze, Position* Current, int Direction);
int GetNextStep(MazeInfo* Maze, Position* Current, int Direction, Position* Next);

int GetMaze(char* FilPath, MazeInfo* Maze);


#endif /* P_15_BACKTRACKING_MAZESOLVER_H_ */
