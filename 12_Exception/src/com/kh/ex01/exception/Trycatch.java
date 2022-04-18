package com.kh.ex01.exception;

import java.io.File;
import java.io.IOException;

public class Trycatch {
	

	public static void main(String[] args) {
		File file = new File("./test");
		try {
			file.createNewFile(); // ������ �����ϴ� ����
			throw new IOException("Test");
//			return; // return�� �־ finally�� �����
		} catch (IOException e) {
			e.printStackTrace(); // ���ܰ� �߻��� ���ΰ� codeline�� �˷��ִ� �޼ҵ�
		} finally {
			System.out.println("���ܰ� �߻��ϵ� ���ϵ� ���������� ��µǴ� ����!");
		}
		
	}
}
