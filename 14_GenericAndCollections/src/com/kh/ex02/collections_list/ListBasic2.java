package com.kh.ex02.collections_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListBasic2 {


	public static void main(String[] args) {
		// 데이터 생성 및 삽입하는 방법
		ArrayList<UserVO> list = new ArrayList<>();

		// 데이터 삽입하는 방법
		list.add(new UserVO("TestID3", "홍길순3", 44, 11110.1));
		list.add(new UserVO("TestID4", "홍길순4", 21, 143.1));
		list.add(new UserVO("TestID2", "홍길순2", 22, 100.1));
		list.add(new UserVO("TestID5", "홍길순5", 32, 4400.1));
		list.add(new UserVO("TestID1", "홍길순1", 25, 10550.1));
		list.add(new UserVO("TestID6", "홍길순", 28, 10550.1));
		list.add(new UserVO("TestID7", "홍길순", 21, 10550.1));
		list.add(new UserVO("TestID8", "홍길순", 25, 10550.1));
		print(list);
		
		// 특정 Index에 데이터를 삽입하는 방법
		list.add(0, new UserVO("TestID9", "홍길순9", 24, 103030));
		print(list);
		
		// 크기 확인하는 방법
		System.out.println(list.size());
		System.out.println("--------------------------");
		
		// 데이터 가져오는 방법
		UserVO user = list.get(3);
		System.out.println(user);
		System.out.println(list.get(3));
		System.out.println(list.get(3).getName());
		System.out.println("--------------------------");
		
		// 데이터 제거하는 방법
		UserVO user2 = list.remove(3);
		System.out.println("제거 된 User : " + user2);
		print(list);
		
		// 정렬하는 방법 ★★★★★

		System.out.println("정렬된 List");
	
		// 1. 객체에 Comparable 구현 필요
		//  - 단점 : 지정된 정렬 방법 외의 다른 정렬을 활용하기 어려움
		Collections.sort(list);
		print(list);
		
		// 2. Comparator를 직접 구현
	
		// 나이순 정렬
		list.sort(new Comparator<UserVO>() { // 익명클래스 선언법
			@Override
			public int compare(UserVO o1, UserVO o2) {
				return Integer.compare(o1.getAge(), o2.getAge()); // 오름 차순
//				return Integer.compare(o2.getAge(), o1.getAge()); // 내림 차순
			}
		});
		print(list);
		
		// 이름 - 나이순 정렬하는 법
		list.sort(new Comparator<UserVO>() { // 익명클래스 선언법
			@Override
			public int compare(UserVO o1, UserVO o2) {
				int result = o1.getName().compareTo(o2.getName());
				if(result == 0) {
					return Integer.compare(o1.getAge(), o2.getAge()); 
				}
				return result;
			}
		});
		print(list);
	}
	
	public static void print(List<UserVO> list) {
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		System.out.println("---------------------------");
	}

}