package i_graph;

public class PQNode<T> {
	private T value;
	private int priority;

	public PQNode() {
	}

	public PQNode(int priority, T value) {
		super();
		this.value = value;
		this.priority = priority;
	}

	public PQNode(T value) {
		super();
		this.value = value;
		this.priority = 0;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
}
