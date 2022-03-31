package Practice;

import java.util.Scanner;

public class p5 {
	private void mian() {
		//키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		//이 때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력처리하세요.
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("학년(숫자만) : ");
		int grade = Integer.parseInt(sc.nextLine());

		System.out.print("반(숫자만) : ");
		int class1 = Integer.parseInt(sc.nextLine());

		System.out.print("번호(숫자만) : ");
		int num = Integer.parseInt(sc.nextLine());

		System.out.print("성별(M/F) : ");
		String gender = sc.nextLine();
		if (gender.equals("M")) {
			gender = "남학생";
		} else {
			gender = "여학생";
		}

		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double test = sc.nextDouble();

		System.out.println();
		System.out.println(grade + "학년 " + class1 + "반 " + num + "번 " + name + " " + gender + "의 " + "성적은 " + test + "이다.");
	}

}

