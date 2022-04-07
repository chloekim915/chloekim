package com.kh.ex03.object_app;

public class Person2 {
	//Person�� ����� �� ����
	//ValueObject : VO, �����͸� �ִ� ��ü�� ǥ��
	//VO��ü������ ��������� private�� ���� �����ؾ��Ѵ�. -> �ܺο��� ���� ���� ���� �Ұ�
	
	private String name; // �̸�
	private int age; 	// ����
	private String phoneNum; // ��ȭ��ȣ
	private String pID; 	 // �ֹι�ȣ
	
	public Person2() { //������
		name = "�̸� ����";
	}
	
	//�����ִ� �����ڸ� ����� ��� 1. ��������=���ú����� �̸��� ��ġ��Ű�� �ʴ� ��� 
	//->���������� ���� �ʴ� ���  
//	public Person2(String _name, int _age, String _phoneNum, String _pID) {
//	// �����Ҷ� ��ü�� �ʱⰪ�� �Է¹޴� ������
//	name = _name;
//	age = _age;
//	phoneNum = _phoneNum;
//	pID = _pID;
//}
	
	//�����ִ� �����ڸ� ����� ��� 2. this Ű���带 ���� ������� ����
	public Person2(String name, int age, String phoneNum, String pID) {
		//�����Ҷ� ��ü�� �ʱⰪ�� �Է¹޴� ������
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
		this.pID = pID;
	}
	
	// getter - �̸� - readOnly
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// setter - ��ȭ��ȣ - ���������� ����
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		String result = "";
		result += "�̸� : " + name +"\n";
		result += "���� : " + age +"\n";
		result += "��ȭ��ȣ : " + phoneNum +"\n";
		result += "�ֹι�ȣ : " + pID +"\n";
		return result;
	}
}
