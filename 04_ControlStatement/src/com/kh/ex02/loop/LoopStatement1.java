package com.kh.ex02.loop;

public class LoopStatement1 {
	public static void myFirstWhileLoop() {
		while(true) {
			System.out.println("���� ����");
		}
	}
	
	public static void testWhileLoop() {
		int i = 0;
		while(i < 10) {
			System.out.println(i++);
		}
		System.out.println("���� ��");
		//while�� ���ѷ��� �Ǵ� ���� �������� ���� ���̽����� ���ȴ�.
		while(true) {
			i++;
			if(i > 50) {
				break;
			}
		}
	}
	
	public static void testDoWhileLoop() {
		//�߾Ⱦ���
		int i = 0;
		do {
			System.out.println(i++); //0 1 2 3 4 5 6 7 8 9 ���� ��
		} while(i < 10);
		System.out.println("���� ��");
	}
	
	public static void testForLoop() {
		//�Ʒ����� �ܿﶧ���� ��� �ĺ���
		//������ ���� ���� ����� �ݺ��� ����
		//0~9, 10�� �������� ����
		for(int i = 0; i < 10 ; i++) {
			System.out.println(i);
		}
		System.out.println("���� ��");
		
		//1~10���� ���� ������� �� ��
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("���� ��");
		
		//�� ��� �̰� ��õ
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1); //i+1�ָ�
		}
		System.out.println("���� ��");
	}
	
	public static void main(String[] args) {
//		myFirstWhileLoop();
//		testWhileLoop();
//		testDoWhileLoop();
		testForLoop();
		
	}
}
