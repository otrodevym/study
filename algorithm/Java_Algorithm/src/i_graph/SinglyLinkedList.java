package i_graph;

public class SinglyLinkedList<T> {
	private int size;
	private SinglyListNode<T> head;

	
	public void add(T value) {
		SinglyListNode<T> newNode = new SinglyListNode<T>(value);
		if (this.head == null) {
			this.head = newNode;
		} else {
			SinglyListNode<T> tail = this.head;
			while (tail.getNextNode() != null) {
				tail = tail.getNextNode();
			}
			tail.setNextNode(newNode);
		}
		size++;
	}

	public T get(int index) {
		if (this.head == null || this.size <= index) {
			throw new NullPointerException("데이터 없음");
		} else {

		}
		int count = 0;
		SinglyListNode<T> tail = this.head;
		while (tail.getNextNode() != null) {
			if (index == count) {
				break;
			}
			tail = tail.getNextNode();
			count++;
		}
		return tail.getValue();
	}
	
	public void insertNewHead(T newData) {
		SinglyListNode<T> newNode = new SinglyListNode<T>(newData);
		if(this.head == null) {
			this.head = newNode;
		}else {
			newNode.setNextNode(this.head);
			this.head = newNode;
		}
	}

	public boolean delete(int index) {
		if (this.size < index) {
			return false;
//					throw new NullPointerException("데이터 없음");
		}
		int count = 0;
		SinglyListNode<T> tail = head;
		while (tail.getNextNode() != null) {
			count++;
			if (index == count) {
				tail.setNextNode(tail.getNextNode().getNextNode());
				break;
			}
			tail = tail.getNextNode();
		}
		size--;
		return true;
	}
	
	public void print() {
		SinglyListNode<T> tail = head;
		while(tail != null) {
			System.out.println(tail.getValue());
			tail = tail.getNextNode();
		}
	}

	public void insertAfter(int index, T value) {
		SinglyListNode<T> node = new SinglyListNode<T>(value);
		SinglyListNode<T> tail = head;
		int count = 0;
		while(tail != null) {
			if(index == count) {
				node.setNextNode(tail.getNextNode());
				tail.setNextNode(node);
				break;
			}
			count++;
			tail = tail.getNextNode();
			
		}
		
	}
	
	public void update(int index, T value) {
		SinglyListNode<T> tail = head;
		int count = 0;
		while(tail != null) {
			if(index == count) {
				tail.setValue(value);
				break;
			}
			
			count++;
			tail = tail.getNextNode();
		}
	}
	
	public SinglyListNode<T> getHead(){
		return this.head;
	}

}
