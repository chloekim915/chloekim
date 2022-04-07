package com.kh.ex03.run_object;

import com.kh.ex03.object_app.Person; //import를 통해 외부 객체만 사용하는 방법
import com.kh.ex03.object_app.*; //*은 와이들카드로, 해당 패키지에 존재하는 모든 Class Import

public class Run {
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.name); //"이름 없음" -> 생성자에서 설정한 초기값
		System.out.println(person.age);
		
		//멤버변수 접근
		person.name = "홍길동";
		System.out.println(person.name); //홍길동
		person.age = 20;
		System.out.println(person.age);
		person.pID = "00000-000000";
		System.out.println(person.pID);
		person.phoneNum = "010-0000-0000";
		System.out.println(person.phoneNum);
		System.out.println("--------------------------------------------");
		
		// setter. getter 접근 -> 메소드 접근
		person.setName("최길동");
		System.out.println(person.getName());
		person.setAge(22);
		System.out.println(person.getAge());
		System.out.println("--------------------------------------------");
		
		Person2 person2 = new Person2("김태은", 26, "010-0001-0001", "970915-1234567");
		System.out.println(person2.getName());
		System.out.println(person2.getAge());
		System.out.println(person2.toString());
		System.out.println("--------------------------------------------");
		person2.setPhoneNum("010-4000-0400");
		person2.setName("김김김");
//		person2.name = "김태김";
		System.out.println(person2.getName());
		System.out.println(person2.toString());
		
	}

}
