package com.kh.ex01.ArrayBasic;

import java.util.Arrays;

public class ArrayBasic {
	public static void main(String[] args) {
		System.out.println("1. �迭 �⺻ ������");
		
		int[] array = null; //null�� �ʱ�ȭ �����ϸ�? ������ ����
		array = new int[10]; //10���� ������ Heap���� �����ϰ�, array������ �ּҰ��� �Ҵ�
							 //�迭(��ü)�� ������ ���ÿ� ��� ���� 0���� �ʱ�ȭ �ȴ�.
		
		System.out.println(array[0]); //�ʱⰪ : 0
		System.out.println(array[1]); //�ʱⰪ : 0
		
//		����ڰ� ���� �����Ͽ� �ʱ�ȭ(�Ҵ�)�ϴ� ����
		array[0] = 0;
		array[1] = 0;
		array[2] = 0;
		
//		��ȸ�� �ݺ�������, i�� index�� ����
		for(int i=0; i < 10; i++) {
//		for(int i = 0; i < = 9; i++_ ) { �� �������� ��������
			array[i] = i;
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		System.out.println("2.�迭 ���� �����ϴ� ���");
		int[] array2 = new int[10]; //������ ǥ������ ���
		int[] array3 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //ũ�� �������� �ʰ� �ʱ�ȭ
//		int[] array4 = new int[5] {1, 2, 3, 4, 5,}; //ũ�� �����ϸ� ���� �߻�
		
		// Hard �ڵ� : ����� ���� ����� Ư�� �����͸� �Է��ϴ� ���
		// Hard �ڵ��� ������ : ������ ��Ȳ�̳� �Ǽ��� ��ó�� ���� ����!
		//		for(int i = 0; i < 10; i++ ) { 
		//			System.out.print(array3[i] +" ");
		//		} // ��� ���� ��µ��� ����!! -> ��û ū ����!!

		//		for(int i = 0; i < 20; i++ ) { 
		//			System.out.print(array3[i] +" ");
		//		} // ArrayIndexOutOfBoundsException �迭�� ������ �پ�Ѿ ���� �߻�!
		
		// �ڡڡڡڡڹ迭���� Length�� Hard �ڵ� ���ϴ� ��� << �ܿ����Ѵ�.
		for(int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
		
		System.out.println("3.�迭 ���� ǥ�������� ����ϴ� ���");
		int[] array5 = new int[12]; //���� �� 0���� �ʱ�ȭ�ϴ� ����
		
		for(int i = 0; i < array5.length; i++) {
			System.out.println(array5[i]);
		}
		
//		���ڿ� �迭
		String[] strArray = new String[] {"���", "�ٳ���", "����"};
//		for�� �Ⱦ��� ������ ����ϴ� ���
		System.out.println(Arrays.toString(strArray)); //int�� �ٸ� Ÿ�Ե� ����
	}
}
