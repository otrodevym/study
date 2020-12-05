package i_graph;

public class ShortestPath<T> {
	static int MAX_WEIGHT = 36267;
	private AdjacencyGraph<T> g;
	private AdjacencyGraph<T> shortestPath;
	
	public ShortestPath(AdjacencyGraph<T> g) {
		this.g= g;
		this.shortestPath = new AdjacencyGraph<>();
	}

	private void dijkstra(Vertex<T> startVertex) {
		PQNode<Vertex<T>> startNode = new PQNode<>();
		startNode.setPriority(0);
		startNode.setValue(startVertex);

		PriorityQueueVertex<T> pq = new PriorityQueueVertex<>();
		pq.pqCreate(10);

		Vertex<T> currentVertex = null;
		Edge<T> currentEdge = null;

		int[] weights = new int[this.g.getVertexCount()];

		Vertex<T>[] shortestPathVertices = new Vertex[this.g.getVertexCount()];
		Vertex<T>[] fringes = new Vertex[this.g.getVertexCount()];
		Vertex<T>[] precedences = new Vertex[this.g.getVertexCount()];

		currentVertex = this.g.getVertecies();

		int i = 0;

		while (currentVertex != null) {
			Vertex<T> newVertex = this.g.createVertex(currentVertex.getData());
			this.shortestPath.addVertex(newVertex);

			fringes[i] = null;
			precedences[i] = null;
			shortestPathVertices[i] = newVertex;
			weights[i] = MAX_WEIGHT;
			currentVertex = currentVertex.getNext();
			i++;
		}

		pq.pqEnqueueVertex(startNode);

		weights[startVertex.getIndex()] = 0;

		while (!pq.isEmpty()) {
			currentVertex = pq.pqDequeueVertex().getValue();

			fringes[currentVertex.getIndex()] = currentVertex;

			currentEdge = currentVertex.getAdjacencyList();

			while (currentEdge != null) {
				Vertex<T> targetVertex = currentEdge.getTarget();

				if (fringes[targetVertex.getIndex()] == null && weights[currentVertex.getIndex()]
						+ currentEdge.getWeight() < weights[targetVertex.getIndex()]) {
					PQNode<Vertex<T>> newNode = new PQNode<>();
					newNode.setPriority(currentEdge.getWeight());
					newNode.setValue(targetVertex);
					pq.pqEnqueueVertex(newNode);

					precedences[targetVertex.getIndex()] = currentEdge.getFrom();
					weights[targetVertex.getIndex()] = weights[currentVertex.getIndex()] + currentEdge.getWeight();

				}
				currentEdge = currentEdge.getNext();
			}
		}

		for (i = 0; i < this.g.getVertexCount(); i++) {
			if (precedences[i] == null) {
				continue;
			}

			int fromIndex = precedences[i].getIndex();
			int toIndex = i;

			this.g.addEdge(shortestPathVertices[fromIndex],
					this.g.createEdge(shortestPathVertices[fromIndex], shortestPathVertices[toIndex], weights[i]));

		}
	}
	
	public static void main(String args[]) {
		AdjacencyGraph<String> g = new AdjacencyGraph<>();

		Vertex<String> A = g.createVertex("A");
		Vertex<String> B = g.createVertex("B");
		Vertex<String> C = g.createVertex("C");
		Vertex<String> D = g.createVertex("D");
		Vertex<String> E = g.createVertex("E");
		Vertex<String> F = g.createVertex("F");
		Vertex<String> G = g.createVertex("G");
		Vertex<String> H = g.createVertex("H");
		Vertex<String> I = g.createVertex("I");

		g.addVertex(A);
		g.addVertex(B);
		g.addVertex(C);
		g.addVertex(D);
		g.addVertex(E);
		g.addVertex(F);
		g.addVertex(G);
		g.addVertex(H);
		g.addVertex(I);

		g.addEdge(A, g.createEdge(A, E, 247));

		g.addEdge(B, g.createEdge(B, A, 35));
		g.addEdge(B, g.createEdge(B, C, 126));
		g.addEdge(B, g.createEdge(B, F, 150));

		g.addEdge(C, g.createEdge(C, D, 117));
		g.addEdge(C, g.createEdge(C, F, 162));
		g.addEdge(C, g.createEdge(C, G, 220));

		g.addEdge(E, g.createEdge(E, H, 98));

		g.addEdge(F, g.createEdge(F, E, 82));
		g.addEdge(F, g.createEdge(F, G, 154));
		g.addEdge(F, g.createEdge(F, H, 120));

		g.addEdge(G, g.createEdge(G, I, 106));

		System.out.println("Prim's Algorithm \n");
		ShortestPath<String> sp = new ShortestPath<>(g);
		
		sp.dijkstra(B);
		g.printGraph(sp.getShortestPah());

	}

	private AdjacencyGraph<T> getShortestPah() {
		return this.shortestPath;
	}
}
