package Practice;

import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		//Ű����� �Է� ���� �ϳ��� ������ ¦���̸� "¦����", ¦���� �ƴϸ� "Ȧ����"�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();

		System.out.println();
		if (num % 2 == 0) {
			System.out.println("¦����");
		} else {
			System.out.println("Ȧ����");
		}
	}
}
