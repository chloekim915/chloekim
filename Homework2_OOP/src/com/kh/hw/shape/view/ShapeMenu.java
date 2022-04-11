package com.kh.hw.shape.view;

import java.util.Scanner;
import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		while(true) {
			System.out.println("=====  도형  프로그램  =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 3: triangleMenu();
			break;
			case 4: squareMenu();
			break;
			case 9: System.out.println("프로그램 종료");
			break;
			default: System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			continue;
			}
		}
	}
	
	public void triangleMenu() {
		while(true) {
			System.out.println("=====  삼각형  =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				inputSize(3, 1);
				break;
			case 2:
				inputSize(3, 2);
				break;
			case 3:
				printInformation(3);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
			break;
		}
		
	}
	
	public void squareMenu() {
		while(true) {
			System.out.println("=====  사각형  =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				inputSize(4, 1);
				break;
			case 2:
				inputSize(4, 2);
				break;
			case 3:
				inputSize(4, 3);
				break;
			case 4:
				printInformation(4);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
			break;
		}
	}
	
	public void inputSize(int Type, int menuNum) {
		if(Type == 3) {
			switch(menuNum) {
			case 1:
				System.out.println("높이 : ");
				int height = Integer.parseInt(sc.nextLine());
				System.out.println("너비 : ");
				int width = Integer.parseInt(sc.nextLine());
				System.out.println(tc.calcArea(height, width));
				break;
			case 2:
				System.out.println("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
				break;
			}
		}
		
		if (Type == 4) {
			int height = 0;
			int width = 0;
			switch (menuNum) {
			case 1:
				System.out.println("높이 : ");
				height = Integer.parseInt(sc.nextLine());
				System.out.println("너비 : ");
				width = Integer.parseInt(sc.nextLine());
				System.out.println("사각형 둘레 : " + scr.calcPerimete(height, width));
				break;
			case 2:
				System.out.println("높이 : ");
				height = Integer.parseInt(sc.nextLine());
				System.out.println("너비 : ");
				width = Integer.parseInt(sc.nextLine());
				System.out.println("사각형 면적 : " + scr.calcArea(height, width));
				break;
			case 3:
				System.out.println("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
				break;
			}
		}
	}
	
	public void printInformation(int Type) {
		if (Type == 3) {
			System.out.println(tc.print());
		} else if (Type == 4) {
			System.out.println(scr.print());
		}
	}
}

