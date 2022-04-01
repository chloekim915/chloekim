package com.kh.practice.chap02.loop.LoopPractice;
//return;멈추는것.그냥 여기서 끝남
//continue;계속하는것.다시 돌아감
//break;자신이 포함된 하나으 반복문을 벗어난다.
import java.util.Scanner;

public class OperatorPractice {
	public void practice1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = Integer.parseInt(sc.nextLine());
		
		if(input < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
			return;
		}
		
		for(int i = 1; i <= input; i++) {
			System.out.print(i+" ");
		}
	}	

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			int input = Integer.parseInt(sc.nextLine());
			
			if(input < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
				continue;
			}
			
			for(int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
			break;
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1이상의 숫자를 입력하세요.");
			int input = Integer.parseInt(sc.nextLine());
			
			if(input < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
				continue;
			}
			
			//패턴1 : i는 증감식, i르르 통해 연산
			for(int i = 1; i <= input; i++) {
				System.out.println(input - i + 1+ " ");
			}
			System.out.println();
			
			//패턴2 : i는 감소식, 그대로 출력하는 법
			for(int i = input; i > 0; i--) {
				System.out.println(i+ " ");
			}
			break; //return가능? ㅇㅇ
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int input = Integer.parseInt(sc.nextLine());
			if(input < 1) {
				System.out.println("1이상의 숫자를 입력해주세요");
				continue;
			}

			for(int i = input; i > 0; i--) {
				System.out.print(i +" ");
			}
			break;
		}
	}
	
	public void practice5() {
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
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수를 하나 입력하세요: ");
		int num2 = Integer.parseInt(sc.nextLine());

		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			if(num1-num2 >= 0) {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}else if(num1-num2 > 0) {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.print("정수를 하나 입력하세요: ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("정수를 하나 입력하세요: ");
			int num2 = Integer.parseInt(sc.nextLine());

			if(num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			} else {
				if(num1-num2 >= 0) {
					for(int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					} break;//다시돌아온경우에는 브레이크 필요
				}else if(num1-num2 > 0) {
					for(int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					} break;
				}
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("====== " + num + "단 " + "======");
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	
	public void parctice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = Integer.parseInt(sc.nextLine());
		if(num > 9) {
			System.out.println("9이하의 숫자만 입력해주세요.");
			return;
		} 

		for(int i = num; i <= 9; i++) {
			System.out.println("====== " + i + "단 " + "======");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.print("숫자 : ");
			int num = Integer.parseInt(sc.nextLine());
			if(num > 9) {
				System.out.println("9이하의 숫자만 입력해주세요.");
				continue;
			} 

			for(int i = num; i <= 9; i++) {
				System.out.println("====== " + i + "단 " + "======");
				for(int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + (i*j));
				} break;
			} break;
		}
	}
	
	public void practice11() {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		for(int i = 1; i <= 10; i++ ) {
			System.out.print(num1 + " ");
			num1 += num2;
			
		}
	}
	
	public void practice12() {
		
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());

		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i = num; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
			System.out.print("*");
	}
			System.out.println();
	}
	}
}

