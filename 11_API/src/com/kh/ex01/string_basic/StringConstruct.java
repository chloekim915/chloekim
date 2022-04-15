package com.kh.ex01.string_basic;

public class StringConstruct {
	//String ��� Tip
	//1. String�� ����Ҵ� Heap�� String constant pool �ΰ����� �ִ�.
	//2. String constant pool�� ����ϴ� ���� �޸� �������鿡�� �����ϴ�.
	//3. String�� new �������� �ʴ´�. //Heap�� ������ ������� �ʴ´�.
	
	public static void main(String[] args){
	//String pool test
	String str1 = "Test String"; //ǥ��, String constant pool
	String str2 = new String("Test String"); //Heap
	String str3 = str2.toString(); //Heap -> Heap constant pool
	String str4 = str3.intern(); //String constant pool
	
	System.out.println(str1.hashCode()); //��ü�� �����ϰ� �ĺ��ϱ� ���� ��ǥ ��
	System.out.println(str2.hashCode()); 
	System.out.println(str3.hashCode()); 
	System.out.println(str4.hashCode()); 
	
	//equals�� hashCode ������� ����
	System.out.println("-------equals-------");
	System.out.println(str1.equals(str2));
	System.out.println(str1.equals(str3));
	System.out.println(str1.equals(str4));
	System.out.println("--------------------");
	System.out.println();
	
	//==�� �޸����� �ּҰ����� ����
	System.out.println("-------==(��)-------");
	System.out.println(str1 == str2);
	System.out.println(str1 == str3);
	System.out.println(str1 == str4);
	System.out.println("--------------------");
	System.out.println();
	
	System.out.println(System.identityHashCode(str1)); // �޸� �ּ�
	System.out.println(System.identityHashCode(str2));
	System.out.println(System.identityHashCode(str3));
	System.out.println(System.identityHashCode(str4));
	System.out.println();
	
	//���ڿ� �ʱ�ȭ�ϴ� ��� (���� ��õ)
	String temp = ""; //�������� �ʱ�ȭ
	temp += "123" + "," + "ȫ�浿"; //null������ �߻������� �ʰ� ���� ���ϴ�.
	System.out.println(temp);
	}
}
