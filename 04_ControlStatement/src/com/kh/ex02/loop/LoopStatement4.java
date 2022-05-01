package com.kh.ex02.loop;

public class LoopStatement4 {
	public static void main(String[] args) {
		//for문 응용 - 2씩 증가하기
		for(int i = 0; i < 20; i+=2) {
			System.out.println(i);
		}
		
		//for문 조건문 지정안하고 작성하기
		for(int i = 0; ; i+=2) {
			System.out.println(i);
			if(i == 100) {
				break;
			}
			
		}System.out.println("끝");
	}
}
