package Practice;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		//	System.out.println(new Scanner(Systemin).nextLine());

		if (num1 > 0) {
			System.out.println("양수다");
		} else {
			System.out.println("양수가 아니다");
		}		
	}
}
