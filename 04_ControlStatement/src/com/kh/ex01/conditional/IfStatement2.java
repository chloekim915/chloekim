package com.kh.ex01.conditional;

import java.util.Scanner;

public class IfStatement2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int value = sc.nextInt();
		
		if (value > 0) {
			System.out.println("����Դϴ�");
		} else if (value == 0) {
			System.out.println("0 �Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		
		//100, 1000, 10000���� �۰ų�, 10000���� ū ��
		if(value < 100) {
			System.out.println("100���� �۽��ϴ�");
		} else if(value < 1000) {
			System.out.println("1000���� �۽��ϴ�");
		} else if(value < 10000) {
			System.out.println("10000���� �۽��ϴ�");
		} else { // (value > 10000)
			System.out.println("10000���� Ů�ϴ�");
		}
		
	}
}
