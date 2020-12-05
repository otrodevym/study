package f_search;

public class BinaryNode {
	private BinaryNode left;
	private BinaryNode right;
	private int value;
	
	public BinaryNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public BinaryNode() {
	}

	public BinaryNode getLeft() {
		return left;
	}

	public void setLeft(BinaryNode left) {
		this.left = left;
	}

	public BinaryNode getRight() {
		return right;
	}

	public void setRight(BinaryNode right) {
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
