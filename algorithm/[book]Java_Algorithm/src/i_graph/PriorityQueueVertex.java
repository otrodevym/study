package i_graph;

import java.util.Arrays;

import org.omg.CORBA.Current;

import d_tree.LeftChildRightSiblingTree;

public class PriorityQueueVertex<T> {
	PQNode<Vertex<T>>[] nodes;
	int capacity;
	int usedSize;

	public PriorityQueueVertex() {
	}

	public void pqCreate(int initialSize) {
		this.capacity = initialSize;
		this.usedSize = 0;
		this.nodes = new PQNode[this.capacity];
	}
	
	public void pqEnqueueVertex(PQNode<Vertex<T>> newNode) {
		int currentPosition = this.usedSize;
		int parentPosition = this.pqGetParent(currentPosition);
		
		if(this.usedSize == this.capacity) {
			if(this.capacity == 0) {
				this.capacity = 1;
			}
			this.capacity *= 2;
			this.nodes = Arrays.copyOf(this.nodes, this.capacity);
		}
		this.nodes[currentPosition] = new PQNode<Vertex<T>>();
		this.nodes[currentPosition] = newNode;
		
		while(currentPosition > 0 && this.nodes[currentPosition].getPriority() < this.nodes[parentPosition].getPriority()) {
			this.pqSwapNodes(currentPosition,parentPosition);
			currentPosition = parentPosition;
			parentPosition = this.pqGetParent(currentPosition);
		}
		this.usedSize++;
		
	}

	public void pqSwapNodes(int currentPosition, int parentPosition) {
		PQNode<Vertex<T>> temp = new PQNode<Vertex<T>>(); 
		temp = this.nodes[currentPosition];
		this.nodes[currentPosition] = this.nodes[parentPosition];
		this.nodes[parentPosition] = temp;
	}

	private int pqGetParent(int currentPosition) {
		return (currentPosition-1)/2;
	}
	private int pqGetLeftChild(int currentPosition) {
		return (2*currentPosition)+1;
	}
	
	
	public PQNode<Vertex<T>> pqDequeueVertex() {
		int parentPosition = 0;
		int leftPosition = 0;
		int rightPosition = 0;
		
		PQNode<Vertex<T>> popped = this.nodes[0];
		
		this.usedSize--;
		this.pqSwapNodes(0, this.usedSize);
		
		this.nodes = Arrays.copyOf(this.nodes, this.nodes.length);
		this.nodes[this.nodes.length-1] = null;
		
		leftPosition = pqGetLeftChild(0);
		rightPosition = leftPosition + 1;
		while(true) {
			int selectedChild = 0;
			
			if(leftPosition >= this.usedSize) {
				break;
			}
			
			if(rightPosition >= this.usedSize) {
				selectedChild = leftPosition;
			}else {
				if(this.nodes[leftPosition].getPriority() > this.nodes[rightPosition].getPriority()) {
					selectedChild = rightPosition;
				}else {
					selectedChild = leftPosition;
				}
			}
			
			if(this.nodes[selectedChild].getPriority() < this.nodes[parentPosition].getPriority()) {
				this.pqSwapNodes(parentPosition, selectedChild);
				parentPosition = selectedChild;
			}else {
				break;
			}
			
			leftPosition = pqGetLeftChild(parentPosition);
			rightPosition = leftPosition + 1;
		}
		
		
		return popped;
	}
	
	public int getUsedSize() {
		return this.usedSize;
	}
	
	public boolean isEmpty() {
		
		return (this.usedSize == 0);
	}
}
