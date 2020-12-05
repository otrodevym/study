package smal_change2;

public class VendingMachine {
	private int changeAmount;
	
	public void putCoin(int coin) {
		this.changeAmount += coin;
	}
	public int getChangeAmount() {
		return this.changeAmount;
	}
	public void selectDrink(Drink drink) {
		this.changeAmount -= drink.getPrice();
	}
	
	public CoinSet getChangeCoinSet() {
		CoinSet coin = new CoinSet();
		
		while(changeAmount >= 500) {
			changeAmount -= 500;
			coin.add(500);
		}
		while(changeAmount >= 100) {
			changeAmount -= 100;
			coin.add(100);
		}
		while(changeAmount >= 50) {
			changeAmount -= 50;
			coin.add(50);
		}
		while(changeAmount >= 10) {
			changeAmount -= 10;
			coin.add(10);
		}
		
		return coin;
	}

}
