package com.kh.practice.chap01.ControlPractice;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������(+, -, *, /, %) : ");
		String oper = sc.nextLine();
		System.out.print("����1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("����2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		if (num2 == 0) {
			System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
		} else {
			switch(oper) {
			case "+" : System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); break;
			case "-" : System.out.println(num1 + " - " + num2 + " = " + (num1+num2)); break;
			case "/" : System.out.println(num1 + " / " + num2 + " = " + (num1+num2)); break;
			case "%" : System.out.println(num1 + " % " + num2 + " = " + (num1+num2)); break;
			case "*" : System.out.println(num1 + " * " + num2 + " = " + (num1+num2)); break;
			default : System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���"); break;
			}
		}
		
	}
} 


