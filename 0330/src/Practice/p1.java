package Practice;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���
		Scanner sc = new Scanner(System.in);

		System.out.println("���� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		//	System.out.println(new Scanner(Systemin).nextLine());

		if (num1 > 0) {
			System.out.println("�����");
		} else {
			System.out.println("����� �ƴϴ�");
		}		
	}
}
