package i_graph;

import java.util.Scanner;

public class GraphTraversal<T> {
	
	private void dfs(Vertex<T> v) {
		Edge<T> e = null;
		System.out.print(v.getData() +" ");
		v.setVisited(VisitedMode.Visited);
		
		e = v.getAdjacencyList();
		while(e != null) {
			if(e.getTarget() != null && e.getTarget().getVisited() == VisitedMode.NotVisited) {
				dfs(e.getTarget());
			}
			e = e.getNext();
		}
	}
	
	private void bfs(Vertex<T> v ) {
		Edge<T> e = null;
		System.out.print(v.getData() + " ");
		
		v.setVisited(VisitedMode.Visited);
		LinkedQueue<Vertex<T>> lq = new LinkedQueue<>();
		lq.enQueue(v);
		
		while(!lq.isEmpty()) {
			Vertex<T> vPopped = lq.deQueue();
			e = vPopped.getAdjacencyList();
			
			while(e != null) {
				vPopped = e.getTarget();
				
				if(vPopped != null &&
						vPopped.getVisited() == VisitedMode.NotVisited) {
					System.out.print(vPopped.getData() + " ");
					
					vPopped.setVisited(VisitedMode.Visited);
					lq.enQueue(vPopped);
				}
				e = e.getNext();
			}
		}
	}
	
	public static void main(String args[]) {
		String mode = "0";
		
		AdjacencyGraph<Integer> ag = new AdjacencyGraph<Integer>();
		Vertex<Integer> v1 = ag.createVertex(1);
		Vertex<Integer> v2 = ag.createVertex(2);
		Vertex<Integer> v3 = ag.createVertex(3);
		Vertex<Integer> v4 = ag.createVertex(4);
		Vertex<Integer> v5 = ag.createVertex(5);
		Vertex<Integer> v6 = ag.createVertex(6);
		Vertex<Integer> v7 = ag.createVertex(7);
		
		ag.addVertex(v1);
		ag.addVertex(v2);
		ag.addVertex(v3);
		ag.addVertex(v4);
		ag.addVertex(v5);
		ag.addVertex(v6);
		ag.addVertex(v7);
		
		ag.addEdge(v1, ag.createEdge(v1, v2, 0));
		ag.addEdge(v1, ag.createEdge(v1, v3, 0));
		
		ag.addEdge(v2, ag.createEdge(v2, v4, 0));
		ag.addEdge(v2, ag.createEdge(v2, v5, 0));
		
		ag.addEdge(v3, ag.createEdge(v3, v4, 0));
		ag.addEdge(v3, ag.createEdge(v3, v6, 0));
		
		ag.addEdge(v4, ag.createEdge(v4, v5, 0));
		ag.addEdge(v4, ag.createEdge(v4, v7, 0));
		
		ag.addEdge(v5, ag.createEdge(v5, v7, 0));
		
		ag.addEdge(v6, ag.createEdge(v6, v7, 0));
		
		System.out.println("Enter Traversal Mode (0:DFS, 1:BFS) : ");
		Scanner s = new Scanner(System.in);
		
		GraphTraversal<Integer> gt = new GraphTraversal<Integer>();
		if(s.nextLine().equals(mode)) {
			gt.dfs(ag.getVertecies());
			System.out.println("dfs");
		}else {
			gt.bfs(v1);
			System.out.println("bfs");
		}
	}
}
