package com.kh.ex03.file_stream_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {
	
//	FileInputStream 생성법 3가지
//	1. File 객체를 통해 file을 여는 방법
//	2. 상대 경로를 통해 file을 여는 방법 ★
//	3. 절대 경로를 통해 file을 여는 방법 ※가급적 쓰지 말것
	
	public static void main(String[] args) {
		// 문자열을 읽어오는 IO 객체가 아님!
		FileInputStream fis = null;
		
		try {
			// 오픈부
			// 1. 파일 객체 활용
//			File file = new File("./test.txt");
//			fis = new FileInputStream(file);
			
			// 2. 절대 또는 상대경로로 활용
			fis = new FileInputStream("./test.txt");  // 영문 파일도 정상적으로 읽어 들이는 상황X
//			fis = new FileInputStream("./covid.txt"); // 인코딩 이슈가 발생. 한글이라
			
			// 알고리즘부
			int read = 0;
			while((read = fis.read()) >= 0) { // 파일에서 1byte 읽어오는 코드
				System.out.print((char)read);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 클로즈 부
			if(fis != null) { // 실제 오픈이 되었을때만 Close
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}

