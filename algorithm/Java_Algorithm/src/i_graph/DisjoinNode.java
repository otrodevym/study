package i_graph;

public class DisjoinNode<T> {
	private DisjoinNode<T> parent;
	private Vertex<T> value;

	public DisjoinNode(Vertex<T> currentVertex) {
		this.value = currentVertex;
		this.parent = null;
	}

	public DisjoinNode<T> getParent() {
		return parent;
	}

	public void setParent(DisjoinNode<T> parent) {
		this.parent = parent;
	}

	public Vertex<T> getValue() {
		return value;
	}

	public void setValue(Vertex<T> value) {
		this.value = value;
	}

}
