package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book{
	private int accessAge; // 제한 나이

	public AniBook() {
		super();
	}

	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
	
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	public int getAccessAge() {
		return accessAge;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", accessAge=" + accessAge + "]";
	}


	
	
}
