package Practice;

import java.util.Scanner;

public class p10 {
	public static void main(String[] args) {
		//3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���.
		Scanner sc = new Scanner(System.in);

		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();

		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();

		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();

		System.out.println();

		if (num1 == num2 && num2 == num3 & num1 == num3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
