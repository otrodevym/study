package d_tree;

import java.util.Stack;

class Node {
	private String value;
	private Node left;
	private Node right;

	public Node(String value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}

public class ExpressionTree {

	private Node buildExpressionTree(String expression) {
		String[] str = expression.split(" ");
		Stack<Node> stack = new Stack<>();
		for (int i = 0; i < str.length; i++) {
			String token = str[i];

			switch (token) {
			case "+":
			case "-":
			case "*":
			case "/": {
				Node newNode = new Node(token);
				newNode.setRight(stack.pop());
				newNode.setLeft(stack.pop());

				stack.push(newNode);
				break;
			}
			default:
				stack.push(new Node(token));
				break;
			}
		}
		return stack.peek();
	}

	private void postorderPrintTree(Node node) {
		if (node == null) {
			return;
		}

		postorderPrintTree(node.getLeft());
		postorderPrintTree(node.getRight());
		System.out.print(" " + node.getValue());
	}

	private double evaluate(Node node) {
		double left = 0;
		double right = 0;

		if (node == null) {
			return 0;
		}
		switch (node.getValue()) {
		case "+":
		case "-":
		case "*":
		case "/": {
			left = evaluate(node.getLeft());
			right = evaluate(node.getRight());

			if (node.getValue().equals("+")) {
				return left + right;
			} else if (node.getValue().equals("-")) {
				return left - right;
			} else if (node.getValue().equals("*")) {
				return left * right;
			} else if (node.getValue().equals("/")) {
				return left / right;
			}
		}
		default:
			return Double.parseDouble(node.getValue());

		}
	}
	
	public static void main(String args[]) {
		ExpressionTree tree = new ExpressionTree();
		
		String expression = "7 1 * 5 2 - /";
		
		Node root = tree.buildExpressionTree(expression);
		
		System.out.println("후위 출력");
		tree.postorderPrintTree(root);
		
		
		
		
		System.out.println("결과 ");
		System.out.println(tree.evaluate(root));
	}

}
