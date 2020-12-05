package account;

public class Account {
	private int balance;
	
	public Account(int monery) {
		this.balance = monery;
	}

	public int getBalance() {
		return this.balance;
	}

	public void deposit(int money) {
		this.balance += money;
	}

	public void withraw(int monery) {
		this.balance -= monery;
		
	}

}
