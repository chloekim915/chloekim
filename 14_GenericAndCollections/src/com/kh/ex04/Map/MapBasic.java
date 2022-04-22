package com.kh.ex04.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapBasic {
	// Map
	// HashMap 		 : �������� �ȵǰ�, ���� ���� ����, ���� ���� ����ϴ� Map. �ڡڡڡڡ�
	// LinkedHashMap : Key�� ���Լ��� ����. �ڡ�
	// TreeMap 		 : Key�� ���ڿ��� ����. �ڡ�
	// HashTable 	 : HashMap Thread Safe Version �� 
	//					�������� ���ֻ��  -> ConcurrentHashMap �ڡڡ�
	// Key �������θ� �ߺ�Ȯ���� -> Comparable, equals �ʿ� ����! 
	// Key - Value�� �����Ͱ� �����ǰ� �ְ�, Key�� �ַ� ���ڳ� ���� Ȱ��, Value�� ��ü�� Ȱ��

	
	public static void main(String[] args) {
		ArrayList<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("testID1", "��浿1", 21, 10000.123));
		list.add(new UserVO("testID1", "��浿1", 21, 10000.123)); // ��������
		list.add(new UserVO("testID3", "��浿3", 23, 444000.123));
		list.add(new UserVO("testID2", "ȫ�浿3", 41, 3300.123)); // ID �� �ٸ�
		list.add(new UserVO("testID2", "��浿2", 22, 10000.123));
		
		// 	  key    value
		Map<String, UserVO> hashMap = new HashMap<>();
		Map<String, UserVO> linkedHashMap = new LinkedHashMap<>();
		Map<String, UserVO> treeMap = new TreeMap<>();
		
		
		// ������ �����ϴ� ���
		for(int i = 0; i < list.size(); i++) {
			String id = list.get(i).getId();
			UserVO user = list.get(i);
			hashMap.put(id, user);
//			hashMap.put(list.get(i).getId(), list.get(i));
		}
		
		for(UserVO user : list) {
			linkedHashMap.put(user.getId(), user);
		}
		
		list.forEach((user) -> treeMap.put(user.getId(), user)); // �ֽ� ����
		// �ֽ� ���� �������� �� ������ �ʴ´�. ���� : �����ڵ��� �� �𸥴�...
		// �ڵ� ���信 �𸣴� ������ �ִ� ��� �ڵ帮�䰡 �� ���� �ʾ� �Ǽ��� �̸� �������� �������� 
		// ������ ���� ����� ����
		
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
