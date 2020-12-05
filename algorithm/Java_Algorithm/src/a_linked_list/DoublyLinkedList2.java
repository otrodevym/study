package a_linked_list;

public class DoublyLinkedList2<T> {
	private int size;
	private Node head;
	private Node tail;

	private DoublyLinkedList2() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	class Node {
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
		if (this.head == null) {
			this.head = newNode;
			this.tail = head;
		} else {
			this.tail.nextNode = newNode;
			newNode.prevNode = this.tail;
			this.tail = newNode;
		}
		this.size++;
	}

	private T get(int index) {
		Node search = null;
		if (index < 0 || index >= size) {
			throw new NullPointerException("데이터 없음 : " + index);
		} else if(index < (size /2)){
			search = this.head;
			while ((search.nextNode != null) && (--index >= 0)) {
				search = search.nextNode;
			}
		}else {
			 search = this.tail;
			 while((search.prevNode != null) && (++index < size)) {
				 search = search.prevNode;
			 }
		}
		
		return search.value;
	}

	private void remove(int index) {
		Node temp = this.head;
		if (index < 0 || index >= size) {
			throw new NullPointerException("데이터 없음 : " + index);
		} else if (index == 0) {
			this.head.nextNode.prevNode = null;
			this.head = this.head.nextNode;
		} else if ((size-1) == index) {
			this.tail.prevNode.nextNode = null;
			this.tail = this.tail.prevNode;
		} else {
			while (temp.nextNode != null && (--index > 0)) {
				temp = temp.nextNode;
			}
			Node current = temp;
			if (null != current.prevNode) {
				temp.prevNode.nextNode = current.nextNode;
			}
			if (null != current.nextNode) {
				temp.nextNode.prevNode = current.prevNode;
			}

			current.nextNode = null;
			current.prevNode = null;
			current.value = null;
		}
		this.size--;

	}

	private void update(int index, T value) {
		Node temp = head;
		if (index < 0 || index >= size) {
			throw new NullPointerException("데이터 없음 : " + index);
		} else {
			while (temp.nextNode != null && (--index >= 0)) {
				temp = temp.nextNode;
			}
			temp.value = value;
		}
	}

	private void print() {
		for (int i = 0; i < this.size; i++) {
			System.out.println(this.get(i));
		}
		System.out.println("print() ---- end");
	}

	public static void main(String args[]) {
		DoublyLinkedList2<String> list = new DoublyLinkedList2<>();
		list.add("1");
		list.add("2");
		list.add("3");

		list.print();

		list.remove(2);
		list.update(0, "6");
//		list.update(1,"6");
//		list.update(2,"6");
		list.print();
	}

}
