package com.kh.ex02.loop;

public class LoopStatement3_GuGuDan {
	public static void main(String[] args) {
		//1.2�� ������ ���� - �ܿ���
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < 10; j++) {
//				System.out.println(i + "x" + j + "=" + (i * j));
//			}
//		}
		
		//2.i�� j�� ����,���� �����ϸ鼭 �������� �ϼ���Ų��
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//				System.out.println(i + "x" + j + "=" + (i * j));
//			}
//		}
		
		//3.�ݺ��� ���� �Ʒ��� ������ �ִٴ� ����� �����غ���
		for(int i = 2; i < 10; i++) {
			System.out.println(i + "�� ����");
			System.out.println("-------------------------------");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j) + " ");
			}
			System.out.println("-------------------------------\n");
		}
	}
}
