package com.kh.ex04.overloading;

public class test {
	public void method1(int i){}
	public void method1(String str){}         // 1
	public void method1(int i, String str){}  // 2
	public void method1(int i, int k){}       // 5
	public void method1(String str, int i){}      // 7
}
