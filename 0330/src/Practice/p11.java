package Practice;

import java.util.Scanner;

public class p11 {
	public static void main(String[] args) {
		//A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		//인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
		//(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		Scanner sc = new Scanner(System.in);

		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();

		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();

		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();

		System.out.println();

		double aa = a*0.4;
		double bb = b*0;
		double cc = c*0.15;

		double totala = a + aa;
		double totalb = b + bb;
		double totalc = c + cc;

		System.out.println("A사원 연봉/연봉+a : " + a + "/" + totala);
		if (totala >= 3000) {
			System.out.println("3000이상");
		} else {
			System.out.println("3000미만");
		}
		System.out.println("B사원 연봉/연봉+a : " + b + "/" + totalb);
		if (totalb >= 3000) {
			System.out.println("3000이상");
		} else {
			System.out.println("3000미만");
		}
		System.out.println("C사원 연봉/연봉+a : " + c + "/" + totalc);
		if (totalc >= 3000) {
			System.out.println("3000이상");
		} else {
			System.out.println("3000미만");
		}
	}
}

