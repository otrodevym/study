package i_graph;

public class TopologicalSort<T> {
	
	
	private void topologicalSort(Vertex<T> v, SinglyLinkedList<Vertex<T>> list) {
		while(v != null && v.getVisited() == VisitedMode.NotVisited) {
			tsDfs(v,list);
			
			v = v.getNext();
		}
	}

	private void tsDfs(Vertex<T> v, SinglyLinkedList<Vertex<T>> list) {
		
		Edge<T> e = null;
		
		v.setVisited(VisitedMode.Visited);
		
		e = v.getAdjacencyList();
		
		while(e != null) {
			if(e.getTarget() != null &&
					e.getTarget().getVisited() == VisitedMode.NotVisited) {
				tsDfs(e.getTarget(), list);
			}
			e = e.getNext();
		}
		
		System.out.println(" " + v.getData());
		
//		list.add(v);
		list.insertNewHead(v);
	}
	
	public static void main(String args[]) {
		
		AdjacencyGraph<String> ag = new AdjacencyGraph<String>();
		
		Vertex<String> A = ag.createVertex("A");
		Vertex<String> B = ag.createVertex("B");
		Vertex<String> C = ag.createVertex("C");
		Vertex<String> D = ag.createVertex("D");
		Vertex<String> E = ag.createVertex("E");
		Vertex<String> F = ag.createVertex("F");
		Vertex<String> G = ag.createVertex("G");
		Vertex<String> H = ag.createVertex("H");
		
		ag.addVertex(A);
		ag.addVertex(B);
		ag.addVertex(C);
		ag.addVertex(D);
		ag.addVertex(E);
		ag.addVertex(F);
		ag.addVertex(G);
		ag.addVertex(H);
		
//		ag.addEdge(A, ag.createEdge(A, B, 0));
		ag.addEdge(A, ag.createEdge(A, C, 0));
		ag.addEdge(A, ag.createEdge(A, D, 0));
		
//		ag.addEdge(B, ag.createEdge(B, D, 0));
		ag.addEdge(B, ag.createEdge(B, C, 0));
		ag.addEdge(B, ag.createEdge(B, E, 0));
		
//		ag.addEdge(C, ag.createEdge(C, D, 0));
		ag.addEdge(C, ag.createEdge(C, F, 0));
		
		ag.addEdge(D, ag.createEdge(D, F, 0));
		ag.addEdge(D, ag.createEdge(D, G, 0));
		
		ag.addEdge(E, ag.createEdge(E, G, 0));
		
		ag.addEdge(F, ag.createEdge(F, H, 0));
		
		ag.addEdge(G, ag.createEdge(G, H, 0));
		
		TopologicalSort<String> ts = new TopologicalSort<String>();
		SinglyLinkedList<Vertex<String>> sll = new SinglyLinkedList<>();
		ts.topologicalSort(ag.getVertecies(), sll);
		
		
		SinglyListNode<Vertex<String>> temp = sll.getHead();
		while(temp != null) {
			System.out.print(" Topological : " + temp.getValue().getData());
			temp = temp.getNextNode();
		}
		
	}
}
