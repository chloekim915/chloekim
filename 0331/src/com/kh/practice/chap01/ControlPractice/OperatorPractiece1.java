package com.kh.practice.chap01.ControlPractice;

import java.util.Scanner;

public class OperatorPractiece1 {
	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ���. : ");
		int num = Integer.parseInt(sc.nextLine());

		switch(num) {
		case 1: 
			System.out.println("�Է¸޴� �Դϴ�.");
			break;
		case 2: 
			System.out.println("�����޴� �Դϴ�.");
			break;
		case 3: 
			System.out.println("��ȸ�޴� �Դϴ�.");
			break;
		case 4: 
			System.out.println("�����޴� �Դϴ�.");
			break;
		case 7: 
			System.out.println("����.");
			break;
		default : 
			System.out.println("�޴��� �����ϴ�.");
			break;
		}

		//		if (num == 1) {
		//			System.out.println("�Է¸޴� �Դϴ�.");
		//		} else if (num == 2) {
		//			System.out.println("�����޴� �Դϴ�.");
		//		} else if (num == 3) {
		//			System.out.println("��ȸ�޴� �Դϴ�.");
		//		} else if (num == 4) {
		//			System.out.println("�����޴� �Դϴ�.");
		//		} else {
		//			System.out.println("����");
		//		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num % 2 == 0) {
			if(num > 0) {
				System.out.println("¦����");
			} else {
				System.out.println("����� �Է��ϼ���");
			}
		} else { 
			System.out.println("Ȧ����");
		}

	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� : ");
		int num1 = Integer.parseInt(sc.nextLine());

		System.out.print("�������� : ");
		int num2 = Integer.parseInt(sc.nextLine());

		System.out.print("�������� : ");
		int num3 = Integer.parseInt(sc.nextLine());

		int sum = num1 + num2 + num3;
		double average = sum / 3.0;

		if ((num1 >= 40 && num2 >= 40 && num3 >= 40)) {
			if(average >= 60) {
				System.out.println("���� : " + num1);
				System.out.println("���� : " + num2);
				System.out.println("���� : " + num3);
				System.out.println("�հ� : " + sum);
				System.out.println("��� : " + average);
			} else {
				System.out.println("���հ��Դϴ�");
			}
		} else {
			System.out.println("���հ��Դϴ�");
		}
		
//		if (num1 < 40 || num2 < 40 || num3 <40) {
//			System.out.println("���հ�");
//			return;
//		}
//		System.out.println("���� : " + num1);
//		System.out.println("���� : " + num2);
//		System.out.println("���� : " + num3);
//		System.out.println("�հ� : " + sum);
//		System.out.println("��� : " + average);
//		
//		if(average > 60.0) {
//			System.out.println("�հ�");
//		} else { 
//			System.out.println("���հ�");
//			
//		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1~12 ������ ���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());

		switch (num) {
		case 1: System.out.println("1���� �ܿ��Դϴ�."); break;
		case 2: System.out.println("2���� �ܿ��Դϴ�."); break;
		case 3: System.out.println("3���� ���Դϴ�."); break;
		case 4: System.out.println("4���� ���Դϴ�.");	break;
		case 5: System.out.println("5���� ���Դϴ�.");	break;
		case 6: System.out.println("6���� �����Դϴ�.");break;
		case 7: System.out.println("7���� �����Դϴ�.");break;
		case 8: System.out.println("8���� �����Դϴ�.");break;
		case 9: System.out.println("9���� �����Դϴ�.");break;
		case 10: System.out.println("10���� �����Դϴ�.");break;
		case 11: System.out.println("11���� �����Դϴ�.");break;
		case 12: System.out.println("12���� �ܿ��Դϴ�.");break;
		default : 
			System.out.println(num + "���� �߸� �Էµ� ���Դϴ�.");
			break;
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		String rid = "myid";
		String rpw = "mypw";
		
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String pw = sc.nextLine();
		
		if(id.equals(rid)) {
			if(pw.equals(rpw)) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
			}
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String level = sc.nextLine();

		String lev1 = "������";
		String lev2 = "ȸ��";
		String lev3 = "��ȸ��";

		if(level.equals(lev1)) {
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		} 

		if(level.equals(lev2)) {
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		}

		if(level.equals(lev3)) {
			System.out.println("�Խñ� ��ȸ");
		} 
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double m = Double.parseDouble(sc.nextLine());
		
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double kg = Double.parseDouble(sc.nextLine());
		
		double bmi = kg / (m*m);
		
		System.out.println("BMI ���� : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("��ü��");
		} else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("����ü��");
		} else if(bmi >= 23 && bmi < 25) {
			System.out.println("��ü��");
		} else if(bmi >= 25 && bmi < 30) {
			System.out.println("��");
		} else {
			System.out.println("����");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("�����ڸ� �Է�(+, -, *, /, %) : ");
		String str = sc.nextLine();


		if(num1 > 0 || num2 > 0) {
			switch(str) {
			case "+" : System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); break;
			case "-" : System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); break;
			case "*" : System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); break;
			case "/" : System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2)); break;
			case "%" : System.out.println(num1 + " % " + num2 + " = " + ((double)num1 % num2)); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�"); break;
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�");
		}
	}
	
	public void practice9() {
Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("�⸻ ��� ���� : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("���� ���� : ");
		int num3 = Integer.parseInt(sc.nextLine());
		System.out.print("�⼮ ȸ�� : ");
		int num4 = Integer.parseInt(sc.nextLine());
		
		double anum1 = num1 * 0.2;
		double anum2 = num2 * 0.3;
		double anum3 = num3 * 0.3;
		double anum4 = num4 * 1.0;
		double sum = anum1 + anum2 + anum3 + anum4;
		
		
		System.out.println("===============���===============");
		System.out.println("�߰� ��� ����(20) : " + anum1);
		System.out.println("�⸻ ��� ����(30) : " + anum2);
		System.out.println("���� ����    (30) : " + anum3);
		System.out.println("�⼮ ����    (20) : " + anum3);
		System.out.println("���� : " + sum);
		
		if (num4 <= 20 * (1 - 0.3)) {
			System.out.println("Fail [�⼮ ȸ�� ����(" + num4 + "/20)]");
			return;
		} else if (sum < 70) {
			System.out.println("Fail [���� �̴�]");
		} else {
			System.out.println("Pass");
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1.�޴� ���");
		System.out.println("2.¦��/Ȧ��");
		System.out.println("3.�հ�/���հ�");
		System.out.println("4.����");
		System.out.println("5.�α���");
		System.out.println("6.���� Ȯ��");
		System.out.println("7.BMI");
		System.out.println("8.����");
		System.out.println("9.P/F");

		int i = 0;
		System.out.print("���� : ");
		i = Integer.parseInt(sc.nextLine());

		switch (i) {
		case 1:System.out.println();practice1();break;
		case 2:System.out.println();practice2();break;
		case 3:System.out.println();practice3();break;
		case 4:System.out.println();practice4();break;
		case 5:System.out.println();practice5();break;
		case 6:System.out.println();practice6();break;
		case 7:System.out.println();practice7();break;
		case 8:System.out.println();practice8();break;
		case 9:System.out.println();practice9();break;
		default:System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}

		System.out.println("(�ǽ�����" + i + " ����)");
	}
}
