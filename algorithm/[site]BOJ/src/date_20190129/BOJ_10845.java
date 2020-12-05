package date_20190129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class MyQueue{
	private int size;
	private Node node;
	class Node {
		private int value;
		private Node nextNode;
		public Node() {
			
		}
		public Node(int value) {
			this.value = value;
			this.nextNode = null;
		}
	}
	public void push(int value) {
		Node newNode = new Node(value);
		if(this.node == null) {
			this.node = newNode;
		}else {
			Node temp = this.node;
			while(temp.nextNode != null) {
				temp = temp.nextNode;
			}
			temp.nextNode = newNode;
		}
		this.size++;
	}
	
	public int pop() {
		int value = 0;
		if(this.node == null) {
			return -1;
		}else {
			value = this.node.value;
			this.node = this.node.nextNode;
		}
		this.size--;
		return value;
	}
	
	public int size() {
		return this.size;
	}
	
	public int empty() {
		if(this.node == null) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public int front() {
		if(this.node == null) {
			return -1;
		}
		return this.node.value;
	}
	
	public int back() {
		if(this.node == null) {
			return  -1;
		}
		Node temp = this.node;
		while(temp.nextNode != null) {
			temp = temp.nextNode;
		}
		return temp.value;
	}
}


public class BOJ_10845 {
// 큐 만들기
//	push X: 정수 X를 큐에 넣는 연산이다.
//	pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//	size: 큐에 들어있는 정수의 개수를 출력한다.
//	empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//	front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//	back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String[] str = new String[2];
		int result = 0;
		MyQueue q = new MyQueue();
		for(int i = 0; i < num; i++) {
			str = br.readLine().split(" ");
			result = queueRun(str, q);
			if(result != -2) {
				bw.write(String.valueOf(result));
				bw.newLine();
			}
		}
		
		bw.close();
		
	}
	
	public static int queueRun(String[] str, MyQueue q) {
		int result = 0;
		switch(str[0]) {
		case "push" :{
			q.push(Integer.parseInt(str[1]));
			result = -2;
			break;
		}
		case "pop" :{
			result = q.pop();
			break;
		}
		case "size" :{
			result = q.size();
			break;
		}
		case "empty" :{
			result = q.empty();
			break;
		}
		case "front" :{
			result = q.front();
			break;
		}
		case "back" :{
			result = q.back();
			break;
		}
		}
		return result;
	}
}
