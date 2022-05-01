package com.kh.ex02.loop;

public class LoopStatement1 {
	public static void myFirstWhileLoop() {
		while(true) {
			System.out.println("무한 루프");
		}
	}
	
	public static void testWhileLoop() {
		int i = 0;
		while(i < 10) {
			System.out.println(i++);
		}
		System.out.println("루프 끝");
		//while은 무한루프 또는 끝이 정해지지 않은 케이스에서 사용된다.
		while(true) {
			i++;
			if(i > 50) {
				break;
			}
		}
	}
	
	public static void testDoWhileLoop() {
		//잘안쓴다
		int i = 0;
		do {
			System.out.println(i++); //0 1 2 3 4 5 6 7 8 9 루프 끝
		} while(i < 10);
		System.out.println("루프 끝");
	}
	
	public static void testForLoop() {
		//아래문장 외울때까지 계속 쳐보기
		//앞으로 제일 많이 사용할 반복문 패턴
		//0~9, 10은 도달하지 않음
		for(int i = 0; i < 10 ; i++) {
			System.out.println(i);
		}
		System.out.println("루프 끝");
		
		//1~10루프 자주 사용하지 말 것
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("루프 끝");
		
		//위 대신 이걸 추천
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1); //i+1주목
		}
		System.out.println("루프 끝");
	}
	
	public static void main(String[] args) {
//		myFirstWhileLoop();
//		testWhileLoop();
//		testDoWhileLoop();
		testForLoop();
		
	}
}
