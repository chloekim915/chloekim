package com.kh.ex02.io_basic;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class StreamRW {
	public static void main(String[] args) {
		// ���ڿ� ������ (2byte�� ó���ϴ� ���)
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		try {
			// Open��
			isr = new InputStreamReader(System.in); // Stream -> Reader�� ó��
			osw = new OutputStreamWriter(System.out); 
			
			osw.append("���ڿ��� �Է����ּ���.\n"); // append -> write �� ���� ���, ���� ��µ��� ������ �ִ�.
			osw.flush(); // ����� ���� �ݵ�� �ʿ�.
			
			// ���ڿ��� �о���� ��
			char[] temp = new char[1024]; // buffer�� ũ�� �����Ҷ��� 2�� �������� �����ؾ���
			int size = isr.read(temp); // Blocking �Լ� -> ��ǲ�� ���;� ������
			
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
