package com.kh.ex03.collections_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetBasic {
	// TreeSet : 중복된 데이터를 허용하지 않고, 데이터가 정렬됨 ★★★
	//           -> Comparable을 사용하여 정렬, 중복도 제거
	// LinkedHashSet : Hash코드 기준으로 중복을 제거, 들어온 순서가 보존
	//			 -> hashCode()을 사용함
	// HashSet : Hash코드 기준으로 중복을 제거, 아무 순서도 보장되지 않음 -> 제일빠르다. ★
	//           -> hashCode()을 사용함
	
	public static void main(String[] args) {
		Set<UserVO> treeSet = new TreeSet<UserVO>();
		Set<UserVO> linkedHashSet = new LinkedHashSet<UserVO>();
		Set<UserVO> hashSet = new HashSet<UserVO>();
		
		ArrayList<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("testID1", "김길동1", 21, 10000.123));
		list.add(new UserVO("testID1", "김길동1", 21, 10000.123)); // 완전동일
		list.add(new UserVO("testID3", "김길동3", 23, 444000.123));
		list.add(new UserVO("testID2", "홍길동3", 41, 3300.123)); // ID 만 다름
		list.add(new UserVO("testID2", "김길동2", 22, 10000.123));
		
		// 1. set에 데이터 추가하는 방법
		treeSet.addAll(list);
		linkedHashSet.addAll((ArrayList<UserVO>)list.clone()); // 복사해서 넘기는 방법
		for(int i = 0; i < list.size(); i++) {
			hashSet.add(list.get(i));
		}
		
		// 2. 순회하는 법
		// 1) Iterator 사용 ★★★★★
		System.out.println("treeSet"); // 3개
		Iterator<UserVO> iterator = treeSet.iterator();
		while(iterator.hasNext()) { // hasNext : 다음에 데이터가 있는 경우 True
			UserVO data = iterator.next(); // next : 데이터를 가져오는 메소드
			System.out.println(data);
		}
		System.out.println("--------------------------------");
		
		// 2) List로 변환해서 출력하는 방법
		System.out.println("LinkedHashSet"); // 5 -> 4개
		List<UserVO> tempList = new ArrayList<>();
		tempList.addAll(linkedHashSet);
		for(UserVO user : tempList) {
			System.out.println(user);
		}
		System.out.println("--------------------------------");
		
		
		// 3) 함수형 프로그래밍 문법 
		System.out.println("HashSet"); // 5 -> 4개
		hashSet.forEach((value) -> System.out.println(value));
	}
}
