package com.kh.ex01.conditional;
import java.util.Scanner;
public class IfStatement3 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("ID를 입력해주세요!");
		String id = sc.nextLine();
		
		if(id.length() < 3) {
			System.out.println("ID가 짧습니다.");
		}
		
		System.out.println("PW를 입력해주세요!");
		String password = sc.nextLine();
		
		if(password.length() < 8) {
			System.out.println("Password가 짧습니다!");
			return; 
		}
		
		if(password.contains(id) == true) {
			System.out.println("패스워드에 ID가 포함되어 있습니다.");
			return; 
		}
		
		// 예외를 묶어서 처리한다!
		if( password.length() < 8 || password.contains(id) == true ) {
			System.out.println("Password 짧거나 id가 포함되어 있습니다.");
			return;
		}
		
		System.out.println("성공하였습니다. ID : " + id + ", PW : " +  password);
	}
}

//예외를 먼저 if문 + return으로 필터링하고 정상적인 상황만 처리하도록 코드를 구성한다.

