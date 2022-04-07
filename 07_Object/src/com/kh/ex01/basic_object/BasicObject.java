package com.kh.ex01.basic_object;

public class BasicObject {

//		Object란? 
//		모든 Class의 조상(부모)인 클래스
//		모든 객체의 Type을 대체할 수 있는 Type
//		Class = 객체 = 변수에서는 Type
		
	public static void main(String[] args) {
		Object object = new Object(); 
		System.out.println(object.toString());
		
		Object object2 = new String("Test"); // String의 Type을 Object로 대체할 수 있다 사실은String이었다
		String str = "Test";
		
		System.out.println(str.length()); // String의 length메소드 호출방법
//		System.out.println(object2.legnth()); 안되는 문장 why? Object Type에서 가지고 있지 않은 메소드
		System.out.println(((String)object2).length()); // Type casting문법
		
		System.out.println(object2.toString()); // toString은 Object의 메소드임으로 호출가능
		System.out.println((((String)object2).toString())); //자신의 toString을 호출하는 방법
		
	}
}
