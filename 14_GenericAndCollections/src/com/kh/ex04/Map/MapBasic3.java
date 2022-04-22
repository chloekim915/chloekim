package com.kh.ex04.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapBasic3 {
	public static void main(String[] args) {
		// ID가 중복이 되어도 HashMap으로 유지하는 방법
		
		ArrayList<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("testID1", "김길동1", 21, 10000.123));
		list.add(new UserVO("testID1", "황길동2", 31, 10000.123)); 
		list.add(new UserVO("testID1", "충길동3", 51, 10000.123)); 
		list.add(new UserVO("testID2", "홍길동1", 61, 3300.123)); 
		list.add(new UserVO("testID2", "고길동2", 32, 10000.123));
		list.add(new UserVO("testID2", "박길동3", 22, 10000.123));
		list.add(new UserVO("testID3", "이길동1", 13, 444000.123));
		list.add(new UserVO("testID3", "김길동2", 23, 444000.123));
		list.add(new UserVO("testID3", "홍길동3", 33, 444000.123));

		// 2가지 방법
		// 1. ID + 다른 데이터를 결합하여 Key로 사용 -> 꼼수에 가까움 NG
		// 2. Map + List를 결합하는 방법 ★★★
		
		Map<String, List<UserVO>> listMap = new HashMap<>();
		
		for(UserVO item : list) {
			String key = item.getId(); 
			
			if(listMap.containsKey(key) == false) { // List가 존재하지 않는 경우
				ArrayList<UserVO> tempList = new ArrayList<UserVO>();
				listMap.put(key, tempList);
			}	
			
			listMap.get(key).add(item);
		}
		
		//"testID2" 모두출력
		System.out.println("-------testID2--------");
		List<UserVO> printList = listMap.get("testID2");
		printList.forEach((item) -> System.out.println(item));
		System.out.println("--------------------");
		
		for(UserVO item : printList) {
			System.out.println(item);
		}
		System.out.println("---------------------------");
		System.out.println(listMap);
		
//		{testID3=[UserVO [id=testID3, name=이길동1, age=13, account=444000.123], 
//		          UserVO [id=testID3, name=김길동2, age=23, account=444000.123], 
//		          UserVO [id=testID3, name=홍길동3, age=33, account=444000.123]], 
//		testID1=[UserVO [id=testID1, name=김길동1, age=21, account=10000.123], 
//		         UserVO [id=testID1, name=황길동2, age=31, account=10000.123], 
//		         UserVO [id=testID1, name=충길동3, age=51, account=10000.123]], 
//		testID2=[UserVO [id=testID2, name=홍길동1, age=61, account=3300.123], 
//		         UserVO [id=testID2, name=고길동2, age=32, account=10000.123], 
//		         UserVO [id=testID2, name=박길동3, age=22, account=10000.123]]}
	}

}