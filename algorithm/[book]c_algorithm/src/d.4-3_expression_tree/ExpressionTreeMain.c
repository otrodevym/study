/*
 * ExpressionTreeMain.c
 *
 *  Created on: 2019. 1. 2.
 *      Author: otrodevym
 */

#include "ExpressionTree.h"


int ExpressionTreeMain(){

	ETNode* Root = NULL;

	char PostfixExpress[20] = "71*52-/";

	ET_BuildExpressionTree(PostfixExpress, &Root);


	printf("Preorder ...\n");
	ET_PreorderPrintTree(Root);
	printf("\n\n");
	printf("Inorder ...\n");
	ET_InorderPrintTree(Root);
	printf("\n\n");
	printf("Postorder ...\n");
	ET_PostorderPrintTree(Root);
	printf("\n\n");

	printf("Evaulation Result : %f \n" , ET_Evaluate(Root));

	ET_DestroyTree(Root);

	return 0;

}

