package com.kh.ex01.generic;

// 제네릭으로 구성된 자체 배열을 만들어보자!
public class MyGenericArray<T> { 
	// 제네릭이란? Type을 사용자가 외부에서 주입 시켜 정의하는 문법.
	// T는 Type의 약자로 활용, <T>로 외부에서 타입을 주입시켜서 내부에서 Type 대체된다.
	// T는 정해져 있지 않은 상태에서 활용이 가능하다.
	private Object[] array;
	private int index = 0;
	
	public MyGenericArray(int size) {
		array = new Object[size];
	}
	
	public int add(T data) {
		if(index >= array.length) {
			return -1;
		}
		array[index++] = data;
		return index;
	}
	
	public T get(int index) {
		if(index < 0 || index >= this.index) {
			return null;
		}
		return (T)array[index];
	}
}

