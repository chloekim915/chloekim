package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member mb = new Member();
		
		mb.changeName("±Ë≈¬¿∫");
		mb.printName();
	}

}