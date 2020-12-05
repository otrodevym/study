package g_priority_queue_and_heap;

import java.util.Arrays;

import org.omg.CORBA.Current;

import d_tree.LeftChildRightSiblingTree;

class QueueNode {
	private String value;
	private int priority;
	
	public QueueNode() {
	}

	public QueueNode(int priority, String value) {
		super();
		this.value = value;
		this.priority = priority;
	}

	public QueueNode(String value) {
		super();
		this.value = value;
		this.priority = 0;
	}


	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
}

public class PriorityQueue {
	QueueNode[] nodes;
	int capacity;
	int usedSize;

	public PriorityQueue() {
	}

	private void pqCreate(int initialSize) {
		this.capacity = initialSize;
		this.usedSize = 0;
		this.nodes = new QueueNode[this.capacity];
	}
	
	private void pqEnqueue(PriorityQueue pq, QueueNode newNode) {
		int currentPosition = pq.usedSize;
		int parentPosition = this.pqGetParent(currentPosition);
		
		if(pq.usedSize == pq.capacity) {
			if(pq.capacity == 0) {
				pq.capacity = 1;
			}
			pq.capacity *= 2;
			pq.nodes = Arrays.copyOf(pq.nodes, pq.capacity);
		}
		pq.nodes[currentPosition] = new QueueNode();
		pq.nodes[currentPosition] = newNode;
		
		while(currentPosition > 0 && pq.nodes[currentPosition].getPriority() < pq.nodes[parentPosition].getPriority()) {
			this.pqSwapNodes(pq,currentPosition,parentPosition);
			currentPosition = parentPosition;
			parentPosition = this.pqGetParent(currentPosition);
		}
		pq.usedSize++;
		
	}

	private void pqSwapNodes(PriorityQueue pq, int currentPosition, int parentPosition) {
		QueueNode temp = new QueueNode(); 
		temp = pq.nodes[currentPosition];
		pq.nodes[currentPosition] = pq.nodes[parentPosition];
		pq.nodes[parentPosition] = temp;
	}

	private int pqGetParent(int currentPosition) {
		return (currentPosition-1)/2;
	}
	private int pqGetLeftChild(int currentPosition) {
		return (2*currentPosition)+1;
	}
	
	
	private QueueNode pqDequeue(PriorityQueue pq) {
		int parentPosition = 0;
		int leftPosition = 0;
		int rightPosition = 0;
		
		QueueNode popped = pq.nodes[0];
		
		pq.usedSize--;
		this.pqSwapNodes(pq, 0, pq.usedSize);
		
//		pq.nodes = Arrays.copyOf(pq.nodes, pq.nodes.length-1);
		pq.nodes = Arrays.copyOf(pq.nodes, pq.nodes.length);
		
		pq.nodes[pq.nodes.length-1] = null;
		
		leftPosition = pqGetLeftChild(0);
		rightPosition = leftPosition + 1;
		while(true) {
			int selectedChild = 0;
			
			if(leftPosition >= pq.usedSize) {
				break;
			}
			
			if(rightPosition >= pq.usedSize) {
				selectedChild = leftPosition;
			}else {
				if(pq.nodes[leftPosition].getPriority() > pq.nodes[rightPosition].getPriority()) {
					selectedChild = rightPosition;
				}else {
					selectedChild = leftPosition;
				}
			}
			
			if(pq.nodes[selectedChild].getPriority() < pq.nodes[parentPosition].getPriority()) {
				pq.pqSwapNodes(pq, parentPosition, selectedChild);
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
	
	public static void main(String args[]) {
		PriorityQueue pq= new PriorityQueue();
		
		pq.pqCreate(3); 
		QueueNode nodes[] =  new QueueNode[7];
		nodes[0] = new QueueNode(34, "코딩");
		nodes[1] = new QueueNode(12, "고객미팅");
		nodes[2] = new QueueNode(87, "커피타기");
		nodes[3] = new QueueNode(45, "문서작성");
		nodes[4] = new QueueNode(35, "디버깅");
		nodes[5] = new QueueNode(66, "이딱기");
		
		
		pq.pqEnqueue(pq, nodes[0]);
		pq.pqEnqueue(pq, nodes[1]);
		pq.pqEnqueue(pq, nodes[2]);
		pq.pqEnqueue(pq, nodes[3]);
		pq.pqEnqueue(pq, nodes[4]);
		pq.pqEnqueue(pq, nodes[5]);
		
		System.out.println("큐에 남아 있는 작업의 수 : " + pq.getUsedSize());
		
		QueueNode node = null;
		while(!pq.isEmpty()) {
			node = pq.pqDequeue(pq);
			System.out.println(node.getValue());
		}
		
		
	}

	private boolean isEmpty() {
		
		return (this.usedSize == 0);
	}
}
