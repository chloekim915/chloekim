package com.kh.ex02.SearchArray;

import java.util.Arrays;
import java.util.Random;

public class ArraySearch {
	// �迭�� Ư���� ������ �ʱ�ȭ �ϰ�, �� �迭���� Ư���� ã�Ƴ��� ���
	
	public static int[] array; // static(�۷ι�)������ array ����!
	public static final int MAX_SIZE = 100000; // ���
	
	public static Random random = new Random(System.currentTimeMillis());
	// �Ϻ��� ������ �̾� ���� ���!
	// ���� = ��ǻ�Ϳ��� �ǻ糭�� = Ư���� �������� ������ �̾Ƴ��¹�!
	// �ǻ糭���� ������ : ���� �����ϴ�.
	// �ǻ糭���� �Ϻ��� ������ �ٲٱ� ���ؼ� Seed ���� �ʿ��ѵ�, �װ��� �ð����� ����Ѵ�.
	//	System.currentTimeMillis() : ����ð��� long������ �����ϰ� �ִ� �ý��� ����.
	//                               since 1970-01-01 00:00:00.000

	
	// ����� �迭�� ������ �ʱ�ȭ�ϴ� �Լ�
	public static void init() { // initialize = �ʱ�ȭ �� 
		array = new int[MAX_SIZE]; // �迭�� MAX_SIZE ��ŭ ���� 
		for(int i = 0; i < array.length; i++) { // MAX_SIZE�� ���⸦ ����!!
			array[i] = randomValue();
		}
	}
	
	// Ư���� ���� ���� �������� �Լ� 
	// return XXX�� �Լ����� ����ϴ� ���� ���� ���� ���� ����!
	public static int randomValue() {
		int randomVal = random.nextInt(MAX_SIZE);
		return randomVal;
	}
	
	// index�� ���ؼ� ���� Ž���ϴ� �˰���
	public static int search(int searchValue) {
		for(int i = 0; i < array.length; i++) { // i���� ������ ��ȸ�ϴ� �ڵ�
			if(array[i] == searchValue) {
				return i; // ã�� ���, index�� ��ȯ�Ѵ�. 
			}
		}
		return -1; // ���� ��� -1�� ����
	}

	// String[] args : Java������κ��� Ư�� ���ڿ� ����� �޾Ƶ��̴� ����
	public static void main(String[] args) {
		init(); // �迭 �ʱ�ȭ �Լ�
		int pickValue = array[randomValue()]; // �迭���� Ư���� ���� �������� �̾ƿ�!
		long startTime = 0; // ����ð�
		long endTime = 0; // ������ �ð�
		int index = 0; // ã�� ��!
		
		System.out.println("pick = " + pickValue);
		
		// 1. ���� �ۼ��� search�� ���� Ž���ϰ�, �ð��� ����ϴ� ���
		startTime = System.currentTimeMillis(); // ����ð� ����
		for(int i = 0; i < 100000; i++) { // Ž���ð��� �ʹ� ���� �ɸ����� 100000�� ������!
			index = search(pickValue);
		}
		endTime = System.currentTimeMillis(); // Ž���� ������ �ð� ����
		
		System.out.println("ã�� index : " + index);
		System.out.println("ã�� �� : " + array[index]);
		System.out.println("ù��° �ɸ� �ð� : " + (endTime - startTime) +"ms");
		
		// 2. Binary Search�� ���� Ž���ϴ� ���
		startTime = System.currentTimeMillis(); // ����ð� ����
		
		Arrays.sort(array); // �迭�� ������������ �����ϴ� �Լ�
		for(int i = 0; i < 100000; i++) { // Ž���ð��� �ʹ� ���� �ɸ����� 100000�� ������!
			index = Arrays.binarySearch(array, pickValue); // �迭���� Ư������ Ž���ϴ� �Լ�
		}
		endTime = System.currentTimeMillis(); // Ž���� ������ �ð� ����
		
		System.out.println("ã�� index : " + index);
		System.out.println("ã�� �� : " + array[index]);
		System.out.println("�ι�° �ɸ� �ð� : " + (endTime - startTime) +"ms");
		
	}
}
