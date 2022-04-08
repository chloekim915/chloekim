 package com.kh.ex05.method_test;

public class TestMethod {
	public static void main(String[] args) {
		MyObject test = new MyObject();
		
		//static method 사용법 = Class.(메소드이름)
		MyObject.staticMethod(); //static일 경우 메소드가 이탈릭체로 바뀜, 표준 사용법
		test.staticMethod(); //생성된 객체에서도 접근은 가능하나 권장하지 않음
		
		//1개의 인자
		test.singleParameter("싱글 파라메터 시험");
		
		//2개의 인자
		test.multipelParameter(4, 5, "아 배고파");
		
		//리턴값 받을 때
		int value = test.returnValue(9, 15);
		System.out.println(value);
	}

}

class MyObject{
	//static + 메소드 : 외부에서 생성없이 클래스 이름으로 접근 가능하다
	public static void staticMethod() {
		System.out.println("Call static method!");
	}
	
	//1개의 인자 받을 때
	public void singleParameter(String str) {
		System.out.println(str);
	}
	
	//2개 이상의 인자 받을 때
	protected void multipelParameter(int a, int b, String str) {
		System.out.println(a + b);
		System.out.println(str);
	}
	
	//반환값이 있는 메소드
	int returnValue(int a, int b) {
		return a + b;
	}
}
