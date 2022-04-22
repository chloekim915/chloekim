package com.kh.ex02.collections_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListBasic {
//	ArrayList - ★★★★★ 추천
//	 -> 주로 ArrayList를 사용하는데, 이유는 DB에서 데이터를 담고 탐색 용도로 많이 활용함
//	- 장점 : 탐색속도가 빠르고, 메모리를 적게 차지한다. 
//	- 단점 : 삽입, 삭제, 수정이 느리다. 

//	LinkedList
//	 -> 굳이 삽입 삭제가 빈번하지 않으면 사용하지 않음... -> 이럴 경우가 많이 없거나 다른 컬랙션(Map)을 사용함
//	- 장점 : 삽입, 삭제, 수정이 빠르다.
//	- 단점 : 탐색속도가 느리고, 메모리를 많이 차지한다.

//	Vector
//	-> Thread safe 할때 사용하나... 더 좋은 컬랙션이 많다. 굳이 안쓴다.
	
	public static void main(String[] args) {
		// 객체배열 문법
		UserVO[] userArray = new UserVO[3];
		userArray[0] = new UserVO("testID1", "김길동", 23, 100000.123);
		userArray[1] = new UserVO("testID2", "홍길동", 43, 200000.123);
		userArray[2] = new UserVO("testID3", "박길동", 53, 300000.123);
//		userArray[3] = new UserVO("testID4", "박길동", 53, 300000.123); 에러발생!
		
		// 배열의 단점
		// 1. 배열의 크기를 지정해야하고, 크기가 더 커지면 새로운 배열을 생성하고 복사해줘야한다!
		// 2. 중간에 데이터 삽입/삭제가 어렵다. -> 반드시 빈데이터를 메꿔야한다.
		// 3. 복사도 어렵고, 사용자 실수가 많았다.
		// 결론 : 프로그래머라면 누구나 고통 받았다.
		
		// List 사용법
		// 1. 초기화 문법
		// - 선언시 Type은 List하는 것이 일반적이다.
		List<UserVO> list1 = new ArrayList<>(); 	  // 1. 뒤에 제네릭 문법을 생략한 버전
		List<UserVO> list2 = new ArrayList<UserVO>(); // 2. 생성자에 제네릭 문법을 생략 안한 버전
		List<UserVO> list3 = new LinkedList<>(); 	  // List는 ArrayList/LinkedList 호환가능하다.
	
		// 2. 배열(userArray) -> List로 변환하는 방법
		// 1) asList 활용
		List<UserVO> userList1 = new ArrayList<>(Arrays.asList(userArray)); // ★★★★★ 추천
		
		// 2) 고전적인 알고리즘 방법1
		List<UserVO> userList2 = new ArrayList<>();
		for(UserVO u : userArray) {
			userList2.add(u);
		}
		
		// 3) 고전적인 알고리즘 방법2
		List<UserVO> userList3 = new ArrayList<>();
		for(int i = 0; i < userArray.length; i++ ) {
			userList2.add(i, userArray[i]); // 앞쪽에 index 지정 가능.
		}
		
		// 출력
		System.out.println(userList1);
		
		for(int i = 0; i < userList1.size(); i++) {
			System.out.println(userList1.get(i));
		}
		
		for(UserVO user : userList1 ) {
			System.out.println(user);
		}
	}
}
