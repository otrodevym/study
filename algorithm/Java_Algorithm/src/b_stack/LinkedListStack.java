package b_stack;

public class LinkedListStack<T> {
	private int size;
	private Node top;
	
	class Node{
		private T value;
		private Node nextNode;
		
		public Node(T value) {
			this.value = value;
			this.nextNode = null;
		}
	}
	
	public LinkedListStack() {
		this.size = 0;
		this.top = null;
	}
	
	public void push(T value) {
		Node newNode = new Node(value);
		
		newNode.nextNode = top;
		top = newNode;
		this.size++;
	}
	
	public T pop() {
		T data = this.top.value;
		this.top = this.top.nextNode;
		this.size--;
		return data; 
	}
	public static void main(String args[]) {
		LinkedListStack<String> stack = new LinkedListStack<>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
