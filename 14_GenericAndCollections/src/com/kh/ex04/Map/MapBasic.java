package com.kh.ex04.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapBasic {
	// Map
	// HashMap 		 : 순서보장 안되고, 제일 빠른 성능, 가장 많이 사용하는 Map. ★★★★★
	// LinkedHashMap : Key의 삽입순서 보장. ★★
	// TreeMap 		 : Key의 문자열로 정렬. ★★
	// HashTable 	 : HashMap Thread Safe Version ★ 
	//					현업에서 자주사용  -> ConcurrentHashMap ★★★
	// Key 기준으로만 중복확인함 -> Comparable, equals 필요 없음! 
	// Key - Value로 데이터가 구성되고 있고, Key는 주로 숫자나 문자 활용, Value는 객체를 활용

	
	public static void main(String[] args) {
		ArrayList<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("testID1", "김길동1", 21, 10000.123));
		list.add(new UserVO("testID1", "김길동1", 21, 10000.123)); // 완전동일
		list.add(new UserVO("testID3", "김길동3", 23, 444000.123));
		list.add(new UserVO("testID2", "홍길동3", 41, 3300.123)); // ID 만 다름
		list.add(new UserVO("testID2", "김길동2", 22, 10000.123));
		
		// 	  key    value
		Map<String, UserVO> hashMap = new HashMap<>();
		Map<String, UserVO> linkedHashMap = new LinkedHashMap<>();
		Map<String, UserVO> treeMap = new TreeMap<>();
		
		
		// 데이터 삽입하는 방법
		for(int i = 0; i < list.size(); i++) {
			String id = list.get(i).getId();
			UserVO user = list.get(i);
			hashMap.put(id, user);
//			hashMap.put(list.get(i).getId(), list.get(i));
		}
		
		for(UserVO user : list) {
			linkedHashMap.put(user.getId(), user);
		}
		
		list.forEach((user) -> treeMap.put(user.getId(), user)); // 최신 문법
		// 최신 문법 현업에서 잘 사용되지 않는다. 이유 : 현업자들이 잘 모른다...
		// 코드 리뷰에 모르는 문법이 있는 경우 코드리뷰가 잘 되지 않아 실수를 미리 방지하지 못함으로 
		// 적절한 문법 사용을 권장
		
		System.out.println("hashMap");
		System.out.println(hashMap);
		System.out.println(hashMap.keySet().size());
		System.out.println(hashMap.size());
		System.out.println(hashMap.get("testID2"));
		System.out.println();

		System.out.println("linkedHashMap");
		System.out.println(linkedHashMap);
		System.out.println(linkedHashMap.keySet().size());
		System.out.println(linkedHashMap.size());
		System.out.println(linkedHashMap.get("testID2"));
		System.out.println();
		
		System.out.println("treeMap");
		System.out.println(treeMap);
		System.out.println(treeMap.keySet().size());
		System.out.println(treeMap.size());
		System.out.println(treeMap.get("testID2"));
		System.out.println();
	}
}
