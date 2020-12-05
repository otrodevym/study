package i_graph;

public class Vertex<T> {
		private T data;
		private VisitedMode visited;
		private int index;
		private Vertex<T> next;
		private Edge<T> adjacencyList;
		public Vertex() {
			
	}
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		
		public VisitedMode getVisited() {
			return visited;
		}
		public void setVisited(VisitedMode visited) {
			this.visited = visited;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public Vertex<T> getNext() {
			return next;
		}
		public void setNext(Vertex<T> next) {
			this.next = next;
		}
		public Edge<T> getAdjacencyList() {
			return adjacencyList;
		}
		public void setAdjacencyList(Edge<T> adjacencyList) {
			this.adjacencyList = adjacencyList;
		}
		
		
}
