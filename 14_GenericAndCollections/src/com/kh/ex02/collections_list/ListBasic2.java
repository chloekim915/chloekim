package com.kh.ex02.collections_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListBasic2 {


	public static void main(String[] args) {
		// ������ ���� �� �����ϴ� ���
		ArrayList<UserVO> list = new ArrayList<>();

		// ������ �����ϴ� ���
		list.add(new UserVO("TestID3", "ȫ���3", 44, 11110.1));
		list.add(new UserVO("TestID4", "ȫ���4", 21, 143.1));
		list.add(new UserVO("TestID2", "ȫ���2", 22, 100.1));
		list.add(new UserVO("TestID5", "ȫ���5", 32, 4400.1));
		list.add(new UserVO("TestID1", "ȫ���1", 25, 10550.1));
		list.add(new UserVO("TestID6", "ȫ���", 28, 10550.1));
		list.add(new UserVO("TestID7", "ȫ���", 21, 10550.1));
		list.add(new UserVO("TestID8", "ȫ���", 25, 10550.1));
		print(list);
		
		// Ư�� Index�� �����͸� �����ϴ� ���
		list.add(0, new UserVO("TestID9", "ȫ���9", 24, 103030));
		print(list);
		
		// ũ�� Ȯ���ϴ� ���
		System.out.println(list.size());
		System.out.println("--------------------------");
		
		// ������ �������� ���
		UserVO user = list.get(3);
		System.out.println(user);
		System.out.println(list.get(3));
		System.out.println(list.get(3).getName());
		System.out.println("--------------------------");
		
		// ������ �����ϴ� ���
		UserVO user2 = list.remove(3);
		System.out.println("���� �� User : " + user2);
		print(list);
		
		// �����ϴ� ��� �ڡڡڡڡ�

		System.out.println("���ĵ� List");
	
		// 1. ��ü�� Comparable ���� �ʿ�
		//  - ���� : ������ ���� ��� ���� �ٸ� ������ Ȱ���ϱ� �����
		Collections.sort(list);
		print(list);
		
		// 2. Comparator�� ���� ����
	
		// ���̼� ����
		list.sort(new Comparator<UserVO>() { // �͸�Ŭ���� �����
			@Override
			public int compare(UserVO o1, UserVO o2) {
				return Integer.compare(o1.getAge(), o2.getAge()); // ���� ����
//				return Integer.compare(o2.getAge(), o1.getAge()); // ���� ����
			}
		});
		print(list);
		
		// �̸� - ���̼� �����ϴ� ��
		list.sort(new Comparator<UserVO>() { // �͸�Ŭ���� �����
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