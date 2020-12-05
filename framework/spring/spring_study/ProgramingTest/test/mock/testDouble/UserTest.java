package mock.testDouble;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {

	@Test
	public void addCoupon_쿠폰추가하기() throws Exception {

		User user = new User("test");
		assertEquals("쿠폰 수령전", 0, user.getTotalCouponCount());

		ICoupon coupon = new DoummyCoupon();

		user.addCoupon(coupon);
		assertEquals("쿠폰 추가 후", 1, user.getTotalCouponCount());

	}

	@Test
	public void getLastOccupiedCoupon_이벤트쿠폰발행() throws Exception {
		User user = new User("test");
		ICoupon eventCoupone = new StubCoupon();
		user.addCoupon(eventCoupone);
		ICoupon lastCoupon = user.getLastOccupiedCoupon();

		assertEquals("구폰 할인율", 7, lastCoupon.getDiscountPercent());
		assertEquals("쿠폰 이름", "VIP 고객 한가위 감사쿠폰", lastCoupon.getName());
	}

	@Test
	public void getOrderPrice_discounttableItem_할인되는물건찾기() throws Exception {
		PriceCalculator calculator = new PriceCalculator();

		Item item = new Item("LightSavor", "부엌칼", 100000);
		ICoupon coupon = new StubCoupon();

		assertEquals("쿠폰으로 인해 할인 된 가격", 93000, calculator.getOrderPrice(item, coupon));

	}
	
	@Test
	public void getOrderPrice_undiscounttableItem_할인되지_않은_물건() throws Exception{
		PriceCalculator calculator = new PriceCalculator();
		
		Item item = new Item("R2D2", "알람시계", 20000);
//		ICoupon coupon = new StubCoupon();
		ICoupon coupon = new FakeCoupon();
		
		assertEquals("쿠폰 적용 안되는 아이템", 20000, calculator.getOrderPrice(item, coupon));
	}
	
	@Test
	public void getOrderPrice_discounttableItem_할인되었고_몇번호출되었는지_획인() throws Exception{
		PriceCalculator calc = new PriceCalculator();
		Item item = new Item("LightSavor", "Kitchen knife", 100000);
		
		ICoupon coupon = new SpyCoupon();
		
		assertEquals("쿠폰으로 인해 할인 된 가격", 93000, calc.getOrderPrice(item, coupon));
		int methodCallCount = ((SpyCoupon)coupon).getIsAppliableCallCount();
		assertEquals("coupon.isAppliable 메소드 호출 횟수", 1, methodCallCount);
	}
}
