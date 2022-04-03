package com.kh.ex01.conditional;

public class IfStatement1 {
	//if(조건식1) {
	//(참일때 실행되는 문장)
	//}
	//else if(조건식2) {
	//(조건식2가 참일때 실행되는 문장)
	
	public static void main(String[] args) {
		int a = 7;
		
		if(a % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
		
	}
}
