package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("�ظ�����", "����","�������̷Ѹ�");
		Book book3 = new Book("IQ84", "�Ϻ�", "����ī�� �Ϸ�Ű", 815, 99.9);
		
		book1.inform();
		book2.inform();
		book3.inform();
		
	}

}
