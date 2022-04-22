package com.kh.ex01.generic;

public class GenericBasic {
	public static void main(String[] args) {
//  	Type을 정하지 않고 Object로 선언한 경우 문제점
//		1. 다른 Type이 들어올수 있어 항상 Type Check해야한다. -> instanceof 연산자 활용
//		2. 특정 Type을 항상 Casting 하여 사용하여야 한다.
//		 -> 그래서 제네릭 문법을 활용하면 둘다 컴파일러에서 해결해준다!
//		
//		Object[] array = new Object[10];
//		array[0] = new User("test", "홍길동", 21);
//		array[1] = "TEST는 홍길동입니다.";
//	
//		// 안죽는 문법
//		((User)array[0]).getName();
//		
//		// 죽는 문법
//		((User)array[1]).getName();
		
		// My Generic을 통한 배열 사용법
		MyGenericArray<User> userArray = new MyGenericArray<User>(10);
		userArray.add(new User("test1","홍길동",21));
		userArray.add(new User("test2","이길동",31));
		userArray.add(new User("test3","박길동",41));
		userArray.add(new User("test4","김길동",51));
//		userArray.add("TEST");
		
		User user = userArray.get(0);
		System.out.println(user.toString());
		System.out.println(userArray.get(1));
		System.out.println(userArray.get(2));
		System.out.println(userArray.get(3));
		
		// My Generic 상속 통한 문법1
		MyGenericArray<? super Number> numberArray = new MyGenericArray<>(10);
		numberArray.add(new Integer(4));
		numberArray.add(31); // Auto boxing
		numberArray.add(new Float(3.14f));
		numberArray.add(new Double(3.1412748917248927184));
//		numberArray.add("test"); 문자열 불가능!
		
		System.out.println(numberArray.get(0));
		System.out.println(numberArray.get(1));
		System.out.println(numberArray.get(2));
		System.out.println(numberArray.get(3));
		
		// My Generic 상속 통한 문법2 - 일반적인 문법
		MyGenericArray<Number> numberArray2 = new MyGenericArray<>(10);
		numberArray2.add(new Integer(4));
		numberArray2.add(31.14); // Auto boxing
		
		System.out.println(numberArray2.get(0));
		System.out.println(numberArray2.get(1));
	}
}