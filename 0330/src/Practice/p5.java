package Practice;

import java.util.Scanner;

public class p5 {
	private void mian() {
		//Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
		//�� �� ������ 'M'�̸� ���л�, 'M'�� �ƴϸ� ���л����� ���ó���ϼ���.
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸� : ");
		String name = sc.nextLine();

		System.out.print("�г�(���ڸ�) : ");
		int grade = Integer.parseInt(sc.nextLine());

		System.out.print("��(���ڸ�) : ");
		int class1 = Integer.parseInt(sc.nextLine());

		System.out.print("��ȣ(���ڸ�) : ");
		int num = Integer.parseInt(sc.nextLine());

		System.out.print("����(M/F) : ");
		String gender = sc.nextLine();
		if (gender.equals("M")) {
			gender = "���л�";
		} else {
			gender = "���л�";
		}

		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double test = sc.nextDouble();

		System.out.println();
		System.out.println(grade + "�г� " + class1 + "�� " + num + "�� " + name + " " + gender + "�� " + "������ " + test + "�̴�.");
	}

}

