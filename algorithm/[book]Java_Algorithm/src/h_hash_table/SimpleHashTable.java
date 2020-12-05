package h_hash_table;


public class SimpleHashTable {
	private HashNode[] table;
	private int size;
	
	public SimpleHashTable() {
		
	}
	public SimpleHashTable(int size) {
		this.table = new HashNode[size];
		this.size = size;
	}
	private void shtSet(int key, int value) {
		int address = this.shtHash(key);
		this.table[address] = new HashNode();
		this.table[address].setKey(key);
		this.table[address].setValue(value);
	}
	
	private int shtGet(int key) {
		int address = this.shtHash(key);
		return this.table[address].getValue();
	}
	private int shtHash(int key) {
		return key % this.size;
	}
	
	
	public static void main(String args[]) {
		SimpleHashTable ht = new SimpleHashTable(193);
		
		ht.shtSet(418, 32114);
		ht.shtSet(9, 514);
		ht.shtSet(27, 8917);
		ht.shtSet(1031, 286);
		
		System.out.println("418 : " + ht.shtGet(418));
		System.out.println("9 : " + ht.shtGet(9));
		System.out.println("27 : " + ht.shtGet(27));
		System.out.println("1031 : " + ht.shtGet(1031));
		
		String[] str= new String[10];
		str[0] = "asdasd";
		str[1] = "qweqwe";
		str[2] = "zxczxc";
		
	}
	
}
