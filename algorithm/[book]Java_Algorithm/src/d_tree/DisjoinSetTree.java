package d_tree;

public class DisjoinSetTree {

	class Node {
		private Node parent;
		private int value;

		public Node(int value) {
			this.value = value;
			this.parent = null;
		}
	}

	private void unionSet(Node node1, Node node2) {
		node2 = findSet(node2);
		node2.parent = node1;
	}

	private Node findSet(Node node) {
		while (node.parent != null) {
			node = node.parent;
		}
		return node;
	}

	private Node makeNode(int value) {
		Node node = new Node(value);
		return node;
	}

	public static void main(String args[]) {
		DisjoinSetTree tree = new DisjoinSetTree();
		
		Node node1 = tree.makeNode(1);
		Node node2 = tree.makeNode(2);
		Node node3 = tree.makeNode(3);
		Node node4 = tree.makeNode(4);
		Node node5 = tree.makeNode(5);
		
		tree.unionSet(node1, node2);
		tree.unionSet(node2, node3);
		tree.unionSet(node4, node5);
		
		
		System.out.println("Set1 == Set2 : " + (tree.findSet(node1) == tree.findSet(node2)));;
		System.out.println("Set1 == Set3 : " + (tree.findSet(node1) == tree.findSet(node3)));;
		System.out.println("Set1 == Set5 : " + (tree.findSet(node1) == tree.findSet(node5)));;
		
		
	}
}
