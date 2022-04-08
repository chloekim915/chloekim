 package com.kh.ex05.method_test;

public class TestMethod {
	public static void main(String[] args) {
		MyObject test = new MyObject();
		
		//static method ���� = Class.(�޼ҵ��̸�)
		MyObject.staticMethod(); //static�� ��� �޼ҵ尡 ��Ż��ü�� �ٲ�, ǥ�� ����
		test.staticMethod(); //������ ��ü������ ������ �����ϳ� �������� ����
		
		//1���� ����
		test.singleParameter("�̱� �Ķ���� ����");
		
		//2���� ����
		test.multipelParameter(4, 5, "�� �����");
		
		//���ϰ� ���� ��
		int value = test.returnValue(9, 15);
		System.out.println(value);
	}

}

class MyObject{
	//static + �޼ҵ� : �ܺο��� �������� Ŭ���� �̸����� ���� �����ϴ�
	public static void staticMethod() {
		System.out.println("Call static method!");
	}
	
	//1���� ���� ���� ��
	public void singleParameter(String str) {
		System.out.println(str);
	}
	
	//2�� �̻��� ���� ���� ��
	protected void multipelParameter(int a, int b, String str) {
		System.out.println(a + b);
		System.out.println(str);
	}
	
	//��ȯ���� �ִ� �޼ҵ�
	int returnValue(int a, int b) {
		return a + b;
	}
}
