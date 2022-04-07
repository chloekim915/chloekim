package com.kh.ex03.run_object;

import com.kh.ex03.object_app.Person; //import�� ���� �ܺ� ��ü�� ����ϴ� ���
import com.kh.ex03.object_app.*; //*�� ���̵�ī���, �ش� ��Ű���� �����ϴ� ��� Class Import

public class Run {
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.name); //"�̸� ����" -> �����ڿ��� ������ �ʱⰪ
		System.out.println(person.age);
		
		//������� ����
		person.name = "ȫ�浿";
		System.out.println(person.name); //ȫ�浿
		person.age = 20;
		System.out.println(person.age);
		person.pID = "00000-000000";
		System.out.println(person.pID);
		person.phoneNum = "010-0000-0000";
		System.out.println(person.phoneNum);
		System.out.println("--------------------------------------------");
		
		// setter. getter ���� -> �޼ҵ� ����
		person.setName("�ֱ浿");
		System.out.println(person.getName());
		person.setAge(22);
		System.out.println(person.getAge());
		System.out.println("--------------------------------------------");
		
		Person2 person2 = new Person2("������", 26, "010-0001-0001", "970915-1234567");
		System.out.println(person2.getName());
		System.out.println(person2.getAge());
		System.out.println(person2.toString());
		System.out.println("--------------------------------------------");
		person2.setPhoneNum("010-4000-0400");
		person2.setName("����");
//		person2.name = "���±�";
		System.out.println(person2.getName());
		System.out.println(person2.toString());
		
	}

}
