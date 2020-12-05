package a_linked_list;

public class SinglyLinkedList2 {
	private int size;
	private Node head;
	private Node current;
	
	
	public SinglyLinkedList2() {
		this.size = 0;
		this.head = null;
		this.current = null;
	}

	class Node {
		private int value;
		private Node nextNode;

		public Node(int value) {
			this.value = value;
			this.nextNode = null;
		}
	}

	private void add(int value) {
		Node newNode = new Node(value);
		if (this.head == null) {
			this.head = newNode;
			this.current = head;
		} else {
			while (this.current.nextNode != null) {
				this.current = this.current.nextNode;
			}
			this.current.nextNode = newNode;
			this.current = newNode;
		}
		size++;
	}

	private int get(int index) {
		Node current = head;
		if (this.head == null || this.size <= index) {
			throw new NullPointerException("데이터 없음");
		} else {
			int count = 0;
			while (current.nextNode != null) {
				if (index == count) {
					break;
				}
				current = current.nextNode;
				count++;
			}
		}
		
		return current.value;
	}

	private boolean delete(int index) {
		Node current = head;
		if (this.size < index) {
			return false;
//					throw new NullPointerException("데이터 없음");
		}
		int count = 0;
		while (current.nextNode != null) {
			count++;
			if (index == count) {
				current.nextNode = current.nextNode.nextNode;
				break;
			}
			current = current.nextNode;
		}
		size--;
		return true;
	}
	
	private void print() {
		Node current = head;
		while(current != null) {
			System.out.println(current.value);
			current = current.nextNode;
		}
	}

	private void insertAfter(int index, int value) {
		Node node = new Node(value);
		Node current = head;
		int count = 0;
		while(current != null) {
			if(index == count) {
				node.nextNode = current.nextNode;
				current.nextNode = node;
				break;
			}
			count++;
			current = current.nextNode;
			
		}
		
	}
	private void insertBefore(int index, int value) {
		Node node = new Node(value);
		Node current = head;
		if(index == 0) {
			node.nextNode = current;
			head = node;
			
		}else {
			int count = 0;
			while(current != null) {
				count++;
				if(index == count) {
					node.nextNode = current.nextNode;
					current.nextNode = node;
					break;
				}
				current = current.nextNode;
				
			}
		}
		
	}
	
	private void update(int index, int value) {
		Node current = head;
		int count = 0;
		while(current != null) {
			if(index == count) {
				current.value = value;
				break;
			}
			
			count++;
			current = current.nextNode;
		}
	}

	public static void main(String args[]) {
		SinglyLinkedList2 list = new SinglyLinkedList2();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		list.delete(3);
		
		
		list.insertAfter(0, 100);
		list.insertBefore(2, 500);
		
		
		list.update(4, 600);
		
		list.print();

	}
}
