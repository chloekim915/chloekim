package com.kh.ex01.exception;

import java.io.File;
import java.io.IOException;

public class UseThrows {
	
//		throws : 예외 발생시 상위 메소드에게 책임을 전가하는 키워드
//				 단, main에서의 예외는 프로그램 종료를 의미
	
//		throw : 예외를 만들어서 던지는 문장
	
	public static void method() throws IOException {
		File file = new File("./Test");
		file.createNewFile(); //IOException 발생, 대표적으로 명시적인 예외
		System.out.println("TEST1");
		
		if(true)
			throw new IOException("TEST");
		System.out.println("TEST2"); //예외 발생시 아래에 문장은 실행되지 않음
	}
	
	public static void main(String[] args) throws IOException {
		method();
	}

}
