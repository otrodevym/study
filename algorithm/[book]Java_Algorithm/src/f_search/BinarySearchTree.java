package f_search;

public class BinarySearchTree {
	public BinarySearchTree() {
		
	}
	private BinaryNode createNode(int value) {
		BinaryNode newNode = new BinaryNode(value);
		
		newNode.setValue(value);
		newNode.setRight(null);
		newNode.setLeft(null);
		
		return newNode;
	}
	
	private BinaryNode searchNode(BinaryNode node, int target) {
		BinaryNode match = null;
		if(node == null) {
			return null;
		}
		if(node.getValue() < target) {
			searchNode(node.getRight(),target);
		}else if(node.getValue() > target) {
			searchNode(node.getLeft(), target);
		}else {
			return node;
		}
		return match;
	}
	
	
	private void insertNode(BinaryNode node, BinaryNode newNode) {
		if(node.getValue() < newNode.getValue()) {
			if(node.getRight() == null) {
				node.setRight(newNode);
			}else {
				this.insertNode(node.getRight(), newNode);
			}
		}else if(node.getValue() > newNode.getValue()){
			
			if(node.getLeft() == null) {
				node.setLeft(newNode);
			}else {
				this.insertNode(node.getLeft(), newNode);
			}
			
		}
	}
	
	
	private BinaryNode removeNode(BinaryNode node, BinaryNode parent, int target) {
		BinaryNode removed = null;
		if(node == null) {
			return null;
		}
		
		
		if(node.getValue() < target) {
			removed = removeNode(node.getRight(), node,  target);
		}else if(node.getValue() > target) {
			removed = removeNode(node.getLeft(), node, target);
		}else {
			
			if(node.getRight() == null && node.getLeft() == null) {
				if(node.getRight() != null) {
					node.setRight(null);
				}
				if(node.getLeft() != null) {
					node.setLeft(null);
				}
			}else {
				if(node.getLeft() != null && node.getRight() != null) {
					BinaryNode minNode = searchMinNode(node.getRight());
					minNode = removeNode(node, null, minNode.getValue());
					node.setValue(minNode.getValue());
				}else {
					BinaryNode temp = null;
					if(node.getLeft() != null) {
						temp = node.getLeft();
					}else {
						temp = node.getRight();
					}
					if(parent.getLeft() == node) {
						parent.setLeft(temp);
					}else {
						parent.setRight(temp);
					}
				}
			}
		}
		
		
		return removed; 
	}
	private BinaryNode searchMinNode(BinaryNode node) {
		if(node == null) {
			return null;
		}
		
		if(node.getLeft() == null) {
			return node;
		}else {
			return searchMinNode(node.getLeft());
		}
	}
	
	
	
	
	void inorderPrintTree(BinaryNode node) {
		if(node == null) {
			return ;
		}
		inorderPrintTree(node.getLeft());
		System.out.println(" "+ node.getValue());
		inorderPrintTree(node.getRight());
		
	}
	
	
	public static void main(String args[]) {
		BinarySearchTree tree = new BinarySearchTree();
		BinaryNode root = tree.createNode(123); 
		
		tree.insertNode(root, tree.createNode(100));
		tree.insertNode(root, tree.createNode(10));
		tree.insertNode(root, tree.createNode(130));
		tree.insertNode(root, tree.createNode(12));
		tree.insertNode(root, tree.createNode(30));
		tree.insertNode(root, tree.createNode(60));
		tree.insertNode(root, tree.createNode(90));
		
		tree.inorderPrintTree(root);
		
		tree.removeNode(root, null, 30);
		System.out.println("removed ---------------");
		tree.inorderPrintTree(root);
		
	}
}
