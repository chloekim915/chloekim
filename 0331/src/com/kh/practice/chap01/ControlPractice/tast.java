package com.kh.practice.chap01.ControlPractice;

import java.util.Scanner;

public class tast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= num; i++) {
//			for(int j = num; j >= 1; j--) {
			System.out.print("*");
	}
			System.out.println();
	}
	}
//	}
