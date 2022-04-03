package com.kh.ex01.conditional;

import java.util.Scanner;

public class SwitchStatement2 {
	public static void main(String[] args) {
		//전공성적 입력받기. //ABCDF
		
		Scanner sc = new Scanner(System.in);
		System.out.println("전공성적을 입력해주세요");
		char grade = sc.nextLine().charAt(0); //한글자 가져오기
		
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("A학점입니다");
			break;
		case 'B' :
		case 'b' :
			System.out.println("B학점입니다");
			break;
		case 'C' :
		case 'c' :
			System.out.println("C학점입니다");
			break;
		case 'D' :
		case 'd' :
			System.out.println("D학점입니다");
			break;
		default :
			System.out.println("F학점입니다");
			break;
		}
	}
}
