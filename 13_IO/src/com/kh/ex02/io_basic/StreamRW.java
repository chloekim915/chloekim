package com.kh.ex02.io_basic;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class StreamRW {
	public static void main(String[] args) {
		// 문자열 데이터 (2byte씩 처리하는 기능)
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		try {
			// Open부
			isr = new InputStreamReader(System.in); // Stream -> Reader로 처리
			osw = new OutputStreamWriter(System.out); 
			
			osw.append("문자열을 입력해주세요.\n"); // append -> write 와 같은 기능, 실제 출력되지 않을수 있다.
			osw.flush(); // 출력을 위해 반드시 필요.
			
			// 문자열을 읽어오는 부
			char[] temp = new char[1024]; // buffer의 크기 선정할때는 2의 제곱으로 선언해야함
			int size = isr.read(temp); // Blocking 함수 -> 인풋이 들어와야 동작함
			
			osw.append("Read Size : " + size + "\n");
			osw.append(String.valueOf(temp) + "\n");
			osw.append(Arrays.toString(temp)+ "\n");
			osw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				osw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
