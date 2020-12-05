package a_linked_list;

public class CircularLinkedList<T> {
	private int size;
	private Node head;
	
	class Node{
		private T value;
		private Node prevNode;
		private Node nextNode;
		
		public Node(T value) {
			this.value = value;
			this.prevNode = null;
			this.nextNode = null;
		}
	}
	public CircularLinkedList() {
		this.size = 0;
		this.head = null;
	}
	
	
	private void add(T value) {
		Node newNode = new Node(value);
		if(this.head == null) {
			this.head = newNode;
			this.head.nextNode = newNode;
			this.head.prevNode = newNode;
		}else {
			
			Node current = this.head;
			
			current.prevNode.nextNode = newNode;
			newNode.prevNode = current.prevNode;
			
			newNode.nextNode = this.head;
			this.head.prevNode= newNode;
		}
		this.size++;
	}
	
	private void remove(int index) {
		Node current = this.head;
		while(current.nextNode != null && (--index) >=0) {
			current = current.nextNode;
		}
		current.nextNode.prevNode = current.prevNode;
		current.prevNode.nextNode = current.nextNode;
		current.nextNode = null;
		current.prevNode = null;
		
		this.size--;
	}
	
	private T get(int index) {
		Node current = this.head;
		if(0 == index) {
			
//			환형 링크드 리스트는 계속 돌아야 맞음
//		}else if(index == (size-1)) {
//			while(current.nextNode != null && (--index) >= 0) {
//				current = current.nextNode;
//			}
		}else {
			while(current.nextNode != null && (--index) >= 0) {
				current = current.nextNode;
			}
		}
		return current.value;
	}
	
	private void update(int index, T value) {
		Node current = this.head;
		while(current.nextNode != null && (--index) >= 0){
			current = current.nextNode;
		}
		
		current.value = value;
		
	}
	
	private void print() {
		for(int i = 0; i < size; i++) {
			System.out.println(this.get(i));
		}
	}
	
	
	public static void main(String args[]) {
		CircularLinkedList<String> list = new CircularLinkedList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.print();
		System.out.println("----------");
		
		list.remove(1);
		list.print();
		System.out.println("----------");
		
		list.update(1, "100");
		list.print();
		System.out.println("----------");
		
		list.update(3, "100");
		list.print();
		System.out.println("----------");
		
		
	}
}
