package com.kh.ex02.collections_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListBasic {
//	ArrayList - �ڡڡڡڡ� ��õ
//	 -> �ַ� ArrayList�� ����ϴµ�, ������ DB���� �����͸� ��� Ž�� �뵵�� ���� Ȱ����
//	- ���� : Ž���ӵ��� ������, �޸𸮸� ���� �����Ѵ�. 
//	- ���� : ����, ����, ������ ������. 

//	LinkedList
//	 -> ���� ���� ������ ������� ������ ������� ����... -> �̷� ��찡 ���� ���ų� �ٸ� �÷���(Map)�� �����
//	- ���� : ����, ����, ������ ������.
//	- ���� : Ž���ӵ��� ������, �޸𸮸� ���� �����Ѵ�.

//	Vector
//	-> Thread safe �Ҷ� ����ϳ�... �� ���� �÷����� ����. ���� �Ⱦ���.
	
	public static void main(String[] args) {
		// ��ü�迭 ����
		UserVO[] userArray = new UserVO[3];
		userArray[0] = new UserVO("testID1", "��浿", 23, 100000.123);
		userArray[1] = new UserVO("testID2", "ȫ�浿", 43, 200000.123);
		userArray[2] = new UserVO("testID3", "�ڱ浿", 53, 300000.123);
//		userArray[3] = new UserVO("testID4", "�ڱ浿", 53, 300000.123); �����߻�!
		
		// �迭�� ����
		// 1. �迭�� ũ�⸦ �����ؾ��ϰ�, ũ�Ⱑ �� Ŀ���� ���ο� �迭�� �����ϰ� ����������Ѵ�!
		// 2. �߰��� ������ ����/������ ��ƴ�. -> �ݵ�� �����͸� �޲���Ѵ�.
		// 3. ���絵 ��ư�, ����� �Ǽ��� ���Ҵ�.
		// ��� : ���α׷��Ӷ�� ������ ���� �޾Ҵ�.
		
		// List ����
		// 1. �ʱ�ȭ ����
		// - ����� Type�� List�ϴ� ���� �Ϲ����̴�.
		List<UserVO> list1 = new ArrayList<>(); 	  // 1. �ڿ� ���׸� ������ ������ ����
		List<UserVO> list2 = new ArrayList<UserVO>(); // 2. �����ڿ� ���׸� ������ ���� ���� ����
		List<UserVO> list3 = new LinkedList<>(); 	  // List�� ArrayList/LinkedList ȣȯ�����ϴ�.
	
		// 2. �迭(userArray) -> List�� ��ȯ�ϴ� ���
		// 1) asList Ȱ��
		List<UserVO> userList1 = new ArrayList<>(Arrays.asList(userArray)); // �ڡڡڡڡ� ��õ
		
		// 2) �������� �˰��� ���1
		List<UserVO> userList2 = new ArrayList<>();
		for(UserVO u : userArray) {
			userList2.add(u);
		}
		
		// 3) �������� �˰��� ���2
		List<UserVO> userList3 = new ArrayList<>();
		for(int i = 0; i < userArray.length; i++ ) {
			userList2.add(i, userArray[i]); // ���ʿ� index ���� ����.
		}
		
		// ���
		System.out.println(userList1);
		
		for(int i = 0; i < userList1.size(); i++) {
			System.out.println(userList1.get(i));
		}
		
		for(UserVO user : userList1 ) {
			System.out.println(user);
		}
	}
}
