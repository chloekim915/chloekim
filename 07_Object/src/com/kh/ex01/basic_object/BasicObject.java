package com.kh.ex01.basic_object;

public class BasicObject {

//		Object��? 
//		��� Class�� ����(�θ�)�� Ŭ����
//		��� ��ü�� Type�� ��ü�� �� �ִ� Type
//		Class = ��ü = ���������� Type
		
	public static void main(String[] args) {
		Object object = new Object(); 
		System.out.println(object.toString());
		
		Object object2 = new String("Test"); // String�� Type�� Object�� ��ü�� �� �ִ� �����String�̾���
		String str = "Test";
		
		System.out.println(str.length()); // String�� length�޼ҵ� ȣ����
//		System.out.println(object2.legnth()); �ȵǴ� ���� why? Object Type���� ������ ���� ���� �޼ҵ�
		System.out.println(((String)object2).length()); // Type casting����
		
		System.out.println(object2.toString()); // toString�� Object�� �޼ҵ������� ȣ�Ⱑ��
		System.out.println((((String)object2).toString())); //�ڽ��� toString�� ȣ���ϴ� ���
		
	}
}
