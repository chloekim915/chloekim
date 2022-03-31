package Practice;

import java.util.Scanner;

public class p6 {
	public static void main(String[] args) {
		//나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());

		System.out.println();

		System.out.println(age == 13? "어린이" : (age <= 19 ? "청소년" : "성인"));
	}

}
