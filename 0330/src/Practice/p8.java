package Practice;

import java.util.Scanner;

public class p8 {
	public static void main(String[] args) {
		//주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.	
		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호를 입력하세요(-포함) : ");
		String num = sc.nextLine();

		System.out.println();

		if (num.charAt(7) == '2') { 
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
	}
}
