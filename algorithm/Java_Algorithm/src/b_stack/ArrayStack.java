package b_stack;

public class ArrayStack {
	private int top;
	private int size;
	private Node[] nodes;
	
	public ArrayStack(int size) {
		this.top = -1;
		this.size = size;
		this.nodes = new Node[size];
	}
	
	class Node{
		private int value;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	private void push(int value) {
		this.top++;
		Node newNode = new Node(value);
		this.nodes[this.top] = newNode;
	}
	
	private int pop() {
		int data = this.nodes[this.top].value;
		this.nodes[this.top] = null;
		this.top--;
		
		return data; 
	}
	
	public static void main(String args[]) {
		ArrayStack list =new ArrayStack(3);
		
		list.push(1);
		list.push(2);
		list.push(3);
		
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		
	}
	
	
}
