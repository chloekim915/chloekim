package com.kh.ex01.exception;

import java.io.File;
import java.io.IOException;

public class Trycatch {
	

	public static void main(String[] args) {
		File file = new File("./test");
		try {
			file.createNewFile(); // 파일을 생성하는 문장
			throw new IOException("Test");
//			return; // return이 있어도 finally를 실행됨
		} catch (IOException e) {
			e.printStackTrace(); // 예외가 발생한 원인과 codeline을 알려주는 메소드
		} finally {
			System.out.println("예외가 발생하든 안하든 마지막으로 출력되는 문장!");
		}
		
	}
}
