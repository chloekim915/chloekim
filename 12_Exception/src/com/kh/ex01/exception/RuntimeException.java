package com.kh.ex01.exception;

public class RuntimeException {
	public static void main(String[] args) {
		// ArithmeticException ���ڿ������ 
//		int a = 10 / 0;
		
		// ArrayIndexOutOfBoundsException �迭 ���� �� ����
//		int[] array = new int[10];
//		array[12] = 10;

		
		// NegativeArraySizeException �迭����� ������ ���� ��
//		array = new int[-1];
		
		// NullPointerException ����� ��ü�� ���� �� �ν��Ͻ��� �������� �ʰ� null������Ʈ�� ����Ϸ� �� ���
//		array = null;
//		array[10] = 10;
		
		// ClassCastException Ÿ���� �ٸ�
//		Object obj = new Object();
//		String str = (String)obj;
		
		// Run time error �ƴ�.
		// System Error / OutOfMemoryError : Required array length too large
//		String str = "11248901284092187409281490128490";
//		while(true) {
//			str += str;
//		}
		
		//java.lang.OutOfMemoryError: Java heap space heap�� �������� ����
//		String str = "11248901284092187409281490128490";
//		StringBuffer sb = new StringBuffer();
//		while(true) {
//			sb.append(str);
//		}
		
		// java.lang.StackOverflowError
		method(); // ���ѷ���
	}
	
	public static void method() {
		int temp = 0;
		method();

}
}

