package com.kh.ex03.object_app;

//객체란? 현실 대상을 추상화한 데이터!
public class Person {
	// 선언부 - 멤버변수 선언 하는곳
	public String name; //이름
	public int age; //나이
	public String phoneNum; //전화번호
	public String pID; //주민번호
	
	//생성자란?
	//객체가 생성될때 호출되는 특별한 메소드
	//객체에 생성 초기화를 시키거나 생성시 사용자의 초기화 메소드를 호출할때 사용
	
	public Person() { //생성자
		name = "이름 없음";
		age = 14;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
