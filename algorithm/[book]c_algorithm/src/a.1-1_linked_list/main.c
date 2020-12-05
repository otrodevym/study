
#include "LinkedList.h"

/* run this program using the console pauser or add your own getch, system("pause") or input loop */


int linkedList(int argc, char *argv[]) {
	int		i 		= 	0;
	int		Count 	= 	0;
	Node*	List	=	NULL;
	Node*	Current	=	NULL;
	Node*	NewNode	=	NULL;
	
	for(i = 0; i < 5; i++){
		NewNode = SLL_CreateNode(i);
		SLL_AppendNode(&List, NewNode);
	}
	
	NewNode = SLL_CreateNode(-1);
	SLL_InsertNewHead(&List, NewNode);
	
	NewNode = SLL_CreateNode(-2);
	SLL_InsertNewHead(&List, NewNode);
	
	Count = SLL_GetNodeCount(List);
	for(i = 0; i < Count; i++){
		Current = SLL_GetNodeAt(List, i);
		printf("List[%d] : %d \n " , i, Current->Data);		
	}
	
	printf("\n Inserting 3000 After [2]...\n\n]");
	
	Current = SLL_GetNodeAt(List, 2);
	NewNode = SLL_CreateNode(3000);
	
	SLL_InsertAfter(Current, NewNode);

	Count = SLL_GetNodeCount(List);
	for(i = 0; i < Count; i++){
		Current = SLL_GetNodeAt(List, i);
		printf("List[%d] : %d \n", i , Current->Data);
	}
	
		printf("\n Inserting 2000 Before [2]...\n\n]");
	
	Current = SLL_GetNodeAt(List, 1);
	NewNode = SLL_CreateNode(2000);
	
	SLL_InsertBefore(&List, Current, NewNode);

	Count = SLL_GetNodeCount(List);
	for(i = 0; i < Count; i++){
		Current = SLL_GetNodeAt(List, i);
		printf("List[%d] : %d \n", i , Current->Data);
	}
	
	printf("\n Destroying List...\n");
	for(i = 0; i < Count; i++){
		Current = SLL_GetNodeAt(List, 0);
		if(Current != NULL){
			SLL_RemoveNode(&List, Current);
			SLL_DestroyNode(Current);
		}
	}
	
	printf("hi");
	return 0;
}
