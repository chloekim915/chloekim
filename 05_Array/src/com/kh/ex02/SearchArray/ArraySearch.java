package com.kh.ex02.SearchArray;

import java.util.Arrays;
import java.util.Random;

public class ArraySearch {
	// 배열의 특정한 난수를 초기화 하고, 그 배열에서 특정값 찾아내는 방법
	
	public static int[] array; // static(글로벌)영역에 array 선언!
	public static final int MAX_SIZE = 100000; // 상수
	
	public static Random random = new Random(System.currentTimeMillis());
	// 완벽한 난수를 뽑아 내는 방법!
	// 난수 = 컴퓨터에서 의사난수 = 특정한 공식으로 난수를 뽑아내는법!
	// 의사난수의 문제점 : 유추 가능하다.
	// 의사난수를 완벽한 난수로 바꾸기 위해선 Seed 값이 필요한데, 그것을 시간으로 사용한다.
	//	System.currentTimeMillis() : 현재시간을 long값으로 저장하고 있는 시스템 변수.
	//                               since 1970-01-01 00:00:00.000

	
	// 선언된 배열에 난수로 초기화하는 함수
	public static void init() { // initialize = 초기화 문 
		array = new int[MAX_SIZE]; // 배열을 MAX_SIZE 만큼 생성 
		for(int i = 0; i < array.length; i++) { // MAX_SIZE를 쓰기를 비추!!
			array[i] = randomValue();
		}
	}
	
	// 특정한 랜덤 값을 가져오는 함수 
	// return XXX로 함수에서 사용하던 로컬 변수 값을 리턴 가능!
	public static int randomValue() {
		int randomVal = random.nextInt(MAX_SIZE);
		return randomVal;
	}
	
	// index를 통해서 순차 탐색하는 알고리즘
	public static int search(int searchValue) {
		for(int i = 0; i < array.length; i++) { // i부터 끝까지 순회하는 코드
			if(array[i] == searchValue) {
				return i; // 찾은 경우, index를 반환한다. 
			}
		}
		return -1; // 없는 경우 -1로 리턴
	}

	// String[] args : Java명령으로부터 특정 문자열 명령을 받아들이는 인자
	public static void main(String[] args) {
		init(); // 배열 초기화 함수
		int pickValue = array[randomValue()]; // 배열에서 특정한 값을 랜덤으로 뽑아옴!
		long startTime = 0; // 현재시간
		long endTime = 0; // 끝나는 시간
		int index = 0; // 찾은 값!
		
		System.out.println("pick = " + pickValue);
		
		// 1. 현재 작성한 search를 통해 탐색하고, 시간을 계산하는 방법
		startTime = System.currentTimeMillis(); // 현재시간 저장
		for(int i = 0; i < 100000; i++) { // 탐색시간이 너무 적게 걸림으로 100000번 돌린다!
			index = search(pickValue);
		}
		endTime = System.currentTimeMillis(); // 탐색한 마지막 시간 저장
		
		System.out.println("찾은 index : " + index);
		System.out.println("찾은 값 : " + array[index]);
		System.out.println("첫번째 걸린 시간 : " + (endTime - startTime) +"ms");
		
		// 2. Binary Search를 통해 탐색하는 방법
		startTime = System.currentTimeMillis(); // 현재시간 저장
		
		Arrays.sort(array); // 배열을 오름차순으로 정렬하는 함수
		for(int i = 0; i < 100000; i++) { // 탐색시간이 너무 적게 걸림으로 100000번 돌린다!
			index = Arrays.binarySearch(array, pickValue); // 배열에서 특정값을 탐색하는 함수
		}
		endTime = System.currentTimeMillis(); // 탐색한 마지막 시간 저장
		
		System.out.println("찾은 index : " + index);
		System.out.println("찾은 값 : " + array[index]);
		System.out.println("두번째 걸린 시간 : " + (endTime - startTime) +"ms");
		
	}
}
