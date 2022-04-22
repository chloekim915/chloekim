package com.kh.ex01.generic;

public class GenericBasic {
	public static void main(String[] args) {
//  	Type�� ������ �ʰ� Object�� ������ ��� ������
//		1. �ٸ� Type�� ���ü� �־� �׻� Type Check�ؾ��Ѵ�. -> instanceof ������ Ȱ��
//		2. Ư�� Type�� �׻� Casting �Ͽ� ����Ͽ��� �Ѵ�.
//		 -> �׷��� ���׸� ������ Ȱ���ϸ� �Ѵ� �����Ϸ����� �ذ����ش�!
//		
//		Object[] array = new Object[10];
//		array[0] = new User("test", "ȫ�浿", 21);
//		array[1] = "TEST�� ȫ�浿�Դϴ�.";
//	
//		// ���״� ����
//		((User)array[0]).getName();
//		
//		// �״� ����
//		((User)array[1]).getName();
		
		// My Generic�� ���� �迭 ����
		MyGenericArray<User> userArray = new MyGenericArray<User>(10);
		userArray.add(new User("test1","ȫ�浿",21));
		userArray.add(new User("test2","�̱浿",31));
		userArray.add(new User("test3","�ڱ浿",41));
		userArray.add(new User("test4","��浿",51));
//		userArray.add("TEST");
		
		User user = userArray.get(0);
		System.out.println(user.toString());
		System.out.println(userArray.get(1));
		System.out.println(userArray.get(2));
		System.out.println(userArray.get(3));
		
		// My Generic ��� ���� ����1
		MyGenericArray<? super Number> numberArray = new MyGenericArray<>(10);
		numberArray.add(new Integer(4));
		numberArray.add(31); // Auto boxing
		numberArray.add(new Float(3.14f));
		numberArray.add(new Double(3.1412748917248927184));
//		numberArray.add("test"); ���ڿ� �Ұ���!
		
		System.out.println(numberArray.get(0));
		System.out.println(numberArray.get(1));
		System.out.println(numberArray.get(2));
		System.out.println(numberArray.get(3));
		
		// My Generic ��� ���� ����2 - �Ϲ����� ����
		MyGenericArray<Number> numberArray2 = new MyGenericArray<>(10);
		numberArray2.add(new Integer(4));
		numberArray2.add(31.14); // Auto boxing
		
		System.out.println(numberArray2.get(0));
		System.out.println(numberArray2.get(1));
	}
}