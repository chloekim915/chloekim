package Practice;

import java.util.Scanner;

public class p8 {
	public static void main(String[] args) {
		//�ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.	
		Scanner sc = new Scanner(System.in);

		System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
		String num = sc.nextLine();

		System.out.println();

		if (num.charAt(7) == '2') { 
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}
