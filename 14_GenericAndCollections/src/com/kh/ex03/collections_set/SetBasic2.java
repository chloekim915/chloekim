package com.kh.ex03.collections_set;

import java.util.Set;
import java.util.TreeSet;

public class SetBasic2 {
	// 일반적으로 Set을 통해 데이터를 저장하기보다, List로 저장하고
	// Set으로 중복제거할때만 잠시 사용함.
	
	public static void main(String[] args) {
		Set<UserVO> set = new TreeSet<UserVO>();
		
		UserVO user = new UserVO("testID1", "김길동1", 21, 10000.123); // Primary Key
		set.add(user);
		set.add(new UserVO("testID1", "김길동1", 21, 10000.123));
		set.add(new UserVO("testID3", "김길동3", 23, 444000.123));
		set.add(new UserVO("testID2", "홍길동3", 41, 3300.123));
		set.add(new UserVO("testID2", "김길동2", 22, 10000.123));
		
		// 객체를 가지고 있는지 확인하는 법
		System.out.println(set.contains(user));
		System.out.println(set.contains(new UserVO("testID5", "김길동3", 21, 10000.123)));
		
		// 객체 삭제하는 방법
		set.remove(user);
		
		// 출력하는 법
		System.out.println(set);
	}
}
