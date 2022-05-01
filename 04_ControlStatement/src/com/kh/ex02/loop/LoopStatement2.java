package com.kh.ex02.loop;

public class LoopStatement2 {
	//홀짝 세기를 while, do-while, for문으로 구현하기
	public static void testWhileLoop() {
		int i = 0;
		while(i < 10) {
			if(i % 2 == 0) {
				System.out.println(i + "는 짝수입니다.");
			}else {
				System.out.println(i + "는 홀수입니다.");
			}
			i++;
		}
	}
	
	public static void testDoWhileLoop() {
		int i = 0;
		do {
			if(i % 2 == 0) {
				System.out.println(i + "는 짝수입니다.");
			}else {
				System.out.println(i + "는 홀수입니다.");
			}
			i++;
		} while(i < 10);
	}
	
	public static void testForLoop() {
		for(int i = 0; i < 10; i++) { // 기계적으로 치고 본다.
			if(i % 2 == 0) {
				System.out.println(i + "는 짝수입니다.");
			}else {
				System.out.println(i + "는 홀수입니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		testWhileLoop();
//		testDoWhileLoop();
//		testForLoop();
	}

}
