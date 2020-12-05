package mock.testDouble;

import java.util.ArrayList;
import java.util.List;

public class SpyCoupon implements ICoupon {
	
	List<String> categoryList = new ArrayList<>();
	private int isAppliableCallCount;
	public SpyCoupon() {
		categoryList.add("부엌칼");
		categoryList.add("아동 장난감");
		categoryList.add("조리 기구");
		categoryList.add("Kitchen knife");
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public boolean isValid() {
		return true;
	}

	@Override
	public int getDiscountPercent() {
		return 7;
	}

	@Override
	public boolean isAppliable(Item item) {
		isAppliableCallCount++;
		if(this.categoryList.contains(item.getCategory())) {
			return true;
		}
		return false;
	}

	@Override
	public void doExpire() {
		
	}
	
	public int getIsAppliableCallCount() {
		return this.isAppliableCallCount;
	}

}
