package Practice;

import java.util.Scanner;

public class p10 {
	public static void main(String[] args) {
		//3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력3 : ");
		int num3 = sc.nextInt();

		System.out.println();

		if (num1 == num2 && num2 == num3 & num1 == num3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
