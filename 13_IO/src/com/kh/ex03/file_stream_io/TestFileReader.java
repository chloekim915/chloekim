package com.kh.ex03.file_stream_io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class TestFileReader {

	public static void main(String[] args) {
		// 문자열을 읽어오는 Reader로 변경
		FileReader fr = null;
		try {
//			fr = new FileReader("./test.txt");  
//			fr = new FileReader("./covid.txt");  
//			fr = new FileReader("./covid_UTF16.txt");   // CharSet 이슈
			// FileReader(String fileName, Charset charset) // BOM 개념 필수!
			fr = new FileReader("./covid_UTF16.txt", Charset.forName("UTF-16"));  	
			// UTF-16으로 encoding 셋팅 변경!
			
			// buffer로 읽어오는 방법
			char[] buf = new char[1024]; // buffer = 임시공간, 예비공간
			while(fr.read(buf) > 0) { // 파일에서 buffer 크기만큼 읽어오는 방법
				System.out.print(String.valueOf(buf));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fr != null) { 
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
