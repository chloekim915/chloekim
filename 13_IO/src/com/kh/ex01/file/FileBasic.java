package com.kh.ex01.file;

import java.io.File;
import java.util.Arrays;

public class FileBasic {
	
	// ���� ���(path)��?
	// File�� ���� �Ǿ� �ִ� ���������ġ(HDD, SSD)�� ���(��ġ)
	
	// ������ vs �����
	// 1. ���� ���
	// Root (������ : C:\, ������ : \)�� ���� ǥ��Ǵ� �������� ���
	// ex) C:\Users\text.txt
	// ex) C:\dev_source\workspace325\13_IO\copy1_covid.txt
	
	// 2. ��� ���
	// ���α׷��� ���� ��ġ�κ����� ǥ��Ǵ� ������� ��� '.', '..'���� ǥ��Ǵ� ���
	// '.' : ������ġ
	// '..' : �������� ��ġ
	// ex) ./covid.txt, 
	
	public static void main(String[] args) {
		File file1 = new File("./covid.txt"); //�����
		
		
		//��� ����ϱ�
		System.out.println(file1.getPath());
		System.out.println(file1.getAbsolutePath());
		
		//���� ����
		file1.setWritable(false);
		System.out.println(file1.canWrite());
		file1.setWritable(true);
		System.out.println("------------");
		
		// ���� ���翩��
		System.out.println("���� ���� : " + file1.exists());
		System.out.println("���� ���� : " + new File("./test.txt").exists());
		
		//����
//		file1.delete();
		
		//���丮 = ����
		File folder = new File(".");
		if(folder.isDirectory() == true) {
			System.out.println("�����Դϴ�.");
		}
		System.out.println(Arrays.toString(folder.listFiles()));

	}

}
