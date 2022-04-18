package com.kh.ex01.exception;

import java.io.File;
import java.io.IOException;

public class UseThrows2 {
	
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
	
	public static void main(String[] args) {
		try { //������ ���ܸ� ó���ϴ� try��
			method();
		} catch (IOException e) { //���ܸ� �޾��ִ� catch��
			e.printStackTrace();
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
			//���ܰ� �߻��ϸ� ó���ؾ��� ����
			// ��)�α׸� ��� �ٴ���..e-mail�� �����ٴ���.
		}
	}

}
