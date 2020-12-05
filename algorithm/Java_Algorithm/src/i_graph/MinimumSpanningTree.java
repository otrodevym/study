package i_graph;

public class MinimumSpanningTree<T> {
	static int MAX_WEIGHT = 36267;
	private AdjacencyGraph<T> g;
	private AdjacencyGraph<T> mst;

	public MinimumSpanningTree(AdjacencyGraph<T> g) {
		this.g = g;
		this.mst = new AdjacencyGraph<>();
	}

	private void prim(Vertex<T> startVertex) {
		PQNode<Vertex<T>> startNode = new PQNode<Vertex<T>>();
		startNode.setPriority(0);
		startNode.setValue(startVertex);
		PriorityQueueVertex<T> pq = new PriorityQueueVertex<T>();
		pq.pqCreate(10);

		Vertex<T> currentVertex = this.g.getVertecies();
		Edge<T> currentEdge = null;

		int i = 0;
		int[] weights = new int[this.g.getVertexCount()];
//		Vertex<T>[] MSTVertices = (Vertex<T>[]) Array.newInstance(Vertex.class, g.getVertexCount()); 
		Vertex<T>[] MSTVertices = new Vertex[this.g.getVertexCount()];
		Vertex<T>[] fringes = new Vertex[this.g.getVertexCount()];
		Vertex<T>[] precedences = new Vertex[this.g.getVertexCount()];

		while (currentVertex != null) {
			Vertex<T> newVertex = this.g.createVertex(currentVertex.getData());
			this.mst.addVertex(newVertex);
			MSTVertices[i] = newVertex;
			fringes[i] = null;
			precedences[i] = null;
			weights[i] = MAX_WEIGHT;
			currentVertex = currentVertex.getNext();
			i++;
		}

		pq.pqEnqueueVertex(startNode);

		weights[startVertex.getIndex()] = 0;

		while (!pq.isEmpty()) {
			PQNode<Vertex<T>> popped;
			popped = pq.pqDequeueVertex();
			currentVertex = popped.getValue();
			fringes[currentVertex.getIndex()] = currentVertex;

			currentEdge = currentVertex.getAdjacencyList();

			while (currentEdge != null) {
				Vertex<T> targetVertex = currentEdge.getTarget();

				if (fringes[targetVertex.getIndex()] == null
						&& currentEdge.getWeight() < weights[targetVertex.getIndex()]) {
					PQNode<Vertex<T>> newNode = new PQNode<>();
					newNode.setPriority(currentEdge.getWeight());
					newNode.setValue(targetVertex);
					pq.pqEnqueueVertex(newNode);

					precedences[targetVertex.getIndex()] = currentEdge.getFrom();
					weights[targetVertex.getIndex()] = currentEdge.getWeight();
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

			this.g.addEdge(MSTVertices[fromIndex],
					this.g.createEdge(MSTVertices[fromIndex], MSTVertices[toIndex], weights[i]));
			this.g.addEdge(MSTVertices[toIndex],
					this.g.createEdge(MSTVertices[toIndex], MSTVertices[fromIndex], weights[i]));
		}
	}

	public AdjacencyGraph<T> getMst() {
		return this.mst;
	}

	private void kruskal() {
		PriorityQueueEdge<T> pq = new PriorityQueueEdge<>();
		DisjoinSetTree<T> ds = new DisjoinSetTree<>();

		Vertex<T> currentVertex = this.g.getVertecies();
		pq.pqCreate(10);

		Vertex<T>[] MSTVertices = new Vertex[this.g.getVertexCount()];
		DisjoinNode<T>[] vertexSet = new DisjoinNode[this.g.getVertexCount()];

		int i = 0;
		while (currentVertex != null) {
			Edge<T> currentEdge = new Edge<>();

			vertexSet[i] = ds.makeNode(currentVertex);
			MSTVertices[i] = this.g.createVertex(currentVertex.getData());
			this.mst.addVertex(MSTVertices[i]);

			currentEdge = currentVertex.getAdjacencyList();

			while (currentEdge != null) {
				PQNode<Edge<T>> newNode = new PQNode<Edge<T>>();
				newNode.setPriority(currentEdge.getWeight());
				newNode.setValue(currentEdge);

				pq.pqEnqueueEdge(newNode);

				currentEdge = currentEdge.getNext();
			}
			currentVertex = currentVertex.getNext();
			i++;
		}
		while (!pq.isEmpty()) {
			Edge<T> currentEdge = pq.pqDequeueEdge().getValue();

			int fromIndex = currentEdge.getFrom().getIndex();
			int toIndex = currentEdge.getTarget().getIndex();

			if (ds.findSet(vertexSet[fromIndex]) != ds.findSet(vertexSet[toIndex])) {
				this.g.addEdge(MSTVertices[fromIndex],
						this.g.createEdge(MSTVertices[fromIndex], MSTVertices[toIndex], currentEdge.getWeight()));
				this.g.addEdge(MSTVertices[toIndex],
						this.g.createEdge(MSTVertices[toIndex], MSTVertices[fromIndex], currentEdge.getWeight()));
				
				ds.unionSet(vertexSet[fromIndex], vertexSet[toIndex]);
			}

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

		g.addEdge(A, g.createEdge(A, B, 35));
		g.addEdge(A, g.createEdge(A, E, 247));

		g.addEdge(B, g.createEdge(B, A, 35));
		g.addEdge(B, g.createEdge(B, C, 126));
		g.addEdge(B, g.createEdge(B, F, 150));

		g.addEdge(C, g.createEdge(C, B, 126));
		g.addEdge(C, g.createEdge(C, D, 117));
		g.addEdge(C, g.createEdge(C, F, 162));
		g.addEdge(C, g.createEdge(C, G, 220));

		g.addEdge(D, g.createEdge(D, C, 117));

		g.addEdge(E, g.createEdge(E, A, 247));
		g.addEdge(E, g.createEdge(E, F, 82));
		g.addEdge(E, g.createEdge(E, H, 98));

		g.addEdge(F, g.createEdge(F, B, 150));
		g.addEdge(F, g.createEdge(F, C, 162));
		g.addEdge(F, g.createEdge(F, E, 82));
		g.addEdge(F, g.createEdge(F, G, 154));
		g.addEdge(F, g.createEdge(F, H, 120));

		g.addEdge(G, g.createEdge(G, C, 220));
		g.addEdge(G, g.createEdge(G, F, 154));
		g.addEdge(G, g.createEdge(G, I, 106));

		g.addEdge(H, g.createEdge(H, E, 98));
		g.addEdge(H, g.createEdge(H, F, 120));

		g.addEdge(I, g.createEdge(I, G, 106));

		System.out.println("Prim's Algorithm \n");
		MinimumSpanningTree<String> mst = new MinimumSpanningTree<>(g);
		mst.prim(B);
		g.printGraph(mst.getMst());

		System.out.println("Kruskal's Algorithm \n");
		mst.kruskal();
		g.printGraph(mst.getMst());

	}
}
