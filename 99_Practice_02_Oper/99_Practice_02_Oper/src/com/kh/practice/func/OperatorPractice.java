package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1(){
	// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		String num1 = sc.nextLine();
		
		if (num1 > 0) {
			System.out.println("양수다");
		} else {
			System.out.println("양수가 아니다");
		}		
	}
	
	public void practice2() {
	//키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 양수가 아닌 경우 중에서 0이면 "0이다", 0이 아니면 "음수다"를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println();
		
		System.out.println((num == 0? "0이다" : (num > 0 ? "양수다" : "음수다")));	
		
	}
	
	public void parctice3() {
	//키보드로 입력 받은 하나의 정수가 짝수이면 "짝수다", 짝수가 아니면 "홀수다"를 출력하세요.
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println();
		if (num % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
	}
	
	public void practice4() {
	//모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num = sc.nextInt();

		System.out.print("사탕 개수 : ");
		int num1 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("1인당 사탕 개수 : "+ (num1 / num));
		System.out.println("남는 사탕 개수 : " + (num1 % num));
	}
	
	public void practice5() {
	//키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
	//이 때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력처리하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("학년(숫자만) : ");
		int grade = Integer.parseInt(sc.nextLine());
		
		System.out.print("반(숫자만) : ");
		int class1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("번호(숫자만) : ");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.print("성별(M/F) : ");
		String gender = sc.nextLine();
		if (gender.equals("M")) {
			gender = "남학생";
		} else {
			gender = "여학생";
		}
			
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double test = sc.nextDouble();
		
		System.out.println();
		System.out.println(grade + "학년 " + class1 + "반 " + num + "번 " + name + " " + gender + "의 " + "성적은 " + test + "이다.");
	}
	
	public void practice6() {
	//나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println();
		
		System.out.println(age == 13? "어린이" : (age <= 19 ? "청소년" : "성인"));
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int test1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("영어 : ");
		int test2 = Integer.parseInt(sc.nextLine());
		
		System.out.print("수학 : ");
		int test3 = Integer.parseInt(sc.nextLine());
		int total = (test1 + test2 + test3);
		
		System.out.println();
		
		System.out.println("합계 : " + total);
		
		System.out.println("평균 : " + ((double)total)/3.0);
		
		if (test1 >= 40 && test2 >= 40 && test3 >= 40 && (((double)total)/3.0) >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String num = sc.nextLine();
		
		System.out.println();
		
		if (num.charAt(7) == '2') { 
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
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
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
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
		
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		
		System.out.println();
		
		double aa = a*0.4;
		double bb = b*0;
		double cc = c*0.15;
		
		double totala = a + aa;
		double totalb = b + bb;
		double totalc = c + cc;
		
		System.out.println("A사원 연봉/연봉+a : " + a + "/" + totala);
		if (totala >= 3000) {
			System.out.println("3000이상");
		} else {
			System.out.println("3000미만");
		}
		System.out.println("B사원 연봉/연봉+a : " + b + "/" + totalb);
		if (totalb >= 3000) {
			System.out.println("3000이상");
		} else {
			System.out.println("3000미만");
		}
		System.out.println("C사원 연봉/연봉+a : " + c + "/" + totalc);
		if (totalc >= 3000) {
			System.out.println("3000이상");
		} else {
			System.out.println("3000미만");
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
