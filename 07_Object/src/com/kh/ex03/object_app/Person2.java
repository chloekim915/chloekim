package com.kh.ex03.object_app;

public class Person2 {
	//Person의 제대로 된 버전
	//ValueObject : VO, 데이터만 있는 객체를 표현
	//VO객체에서는 멤버변수는 private로 접근 제한해야한다. -> 외부에서 직접 변수 접근 불가
	
	private String name; // 이름
	private int age; 	// 나이
	private String phoneNum; // 전화번호
	private String pID; 	 // 주민번호
	
	public Person2() { //생성자
		name = "이름 없음";
	}
	
	//인자있는 생성자를 만드는 방법 1. 지역변수=로컬변수의 이름을 일치시키지 않는 방법 
	//->현업에서는 쓰지 않는 방법  
//	public Person2(String _name, int _age, String _phoneNum, String _pID) {
//	// 생성할때 객체의 초기값을 입력받는 생성자
//	name = _name;
//	age = _age;
//	phoneNum = _phoneNum;
//	pID = _pID;
//}
	
	//인자있는 생성자를 만드는 방법 2. this 키워드를 통해 멤버변수 접근
	public Person2(String name, int age, String phoneNum, String pID) {
		//생성할때 객체의 초기값을 입력받는 생성자
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
		this.pID = pID;
	}
	
	// getter - 이름 - readOnly
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// setter - 전화번호 - 수정가능한 변수
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		String result = "";
		result += "이름 : " + name +"\n";
		result += "나이 : " + age +"\n";
		result += "전화번호 : " + phoneNum +"\n";
		result += "주민번호 : " + pID +"\n";
		return result;
	}
}
