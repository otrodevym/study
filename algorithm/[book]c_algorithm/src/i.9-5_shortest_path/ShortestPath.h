/*
 * ShortestPath.h
 *
 *  Created on: 2019. 1. 9.
 *      Author: otrodevym
 */

#ifndef SHORTESTPATH_H_
#define SHORTESTPATH_H_

#include "../i.9-5_shortest_path/Graph.h"
#include "../i.9-5_shortest_path/PriorityQueue.h"
#define MAX_WEIGHT 36267

void Dijkstra(Graph* G, Vertex* StartVertex, Graph* ShortestPath);

#endif /* 9_5_SHORTEST_PATH_SHORTESTPATH_H_ */
