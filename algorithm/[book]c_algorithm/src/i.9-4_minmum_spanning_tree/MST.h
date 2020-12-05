
/*
 * MST.h
 *
 *  Created on: 2019. 1. 9.
 *      Author: otrodevym
 */

#ifndef MST_H_
#define MST_H_

#include "DisjoinSetTree.h"
#include "Graph.h"
#include "PriorityQueue.h"

#define MAX_WEIGHT 36267

void Prim(Graph* G, Vertex* StartVertex, Graph* MST);
void Kruskal(Graph* G, Graph* MST);




#endif /* 9_4_MINMUM_SPANNING_TREE_MST_H_ */
