package com.kh.practice.chap01.ControlPractice;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		
//	�� ������ ��� ���� �����ϳ�, 9�� �ʰ��ϴ� ���ڰ� �Էµƴٸ�
//	��9 ������ ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
//	Scanner sc = new Scanner(System.in);
//
//
//	System.out.print("���� : ");
//	int num1 = sc.nextInt();
//}
//

	Scanner sc = new Scanner(System.in);
	System.out.print("������ �ϳ� �Է��ϼ���: ");
	int sum = 0;
	int num = sc.nextInt();

	for (int i = 1; i < num ; i++) {
		System.out.print(i + " + ");
		sum = sum+i;
	}
	sum = num + sum;
	System.out.println(num + " = " + sum);

	sc.close();
	System.out.println("=============================");
}
}