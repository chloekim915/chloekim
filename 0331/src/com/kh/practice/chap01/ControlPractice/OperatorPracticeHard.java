package com.kh.practice.chap01.ControlPractice;

import java.util.Scanner;

public class OperatorPracticeHard {
	public static void main(String[] args) {
		//public void practice11(){
		//정수를 이용해서 4자리 비밀번호를 만들려고 하는데
		//이 때 4자리 정수를 입력받아 각 자리수에 중복되는 값이 없을 경우 '생성 성공'
		//중복 값이 있으면 ‘중복 값 있음‘
		//자리수가 안 맞으면 ‘자리 수 안 맞음‘ 출력
		//단, 제일 앞자리 수의 값은 1~9 사이 정수

		Scanner sc = new Scanner(System.in);

		System.out.print("비밀번호 입력(1000~9999) : ");
		String pw = sc.nextLine();

		if(pw.length() >= 5) {
			System.out.println("자리수 안맞음");
		} else if(pw.contains((pw)) == true) {
			System.out.println("중복 값 있음"); 
		} else { 
				System.out.println("성공");
			}
		}

}
