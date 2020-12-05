package h_hash_table;

enum ElementStatus{
	EMPTY(0), OCCUPIED(1);
	private int value;
	private ElementStatus(int value) {
		this.value = value;
	}
}
public class OpenAddressing {
	private int occupiedCount;
	private int size;
	private OAHashNode[] table;
	
	class OAHashNode {
		String key;
		String value;
		
		ElementStatus status;
		
		public OAHashNode() {
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

		public ElementStatus getStatus() {
			return status;
		}

		public void setStatus(ElementStatus status) {
			this.status = status;
		}
	}
	
	public OpenAddressing() {
	}
	public OpenAddressing(int size) {
		this.size = size;
		this.table = new OAHashNode[size];
	}
	
	private void oahtSet(String key, String value) {
		int address = 0;
		int stepSize = 0;
		double usage = (double)this.occupiedCount / this.size;
		
		if(usage > 0.5) {
			this.oahtRehash();
		}
		
		address = this.oahtHash(key);
		stepSize = this.oahtHash2(key);
		if(null == this.table[address] || (null == this.table[address].getStatus() || null ==this.table[address].getKey())) {
			this.table[address] = new OAHashNode();
		}else {
			while(	
					this.table[address].getStatus() != ElementStatus.EMPTY 
					&& !this.table[address].getKey().equals(key)) {
				System.out.println("Collision occured! : Key("+ key+"), Address("+ address +"), StepSize("+stepSize +")");
				address = (address + stepSize) % this.size;
				if(null == this.table[address]) {
					this.table[address] = new OAHashNode();
					break;
				}
			}
		}
		this.table[address].setKey(key);
		this.table[address].setValue(value);
		this.table[address].setStatus(ElementStatus.OCCUPIED);
		this.occupiedCount++;
		System.out.println("Key : " + key + " endtered at address : "+ address);
	}
	
	private String oahtGet(String key) {
		int address = 0;
		address=this.oahtHash(key);
		int stepSize = 0;
		stepSize = this.oahtHash2(key);
		while(this.table[address].getStatus() != ElementStatus.EMPTY && !this.table[address].getKey().equals(key)) {
			address = (address + stepSize) % this.size;
		}
		return this.table[address].getValue();
	}
	
	private int oahtHash(String key) {
		int hashValue = 0;
		for(int i =0; i < key.length(); i++) {
			hashValue = (hashValue << 3) + key.charAt(i);
//			hashValue +=  key.charAt(i);
		}
		hashValue = hashValue % this.size;
		
		return hashValue;
	}

	private int oahtHash2(String key) {
		int hashValue =0;
		for(int i =0; i < key.length(); i++) {
			hashValue = (hashValue << 3) + key.charAt(i);
//			hashValue +=  key.charAt(i);
		}
		hashValue = hashValue % (this.size-3);
		
		return hashValue+1;
	}
	private void oahtRehash() {
		System.out.println("rehasing");
		OAHashNode[] oa = this.table;
		this.size = this.size *2;
		this.occupiedCount = 0;
		
		
		for(int i =0 ; i < this.size; i++) {
			if(oa[i].getStatus() == ElementStatus.OCCUPIED) {
				this.oahtSet(oa[i].getKey(), oa[i].getValue());
			}
		}
	}
	
	public static void main(String args[]) {
		OpenAddressing oa = new OpenAddressing(12289);
		
		oa.oahtSet("MSFT", "Microsoft Corporation");
		oa.oahtSet("JAVA", "Sun Microsystems");
		oa.oahtSet("REDH", "Read Hat Linux");
		oa.oahtSet("APAC", "Apach Org");
		oa.oahtSet("ZYMZZ", "Unisys Ops Check");
		oa.oahtSet("IBM", "IBM Ltd.");
		oa.oahtSet("ORCL", "Oracle Corporation");
		oa.oahtSet("CSCO", "Cisco Systems, Inc.");
		oa.oahtSet("GOOG", "Google Inc.");
		oa.oahtSet("YHOO", "Yahoo! Inc.");
		oa.oahtSet("NOVL", "Novell, Inc.");
		
		
		System.out.println("Key: MSFT, Value: " + oa.oahtGet("MSFT"));
		System.out.println("Key: JAVA, Value: " + oa.oahtGet("JAVA"));
		System.out.println("Key: REDH, Value: " + oa.oahtGet("REDH"));
		System.out.println("Key: APAC, Value: " + oa.oahtGet("APAC"));
		System.out.println("Key: ZYMZ, Value: " + oa.oahtGet("ZYMZZ"));
		System.out.println("Key: IBM, Value: " + oa.oahtGet("IBM"));
		System.out.println("Key: ORCL, Value: " + oa.oahtGet("ORCL"));
		System.out.println("Key: CSCO, Value: " + oa.oahtGet("CSCO"));
		System.out.println("Key: GOOG, Value: " + oa.oahtGet("GOOG"));
		System.out.println("Key: YHOO, Value: " + oa.oahtGet("YHOO"));
		System.out.println("Key: NOVL, Value: " + oa.oahtGet("NOVL"));

		
	}
}
