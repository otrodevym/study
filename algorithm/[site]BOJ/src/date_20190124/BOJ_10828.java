package date_20190124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class MyStack {
	private Node node;
	private int size;

	public MyStack() {
	}

	class Node {
		private int value;
		private Node nextNode;

		public Node() {
			this.value = -1;
			this.nextNode = null;
		}

		public Node(int value) {
			this.value = value;
			this.nextNode = null;
		}
	}

	public void push(int value) {
		Node newNode = new Node(value);
		if (this.node == null) {
			this.node = newNode;
		} else {
			Node temp = this.node;
			newNode.nextNode = temp;
			this.node = newNode;
		}
		this.size++;
	}

	public int pop() {
		if (this.node == null) {
			this.size = 0;
			return -1;
		} else {
			Node temp = this.node;
			this.node = temp.nextNode;
			this.size--;
			return temp.value;
		}
	}

	public int size() {
		return this.size;
	}

	public int empty() {
		if (this.node == null) {
			return 1;
		} else {
			return 0;
		}
	}

	public int top() {
		if (this.node == null) {
			return -1;
		} else {
			return this.node.value;
		}
	}

}


public class BOJ_10828 {
	// 스택의 5가지 기능을 구현
	// push x : 정수 x 저장
	// pop : 가장 위의 정수를 뺴고 없으면 -1 출력
	// size : 정수의 개수를 출력
	// empty : 비어 있으면 1, 아니면 0
	// top : 가장 위에 있는 정수 출력, 없으면 -1
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		MyStack s = new MyStack();
		String[] str = new String[num];
		int[] result = new int[num];
		for (int i = 0; i < num; i++) {
			str = br.readLine().split(" ");
			result[i] = caseCall(str, s);
		}
		for(int i : result) {
			if(i != -2) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		bw.close();
		
	}

	public static int caseCall(String[] str, MyStack s) {

		int result = 0;
		switch (str[0]) {
		case "push": {
			s.push(Integer.parseInt(str[1]));
			result = -2;
			break;
		}
		case "pop": {
			result = s.pop();
			break;
		}
		case "size": {
			result = s.size();
			break;
		}
		case "empty": {
			result = s.empty();
			break;
		}
		case "top": {
			result = s.top();
			break;
		}
		default: {
			result = -2;
			break;
		}
		}

		return result;
	}

}
