package Practice;

import java.util.Scanner;

public class p7 {
	public static void main(String[] args) {
		//����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է¹ް�, �� ���� ���� �հ�� ����� ���ϼ���.
		//�������� ������ ����� ������ �հ� ���θ� ó���ϴµ�, �� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ����ϼ���.
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int test1 = Integer.parseInt(sc.nextLine());

		System.out.print("���� : ");
		int test2 = Integer.parseInt(sc.nextLine());

		System.out.print("���� : ");
		int test3 = Integer.parseInt(sc.nextLine());
		int total = (test1 + test2 + test3);

		System.out.println();

		System.out.println("�հ� : " + total);

		System.out.println("��� : " + ((double)total)/3.0);

		if (test1 >= 40 && test2 >= 40 && test3 >= 40 && (((double)total)/3.0) >= 60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}

	}
}
