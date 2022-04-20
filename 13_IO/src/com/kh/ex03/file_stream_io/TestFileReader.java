package com.kh.ex03.file_stream_io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class TestFileReader {

	public static void main(String[] args) {
		// ���ڿ��� �о���� Reader�� ����
		FileReader fr = null;
		try {
//			fr = new FileReader("./test.txt");  
//			fr = new FileReader("./covid.txt");  
//			fr = new FileReader("./covid_UTF16.txt");   // CharSet �̽�
			// FileReader(String fileName, Charset charset) // BOM ���� �ʼ�!
			fr = new FileReader("./covid_UTF16.txt", Charset.forName("UTF-16"));  	
			// UTF-16���� encoding ���� ����!
			
			// buffer�� �о���� ���
			char[] buf = new char[1024]; // buffer = �ӽð���, �������
			while(fr.read(buf) > 0) { // ���Ͽ��� buffer ũ�⸸ŭ �о���� ���
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
