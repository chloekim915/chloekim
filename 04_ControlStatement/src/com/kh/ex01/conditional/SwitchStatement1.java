package com.kh.ex01.conditional;

public class SwitchStatement1 {
	public static void main(String[] args) {
		// 1등급 ~ 4등급(최하, 모든 최저점수 포함.)
		//100~80 1등급...
		
		double score = 80.3;
		int grade = (int)(score / 20);
		
		switch(grade) {
		case 5 : //100점
		case 4 : //100미만~80점
			System.out.println("1등급 입니다.");
		case 3:
			System.out.println("2등급 입니다.");
		case 2 :
			System.out.println("3등급 입니다.");
		case 1 :
			System.out.println("4등급 입니다.");
			break;
		default : 
			System.out.println("예외값 입니다.");
			
		} //브레이크 걸리면 여기로 탈출
	}
}
