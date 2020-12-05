package f_search;

public class SinglyLinkedList {
	protected Node head;
	private int size;
	
	public SinglyLinkedList() {
	}
	
	
	public void add(int value) {
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
	
	
	public Node MoveToFront(int target) {
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
	
	public void printTree() {
		Node temp = this.head;
		while(temp != null) {
			System.out.print(" " + temp.getValue());
			temp = temp.getNextNode();
		}
	}
	public static void main(String args[]) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		list.MoveToFront(4);
		
		list.printTree();
		
	}
}