package com.kh.ex01.conditional;
import java.util.Scanner;
public class SwitchStatement3 {
	
	public static final int MEN = 1;
	public static final int WOMEN = 2;
	public static final int OTHER = 3;
	
	public static void main(String[] args) {
		//������ �Է¹޾Ƽ� ����, ���� �׸��� ��3�� ������ �����ϴ� �ڵ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���");
		String gender = sc.nextLine();
		int genderValue = 0;
		
		//����, ����, ���ڿ� + ������(�Ⱦ���)
		switch(gender) {
		case "��" :
		case "����" :
		case "�ҳ�" :
		case "������" :
		case "����" :
			genderValue = MEN;
			break;
		case "��" :
		case "����" :
		case "����" :
		case "�ҳ�" :
			genderValue = WOMEN;
			break;
		default :
			genderValue = OTHER;
			break;
		}
		
		if(genderValue == MEN) {
			System.out.println("������ �����Դϴ�");
		} else if(genderValue == WOMEN) {
			System.out.println("������ �����Դϴ�");
		} else {
			System.out.println("������ ��3�� ���Դϴ�");
		}
		
	}
}
