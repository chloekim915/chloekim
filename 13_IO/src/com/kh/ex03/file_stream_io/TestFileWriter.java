package com.kh.ex03.file_stream_io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	// Write=append ������ ������
	// 1. �Ϲ� Write ���� ������ ���� ������ ������ �������� ����
	// 2. ���� �̾�⸦ ���ؼ��� open(��ü����)�� Append �ɼ� ���
	// 3. Write�� ���� �������� �ݵ�� Close�� �־���ϰ�, �ɼ����� flush ����� �ʿ�
	//    Close : ���� ���� ���� �� �ڿ�����, flush : ���� ���߿� ���Ϸ� ���� ������ ��ɾ��ϴ� �Լ�
	// 4. ���ڿ� ���õ� �����ؾ��Ѵ�. �������� ���� ��� workspace default���� ���󰣴�.
	
	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
//			fw = new FileWriter("./test2.txt"); 	  // �Ϲݾ���
			fw = new FileWriter("./test2.txt", true); // �̾��
			
//			fw.append("�ȳ��ϼ���?\n�ݰ����ϴ�.\n");
			fw.append("���� ȫ�浿�Դϴ�.");
			fw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
