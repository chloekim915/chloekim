package com.kh.ex05.clone;


public class Clone {
	// 객체 복사하는 방법
	public static void main(String[] args) {
		UserVO user1 = new UserVO("testID1", "김길동1", 21, 10000.123);
		UserVO user2 = new UserVO("testID2", "김길동2", 22, 10000.123);
		
		// 1. 전통적인 방법 ★★★
		UserVO user1copy = new UserVO(); // 생성자 초기화
		user1copy.setId(user1.getId());
		user1copy.setName(user1.getName());
		user1copy.setAge(user1.getAge());
		user1copy.setAccount(user1.getAccount());
		System.out.println(user1copy == user1);
		System.out.println(user1copy.equals(user1));
		user1copy.setName("홍길동777");
		System.out.println(user1);
		System.out.println(user1copy);
		
		// 2. clone을 상속만 하는 방법 ★★★
//		UserVO user2copy = null;
//		try {
//			user2copy = (UserVO) user2.clone();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
		
		// 3. Clone을 상속하고 내부적으로 예외 처리하는 방법 ★★★★★
		//    ※주의 : 클론 만들때 Cloneable 객체에 구현 필요
		UserVO user2copy = null;
		user2copy = user2.clone();
		
		System.out.println(user2copy.equals(user2));
		user2copy.setName("홍길동777");
		System.out.println(user2);
		System.out.println(user2copy);
	}
}
