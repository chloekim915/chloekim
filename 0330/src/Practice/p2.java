package Practice;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		//Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����", ����� �ƴ� ��� �߿��� 0�̸� "0�̴�", 0�� �ƴϸ� "������"�� ����ϼ���.
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		System.out.println();

		System.out.println((num == 0? "0�̴�" : (num > 0 ? "�����" : "������")));	

	}
}

