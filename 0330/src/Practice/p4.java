package Practice;

import java.util.Scanner;

public class p4 {
	public static void main(String[] args) {
		//��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް� 1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
		Scanner sc = new Scanner(System.in);

		System.out.print("�ο� �� : ");
		int num = Integer.parseInt(sc.nextLine());

		System.out.print("���� ���� : ");
		int num1 = Integer.parseInt(sc.nextLine());

		System.out.println();

		System.out.println("1�δ� ���� ���� : "+ (num1 / num));
		System.out.println("���� ���� ���� : " + (num1 % num));
	}
}
