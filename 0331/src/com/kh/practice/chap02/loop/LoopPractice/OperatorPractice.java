package com.kh.practice.chap02.loop.LoopPractice;
//return;���ߴ°�.�׳� ���⼭ ����
//continue;����ϴ°�.�ٽ� ���ư�
//break;�ڽ��� ���Ե� �ϳ��� �ݺ����� �����.
import java.util.Scanner;

public class OperatorPractice {
	public void practice1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int input = Integer.parseInt(sc.nextLine());
		
		if(input < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
			return;
		}
		
		for(int i = 1; i <= input; i++) {
			System.out.print(i+" ");
		}
	}	

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int input = Integer.parseInt(sc.nextLine());
			
			if(input < 1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
				continue;
			}
			
			for(int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
			break;
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
			int input = Integer.parseInt(sc.nextLine());
			
			if(input < 1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
				continue;
			}
			
			//����1 : i�� ������, i���� ���� ����
			for(int i = 1; i <= input; i++) {
				System.out.println(input - i + 1+ " ");
			}
			System.out.println();
			
			//����2 : i�� ���ҽ�, �״�� ����ϴ� ��
			for(int i = input; i > 0; i--) {
				System.out.println(i+ " ");
			}
			break; //return����? ����
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int input = Integer.parseInt(sc.nextLine());
			if(input < 1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���");
				continue;
			}

			for(int i = input; i > 0; i--) {
				System.out.print(i +" ");
			}
			break;
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		int sum = 0;
		int num = sc.nextInt();

		for (int i = 1; i < num ; i++) {
			System.out.print(i + " + ");
			sum = sum+i;
		}
		sum = num + sum;
		System.out.println(num + " = " + sum);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �ϳ� �Է��ϼ���: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		int num2 = Integer.parseInt(sc.nextLine());

		if(num1 < 1 || num2 < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {
			if(num1-num2 >= 0) {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}else if(num1-num2 > 0) {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.print("������ �ϳ� �Է��ϼ���: ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("������ �ϳ� �Է��ϼ���: ");
			int num2 = Integer.parseInt(sc.nextLine());

			if(num1 < 1 || num2 < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				continue;
			} else {
				if(num1-num2 >= 0) {
					for(int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					} break;//�ٽõ��ƿ°�쿡�� �극��ũ �ʿ�
				}else if(num1-num2 > 0) {
					for(int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					} break;
				}
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("====== " + num + "�� " + "======");
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	
	public void parctice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		if(num > 9) {
			System.out.println("9������ ���ڸ� �Է����ּ���.");
			return;
		} 

		for(int i = num; i <= 9; i++) {
			System.out.println("====== " + i + "�� " + "======");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.print("���� : ");
			int num = Integer.parseInt(sc.nextLine());
			if(num > 9) {
				System.out.println("9������ ���ڸ� �Է����ּ���.");
				continue;
			} 

			for(int i = num; i <= 9; i++) {
				System.out.println("====== " + i + "�� " + "======");
				for(int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + (i*j));
				} break;
			} break;
		}
	}
	
	public void practice11() {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int num1 = sc.nextInt();
		System.out.print("���� : ");
		int num2 = sc.nextInt();
		
		for(int i = 1; i <= 10; i++ ) {
			System.out.print(num1 + " ");
			num1 += num2;
			
		}
	}
	
	public void practice12() {
		
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());

		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i = num; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
			System.out.print("*");
	}
			System.out.println();
	}
	}
}

