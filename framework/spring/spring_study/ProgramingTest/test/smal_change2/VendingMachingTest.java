package smal_change2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VendingMachingTest {
// Test를 위한 Test 케이스형태입니다.
//	음료수 선택까지 구현 되어 있는 점에서 리소스 낭비이며 목적이어쓰던 잔돈 모듈에서 벗어납니다.
	@Test // 잔액 확인
	public void testGetChangeAmount() throws Exception{
		VendingMachine machine = new VendingMachine();
		machine.putCoin(100);
		assertEquals("투입 금액 100원", 100, machine.getChangeAmount());
		
		machine.putCoin(500);
		assertEquals("추가 투입 금액  500원", 600, machine.getChangeAmount());
	}
	
	@Test // 거스름돈 50원
	public void testReturnChangeCoinSet_oneCoin_50() throws Exception{
		VendingMachine machine = new VendingMachine();
		machine.putCoin(100);
		machine.putCoin(100);
		machine.putCoin(500);
		
		machine.selectDrink(new Drink("Cola",650));
		
		CoinSet expectedConinSet = new CoinSet();
		assertEquals("700원 투입 후 650원 음료 선택", expectedConinSet, machine.getChangeCoinSet());
	}
	
	@Test // 거스름돈 180원
	public void testReturnChangeCoinSet_coins_180() throws Exception{
		VendingMachine machine = new VendingMachine();
		machine.putCoin(100);
		machine.putCoin(100);
		machine.putCoin(500);
		machine.selectDrink(new Drink("Soda", 520));
		
		CoinSet expectedCoinSet = new CoinSet();
		expectedCoinSet.add(100);
		expectedCoinSet.add(50);
		expectedCoinSet.add(10);
		expectedCoinSet.add(10);
		expectedCoinSet.add(10);
		
		assertEquals("700원 투입 후 520원 음료 선택", expectedCoinSet, machine.getChangeCoinSet());
	}
}
