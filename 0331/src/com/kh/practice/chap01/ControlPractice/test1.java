package com.kh.practice.chap01.ControlPractice;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		
//	위 문제와 모든 것이 동일하나, 9를 초과하는 숫자가 입력됐다면
//	“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//	Scanner sc = new Scanner(System.in);
//
//
//	System.out.print("점수 : ");
//	int num1 = sc.nextInt();
//}
//

	Scanner sc = new Scanner(System.in);
	System.out.print("정수를 하나 입력하세요: ");
	int sum = 0;
	int num = sc.nextInt();

	for (int i = 1; i < num ; i++) {
		System.out.print(i + " + ");
		sum = sum+i;
	}
	sum = num + sum;
	System.out.println(num + " = " + sum);

	sc.close();
	System.out.println("=============================");
}
}