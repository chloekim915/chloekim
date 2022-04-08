package com.kh.ex06.test_static;

//객체의 Life-Cycle(생명주기=메모리 관점)
//0. JVM 초기화 및 실행
//1. main 호출
//2. Class 접근하는 순간(생성 포함) static{} 블록 실행 -> 최초 한번만 실행
//3. Class 생성시 {} 초기화 블록 실행
//4. 생성자 호출
//5. 객체 사용 (사용자 프로그래밍한 순으로 활용됨)
//6. 종료시 소멸자 - finalize() 호출 -> 실행이 불확정적임으로 언제 실행될지 모름!!
//* 반드시 정리해야 하는 자원이 있다면 별도의 사용자 메소드 'clear()' 메소드를 생성시키고 수동으로 호출
//* 또는 반드시 try finally 문법을 활용하자

public class StaticTest {
	public static void main(String[] args) {
		System.out.println("실행!");
		//		User.requiredUserNumber = 8; 클래스가 소환만 되어도 초기화됨
		new User();

		int count = 0;
		while(true) {
			new User("홍길동" + count++);
		}
	}
}

class User {
	String name;
	public static final int MAX_SIZE = 10; // 최대 생성할수 있는 사람의 수 
	public static int requiredUserNumber;  // 요구되는 사용자의 수
	private static int currentUserNumber;  // 현재 생선된 사용자의 수 

	// class 사용할때 초기화 한다.
	static { // 객체 사용시 최우선 호출되는 영역
		System.out.println("Class를 초기화 하였습니다.");
		requiredUserNumber = 5;
		currentUserNumber = 0;
	}

	// 초기화 블럭 생성자보다 먼저 호출된다.
	{ // 객체 생성시 최우선 호출되는 영역
		currentUserNumber++;
		System.out.println("유저가 생성되었습니다. Num : " + currentUserNumber);

		if (currentUserNumber > requiredUserNumber) {
			System.out.println("허용된 사용자보다 많은 유저가 생성되었습니다.");
		}
		if (currentUserNumber > MAX_SIZE) {
			System.err.println("생성된 유저 숫자가 너무 많습니다. 메모리를 정리합니다.");
			System.gc(); // 메모리 정리를 요청하는 함수

			try { // 이게 없으면 소멸하지 않는다.
				Thread.sleep(1000); // 1초간 기다리는 코드
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// System.exit(1);
		}
	}

	public User() { // 초기화문 이후에 호출 
		this("무명");
		System.out.println("User 이름 : " + name);
	}

	public User(String name) { // 초기화문 이후에 호출
		this.name = name;
		System.out.println("User 이름 : " + name);
	}

	@Override
	protected void finalize() throws Throwable { // 객체가 소멸될때 호출되는 메소드
		System.out.println("유저 정보를 정리합니다. " + currentUserNumber);
		currentUserNumber--;
	}
}
