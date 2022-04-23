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
		System.out.println("1. 도서 추가 저장");
		System.out.println("2. 저장 도서 출력");
		System.out.println("9. 프로그램 끝내기");
		
		System.out.print("메뉴 번호 : ");
		int menunum = Integer.parseInt(sc.nextLine());
		
		switch (menunum) {
		case 1: fileSave(); break;
		case 2: fileRead(); break;
		case 9: System.out.println("프로그램 종료"); return;
		default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); continue;
		}
	}
}
	
	public void fileSave() {
		System.out.print("도서 명 : ");
		String title = sc.nextLine();

		System.out.print("저자 명 : ");
		String autor = sc.nextLine();;
		
		System.out.print("도서 가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String date = sc.nextLine();
		int yyyy = Integer.parseInt(date.split("-")[0]);
		int mm = Integer.parseInt(date.split("-")[1]) - 1;
		int dd = Integer.parseInt(date.split("-")[2]);
		Calendar reCalendar = Calendar.getInstance();
		reCalendar.set(yyyy, mm, dd);
		
		System.out.print("할인율 : ");
		double discount = Double.parseDouble(sc.nextLine());
		// 입력 받은 출판날짜를 split()를 통해 년, 월, 일로 나누고 Calendar에 담음
		
		Book b = new Book(title, autor, price, reCalendar, discount);
		// 각 요소와 새로 만든 Calendar를 Book 객체에 담고
	
		for(int i = 0; i<bArr.length;i++) {
			if(bArr[i]==null) {
				bArr[i] = b; 
				break;
			}else{
				continue;
			}
		}
			
		bc.fileSave(bArr);
		// 비어있는 Book객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달
		
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
