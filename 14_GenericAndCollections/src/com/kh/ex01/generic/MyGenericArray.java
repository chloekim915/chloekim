package com.kh.ex01.generic;

// ���׸����� ������ ��ü �迭�� ������!
public class MyGenericArray<T> { 
	// ���׸��̶�? Type�� ����ڰ� �ܺο��� ���� ���� �����ϴ� ����.
	// T�� Type�� ���ڷ� Ȱ��, <T>�� �ܺο��� Ÿ���� ���Խ��Ѽ� ���ο��� Type ��ü�ȴ�.
	// T�� ������ ���� ���� ���¿��� Ȱ���� �����ϴ�.
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

