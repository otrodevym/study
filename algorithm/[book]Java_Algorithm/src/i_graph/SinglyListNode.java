package i_graph;


public class SinglyListNode<T> {
		private T value;
		private SinglyListNode<T> nextNode;

		public SinglyListNode(T value) {
			this.value = value;
			this.nextNode = null;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		protected  SinglyListNode<T> getNextNode() {
			return nextNode;
		}

		public void setNextNode(SinglyListNode<T> nextNode) {
			this.nextNode = nextNode;
		}
	
}
