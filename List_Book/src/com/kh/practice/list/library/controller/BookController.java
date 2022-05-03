package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List<Book> bookList = new ArrayList<>();

	public BookController() {
		bookList.add(new Book("�ڹ�������", "���ü�", "����", 27000));
		bookList.add(new Book("����Ƽ��Java", "�ܱ����", "����", 35000));
		bookList.add(new Book("�׸����� ���� �ü��", "�Ϻ���", "����", 21000));
		bookList.add(new Book("���ǽ�", "����", 	"��ȭ", 8000));
		bookList.add(new Book("ȭ���ȯ", "��ȭ��", "��ȭ", 12000));
		bookList.add(new Book("�͸���Į��", "�Ǿ�", "��ȭ", 8000));
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
				return o1.getTitle().compareTo(o2.getTitle()); 	 // ���� ����
//				return o2.getAuthor().compareTo(o1.getAuthor()); // ���� ����
			}
		});
		return 1;
	}
}