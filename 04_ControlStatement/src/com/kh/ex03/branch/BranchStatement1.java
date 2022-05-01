package com.kh.ex03.branch;

//continue : 반복문을 스킵하는 키워드 (단, 반복문은 끝나지 않고 다음 스텝으로 넘어감!)
//break : 반복문을 벗어나는 문장(끝나는 문장) -> 반복문 아래의 실행문이 있으면 실행된다
//return : 메소드(함수)를 종료시키는 문장 -> 반복문 아래의 실행문이 실행되지 않는다

//반복문 분기를 종료시키는 2가지 방법
//break : 반복문이 종료되는 문장 -> 반복문은 끝나지만 반복문 아래가 계속 실행가능
//return : 반복문이 포함된 함수를 종료하는 문장 -> 함수 자체가 종료되는 문장

public class BranchStatement1 {
	public static void main(String[] args) {
//		짝수가 아닌 31의 배수를 찾아본다. 1~1000
//		갯수도 세본다. 10개만 찾고 끝낸다.
		int count = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0) {
				continue; //짝수이면 다시 시작! continue:아래문장을 실행하지 않고 i++로 돌아감
			}
	//		System.out.println(i); 1 3 5 7 9 11 ..
			if( i % 31 == 0) {
				System.out.println(i); //31 93 155 ...
				count++;//센다
				if(count == 10) {
					break; //반복문을 종료하는 키워드
					//return; 함수를 끝내는 키워드 -> 아래 count가 보이지않는다
				}
			}
		}
		System.out.println("count : " + count);
	}
}
