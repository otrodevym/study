package mock.testDouble;

public class DoummyCoupon implements ICoupon {

	@Override
	public String getName() {
		throw new UnsupportedOperationException("호출 되지 않는 메소드");
	}

	@Override
	public boolean isValid() {
		return false;
	}

	@Override
	public int getDiscountPercent() {
		return 0;
	}

	@Override
	public boolean isAppliable(Item item) {
		return false;
	}

	@Override
	public void doExpire() {

	}

}
