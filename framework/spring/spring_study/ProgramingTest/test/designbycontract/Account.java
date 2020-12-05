package designbycontract;

public class Account {
	private String id;
	private String name;
	private int money;
	
	public Account() {
	}

	public Account(String id, String name, int money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}

	public Account(int money) {
		super();
		if(money > 0) {
			throw new IllegalArgumentException("계좌 생성 시 money는 양수여야 함, 현재 : " + money);
		}
//		assert money > -1 : "계좌 생성 시 money는 양수여야 함, 현재 : " +money;
		this.money = money;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}