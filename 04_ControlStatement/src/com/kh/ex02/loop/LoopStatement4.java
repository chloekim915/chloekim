package com.kh.ex02.loop;

public class LoopStatement4 {
	public static void main(String[] args) {
		//for�� ���� - 2�� �����ϱ�
		for(int i = 0; i < 20; i+=2) {
			System.out.println(i);
		}
		
		//for�� ���ǹ� �������ϰ� �ۼ��ϱ�
		for(int i = 0; ; i+=2) {
			System.out.println(i);
			if(i == 100) {
				break;
			}
			
		}System.out.println("��");
	}
}
