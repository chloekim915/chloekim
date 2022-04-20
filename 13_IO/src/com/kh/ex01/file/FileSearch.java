package com.kh.ex01.file;

import java.io.File;

public class FileSearch {
	//재귀 프로그래밍 - Recursive Programming
	// -> 함수에서 본인 스스로를 호출하는 프로그래밍 기법
	public static void search(File file, int depth) {
		String tempStr = " ".repeat(depth);
		
		if(file.isFile() == true) { // 파일 일때
			System.out.println(tempStr + "└" + file.getName()); // 프린트
			return;
		}
		
		// 디렉토리(폴더) 일때
		System.out.println(tempStr + file.getName());
		File[] list = file.listFiles(); // 폴더일경우 자신이 가지고 있던 파일 리스트

		if(list == null || list.length == 0) {
			return;
		}
		
		for(File childFile : list) {
			search(childFile, depth + 1); // 자기 자신을 다시 호출
		}
	}
	
	public static void main(String[] args) {
		File file = new File("./"); // 시작점
		search(file, 0); 
	}
}

