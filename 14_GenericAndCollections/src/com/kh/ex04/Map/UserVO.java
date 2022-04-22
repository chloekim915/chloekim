package com.kh.ex04.Map;

import java.util.Objects;

// Comparable : 정렬이 가능하도록 만드는 Interface
public class UserVO implements Comparable<UserVO>{
	private String id;
	private String name;
	private int age;
	private double account; // 계좌 잔액;
	
	public UserVO() {
		super();
	}

	public UserVO(String id, String name, int age, double account) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.account = account;
	}

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

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", name=" + name + ", age=" + age + ", account=" + account + "]";
	}

//	@Override
//	public int compareTo(UserVO o) { // 객체 비교시의 알고리즘(우선순위, 순서)을 정하는 메소드
//		// id 기준으로 정렬하는 법 내림차순
//		return o.getId().compareTo(this.id); // compareTo : 작은거-1, 같은거0, 큰거+1
//	}
//	
	@Override
	public int compareTo(UserVO o) { // 객체 비교시의 알고리즘(우선순위, 순서)을 정하는 메소드
		// id 기준으로 정렬하는 법 오름차순
		return this.id.compareTo(o.getId()); // compareTo : 작은거-1, 같은거0, 큰거+1
	}

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

	
	
}
