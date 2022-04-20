package com.kh.ex01.file;

import java.io.File;
import java.util.Arrays;

public class FileBasic {
	
	// 파일 경로(path)란?
	// File이 저장 되어 있는 보조기억장치(HDD, SSD)의 경로(위치)
	
	// 절대경로 vs 상대경로
	// 1. 절대 경로
	// Root (윈도우 : C:\, 리눅스 : \)로 부터 표기되는 절대적인 경로
	// ex) C:\Users\text.txt
	// ex) C:\dev_source\workspace325\13_IO\copy1_covid.txt
	
	// 2. 상대 경로
	// 프로그램의 실행 위치로부터의 표기되는 상대적인 경로 '.', '..'으로 표기되는 경로
	// '.' : 현재위치
	// '..' : 상위폴더 위치
	// ex) ./covid.txt, 
	
	public static void main(String[] args) {
		File file1 = new File("./covid.txt"); //상대경로
		
		
		//경로 출력하기
		System.out.println(file1.getPath());
		System.out.println(file1.getAbsolutePath());
		
		//권한 설정
		file1.setWritable(false);
		System.out.println(file1.canWrite());
		file1.setWritable(true);
		System.out.println("------------");
		
		// 파일 존재여부
		System.out.println("파일 존재 : " + file1.exists());
		System.out.println("파일 존재 : " + new File("./test.txt").exists());
		
		//삭제
//		file1.delete();
		
		//디렉토리 = 폴더
		File folder = new File(".");
		if(folder.isDirectory() == true) {
			System.out.println("폴더입니다.");
		}
		System.out.println(Arrays.toString(folder.listFiles()));

	}

}
