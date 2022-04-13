package com.kh.ex02.text_inherit;

public class Run { 
	
	public static void main(String[] args) {
		System.out.println("SuperClass 持失!");
		new SuperClass();
		System.out.println("SuperClass 持失 魁!");
		System.out.println("");
		
		System.out.println("ChildClass 持失!");
		new ChildClass().publicMethod();
		System.out.println("ChildClass 持失 魁!");
	}

}
