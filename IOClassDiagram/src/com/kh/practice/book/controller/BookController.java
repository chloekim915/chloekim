package com.kh.practice.book.controller;

import java.io.File;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	
	private BookDAO bd = new BookDAO();
	
	public void makeFile() {
		File file = new File("book.txt");
		
		if (file.exists()==false) {
			try {
				file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);
	}
	
	public Book[] fileRead() {
		return bd.fileRead();
	}
}
