package com.kh.ex01.conditional;
import java.util.Scanner;
public class IfStatement3 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("ID�� �Է����ּ���!");
		String id = sc.nextLine();
		
		if(id.length() < 3) {
			System.out.println("ID�� ª���ϴ�.");
		}
		
		System.out.println("PW�� �Է����ּ���!");
		String password = sc.nextLine();
		
		if(password.length() < 8) {
			System.out.println("Password�� ª���ϴ�!");
			return; 
		}
		
		if(password.contains(id) == true) {
			System.out.println("�н����忡 ID�� ���ԵǾ� �ֽ��ϴ�.");
			return; 
		}
		
		// ���ܸ� ��� ó���Ѵ�!
		if( password.length() < 8 || password.contains(id) == true ) {
			System.out.println("Password ª�ų� id�� ���ԵǾ� �ֽ��ϴ�.");
			return;
		}
		
		System.out.println("�����Ͽ����ϴ�. ID : " + id + ", PW : " +  password);
	}
}

//���ܸ� ���� if�� + return���� ���͸��ϰ� �������� ��Ȳ�� ó���ϵ��� �ڵ带 �����Ѵ�.

