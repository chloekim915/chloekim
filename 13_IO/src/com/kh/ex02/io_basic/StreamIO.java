package com.kh.ex02.io_basic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamIO {
	// Stream�̶�?
	// - Binary(����) �����͸� �ٷ�� Stream = 1byte�� ó�� ����
	// - ���ó : ����, ��Ʈ��ũ, ���α׷� ���� ����� ����� ���
	
	// IO ����Ҷ��� �ڵ� ��ũ��
	// 1. ���� ���ܿ� ����� IO��ü�� null�� �����Ѵ�. �̸��� �ձ��ڸ� �ٿ��� �����Ѵ�.
	// 2. try-catch���� ����.
	// 3. try ���ʿ��� IO��ü�� open�Ѵ�.
	// 4. �ʿ��� IO �۾��� �����Ѵ�. ���� while������ ó���Ѵ�.
	// 5. finally�� �����ϰ� ����� IO�� �ݴ´�.
	
	public static void main(String[] args) {
		InputStream  is = null;
		OutputStream os = null;
		
//		is = new InputStream(); // abstract(�߻�) Ŭ������ ���� �Ұ�!
//		is.read(); // ����ó�� �ʿ�!
		try {
			is = System.in;  // open ��ü�ϴ� �ڵ�, �ܼ� �Է�
			os = System.out; // �ܼ� ���
			
			System.out.println("���ڸ� �Է����ּ���.");
			int read = is.read();
			os.write(read); // �̰������� ���� write�� �������� ����. ������� ������ ���� �ڵ����� ���⵵ ��.
//			os.flush();
			// os�� ������ ����ϴ� ��� 2����.
			// 1. flush ��� : �߰��� �ݵ�� ������ �����͸� �о���ҵ� ��������� ���� ����
			// 2. close ��� : �ڿ� �����Ҷ� ��������� �ʿ�� flush ��� �ʿ�
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { // �ݵ�� 2�� try ó�� �ʿ�
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try { // �ݵ�� 2�� try ó�� �ʿ�
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
