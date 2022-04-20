package com.kh.ex02.io_basic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamIO {
	// Stream이란?
	// - Binary(이진) 데이터를 다루는 Stream = 1byte씩 처리 가능
	// - 사용처 : 파일, 네트워크, 프로그램 등의 입출력 기능을 담당
	
	// IO 사용할때의 코딩 테크닉
	// 1. 가장 윗단에 사용할 IO객체를 null로 선언한다. 이름을 앞글자만 줄여서 선언한다.
	// 2. try-catch문을 연다.
	// 3. try 안쪽에서 IO객체를 open한다.
	// 4. 필요한 IO 작업을 수행한다. 보통 while문으로 처리한다.
	// 5. finally를 선언하고 사용한 IO을 닫는다.
	
	public static void main(String[] args) {
		InputStream  is = null;
		OutputStream os = null;
		
//		is = new InputStream(); // abstract(추상) 클래스라 생성 불가!
//		is.read(); // 예외처리 필요!
		try {
			is = System.in;  // open 대체하는 코드, 콘솔 입력
			os = System.out; // 콘솔 출력
			
			System.out.println("숫자를 입력해주세요.");
			int read = is.read();
			os.write(read); // 이곳에서는 실제 write를 보장하지 않음. 어느정도 데이터 차면 자동으로 쓰기도 됨.
//			os.flush();
			// os를 강제로 출력하는 방법 2가지.
			// 1. flush 사용 : 중간에 반드시 강제로 데이터를 밀어내야할데 명시적으로 쓰는 문법
			// 2. close 사용 : 자원 정리할때 사용함으로 필요시 flush 사용 필요
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { // 반드시 2번 try 처리 필요
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try { // 반드시 2번 try 처리 필요
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
