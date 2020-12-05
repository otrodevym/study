package d_tree;

public class LeftChildRightSiblingTree {
	private int value;
	private LeftChildRightSiblingTree leftChild;
	private LeftChildRightSiblingTree rightSibling;
	
	
	
	public LeftChildRightSiblingTree() {
		this.value = 0;
		this.leftChild = null;
		this.rightSibling = null;
	}
	public LeftChildRightSiblingTree(int value) {
		this.value = value;
		this.leftChild = null;
		this.rightSibling = null;
	}
	
	private void addChild(LeftChildRightSiblingTree parent, LeftChildRightSiblingTree child) {
		LeftChildRightSiblingTree temp = new LeftChildRightSiblingTree();
		if(parent.leftChild == null) {
			parent.leftChild = child;
		}else {
			temp = parent.leftChild;
			while(temp.rightSibling != null) {
				temp = temp.rightSibling; 
			}
			
			temp.rightSibling = child;
		}
	}
	
	private void removeChild(LeftChildRightSiblingTree parent, LeftChildRightSiblingTree child) {
		LeftChildRightSiblingTree temp = new LeftChildRightSiblingTree();
		parent.leftChild.rightSibling = child.leftChild;
		child.rightSibling = null;
	}
	
	private void printTree(LeftChildRightSiblingTree parent, int depth) {
		for(int i = 0; i < depth; i++) {
			System.out.print(" ");
		}
		System.out.println("depth : " + depth + ", value : " + parent.value);
		if(parent.leftChild != null) {
			printTree(parent.leftChild, depth+1);
		}
		if(parent.rightSibling != null) {
			printTree(parent.rightSibling, depth);
			
		}
		
	}
	
	public static void main(String args[]) {
		LeftChildRightSiblingTree root = new LeftChildRightSiblingTree(1);
		LeftChildRightSiblingTree a = new LeftChildRightSiblingTree(2);
		LeftChildRightSiblingTree b = new LeftChildRightSiblingTree(3);
		LeftChildRightSiblingTree c = new LeftChildRightSiblingTree(4);
		LeftChildRightSiblingTree d = new LeftChildRightSiblingTree(5);
		LeftChildRightSiblingTree e = new LeftChildRightSiblingTree(6);
		LeftChildRightSiblingTree f = new LeftChildRightSiblingTree(7);
		LeftChildRightSiblingTree g = new LeftChildRightSiblingTree(8);
		
		LeftChildRightSiblingTree tree = new LeftChildRightSiblingTree();
		
		tree.addChild(root, a);
		tree.addChild(root, b);
		
		
		tree.addChild(a, d);
		tree.addChild(a, c);
		
		tree.addChild(b, e);
		tree.addChild(b, f);
		tree.addChild(b, g);
		tree.removeChild(root, b);
		tree.printTree(root, 0);
		
	}
}
