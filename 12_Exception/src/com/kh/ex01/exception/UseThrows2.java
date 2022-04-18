package com.kh.ex01.exception;

import java.io.File;
import java.io.IOException;

public class UseThrows2 {
	
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
	
	public static void main(String[] args) {
		try { //전가된 예외를 처리하는 try문
			method();
		} catch (IOException e) { //예외를 받아주는 catch문
			e.printStackTrace();
			System.out.println("예외가 발생하였습니다.");
			//예외가 발생하면 처리해야할 로직
			// 예)로그를 찍는 다던가..e-mail을 보낸다던가.
		}
	}

}
