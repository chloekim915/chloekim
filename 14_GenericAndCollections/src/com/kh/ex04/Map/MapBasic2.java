package com.kh.ex04.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapBasic2 {
	public static void main(String[] args) {
		ArrayList<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("testID1", "��浿1", 21, 10000.123));
		list.add(new UserVO("testID1", "��浿1", 21, 10000.123)); // ��������
		list.add(new UserVO("testID3", "��浿3", 23, 444000.123));
		list.add(new UserVO("testID2", "ȫ�浿3", 41, 3300.123)); // ID �� �ٸ�
		list.add(new UserVO("testID2", "��浿2", 22, 10000.123));
		
		//   Key    Value
		Map<String, UserVO> hashMap = new HashMap<>();
		
		// 1. ������ �����ϴ� ���
		for(UserVO user : list) {
			hashMap.put(user.getId(), user); // �Ϲ����� ������ ���Թ� : put
			
//			UserVO user2 = hashMap.putIfAbsent(user.getId(), user); // key���� ������ ����ϴ� �޼ҵ�
//			if(user2 == null) {
//				System.out.println("Key�� ����!");
//			}
			//- Key ���� �����ϴ� ��� Map�� Value�� ���� ��ȯ�ϰ�, 
			//  Key���� �������� �ʴ� ��� Key�� Value�� Map�� �����ϰ� Null�� ��ȯ�մϴ�.
		}
		System.out.println(hashMap.toString().replace("],", "],\n")); // �����뵵 
		
		// 2. ��ȸ�ϴ� ���
		Set<String> keySet = hashMap.keySet(); // Ű�� �̷��� Set
		Iterator<String> iter = keySet.iterator();
//		Iterator<String> iterator = hashMap.keySet().iterator();

		System.out.println(hashMap.get("test!!")); // ������ null�� ��ȯ��
		while(iter.hasNext()) {
//			System.out.println(hashMap.get(iter.next()));

			String key = iter.next();
//			System.out.println(hashMap.get(key)); // ������ null�� ��ȯ��
			System.out.println(hashMap.getOrDefault(key, new UserVO()));
			// ã�� key�� �����ϸ� �ش� key�� ���εǾ� �ִ� ���� ��ȯ�ϰ�, �׷��� ������ ����Ʈ ���� ��ȯ�˴ϴ�.
		}
	
		ArrayList<String> list2 = new ArrayList<String>(keySet);
		for(String key : list2) {
			System.out.println(hashMap.get(key));
		}
		
		// 3. �����͸� �߰��ϰ� �ߺ��� ������ Ȯ���ϰ� �ߺ����� ������ Map�� ������ �ִ� �ڵ�
		list.add(new UserVO("testID4", "��浿4", 32, 40.123));
		list.add(new UserVO("testID5", "ȫ�浿5", 23, 300.123)); 
//		System.out.println(list);
		System.out.println("-------------------");
		
		for(UserVO user : list) {
			String key = user.getId();
			
			// �ߺ��� ���̵� �ִ��� ���� �ڵ�
			if(hashMap.containsKey(key) == true) {
				System.out.println();
				// �ߺ��� ���!
				System.out.println("ID �ߺ��Ǿ����ϴ�." + key);
				if(user.equals(hashMap.get(key))) { // ��ü�� ��
					// ��ü�� ���� ���
					System.out.println("����� ������ ��ġ�մϴ�.");
					System.out.println(user);
				} else {
					// ID�� �������
					System.out.println("ID�� ��ġ�ϰ� ����� ������ ��ġ���� �ʽ��ϴ�.");
					System.out.println(user);
				}
			} else {
				// �ߺ����� ���� ���
				hashMap.put(key, user);
				System.out.println("�ߺ��� ID�� �����ϴ�.");
				System.out.println(user);
			}
		}
		
		System.out.println(hashMap.toString().replace("],", "],\n")); // �����뵵 
		
		
		// �����ϱ�
		System.out.println("-----------�����ϱ�------------");
		hashMap.remove("testID1");
		System.out.println(hashMap.get("testID1"));

		System.out.println("-----------�����ϱ�------------");
		System.out.println(hashMap.get("testID2").getName());
		hashMap.get("testID2").setName("ȫ���777");
		System.out.println(hashMap.get("testID2").getName());
		
		// ���� �ٲٴ� ���
		hashMap.replace("testID2", new UserVO("testID2", "Ȳ���", 32, 444123));
		hashMap.put("testID2", new UserVO("testID2", "Ȳ���", 32, 444123));
		System.out.println(hashMap.get("testID2"));
		
		// ������ ��� �����ϱ�.
		System.out.println("-----------clear------------");
		hashMap.clear();
		System.out.println(hashMap);
		
		
	}
}
