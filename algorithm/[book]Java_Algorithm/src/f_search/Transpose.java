package f_search;

public class Transpose extends SinglyLinkedList {
	public Transpose() {
	}

	private Node transpose(int target) {
		Node current = super.head;
		Node match = null;
		Node pprevious = null;
		Node previous = null;

		while (current != null) {
			if (current.getValue() == target) {
				match = current;
				if (previous != null) {
					if (pprevious != null) {
						pprevious.setNextNode(current);
					} else {
						super.head = current;
					}
					previous.setNextNode(current.getNextNode());
					current.setNextNode(previous);
				}
				break;
			} else {
				if (previous != null) {
					pprevious = previous;
				}
				previous = current;
				current = current.getNextNode();
			}

		}

		return match;
	}
	
	

	public static void main(String args[]) {
		Transpose t = new Transpose();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(6);
		t.add(7);
		
		Node node = t.transpose(6);
		
		
		
		t.printTree();
		
		
		
	}
	
}
