package com.kh.ex05.clone;

import java.util.Objects;

// 클론 만들때 Cloneable 선언 필요
public class UserVO implements Comparable<UserVO>, Cloneable {
	
	private String id;
	private String name;
	private int age;
	private double account; // 계좌 잔액;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getAccount() {
		return account;
	}
	public void setAccount(double account) {
		this.account = account;
	}
	
	public UserVO(String id, String name, int age, double account) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.account = account;
	}
	
	public UserVO() {
		super();
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", name=" + name + ", age=" + age + ", account=" + account + "]";
	}
	
	@Override
	public int compareTo(UserVO o) { // 객채에 순서를 정해는 메소드
		// id 기준으로 정렬
		return o.getId().compareTo(this.getId()); // -1 작은거,  0 = 같은거,  +1 높은거
	}
//	@Override
//	public int compareTo(UserVO o) { // 객채에 순서를 정해는 메소드
//		// id 기준으로 정렬
//		return this.getId().compareTo(o.getId()); // -1 작은거,  0 = 같은거,  +1 높은거
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(account, age, id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserVO other = (UserVO) obj;
		return Double.doubleToLongBits(account) == Double.doubleToLongBits(other.account) && age == other.age
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	// clone 만드는 법
	@Override
	public UserVO clone(){
		try {
			return (UserVO)super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}