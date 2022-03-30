import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		// 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.	
		
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
