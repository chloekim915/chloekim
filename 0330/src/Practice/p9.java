package Practice;

import java.util.Scanner;

public class p9 {
	public static void main(String[] args) {
		//Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
		//�׸��� �� �ٸ� ������ �Է¹޾� �� ���� num1���ϰų� num2�ʰ��̸� true�� ����ϰ� �ƴϸ� false�� ����ϼ���.
		//(��, num1�� num2���� �۾ƾ� ��)
		Scanner sc = new Scanner(System.in);

		System.out.print("����1 : ");
		int num1 = sc.nextInt();

		System.out.print("����2 : ");
		int num2 = sc.nextInt();

		System.out.print("�Է� : ");
		int num3 = sc.nextInt();

		System.out.println();

		if ((num1 < num2)) {
			if (num3 <= num1 || num3 > num2) {
				System.out.println("true");
			}
		} else {
			System.out.println("false");
		}
	}
}
