package com.kh.practice.chap01.ControlPractice;

import java.util.Scanner;

public class OperatorPractiece1 {
	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요. : ");
		int num = Integer.parseInt(sc.nextLine());

		switch(num) {
		case 1: 
			System.out.println("입력메뉴 입니다.");
			break;
		case 2: 
			System.out.println("수정메뉴 입니다.");
			break;
		case 3: 
			System.out.println("조회메뉴 입니다.");
			break;
		case 4: 
			System.out.println("삭제메뉴 입니다.");
			break;
		case 7: 
			System.out.println("종료.");
			break;
		default : 
			System.out.println("메뉴가 없습니다.");
			break;
		}

		//		if (num == 1) {
		//			System.out.println("입력메뉴 입니다.");
		//		} else if (num == 2) {
		//			System.out.println("수정메뉴 입니다.");
		//		} else if (num == 3) {
		//			System.out.println("조회메뉴 입니다.");
		//		} else if (num == 4) {
		//			System.out.println("삭제메뉴 입니다.");
		//		} else {
		//			System.out.println("종료");
		//		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num % 2 == 0) {
			if(num > 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("양수만 입력하세요");
			}
		} else { 
			System.out.println("홀수다");
		}

	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수 : ");
		int num1 = Integer.parseInt(sc.nextLine());

		System.out.print("수학점수 : ");
		int num2 = Integer.parseInt(sc.nextLine());

		System.out.print("영어점수 : ");
		int num3 = Integer.parseInt(sc.nextLine());

		int sum = num1 + num2 + num3;
		double average = sum / 3.0;

		if ((num1 >= 40 && num2 >= 40 && num3 >= 40)) {
			if(average >= 60) {
				System.out.println("국어 : " + num1);
				System.out.println("수학 : " + num2);
				System.out.println("영어 : " + num3);
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + average);
			} else {
				System.out.println("불합격입니다");
			}
		} else {
			System.out.println("불합격입니다");
		}
		
//		if (num1 < 40 || num2 < 40 || num3 <40) {
//			System.out.println("불합격");
//			return;
//		}
//		System.out.println("국어 : " + num1);
//		System.out.println("수학 : " + num2);
//		System.out.println("영어 : " + num3);
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + average);
//		
//		if(average > 60.0) {
//			System.out.println("합격");
//		} else { 
//			System.out.println("불합격");
//			
//		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1~12 사이의 정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());

		switch (num) {
		case 1: System.out.println("1월은 겨울입니다."); break;
		case 2: System.out.println("2월은 겨울입니다."); break;
		case 3: System.out.println("3월은 봄입니다."); break;
		case 4: System.out.println("4월은 봄입니다.");	break;
		case 5: System.out.println("5월은 봄입니다.");	break;
		case 6: System.out.println("6월은 여름입니다.");break;
		case 7: System.out.println("7월은 여름입니다.");break;
		case 8: System.out.println("8월은 여름입니다.");break;
		case 9: System.out.println("9월은 가을입니다.");break;
		case 10: System.out.println("10월은 가을입니다.");break;
		case 11: System.out.println("11월은 가을입니다.");break;
		case 12: System.out.println("12월은 겨울입니다.");break;
		default : 
			System.out.println(num + "월은 잘못 입력된 달입니다.");
			break;
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		String rid = "myid";
		String rpw = "mypw";
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if(id.equals(rid)) {
			if(pw.equals(rpw)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String level = sc.nextLine();

		String lev1 = "관리자";
		String lev2 = "회원";
		String lev3 = "비회원";

		if(level.equals(lev1)) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		} 

		if(level.equals(lev2)) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}

		if(level.equals(lev3)) {
			System.out.println("게시글 조회");
		} 
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = Double.parseDouble(sc.nextLine());
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = Double.parseDouble(sc.nextLine());
		
		double bmi = kg / (m*m);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if(bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if(bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("피연산자2 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자를 입력(+, -, *, /, %) : ");
		String str = sc.nextLine();


		if(num1 > 0 || num2 > 0) {
			switch(str) {
			case "+" : System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); break;
			case "-" : System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); break;
			case "*" : System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); break;
			case "/" : System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2)); break;
			case "%" : System.out.println(num1 + " % " + num2 + " = " + ((double)num1 % num2)); break;
			default : System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다"); break;
			}
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
		}
	}
	
	public void practice9() {
Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("기말 고사 점수 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("과제 점수 : ");
		int num3 = Integer.parseInt(sc.nextLine());
		System.out.print("출석 회수 : ");
		int num4 = Integer.parseInt(sc.nextLine());
		
		double anum1 = num1 * 0.2;
		double anum2 = num2 * 0.3;
		double anum3 = num3 * 0.3;
		double anum4 = num4 * 1.0;
		double sum = anum1 + anum2 + anum3 + anum4;
		
		
		System.out.println("===============결과===============");
		System.out.println("중간 고사 점수(20) : " + anum1);
		System.out.println("기말 고사 점수(30) : " + anum2);
		System.out.println("과제 점수    (30) : " + anum3);
		System.out.println("출석 점수    (20) : " + anum3);
		System.out.println("총점 : " + sum);
		
		if (num4 <= 20 * (1 - 0.3)) {
			System.out.println("Fail [출석 회수 부족(" + num4 + "/20)]");
			return;
		} else if (sum < 70) {
			System.out.println("Fail [점수 미달]");
		} else {
			System.out.println("Pass");
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);

		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1.메뉴 출력");
		System.out.println("2.짝수/홀수");
		System.out.println("3.합격/불합격");
		System.out.println("4.계절");
		System.out.println("5.로그인");
		System.out.println("6.권한 확인");
		System.out.println("7.BMI");
		System.out.println("8.계산기");
		System.out.println("9.P/F");

		int i = 0;
		System.out.print("선택 : ");
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
		default:System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}

		System.out.println("(실습문제" + i + " 실행)");
	}
}
