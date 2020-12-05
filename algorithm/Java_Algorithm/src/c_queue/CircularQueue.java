package c_queue;

public class CircularQueue<T> {

	private Node<T>[] Nodes;
	private int size;
	int front;
	int rear;
	
	public CircularQueue(int size) {
		this.Nodes = new Node[size];
		this.size = size;
		this.front = -1;
		this.rear = -1;
		
	}
	
	class Node<T>{
		T value;
		
		public Node() {
			
		}
		
		public Node(T value) {
			this.value = value;
		}
	}
	
	
	private void enQueue(T value) {
		Node<T> newNode = new Node<T>(value);
		if(this.rear == -1) {
			this.rear++;
			Nodes[this.rear] = newNode;
		}else {
			if((this.rear+1) == this.size) {
				this.rear = 0 ;
			}else {
				this.rear++;
			}
			Nodes[this.rear] = newNode;
		}
	}
	
	
	private T deQueue() {

		if((this.front+1) == this.size) {
			this.front = 0;
		}else {
			this.front++;
		}		
		T data =Nodes[this.front].value; 
		Nodes[this.front] = null;
		return data; 
	}
	
	private boolean isEmpty() {
		if(this.front == this.rear) {
			return true;
		}else {
			return false;
		}
	}
	
	private boolean isFull() {
		if(this.front < this.rear) {
			return (this.rear - this.front) == this.size;
		}else {
			return this.size == (this.rear) + ((this.size - this.front)+1); 
		}
	}
	
	public static void main(String args[]) {
		int size = 10;
		CircularQueue<String> list = new CircularQueue<String>(size);
		list.enQueue("1");
		list.enQueue("2");
		list.enQueue("3");
		System.out.println("--------------------------");
		System.out.println(list.rear);
		System.out.println("--------------------------");
		System.out.println(list.deQueue());
		System.out.println(list.deQueue());
		System.out.println(list.deQueue());
		System.out.println("--------------------------");
		if(!list.isEmpty()) {
			System.out.println(list.front);
			System.out.println(list.rear);
			System.out.println(list.deQueue());
		}
		
		while(!list.isFull()) {
			list.enQueue("3");
		}
		
		while(!list.isEmpty()) {
			System.out.println(list.deQueue());
		}
		
		
		
	}
	
}

