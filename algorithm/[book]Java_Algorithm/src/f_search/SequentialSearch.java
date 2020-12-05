package f_search;


public class SequentialSearch {
	private int size;
	private Node head;


	public void add(int value) {
		Node newNode = new Node(value);
		if (this.head == null) {
			this.head = newNode;
		} else {
			Node tail = this.head;
			while (tail.getNextNode() != null) {
				tail = tail.getNextNode();
			}
			tail.setNextNode(newNode);
		}
		size++;
	}

	public Node sequentialSearch(int target) {
		Node match = null;
		Node current = this.head;
		while(current != null) {
			if(current.getValue() == target) {
				match = current;
				break;
			}else {
				current = current.getNextNode();
			}
		}
		
		return match;
	}
	

	public static void main(String args[]) {
		SequentialSearch list = new SequentialSearch();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		Node node = list.sequentialSearch(4);
		System.out.println(node.getValue());
	}

}
