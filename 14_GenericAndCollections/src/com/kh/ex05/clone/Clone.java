package com.kh.ex05.clone;


public class Clone {
	// ��ü �����ϴ� ���
	public static void main(String[] args) {
		UserVO user1 = new UserVO("testID1", "��浿1", 21, 10000.123);
		UserVO user2 = new UserVO("testID2", "��浿2", 22, 10000.123);
		
		// 1. �������� ��� �ڡڡ�
		UserVO user1copy = new UserVO(); // ������ �ʱ�ȭ
		user1copy.setId(user1.getId());
		user1copy.setName(user1.getName());
		user1copy.setAge(user1.getAge());
		user1copy.setAccount(user1.getAccount());
		System.out.println(user1copy == user1);
		System.out.println(user1copy.equals(user1));
		user1copy.setName("ȫ�浿777");
		System.out.println(user1);
		System.out.println(user1copy);
		
		// 2. clone�� ��Ӹ� �ϴ� ��� �ڡڡ�
//		UserVO user2copy = null;
//		try {
//			user2copy = (UserVO) user2.clone();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
		
		// 3. Clone�� ����ϰ� ���������� ���� ó���ϴ� ��� �ڡڡڡڡ�
		//    ������ : Ŭ�� ���鶧 Cloneable ��ü�� ���� �ʿ�
		UserVO user2copy = null;
		user2copy = user2.clone();
		
		System.out.println(user2copy.equals(user2));
		user2copy.setName("ȫ�浿777");
		System.out.println(user2);
		System.out.println(user2copy);
	}
}
