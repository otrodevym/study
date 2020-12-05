package g_priority_queue_and_heap;

import java.util.Arrays;

class HeapNode {
	private int value;
	
	public HeapNode() {
		
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
public class PriorityHeap {

	HeapNode nodes[];
	int capacity;
	int usedSize;

	public PriorityHeap() {

	}

	public PriorityHeap(int initialCapacity) {
		this.capacity = initialCapacity;
		this.usedSize = 0;
		this.nodes = new HeapNode[this.capacity];
	}

	

	private PriorityHeap heapCreate(int initialSize) {
		PriorityHeap newNode = new PriorityHeap(initialSize);
		return newNode;
	}

	private void heapInsert(PriorityHeap heap, int newValue) {
		int currentPosition = heap.usedSize;
		int parentPosition = heapGetParent(currentPosition);

		if (heap.usedSize == heap.capacity) {
			heap.capacity *= 2;
			HeapNode[] temp = new HeapNode[heap.capacity];
			temp = Arrays.copyOf(heap.nodes, temp.length);
			heap.nodes = temp; 
		}
		HeapNode node = new HeapNode();
		node.setValue(newValue);
		heap.nodes[currentPosition] = node;

		while (currentPosition > 0 && heap.nodes[currentPosition].getValue() < heap.nodes[parentPosition].getValue()) {
			heapSwapNodes(heap, currentPosition, parentPosition);
			currentPosition = parentPosition;
			parentPosition = heapGetParent(currentPosition);
		}
		heap.usedSize++;
	}

	private int heapGetParent(int currentPosition) {
		return (currentPosition-1)/2;
	}
	
	private int heapGetLeftChild(int currentPosition) {
		return (2*currentPosition)+1;
	}

	private void heapSwapNodes(PriorityHeap heap, int currentPosition, int parentPosition) {
		HeapNode temp = new HeapNode();
		
		temp = heap.nodes[currentPosition];
		heap.nodes[currentPosition] = heap.nodes[parentPosition];
		heap.nodes[parentPosition] = temp;
		
	}
	
	
	private void heapDeleteMin(PriorityHeap heap, HeapNode Root) {
		int parentPosition = 0;
		int leftPosition = 0;
		int rightPosition = 0;
		
		heap.nodes[0].setValue(-1);
		heap.usedSize--;
		heapSwapNodes(heap, 0, heap.usedSize);
		
		heap.nodes = Arrays.copyOf(heap.nodes, heap.nodes.length-1);
		
		leftPosition = heapGetLeftChild(0);
		rightPosition = leftPosition +1;
		
		while(true) {
			int selectedChild = 0;
			if(leftPosition >= heap.usedSize) {
				break;
			}
			
			if(rightPosition >= heap.usedSize) {
				selectedChild = leftPosition;
			}else {
				if(heap.nodes[leftPosition].getValue() > heap.nodes[rightPosition].getValue()) {
					selectedChild = rightPosition;
				}else {
					selectedChild = leftPosition;
				}
			}
			if(heap.nodes[selectedChild].getValue() < heap.nodes[parentPosition].getValue()) {
				heapSwapNodes(heap, parentPosition, selectedChild);
				parentPosition = selectedChild;
			}else {
				break;
			}
			leftPosition = heapGetLeftChild(parentPosition);
			rightPosition = leftPosition + 1;
			
		}
		
	}
	
	private void heapPrintNodes(PriorityHeap heap) {
		for(int i = 0; i < heap.usedSize; i++) {
			System.out.print(" " + heap.nodes[i].getValue());
		}
		System.out.println();
	}

	public static void main(String args[]) {
		PriorityHeap heap = new PriorityHeap();
		heap = heap.heapCreate(3);
		
		heap.heapInsert(heap, 12);
		heap.heapInsert(heap, 87);
		heap.heapInsert(heap, 111);
		heap.heapInsert(heap, 34);
		heap.heapInsert(heap, 16);
		heap.heapInsert(heap, 75);
		heap.heapPrintNodes(heap);
		
		HeapNode node = new HeapNode();
		
		
		heap.heapDeleteMin(heap, node);
		heap.heapPrintNodes(heap);
		heap.heapDeleteMin(heap, node);
		heap.heapPrintNodes(heap);
		heap.heapDeleteMin(heap, node);
		heap.heapPrintNodes(heap);
		heap.heapDeleteMin(heap, node);
		heap.heapPrintNodes(heap);
		heap.heapDeleteMin(heap, node);
		heap.heapPrintNodes(heap);
		
		
	}	

}
