/*
 * FibonacciDP.c
 *
 *  Created on: 2019. 1. 13.
 *      Author: otrodevym
 */


#include <stdio.h>
#include <stdlib.h>


typedef unsigned long ULONG;

ULONG Fibonacci(int N){
	int  i;
	ULONG Result;
	ULONG* FibonacciTable;

	if(N == 0 || N == 1){
		return N;
	}

	FibonacciTable = (ULONG)malloc(sizeof(ULONG) * (N+1));

	FibonacciTable[0] = 0;
	FibonacciTable[1] = 1;


	for(i = 2; i <= N; i++){
		FibonacciTable[i] = FibonacciTable[i-2] +FibonacciTable[i-1];
	}
	Result = FibonacciTable[N];

	return Result ;
	free(FibonacciTable);
}

int main(){
	int N = 46;
	ULONG Result = Fibonacci(N);
	printf("Fibonacci(%d) : %d",N,  Result);

	return 0;
}
