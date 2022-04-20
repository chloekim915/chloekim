package com.kh.ex03.file_stream_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {
	
//	FileInputStream ������ 3����
//	1. File ��ü�� ���� file�� ���� ���
//	2. ��� ��θ� ���� file�� ���� ��� ��
//	3. ���� ��θ� ���� file�� ���� ��� �ذ����� ���� ����
	
	public static void main(String[] args) {
		// ���ڿ��� �о���� IO ��ü�� �ƴ�!
		FileInputStream fis = null;
		
		try {
			// ���º�
			// 1. ���� ��ü Ȱ��
//			File file = new File("./test.txt");
//			fis = new FileInputStream(file);
			
			// 2. ���� �Ǵ� ����η� Ȱ��
			fis = new FileInputStream("./test.txt");  // ���� ���ϵ� ���������� �о� ���̴� ��ȲX
//			fis = new FileInputStream("./covid.txt"); // ���ڵ� �̽��� �߻�. �ѱ��̶�
			
			// �˰����
			int read = 0;
			while((read = fis.read()) >= 0) { // ���Ͽ��� 1byte �о���� �ڵ�
				System.out.print((char)read);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Ŭ���� ��
			if(fis != null) { // ���� ������ �Ǿ������� Close
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}

