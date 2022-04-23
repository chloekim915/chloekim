package com.kh.practice.book.view;

import java.io.File;
import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	public Book[] bArr;
	
	public BookMenu() {
		bc.makeFile();
		File file = new File("book.txt");
		
		if(file.exists()) {
			bArr = bc.fileRead();
			return;
		} 
		
		bc.makeFile();
		bArr = new Book[10];
	}
	
	public void mainMenu() {
		while (true) {
		System.out.println("1. ���� �߰� ����");
		System.out.println("2. ���� ���� ���");
		System.out.println("9. ���α׷� ������");
		
		System.out.print("�޴� ��ȣ : ");
		int menunum = Integer.parseInt(sc.nextLine());
		
		switch (menunum) {
		case 1: fileSave(); break;
		case 2: fileRead(); break;
		case 9: System.out.println("���α׷� ����"); return;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); continue;
		}
	}
}
	
	public void fileSave() {
		System.out.print("���� �� : ");
		String title = sc.nextLine();

		System.out.print("���� �� : ");
		String autor = sc.nextLine();;
		
		System.out.print("���� ���� : ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� ��¥(yyyy-mm-dd) : ");
		String date = sc.nextLine();
		int yyyy = Integer.parseInt(date.split("-")[0]);
		int mm = Integer.parseInt(date.split("-")[1]) - 1;
		int dd = Integer.parseInt(date.split("-")[2]);
		Calendar reCalendar = Calendar.getInstance();
		reCalendar.set(yyyy, mm, dd);
		
		System.out.print("������ : ");
		double discount = Double.parseDouble(sc.nextLine());
		// �Է� ���� ���ǳ�¥�� split()�� ���� ��, ��, �Ϸ� ������ Calendar�� ����
		
		Book b = new Book(title, autor, price, reCalendar, discount);
		// �� ��ҿ� ���� ���� Calendar�� Book ��ü�� ���
	
		for(int i = 0; i<bArr.length;i++) {
			if(bArr[i]==null) {
				bArr[i] = b; 
				break;
			}else{
				continue;
			}
		}
			
		bc.fileSave(bArr);
		// ����ִ� Book��ü �迭(bArr)�� ��� bc�� fileSave()�� �Ű������� ����
		
	}
	
	public void fileRead() {
		bArr = bc.fileRead();
		
		for(int i = 0; i < bArr.length; i++) {
			if(bArr[i] == null) {
				break;
			}
			if(bArr[i] != null) {
				System.out.println(bArr[i].toString());
			}
		}
	}
	
}
