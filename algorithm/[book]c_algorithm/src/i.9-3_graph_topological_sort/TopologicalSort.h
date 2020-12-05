/*
 * TopologicalSort.h
 *
 *  Created on: 2019. 1. 8.
 *      Author: otrodevym
 */

#ifndef TOPOLOGICALSORT_H_
#define TOPOLOGICALSORT_H_

#include "../i.9-3_graph_topological_sort/LinkedList.h"
#include "../i.9-4_minmum_spanning_tree/Graph.h"


void TopologicalSort(Vertex* V, Node** List);
void Ts_DFS(Vertex* V, Node** List);


#endif /* 9_3_GRAPH_TOPOLOGICAL_SORT_TOPOLOGICALSORT_H_ */
