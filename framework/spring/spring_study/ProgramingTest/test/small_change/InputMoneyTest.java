package small_change;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InputMoneyTest {

	@Test
	public void inputMoneyTest_손님이_구매하기위해_넣은금액을_확인한다() throws Exception {
		VendingMaching vm = new VendingMaching();
		int money = vm.getMoney();
		
		assertNotNull(money);
	}
	
	@Test
	public void inputMoneyTest_손님이_넣은_금액이_0이하일수없다() throws Exception{
		VendingMaching vm = new VendingMaching();
//		vm.setInputMoney(-1);
		vm.setInputMoney(1000);
		
		assertTrue("투입 금액은 0이하 일수 없다", vm.getMoney() > 0);
	}
	
	
	@Test
	public void changeMoneyTest_손님이_선택한_물품의_가격을확인한다() throws Exception{
		VendingMaching vm = new VendingMaching();
		vm.setSelectedProduct(650);
		
		assertEquals("손님이 선택한 물품 가격을 확인한다", 650, vm.getSelectedProduct());
	}
	
	@Test
	public void changeMoneyTest_손님이_선택한_물품가격을_투입금액에서_차감한다() throws Exception{
		VendingMaching vm = new VendingMaching();
		vm.setInputMoney(1000);
		vm.setSelectedProduct(650);
		vm.inputMoneyAndProductDeduct();
		
		assertEquals("손님이 선택한 물품 가격을 투입 금액에서 차감한다",350, vm.getMoney());
	}
	@Test
	public void changeMoneyTest_손님에게_거스름돈을_반환한다() throws Exception{
		VendingMaching vm = new VendingMaching();
		vm.setInputMoney(1000);
		vm.setSelectedProduct(650);
		vm.inputMoneyAndProductDeduct();
		
		ChangeMoney cm = new ChangeMoney();
		cm.setChangeMoney(vm.getMoney());
		
		int[] money = cm.getChangeMoney(); 
		assertEquals("손님에게 반환 할 500원의 개수",0, money[0]);
		assertEquals("손님에게 반환 할 100원의 개수",3, money[1]);
		assertEquals("손님에게 반환 할 50원의 개수",1, money[2]);
		assertEquals("손님에게 반환 할 10원의 개수",0, money[3]);
	}
}
