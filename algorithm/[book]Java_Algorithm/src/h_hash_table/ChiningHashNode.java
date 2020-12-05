package h_hash_table;

public class ChiningHashNode {
	String key;
	String value;
	ChiningHashNode next;
	
	public ChiningHashNode() {
		
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ChiningHashNode getNext() {
		return next;
	}

	public void setNext(ChiningHashNode next) {
		this.next = next;
	}
	
	
	
}
