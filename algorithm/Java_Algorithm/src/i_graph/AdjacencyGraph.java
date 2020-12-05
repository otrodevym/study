package i_graph;

enum VisitedMode {
	Visited(1), NotVisited(0);
	private int value;
	private VisitedMode(int value) {
		this.value = value;
	}
};

public class AdjacencyGraph<T> {
	private int vertexCount;
	private Vertex<T> vertecies;

	public AdjacencyGraph() {
		this.vertecies = null;
		this.vertexCount = 0;
	}

	public int getVertexCount() {
		return vertexCount;
	}

	public void setVertexCount(int vertexCount) {
		this.vertexCount = vertexCount;
	}

	public Vertex<T> getVertecies() {
		return vertecies;
	}

	public void setVertecies(Vertex<T> vertecies) {
		this.vertecies = vertecies;
	}
	
	public Vertex<T> createVertex(T data) {
		Vertex<T> v = new Vertex<T>();
		v.setData(data);
		v.setNext(null);
		v.setAdjacencyList(null);
		v.setVisited(VisitedMode.NotVisited);
		
		return v;
	}
	
	public Edge<T> createEdge(Vertex<T> from ,Vertex<T> target, int weight) {
		Edge<T> e = new Edge<T>();
		e.setFrom(from);
		e.setTarget(target);
		e.setWeight(weight);
		e.setNext(null);
		
		return e;
	}
	
	public void addVertex(Vertex<T> v) {
		Vertex<T> vList = this.vertecies;
		if(vList == null) {
			this.vertecies = v;
		}else {
			while(vList.getNext() != null) {
				vList = vList.getNext();
			}
			vList.setNext(v);
		}
		v.setIndex(this.vertexCount++);
	}
	
	public void addEdge(Vertex<T> v, Edge<T> e) {
		if(v.getAdjacencyList() == null) {
			v.setAdjacencyList(e);
		}else {
			Edge<T> adjacencyList = v.getAdjacencyList();
			while(adjacencyList.getNext() != null) {
				adjacencyList = adjacencyList.getNext();
			}
			adjacencyList.setNext(e);
		}
	}
	
	public void printGraph() {
		Vertex<T> v = null;
		Edge<T> e = null;
		
		if( (v = this.vertecies) == null) {
			return ;
		}
		
		while(v != null) {
			System.out.print(v.getData() + " : ");
			if((e=v.getAdjacencyList()) == null) {
				v = v.getNext();
				continue;
			}
		
		while(e != null) {
			System.out.print(e.getTarget().getData() + "[" + e.getWeight() +"] ");
			e = e.getNext();
		}
		v = v.getNext();
		System.out.println();
		}
	}
	public void printGraph(AdjacencyGraph<T> g) {
		Vertex<T> v = null;
		Edge<T> e = null;
		
		if( (v = g.getVertecies()) == null) {
			return ;
		}
		
		while(v != null) {
			System.out.print(v.getData() + " : ");
			if((e=v.getAdjacencyList()) == null) {
				v = v.getNext();
				System.out.println();
				continue;
			}
			
			while(e != null) {
				System.out.print(e.getTarget().getData() + "[" + e.getWeight() +"] ");
				e = e.getNext();
			}
			v = v.getNext();
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		AdjacencyGraph<Integer> ag = new AdjacencyGraph<Integer>();
		Vertex<Integer> v1 = ag.createVertex(1);
		Vertex<Integer> v2 = ag.createVertex(2);
		Vertex<Integer> v3 = ag.createVertex(3);
		Vertex<Integer> v4 = ag.createVertex(4);
		Vertex<Integer> v5 = ag.createVertex(5);
		
		ag.addVertex(v1);
		ag.addVertex(v2);
		ag.addVertex(v3);
		ag.addVertex(v4);
		ag.addVertex(v5);
		
		ag.addEdge(v1, ag.createEdge(v1, v2, 0));
		ag.addEdge(v1, ag.createEdge(v1, v3, 0));
		ag.addEdge(v1, ag.createEdge(v1, v4, 0));
		ag.addEdge(v1, ag.createEdge(v1, v5, 0));
		
		ag.addEdge(v2, ag.createEdge(v2, v1, 0));
		ag.addEdge(v2, ag.createEdge(v2, v3, 0));
		ag.addEdge(v2, ag.createEdge(v2, v5, 0));
		
		ag.addEdge(v3, ag.createEdge(v3, v1, 0));
		ag.addEdge(v3, ag.createEdge(v3, v2, 0));
		
		ag.addEdge(v4, ag.createEdge(v4, v1, 0));
		ag.addEdge(v4, ag.createEdge(v4, v5, 0));
		
		ag.addEdge(v5, ag.createEdge(v5, v1, 0));
		ag.addEdge(v5, ag.createEdge(v5, v2, 0));
		ag.addEdge(v5, ag.createEdge(v5, v4, 0));
		
		
		ag.printGraph();
		
		
		
		
	}
}
