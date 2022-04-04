package com.kh.ex01.ArrayBasic;

import java.util.Arrays;

public class ArrayBasic {
	public static void main(String[] args) {
		System.out.println("1. 배열 기본 생성법");
		
		int[] array = null; //null로 초기화 가능하면? 참조형 변수
		array = new int[10]; //10개의 공간을 Heap에서 생성하고, array변수에 주소값을 할당
							 //배열(객체)은 생성과 동시에 모든 값이 0으로 초기화 된다.
		
		System.out.println(array[0]); //초기값 : 0
		System.out.println(array[1]); //초기값 : 0
		
//		사용자가 직접 접근하여 초기화(할당)하는 문법
		array[0] = 0;
		array[1] = 0;
		array[2] = 0;
		
//		순회는 반복문으로, i는 index의 약자
		for(int i=0; i < 10; i++) {
//		for(int i = 0; i < = 9; i++_ ) { 이 문법으로 쓰지말것
			array[i] = i;
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		System.out.println("2.배열 직접 선언하는 방법");
		int[] array2 = new int[10]; //선언의 표준적인 방법
		int[] array3 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //크기 지정하지 않고 초기화
//		int[] array4 = new int[5] {1, 2, 3, 4, 5,}; //크기 지정하면 에러 발생
		
		// Hard 코딩 : 사람이 직접 상수나 특정 데이터를 입력하는 방법
		// Hard 코딩의 문제점 : 동적인 상황이나 실수에 대처가 되지 않음!
		//		for(int i = 0; i < 10; i++ ) { 
		//			System.out.print(array3[i] +" ");
		//		} // 모든 값이 출력되지 않음!! -> 엄청 큰 문제!!

		//		for(int i = 0; i < 20; i++ ) { 
		//			System.out.print(array3[i] +" ");
		//		} // ArrayIndexOutOfBoundsException 배열의 범위를 뛰어넘어서 에러 발생!
		
		// ★★★★★배열에서 Length를 Hard 코딩 안하는 방법 << 외워야한다.
		for(int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
		
		System.out.println("3.배열 가장 표준적으로 사용하는 방법");
		int[] array5 = new int[12]; //선언 및 0으로 초기화하는 문법
		
		for(int i = 0; i < array5.length; i++) {
			System.out.println(array5[i]);
		}
		
//		문자열 배열
		String[] strArray = new String[] {"사과", "바나나", "딸기"};
//		for문 안쓰고 내용을 출력하는 방법
		System.out.println(Arrays.toString(strArray)); //int나 다른 타입도 가능
	}
}
