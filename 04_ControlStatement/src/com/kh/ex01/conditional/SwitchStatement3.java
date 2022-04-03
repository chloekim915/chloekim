package com.kh.ex01.conditional;
import java.util.Scanner;
public class SwitchStatement3 {
	
	public static final int MEN = 1;
	public static final int WOMEN = 2;
	public static final int OTHER = 3;
	
	public static void main(String[] args) {
		//성별을 입력받아서 남성, 여성 그리고 제3의 성까지 구분하는 코드
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력해주세요");
		String gender = sc.nextLine();
		int genderValue = 0;
		
		//숫자, 문자, 문자열 + 열거형(안쓸것)
		switch(gender) {
		case "남" :
		case "남자" :
		case "소년" :
		case "아저씨" :
		case "남성" :
			genderValue = MEN;
			break;
		case "여" :
		case "여자" :
		case "여성" :
		case "소녀" :
			genderValue = WOMEN;
			break;
		default :
			genderValue = OTHER;
			break;
		}
		
		if(genderValue == MEN) {
			System.out.println("성별은 남성입니다");
		} else if(genderValue == WOMEN) {
			System.out.println("성별은 여성입니다");
		} else {
			System.out.println("성별은 제3의 성입니다");
		}
		
	}
}
