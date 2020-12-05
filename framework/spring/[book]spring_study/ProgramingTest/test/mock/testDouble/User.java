package mock.testDouble;

import java.util.ArrayList;

public class User {
	private String name;
	private ArrayList<ICoupon> coupon;
	public User() {
		this.coupon = new ArrayList<ICoupon>();
	}
	public User(String name) {
		super();
		this.coupon = new ArrayList<ICoupon>();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalCouponCount() {
		return this.coupon.size();
	}
	public void addCoupon(ICoupon coupon) {
		this.coupon.add(coupon);
	}
	public ICoupon getLastOccupiedCoupon() {
		return this.coupon.get(this.coupon.size()-1);
	}
}
