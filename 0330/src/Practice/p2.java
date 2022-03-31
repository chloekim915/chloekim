package Practice;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		//키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 양수가 아닌 경우 중에서 0이면 "0이다", 0이 아니면 "음수다"를 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		System.out.println();

		System.out.println((num == 0? "0이다" : (num > 0 ? "양수다" : "음수다")));	

	}
}

