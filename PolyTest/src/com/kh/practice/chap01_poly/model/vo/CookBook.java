package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book {
	private boolean coupon; // 요리학원 쿠폰유무

	public CookBook(boolean coupon) {
		super();
		this.coupon = coupon;
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	
	public boolean isCoupon() {
		return coupon;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", coupon=" + coupon + "]";
	}
	
	
}

