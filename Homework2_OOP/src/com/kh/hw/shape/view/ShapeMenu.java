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
			System.out.println("=====  ����  ���α׷�  =====");
			System.out.println("3. �ﰢ��");
			System.out.println("4. �簢��");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 3: triangleMenu();
			break;
			case 4: squareMenu();
			break;
			case 9: System.out.println("���α׷� ����");
			break;
			default: System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			continue;
			}
		}
	}
	
	public void triangleMenu() {
		while(true) {
			System.out.println("=====  �ﰢ��  =====");
			System.out.println("1. �ﰢ�� ����");
			System.out.println("2. �ﰢ�� ��ĥ");
			System.out.println("3. �ﰢ�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
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
				System.out.println("�������� ���ư��ϴ�.");
				inputMenu();
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			break;
		}
		
	}
	
	public void squareMenu() {
		while(true) {
			System.out.println("=====  �簢��  =====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("3. �簢�� ��ĥ");
			System.out.println("4. �簢�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
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
				System.out.println("�������� ���ư��ϴ�.");
				inputMenu();
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			break;
		}
	}
	
	public void inputSize(int Type, int menuNum) {
		if(Type == 3) {
			switch(menuNum) {
			case 1:
				System.out.println("���� : ");
				int height = Integer.parseInt(sc.nextLine());
				System.out.println("�ʺ� : ");
				int width = Integer.parseInt(sc.nextLine());
				System.out.println(tc.calcArea(height, width));
				break;
			case 2:
				System.out.println("������ �Է��ϼ��� : ");
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("���� �����Ǿ����ϴ�.");
				break;
			}
		}
		
		if (Type == 4) {
			int height = 0;
			int width = 0;
			switch (menuNum) {
			case 1:
				System.out.println("���� : ");
				height = Integer.parseInt(sc.nextLine());
				System.out.println("�ʺ� : ");
				width = Integer.parseInt(sc.nextLine());
				System.out.println("�簢�� �ѷ� : " + scr.calcPerimete(height, width));
				break;
			case 2:
				System.out.println("���� : ");
				height = Integer.parseInt(sc.nextLine());
				System.out.println("�ʺ� : ");
				width = Integer.parseInt(sc.nextLine());
				System.out.println("�簢�� ���� : " + scr.calcArea(height, width));
				break;
			case 3:
				System.out.println("������ �Է��ϼ��� : ");
				String color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("���� �����Ǿ����ϴ�.");
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

