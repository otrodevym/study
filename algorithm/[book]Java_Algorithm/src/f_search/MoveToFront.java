package f_search;
public class MoveToFront {
	private Node head;
	private int size;
	
	public MoveToFront() {
	}
	
	
	private void add(int value) {
		Node newNode = new Node(value);
		if(this.head == null) {
			this.head = newNode;
		}else {
			Node temp = this.head;
			while(temp.getNextNode() != null) {
				temp = temp.getNextNode();
			}
			
			temp.setNextNode(newNode);
		}
	}
	
	
	private Node MoveToFront(int target) {
		Node current = this.head;
		Node previous = null;
		Node match = null;
		
		while(current != null) {
			if(current.getValue() == target) {
				match = current;
				if(previous != null) {
					previous.setNextNode(current.getNextNode());
					current.setNextNode(this.head);
					this.head = current;
				}
				break;
			}else {
				previous = current;
				current = current.getNextNode();
				
			}
		}
		
		return match;
	}
	
	private void printTree() {
		Node temp = this.head;
		while(temp.getNextNode()!= null) {
			System.out.print(" " + temp.getValue());
			temp = temp.getNextNode();
		}
	}
	public static void main(String args[]) {
		MoveToFront mtf = new MoveToFront();
		mtf.add(1);
		mtf.add(2);
		mtf.add(3);
		mtf.add(4);
		mtf.add(5);
		mtf.add(6);
		
		mtf.MoveToFront(4);
		
		mtf.printTree();
		
	}
}