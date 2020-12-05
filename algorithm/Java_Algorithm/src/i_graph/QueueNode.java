package i_graph;


public class QueueNode<T> {
		private T value;
		private QueueNode<T> nextNode;
		
		public QueueNode(T newValue) {
			this.value = newValue;
			this.nextNode = null;
	}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public QueueNode<T> getNextNode() {
			return nextNode;
		}

		public void setNextNode(QueueNode<T> nextNode) {
			this.nextNode = nextNode;
		}
		
		
}
