package mock.testDouble;

import java.util.ArrayList;
import java.util.List;

public class FakeCoupon implements ICoupon {
	
	List<String> categoryList = new ArrayList<>();
	
	public FakeCoupon() {
		categoryList.add("부엌칼");
		categoryList.add("아동 장난감");
		categoryList.add("조리 기구");
	}

	@Override
	public String getName() {
		return null;
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
		if(this.categoryList.contains(item.getCategory())) {
			return true;
		}
		return false;
	}

	@Override
	public void doExpire() {
		
	}

}
