package com.kh.ex03.object_app;

//��ü��? ���� ����� �߻�ȭ�� ������!
public class Person {
	// ����� - ������� ���� �ϴ°�
	public String name; //�̸�
	public int age; //����
	public String phoneNum; //��ȭ��ȣ
	public String pID; //�ֹι�ȣ
	
	//�����ڶ�?
	//��ü�� �����ɶ� ȣ��Ǵ� Ư���� �޼ҵ�
	//��ü�� ���� �ʱ�ȭ�� ��Ű�ų� ������ ������� �ʱ�ȭ �޼ҵ带 ȣ���Ҷ� ���
	
	public Person() { //������
		name = "�̸� ����";
		age = 14;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
