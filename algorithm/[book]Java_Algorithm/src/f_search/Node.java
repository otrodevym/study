package f_search;

public class Node {
	private int value;
	private Node nextNode;

	public Node() {
		this.value = 0;
		this.nextNode = null;
	}

	public Node(int value) {
		this.value = value;
		this.nextNode = null;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}
