package h_hash_table;

public class Chining {
	int size;
	ChiningHashNode[] table;
	
	public Chining() {
		
	}
	public Chining(int size) {
		this.size = size;
		this.table = new ChiningHashNode[size];
	}
	
	private ChiningHashNode chtCreateNode(String key, String value) {
		ChiningHashNode chn = new ChiningHashNode();
		chn.setKey(key);
		chn.setValue(value);
		chn.setNext(null);
		return chn;
	}
	
	private void chtSet(String key, String value) {
		int address = this.chtHash(key);
		ChiningHashNode newNode = this.chtCreateNode(key, value);
		if(this.table[address] == null) {
			this.table[address] = new ChiningHashNode();
			this.table[address] = newNode;
		}else {
			ChiningHashNode list = this.table[address];
			newNode.setNext(list);
			this.table[address] = newNode;
		}
		System.out.println("Collision occured : Key(" +key + "), Address(" + address + ")");
		
	}
	
	private String chtGet(String key) {
		int address = this.chtHash(key);
		ChiningHashNode list = this.table[address];
		ChiningHashNode target = null;
		if(list == null) {
			return null;
		}
		
		while(true) {
			if(list.getKey().equals(key)) {
				target = list;
				break;
			}
			
			if(list.getNext() == null) {
				break;
			}else {
				list = list.getNext();
			}
		}
		
		return target.getValue();
		
	}
	private int chtHash(String key) {
		int hashValue = 0;
		for(int i = 0; i < key.length(); i++) {
			hashValue += key.charAt(i);
		}
		hashValue = hashValue % this.size;
		return hashValue;
	}
	
	public static void main(String args[]) {
		Chining c = new Chining(12289);
		
		c.chtSet("MSFT", "Microsoft Corporation");
		c.chtSet("JAVA", "Sun Microsystems");
		c.chtSet("REDH", "Read Hat Linux");
		c.chtSet("APAC", "Apach Org");
		c.chtSet("ZYMZZ", "Unisys Ops Check");
		c.chtSet("IBM", "IBM Ltd.");
		c.chtSet("ORCL", "Oracle Corporation");
		c.chtSet("CSCO", "Cisco Systems, Inc.");
		c.chtSet("GOOG", "Google Inc.");
		c.chtSet("YHOO", "Yahoo! Inc.");
		c.chtSet("NOVL", "Novell, Inc.");
		
		
		System.out.println("Key: MSFT, Value: " + c.chtGet("MSFT"));
		System.out.println("Key: JAVA, Value: " + c.chtGet("JAVA"));
		System.out.println("Key: REDH, Value: " + c.chtGet("REDH"));
		System.out.println("Key: APAC, Value: " + c.chtGet("APAC"));
		System.out.println("Key: ZYMZ, Value: " + c.chtGet("ZYMZ"));
		System.out.println("Key: IBM, Value: " + c.chtGet("IBM"));
		System.out.println("Key: ORCL, Value: " + c.chtGet("ORCL"));
		System.out.println("Key: CSCO, Value: " + c.chtGet("CSCO"));
		System.out.println("Key: GOOG, Value: " + c.chtGet("GOOG"));
		System.out.println("Key: YHOO, Value: " + c.chtGet("YHOO"));
		System.out.println("Key: NOVL, Value: " + c.chtGet("NOVL"));

		
	}
}
