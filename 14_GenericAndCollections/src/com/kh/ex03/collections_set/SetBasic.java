package com.kh.ex03.collections_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetBasic {
	// TreeSet : �ߺ��� �����͸� ������� �ʰ�, �����Ͱ� ���ĵ� �ڡڡ�
	//           -> Comparable�� ����Ͽ� ����, �ߺ��� ����
	// LinkedHashSet : Hash�ڵ� �������� �ߺ��� ����, ���� ������ ����
	//			 -> hashCode()�� �����
	// HashSet : Hash�ڵ� �������� �ߺ��� ����, �ƹ� ������ ������� ���� -> ���Ϻ�����. ��
	//           -> hashCode()�� �����
	
	public static void main(String[] args) {
		Set<UserVO> treeSet = new TreeSet<UserVO>();
		Set<UserVO> linkedHashSet = new LinkedHashSet<UserVO>();
		Set<UserVO> hashSet = new HashSet<UserVO>();
		
		ArrayList<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("testID1", "��浿1", 21, 10000.123));
		list.add(new UserVO("testID1", "��浿1", 21, 10000.123)); // ��������
		list.add(new UserVO("testID3", "��浿3", 23, 444000.123));
		list.add(new UserVO("testID2", "ȫ�浿3", 41, 3300.123)); // ID �� �ٸ�
		list.add(new UserVO("testID2", "��浿2", 22, 10000.123));
		
		// 1. set�� ������ �߰��ϴ� ���
		treeSet.addAll(list);
		linkedHashSet.addAll((ArrayList<UserVO>)list.clone()); // �����ؼ� �ѱ�� ���
		for(int i = 0; i < list.size(); i++) {
			hashSet.add(list.get(i));
		}
		
		// 2. ��ȸ�ϴ� ��
		// 1) Iterator ��� �ڡڡڡڡ�
		System.out.println("treeSet"); // 3��
		Iterator<UserVO> iterator = treeSet.iterator();
		while(iterator.hasNext()) { // hasNext : ������ �����Ͱ� �ִ� ��� True
			UserVO data = iterator.next(); // next : �����͸� �������� �޼ҵ�
			System.out.println(data);
		}
		System.out.println("--------------------------------");
		
		// 2) List�� ��ȯ�ؼ� ����ϴ� ���
		System.out.println("LinkedHashSet"); // 5 -> 4��
		List<UserVO> tempList = new ArrayList<>();
		tempList.addAll(linkedHashSet);
		for(UserVO user : tempList) {
			System.out.println(user);
		}
		System.out.println("--------------------------------");
		
		
		// 3) �Լ��� ���α׷��� ���� 
		System.out.println("HashSet"); // 5 -> 4��
		hashSet.forEach((value) -> System.out.println(value));
	}
}
