package com.kh.ex01.exception;

import java.io.File;
import java.io.IOException;

public class UseThrows {
	
//		throws : ���� �߻��� ���� �޼ҵ忡�� å���� �����ϴ� Ű����
//				 ��, main������ ���ܴ� ���α׷� ���Ḧ �ǹ�
	
//		throw : ���ܸ� ���� ������ ����
	
	public static void method() throws IOException {
		File file = new File("./Test");
		file.createNewFile(); //IOException �߻�, ��ǥ������ ������� ����
		System.out.println("TEST1");
		
		if(true)
			throw new IOException("TEST");
		System.out.println("TEST2"); //���� �߻��� �Ʒ��� ������ ������� ����
	}
	
	public static void main(String[] args) throws IOException {
		method();
	}

}
