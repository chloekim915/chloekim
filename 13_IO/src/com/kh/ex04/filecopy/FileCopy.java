package com.kh.ex04.filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	// File IO시 Close 없는 버전으로 작성 
	// -> Try-catch resource 버전 문법, 자바7 이후로 가능
	
	// 전체 파일 용도 (Binary + 문자열 모두 됨)
	// source = 원본, dest = 카피 되는 파일 
	// 가장 고전적인 방법으로 파일 카피! = 고전 = 느리다.
	public static int fileCopyStreamVer(File source, File dest) {
		int fileSize = 0;
		
		try ( FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(dest);
				) {
			int read = 0;
			while((read = fis.read()) > -1) {
				fos.write(read);
				fileSize++;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -1; // error 설계
		}
		
		return fileSize;
	}
	
	// source = 원본, dest = 카피 되는 파일 
	public static int fileCopyReadWriteVer(File source, File dest) {
		int fileSize = 0;
		
		try ( FileReader fr = new FileReader(source);
			  FileWriter fw = new FileWriter(dest); ) {
			int read = 0;
			while( (read = fr.read()) > -1 ) {
				fw.write(read);
				fileSize++;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -1; // error
		}
		return fileSize;
	}
	
	public static void main(String[] args) {
		File source1 = new File("./covid.txt");
		File dest1 = new File("./copy1_covid.txt");
		File dest2 = new File("./copy2_covid.txt");
		
		int result1 = FileCopy.fileCopyStreamVer(source1, dest1);
		int result2 = FileCopy.fileCopyReadWriteVer(source1, dest2);
		if(result2 == -1) {
			System.out.println("파일 복사에 실패했습니다!");
		}
		
		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result2);
//		result1 : 12128 - file의 크기
//		result2 : 9128  - 한글을 2byte, 영문은 1byte씩 했을때의 문자의 길이
		
		//---------------------------------------------------------------
		File source3 = new File("./covid_UTF16.txt");
		File dest3 = new File("./copy1_covid_UTF16.txt");
		File dest4 = new File("./copy2_covid_UTF16.txt");
		
		int result3 = FileCopy.fileCopyStreamVer(source3, dest3);
		int result4 = FileCopy.fileCopyReadWriteVer(source3, dest4);
		
		System.out.println("result3 : "+ result3);
		System.out.println("result4 : "+ result4);

		// ---------------------------------------------------------------
		File source5 = new File("./images.jpg");
		File dest5 = new File("./copy1_images.jpg");
		File dest6 = new File("./copy2_images.jpg");

		int result5 = FileCopy.fileCopyStreamVer(source5, dest5);
		int result6 = FileCopy.fileCopyReadWriteVer(source5, dest6);

		System.out.println("result5 : " + result5);
		System.out.println("result6 : " + result6);

		// 결론!!
		// Reader / Writer 사용시에는 binary파일 복사를 지원하지 않음! -> 쓰지말것!
		// 인코딩, binary(이미지, 동영상, 기타파일) 파일을 복사/전송 하기 위해선 Stream으로 복사 할것!
		
	}
}

