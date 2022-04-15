package com.kh.ex01.string_basic;

public class StringConstruct {
	//String 사용 Tip
	//1. String의 저장소는 Heap과 String constant pool 두가지가 있다.
	//2. String constant pool을 사용하는 것이 메모리 관리측면에서 유리하다.
	//3. String은 new 생성하지 않는다. //Heap을 생으로 사용하지 않는다.
	
	public static void main(String[] args){
	//String pool test
	String str1 = "Test String"; //표준, String constant pool
	String str2 = new String("Test String"); //Heap
	String str3 = str2.toString(); //Heap -> Heap constant pool
	String str4 = str3.intern(); //String constant pool
	
	System.out.println(str1.hashCode()); //객체를 유일하게 식별하기 위한 대표 값
	System.out.println(str2.hashCode()); 
	System.out.println(str3.hashCode()); 
	System.out.println(str4.hashCode()); 
	
	//equals는 hashCode 기반으로 비교함
	System.out.println("-------equals-------");
	System.out.println(str1.equals(str2));
	System.out.println(str1.equals(str3));
	System.out.println(str1.equals(str4));
	System.out.println("--------------------");
	System.out.println();
	
	//==는 메모자의 주소값으로 비교함
	System.out.println("-------==(비교)-------");
	System.out.println(str1 == str2);
	System.out.println(str1 == str3);
	System.out.println(str1 == str4);
	System.out.println("--------------------");
	System.out.println();
	
	System.out.println(System.identityHashCode(str1)); // 메모리 주소
	System.out.println(System.identityHashCode(str2));
	System.out.println(System.identityHashCode(str3));
	System.out.println(System.identityHashCode(str4));
	System.out.println();
	
	//문자열 초기화하는 방법 (강사 추천)
	String temp = ""; //공백으로 초기화
	temp += "123" + "," + "홍길동"; //null에러가 발생하지도 않고 쓰기 편리하다.
	System.out.println(temp);
	}
}
