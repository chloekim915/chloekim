package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1(){
	// Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		String num1 = sc.nextLine();
		
		if (num1 > 0) {
			System.out.println("�����");
		} else {
			System.out.println("����� �ƴϴ�");
		}		
	}
	
	public void practice2() {
	//Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����", ����� �ƴ� ��� �߿��� 0�̸� "0�̴�", 0�� �ƴϸ� "������"�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.println();
		
		System.out.println((num == 0? "0�̴�" : (num > 0 ? "�����" : "������")));	
		
	}
	
	public void parctice3() {
	//Ű����� �Է� ���� �ϳ��� ������ ¦���̸� "¦����", ¦���� �ƴϸ� "Ȧ����"�� ����ϼ���.
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.println();
		if (num % 2 == 0) {
			System.out.println("¦����");
		} else {
			System.out.println("Ȧ����");
		}
	}
	
	public void practice4() {
	//��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް� 1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int num = sc.nextInt();

		System.out.print("���� ���� : ");
		int num1 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("1�δ� ���� ���� : "+ (num1 / num));
		System.out.println("���� ���� ���� : " + (num1 % num));
	}
	
	public void practice5() {
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
	
	public void practice6() {
	//���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����, ����(19�� �ʰ�)���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println();
		
		System.out.println(age == 13? "���" : (age <= 19 ? "û�ҳ�" : "����"));
	}
	
	public void practice7() {
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
	
	public void practice8() {
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
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է� : ");
		int num3 = sc.nextInt();
		
		System.out.println();
		
		if ((num1 < num2)) {
			if (num3 <= num1 || num3 > num2) {
				System.out.println("true");
			}
		} else {
			System.out.println("false");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		
		System.out.println();
		
		if (num1 == num2 && num2 == num3 & num1 == num3) {
				System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : ");
		int a = sc.nextInt();
		
		System.out.print("B����� ���� : ");
		int b = sc.nextInt();
		
		System.out.print("C����� ���� : ");
		int c = sc.nextInt();
		
		System.out.println();
		
		double aa = a*0.4;
		double bb = b*0;
		double cc = c*0.15;
		
		double totala = a + aa;
		double totalb = b + bb;
		double totalc = c + cc;
		
		System.out.println("A��� ����/����+a : " + a + "/" + totala);
		if (totala >= 3000) {
			System.out.println("3000�̻�");
		} else {
			System.out.println("3000�̸�");
		}
		System.out.println("B��� ����/����+a : " + b + "/" + totalb);
		if (totalb >= 3000) {
			System.out.println("3000�̻�");
		} else {
			System.out.println("3000�̸�");
		}
		System.out.println("C��� ����/����+a : " + c + "/" + totalc);
		if (totalc >= 3000) {
			System.out.println("3000�̻�");
		} else {
			System.out.println("3000�̸�");
		}
	}
	
	public static void main(String[] args) {
		OperatorPractice op = new OperatorPractice();
		op.practice1();
		op.practice2();		
		op.practice3();
		op.practice4();
		op.practice5();
		op.practice6();
		op.practice7();
		op.practice8();
		op.practice9();
		op.practice10();
		op.practice11();		
	}
}
