package com.kh.ex01.conditional;

public class SwitchStatement1 {
	public static void main(String[] args) {
		// 1��� ~ 4���(����, ��� �������� ����.)
		//100~80 1���...
		
		double score = 80.3;
		int grade = (int)(score / 20);
		
		switch(grade) {
		case 5 : //100��
		case 4 : //100�̸�~80��
			System.out.println("1��� �Դϴ�.");
		case 3:
			System.out.println("2��� �Դϴ�.");
		case 2 :
			System.out.println("3��� �Դϴ�.");
		case 1 :
			System.out.println("4��� �Դϴ�.");
			break;
		default : 
			System.out.println("���ܰ� �Դϴ�.");
			
		} //�극��ũ �ɸ��� ����� Ż��
	}
}
