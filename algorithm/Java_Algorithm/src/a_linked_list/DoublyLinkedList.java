package a_linked_list;

public class DoublyLinkedList<T> {
	private int size;
	private Node head;
	
	private DoublyLinkedList() {
		this.size = 0;
		this.head = null; 
	}
	
	class Node{
		private T value;
		private Node nextNode;
		private Node prevNode;
		
		public Node(T value) {
			this.value = value;
			this.nextNode = null;
			this.prevNode = null;
		}
	}
	
	private void add(T value) {
		Node newNode = new Node(value);
		if(this.head == null) {
			this.head = newNode;
		}else {
			Node tail = head;
			while(tail.nextNode != null) {
				tail = tail.nextNode;
			}
			tail.nextNode = newNode;
			newNode.prevNode = tail;
		}
		this.size++;
	}
	
	private T get(int index) {
		Node tail = this.head;
		if(index < 0 || index >= size ) {
			throw new NullPointerException("데이터 없음 : " + index);
		}else {
			while((tail.nextNode != null) && (--index >= 0)) {
				tail = tail.nextNode;
			}
		}
		return tail.value;
	}
	
	private void remove(int index) {
		Node tail = this.head;
		if(index < 0 || index >= size ) {
			throw new NullPointerException("데이터 없음 : " + index);
		}else {
			while(tail.nextNode != null && (--index >=0)) {
				tail = tail.nextNode;
			}
			Node current = tail;
			if(null != current.prevNode) {
				tail.prevNode.nextNode = current.nextNode;
			}
			if(null != current.nextNode) {
				tail.nextNode.prevNode = current.prevNode;
			}
			
			current.nextNode = null;
			current.prevNode = null;
			current.value = null;
			this.size--;
		}
	}
	
	private void update(int index, T value) {
		Node tail = this.head;
		if(index < 0 || index >= size ) {
			throw new NullPointerException("데이터 없음 : " + index);
		}else{
			while(tail.nextNode != null && (--index >= 0)) {
				tail = tail.nextNode;
			}
			tail.value = value;
		}
	}
	
	private void print() {
		for(int i = 0; i < this.size; i++) {
			System.out.println(this.get(i));
		}
		System.out.println("print() ---- end");
	}
	public static void main(String args[]) {
		DoublyLinkedList<String> list = new DoublyLinkedList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		list.print();
		
		
		list.remove(2);
		list.update(0,"6");
//		list.update(1,"6");
//		list.update(2,"6");
		list.print();
	}
	
}
