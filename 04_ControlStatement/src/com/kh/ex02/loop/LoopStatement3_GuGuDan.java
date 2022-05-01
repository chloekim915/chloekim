package com.kh.ex02.loop;

public class LoopStatement3_GuGuDan {
	public static void main(String[] args) {
		//1.2단 심플한 버전 - 외워라
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < 10; j++) {
//				System.out.println(i + "x" + j + "=" + (i * j));
//			}
//		}
		
		//2.i와 j의 시작,끝을 조절하면서 구구단을 완성시킨다
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//				System.out.println(i + "x" + j + "=" + (i * j));
//			}
//		}
		
		//3.반복문 위와 아래에 공간이 있다는 사실을 생각해보자
		for(int i = 2; i < 10; i++) {
			System.out.println(i + "단 시작");
			System.out.println("-------------------------------");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j) + " ");
			}
			System.out.println("-------------------------------\n");
		}
	}
}
