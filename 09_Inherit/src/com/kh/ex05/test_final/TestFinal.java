package com.kh.ex05.test_final;

final public class TestFinal { //상속 불가
	public static final int MAX_SIZE = 10;; //변경 불가
	//public static final = 숙어, 상수
	public final void myMethod(final int finalValue) { //오버라이딩 불가
//		finalValue = 100; //변경 불가
	}

}
