package a_linked_list;

import i_graph.SinglyListNode;

public class SinglyLinkedList {
	private int size;
	private Node head;

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
		} else {
			Node tail = this.head;
			while (tail.nextNode != null) {
				tail = tail.nextNode;
			}
			tail.nextNode = newNode;
		}
		size++;
	}

	private int get(int index) {
		if (this.head == null || this.size <= index) {
			throw new NullPointerException("데이터 없음");
		} else {

		}
		int count = 0;
		Node tail = this.head;
		while (tail.nextNode != null) {
			if (index == count) {
				break;
			}
			tail = tail.nextNode;
			count++;
		}
		return tail.value;
	}
	public void insertNewHead(Node newNode) {
		if(this.head == null) {
			this.head = newNode;
		}else {
			newNode.nextNode = this.head;
			this.head = newNode;
		}
	}

	private boolean delete(int index) {
		if (this.size < index) {
			return false;
//					throw new NullPointerException("데이터 없음");
		}
		int count = 0;
		Node tail = head;
		while (tail.nextNode != null) {
			count++;
			if (index == count) {
				tail.nextNode = tail.nextNode.nextNode;
				break;
			}
			tail = tail.nextNode;
		}
		size--;
		return true;
	}
	
	private void print() {
		Node tail = head;
		while(tail != null) {
			System.out.println(tail.value);
			tail = tail.nextNode;
		}
	}

	private void insertAfter(int index, int value) {
		Node node = new Node(value);
		Node tail = head;
		int count = 0;
		while(tail != null) {
			if(index == count) {
				node.nextNode = tail.nextNode;
				tail.nextNode = node;
				break;
			}
			count++;
			tail = tail.nextNode;
			
		}
		
	}
	private void insertBefore(int index, int value) {
		Node node = new Node(value);
		Node tail = head;
		if(index == 0) {
			node.nextNode = tail;
			head = node;
			
		}else {
			int count = 0;
			while(tail != null) {
				count++;
				if(index == count) {
					node.nextNode = tail.nextNode;
					tail.nextNode = node;
					break;
				}
				tail = tail.nextNode;
				
			}
		}
		
	}
	
	private void update(int index, int value) {
		Node tail = head;
		int count = 0;
		while(tail != null) {
			if(index == count) {
				tail.value = value;
				break;
			}
			
			count++;
			tail = tail.nextNode;
		}
	}

	public static void main(String args[]) {
		SinglyLinkedList list = new SinglyLinkedList();
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
