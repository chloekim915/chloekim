package com.kh.ex03.ArrayCopy;

import java.util.Arrays;

public class ArrayCopy {

	// 얕은 복사 : 배열의 주소지만 복사하여 동일한 배열을 활용하는 기법
	// 깊은 복사 : 배열의 주소지가 아니고, 실제 배열을 물리적으로 복사하는 기법
	
	public static void main(String[] args) {
		int[] array1 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, };
		int[] array2 = array1; // 얕은 복사 Shallow copy 
		
		array1[1] = 10;
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		int[] array3 = null;
		// deep copy, 깊은 복사 ★★★★★
		array3 = Arrays.copyOf(array1, array1.length); // 방법1 ★★★★★
//		array3 = array1.clone(); 			   		   // 방법2
		
		array3 = new int[array1.length];
		for(int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		} // 방법3 가장 고전적인 방법. 코드는 알아야 한다.
		
		array1[2] = 1000; 
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array3));
	}
}

