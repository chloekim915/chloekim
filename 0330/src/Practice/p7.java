package Practice;

import java.util.Scanner;

public class p7 {
	public static void main(String[] args) {
		//국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고, 세 과목에 대한 합계와 평균을 구하세요.
		//세과목의 점수와 평균을 가지고 합격 여부를 처리하는데, 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		int test1 = Integer.parseInt(sc.nextLine());

		System.out.print("영어 : ");
		int test2 = Integer.parseInt(sc.nextLine());

		System.out.print("수학 : ");
		int test3 = Integer.parseInt(sc.nextLine());
		int total = (test1 + test2 + test3);

		System.out.println();

		System.out.println("합계 : " + total);

		System.out.println("평균 : " + ((double)total)/3.0);

		if (test1 >= 40 && test2 >= 40 && test3 >= 40 && (((double)total)/3.0) >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

	}
}
