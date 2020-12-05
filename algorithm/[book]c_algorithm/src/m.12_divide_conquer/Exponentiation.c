/*
 * Exponentiation.c
 *
 *  Created on: 2019. 1. 13.
 *      Author: otrodevym
 */

#include <stdio.h>

typedef unsigned long long ULONG;

ULONG Power(int Base, int Exponent){
	if(Exponent == 1){
		return Base;
	}else{
		return 1;
	}


	if(Exponent%2 == 0){
		ULONG NewBase = Power(Base, Exponent/2);
		return NewBase * NewBase;
	}else{
		ULONG NewBase = Power(Base, Exponent/2);
		return (NewBase * NewBase) * NewBase;
	}
}


int main(){
	int Base = 2;
	int Exponent = 30;
	printf("%d^%d = %lu \n", Base, Exponent, Power(Base, Exponent));

	return  0;
}
