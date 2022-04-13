package com.kh.ex01.basic_inherit;

import java.util.Date;

public class BasicInherit { //extends Object가 생략되어 있음
	//현재까지 모든 코드는 Object를 상속받은 클래스이며, Object 상속은 생략 가능한 문법
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new String("안녕?");
		Object obj3 = new Date();
		Object obj4 = new BasicInherit();
		
		//Class의 이름을 출력하는 방법
		System.out.println(obj1.getClass().getName());
		System.out.println(obj2.getClass().getName());
		System.out.println(obj3.getClass().getName());
		System.out.println(obj4.getClass().getName());
		
		//Class의 조상을 알아보는 방법
		System.out.println(obj1.getClass().getSuperclass()); //null : 부모가 없음.시조니
		System.out.println(obj2.getClass().getSuperclass());
		System.out.println(obj3.getClass().getSuperclass());
		System.out.println(obj4.getClass().getSuperclass());
	}

}
