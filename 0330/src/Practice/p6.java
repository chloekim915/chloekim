package Practice;

import java.util.Scanner;

public class p6 {
	public static void main(String[] args) {
		//���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����, ����(19�� �ʰ�)���� ����ϼ���.
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int age = Integer.parseInt(sc.nextLine());

		System.out.println();

		System.out.println(age == 13? "���" : (age <= 19 ? "û�ҳ�" : "����"));
	}

}
