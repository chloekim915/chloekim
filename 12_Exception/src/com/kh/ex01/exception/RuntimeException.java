package com.kh.ex01.exception;

public class RuntimeException {
	public static void main(String[] args) {
		// ArithmeticException 숫자연산오류 
//		int a = 10 / 0;
		
		// ArrayIndexOutOfBoundsException 배열 범위 밖 오류
//		int[] array = new int[10];
//		array[12] = 10;

		
		// NegativeArraySizeException 배열사이즈를 음수로 줬을 때
//		array = new int[-1];
		
		// NullPointerException 사용할 객체를 생성 후 인스턴스를 생성하지 않고 null오브젝트를 사용하려 할 경우
//		array = null;
//		array[10] = 10;
		
		// ClassCastException 타입이 다름
//		Object obj = new Object();
//		String str = (String)obj;
		
		// Run time error 아님.
		// System Error / OutOfMemoryError : Required array length too large
//		String str = "11248901284092187409281490128490";
//		while(true) {
//			str += str;
//		}
		
		//java.lang.OutOfMemoryError: Java heap space heap의 공간영역 부족
//		String str = "11248901284092187409281490128490";
//		StringBuffer sb = new StringBuffer();
//		while(true) {
//			sb.append(str);
//		}
		
		// java.lang.StackOverflowError
		method(); // 무한루프
	}
	
	public static void method() {
		int temp = 0;
		method();

}
}

