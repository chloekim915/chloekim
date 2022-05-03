package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List<Book> bookList = new ArrayList<>();

	public BookController() {
		bookList.add(new Book("자바의정석", "남궁성", "전공", 27000));
		bookList.add(new Book("이펙티브Java", "외국사람", "전공", 35000));
		bookList.add(new Book("그림으로 보는 운영체제", "일본인", "전공", 21000));
		bookList.add(new Book("원피스", "육다", 	"만화", 8000));
		bookList.add(new Book("화산귀환", "만화가", "만화", 12000));
		bookList.add(new Book("귀멸의칼날", "악어", "만화", 8000));
	}

	public void insertBook(Book bk) {
		bookList.add(bk);
	}

	public List<Book> selectList() {
		return bookList;
	}

	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> tempBook = new ArrayList<>();
		
		for(Book book : bookList) {
			if(book.getTitle().contains(keyword)) {
				tempBook.add(book);
			}
		}
		return tempBook;
	}

	public Book deleteBook(String title, String author) {
		for(Book book : bookList) {
			if(book.getTitle().equals(title) && book.getAuthor().equals(author)) {
				bookList.remove(book);
				return book;
			}
		}
		return null;
	}

	public int ascBook() {
		Collections.sort(bookList, new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getTitle().compareTo(o2.getTitle()); 	 // 오름 차순
//				return o2.getAuthor().compareTo(o1.getAuthor()); // 내림 차순
			}
		});
		return 1;
	}
}