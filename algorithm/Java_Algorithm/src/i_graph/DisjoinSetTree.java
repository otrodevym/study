package i_graph;

public class DisjoinSetTree<T> {

	public void unionSet(DisjoinNode<T> node1, DisjoinNode<T> node2) {
		node2 = findSet(node2);
		node2.setParent(node1);
	}

	public DisjoinNode<T> findSet(DisjoinNode<T> node) {
		while (node.getParent() != null) {
			node = node.getParent();
		}
		return node;
	}

	public DisjoinNode<T> makeNode(Vertex<T> currentVertex) {
		DisjoinNode<T> node = new DisjoinNode<T>(currentVertex);
		return node;
	}

}
