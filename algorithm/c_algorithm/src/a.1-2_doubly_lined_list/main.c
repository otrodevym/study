#include "DoublyLinkedList.h"

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int doublyLinkedList(int argc, char *argv[]) {

	int i = 0;
	int Count = 0;
	Node* List = NULL;
	Node* NewNode = NULL;
	Node* Current = NULL;

	for(i = 0; i < 5; i++){
		NewNode = DLL_CreateNode(i);
		DLL_AppendNode(&List, NewNode);
	}
	Count = DLL_GetNodeCount(List);
	for(i = 0; i < Count; i++){
		Current = DLL_GetNodeAt(List, i);
		printf("Data : %d \n ", Current->Data);
	}

	printf("\n Inserting 3000 After [2]....");

	Current = DLL_GetNodeAt(List, 2);
	NewNode = DLL_CreateNode(3000);
	DLL_InsertAfter(Current, NewNode);

	Count = DLL_GetNodeCount(List);
	for(i = 0; i < Count; i++){
		Current = DLL_GetNodeAt(List, i);
		printf("Data : %d \n", Current->Data );
	}

	printf("\n Destroyng List...\n");
	Count = DLL_GetNodeCount(List);
	for( i = 0; i < Count; i++){
		Current = DLL_GetNodeAt(List, 0);
		if(Current != NULL){
			DLL_RemoveNode(&List, Current);
			DLL_DestroyNode(Current);
		}
	}


	return 0;
}
