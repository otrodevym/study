package c_queue;

public class LinkedQueue<T> {
	private Node front;
	private Node rear;
	private int size;
	
	public LinkedQueue() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}
	
	class Node {
		private T value;
		private Node nextNode;
		
		public Node(T value) {
			this.value = value;
			this.nextNode = null;
		}
	}
	
	private void enQueue(T newValue) {
		Node newNode = new Node(newValue);
		if(this.rear == null) {
			this.front = newNode;
			this.rear = newNode;
		}else {
			this.rear.nextNode = newNode;
			this.rear = newNode;
		}
		this.size++;
	}
	
	private T deQueue() {
		T data = this.front.value;
		if(this.front.nextNode == null) {
			this.front = null;
			this.rear = null;
		}else {
			
			this.front = this.front.nextNode;
		}
		this.size--;
		return data;
	}
	
	private boolean isEmpty() {
		return (this.front == null);
	}
	
	public static void main(String args[]) {
		LinkedQueue<String> list = new LinkedQueue<>();
		
		list.enQueue("1");
		list.enQueue("2");
		list.enQueue("3");
		list.enQueue("4");
		list.enQueue("5");
		
		
		System.out.println(list.deQueue());
		System.out.println(list.deQueue());
		System.out.println(list.deQueue());
		
		while(!list.isEmpty()) {
			System.out.println(list.deQueue());
		}
		
		
	}
}


