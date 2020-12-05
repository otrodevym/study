package i_graph;


public class LinkedQueue<T> {
	private QueueNode<T> front;
	private QueueNode<T> rear;
	private int size;
	
	public LinkedQueue() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}
	

	public void enQueue(T newValue) {
		QueueNode<T> newNode = new QueueNode<T>(newValue);
		if(this.rear == null) {
			this.front = newNode;
			this.rear = newNode;
		}else {
			this.rear.setNextNode(newNode);
			this.rear = newNode;
		}
		this.size++;
	}
	
	public T deQueue() {
		T data  = this.front.getValue();
		if(this.front.getNextNode() == null) {
			this.front = null;
			this.rear = null;
		}else{
			this.front = this.front.getNextNode();
		}
		this.size--;
		return data;
	}
	
	public boolean isEmpty() {
		return (this.front == null);
	}
	
}


