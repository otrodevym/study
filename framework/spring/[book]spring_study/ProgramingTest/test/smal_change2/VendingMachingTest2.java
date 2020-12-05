package smal_change2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VendingMachingTest2 {
//		TDD형태의 잔돈 모듈입니다.
	@Test // 잔액 확인
	public void testGetChangeAmount() throws Exception {
		VendingMachine machine = new VendingMachine();
		machine.putCoin(100);
		assertEquals("투입 금액 100원", 100, machine.getChangeAmount());

		machine.putCoin(500);
		assertEquals("추가 투입 금액  500원", 600, machine.getChangeAmount());
	}

	@Test // 거스름돈 50원
	public void testReturnChangeCoinSet_oneCoin_50() throws Exception {
		ChangeModule module = new ChangeModule();
		CoinSet expectedConinSet = new CoinSet();
		expectedConinSet.add(50);
		System.out.println(module.getChangeCoinSet(50));
		assertEquals("700원 투입 후 650원 음료 선택", expectedConinSet, module.getChangeCoinSet(50));
	}

	@Test // 거스름돈 180원
	public void testReturnChangeCoinSet_coins_180() throws Exception {
		ChangeModule module = new ChangeModule();
		CoinSet expectedCoinSet = new CoinSet();
		expectedCoinSet.add(100);
		expectedCoinSet.add(50);
		expectedCoinSet.add(10);
		expectedCoinSet.add(10);
		expectedCoinSet.add(10);

		assertEquals("700원 투입 후 520원 음료 선택", expectedCoinSet, module.getChangeCoinSet(180));
	}

}
