package com.kh.ex03.branch;
import java.util.Random;
import java.util.Scanner;

public class BranchStatement2 {
	public static void main(String[] args) {
		// ���� 1 ~ 10���� �������� ���� �ϳ��� �̰�,
		// �����е��� 5������ ���缭 �̱�� ���� ����
		Scanner sc = new Scanner(System.in);
		//	int randomInt = new Random().nextInt(10); //0~9���� �������� �����ö�
		int randomInt = new Random().nextInt(10) + 1; //1~10
		char randomChar = (char)('A' + new Random().nextInt(5)); //���� ���ڿ� ������

		int i = 5; //��ȸ 5��
		boolean isWin = false;//flag
		//boolean�� �ʱⰪ�� false�� ������ �س��� false���� ����� true�̰� �ȹ���� �״�� false�� ���°�

		while(i > 0) { // 5 4 3 2 1 ...
			System.out.println("1 ~ 10 ���� ���� �ϳ��� �������ּ���!");
			int pickNum = sc.nextInt();

			if(pickNum < 1 || pickNum > 10) {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���. : " + pickNum);
				continue; // count�� ���� ��Ű�� �ʰ� ��ȸ�� �ѹ� ���ش�! ���� while�� ����������
			}

			if(pickNum == randomInt) {
				System.out.println("������ϴ�. ����� �¸��Ͽ����ϴ�.");
				isWin = true;
				break;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�! " + (i-1) + "�� ���ҽ��ϴ�.");
			}
			i--;
		}

		if(isWin == false) {
			System.out.println("����� �����Դϴ�.");
		}
		System.out.println("���� �� ���� : " + randomInt);
	}
}
