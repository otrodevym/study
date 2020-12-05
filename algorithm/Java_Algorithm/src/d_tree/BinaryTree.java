package d_tree;

public class BinaryTree {
	private String value;
	private BinaryTree left;
	private BinaryTree right;
	
	public BinaryTree(String value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	
	private static void preorderPrintTree(BinaryTree node) {
		if(node == null) {
			return ;
		}
		System.out.print(" " + node.value);
		preorderPrintTree(node.left);
		preorderPrintTree(node.right);
	}
	private static void InorderPrintTree(BinaryTree node) {
		if(node == null) {
			return ;
		}
		InorderPrintTree(node.left);
		System.out.print(" " + node.value);
		InorderPrintTree(node.right);
	}
	private static void PostorderPrintTree(BinaryTree node) {
		if(node == null) {
			return ;
		}
		PostorderPrintTree(node.left);
		PostorderPrintTree(node.right);
		System.out.print(" " + node.value);
	}
	
	
	public static void main(String args[]) {
		BinaryTree a= new BinaryTree("a");
		BinaryTree b= new BinaryTree("b");
		BinaryTree c= new BinaryTree("c");
		BinaryTree d= new BinaryTree("d");
		BinaryTree e= new BinaryTree("e");
		BinaryTree f= new BinaryTree("f");
		BinaryTree g= new BinaryTree("g");
		
		
		a.left = b;
		b.left = c;
		b.right = d; 
		
		
		a.right = e;
		e.left = f;
		e.right = g;
		
		
		
		preorderPrintTree(a);
		System.out.println("");
		InorderPrintTree(a);
		System.out.println("");
		PostorderPrintTree(a);
		
		
	}
}
