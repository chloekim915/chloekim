package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("해리포터", "영국","조앤케이롤링");
		Book book3 = new Book("IQ84", "일본", "무라카미 하루키", 815, 99.9);
		
		book1.inform();
		book2.inform();
		book3.inform();
		
	}

}
