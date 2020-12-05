package i_graph;


public class Edge<T> {
	private int weight;
	private Edge<T> next; 
	private Vertex<T> from;
	private Vertex<T> target;
	
	public Edge() {
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Edge<T> getNext() {
		return next;
	}

	public void setNext(Edge<T> next) {
		this.next = next;
	}

	public Vertex<T> getFrom() {
		return from;
	}

	public void setFrom(Vertex<T> from) {
		this.from = from;
	}

	public Vertex<T> getTarget() {
		return target;
	}

	public void setTarget(Vertex<T> target) {
		this.target = target;
	}
	
	
}
