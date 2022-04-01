package com.kh.practice.chap01.ControlPractice;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자(+, -, *, /, %) : ");
		String oper = sc.nextLine();
		System.out.print("정수1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
		} else {
			switch(oper) {
			case "+" : System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); break;
			case "-" : System.out.println(num1 + " - " + num2 + " = " + (num1+num2)); break;
			case "/" : System.out.println(num1 + " / " + num2 + " = " + (num1+num2)); break;
			case "%" : System.out.println(num1 + " % " + num2 + " = " + (num1+num2)); break;
			case "*" : System.out.println(num1 + " * " + num2 + " = " + (num1+num2)); break;
			default : System.out.println("없는 연산자입니다. 다시 입력해주세요"); break;
			}
		}
		
	}
} 


