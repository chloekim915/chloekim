package com.kh.practice.set.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	private String menu = "";

	{
		StringBuilder sb = new StringBuilder();
		sb.append("******* ���� �޴� *******\n");
		sb.append("1.��÷ ��� �߰�\n");
		sb.append("2.��÷ ��� ����\n");
		sb.append("3.��÷ ��� Ȯ��\n");
		sb.append("4.���ĵ� ��÷ ��� Ȯ��\n");
		sb.append("5.��÷ ��� �˻�\n");
		sb.append("9.����\n\n");
		sb.append("�޴� ��ȣ ���� : ");
		menu = sb.toString();
	}

	public void mainMenu() {
		System.out.println("========== KH  ��÷  ���α׷�  ==========");
		while (true) {
			System.out.print(menu);
			int menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				System.out.println("���α׷� ����.");
				return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
		}
	}

	public void insertObject() {
		try {
			System.out.print("�߰��� ��÷ ��� �� : ");
			int addNum = Integer.parseInt(sc.nextLine());

			for (int i = 0; i < addNum; i++) {
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				System.out.print("�ڵ��� ��ȣ('-'����) : ");
				String phone = sc.nextLine();
				System.out.println();

				Lottery insert = new Lottery(name, phone);
				if (lc.insertObject(insert) == true) {
					lc.insertObject(insert);
				} else {
					System.out.println("�ߺ��� ����Դϴ�. �ٽ� �Է��ϼ���.");
					continue;
				}
			}
			System.out.println(addNum + "�� �߰� �Ϸ�Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}

	public void deleteObject() {
		try {
			System.out.println("������ ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�ڵ��� ��ȣ('-'����) : ");
			String phone = sc.nextLine();

			Lottery delete = new Lottery(name, phone);
			if (lc.deleteObject(delete) == true) {
				lc.deleteObject(delete);
				System.out.println("���� �Ϸ�Ǿ����ϴ�.");
			} else {
				System.out.println("�������� �ʴ� ����Դϴ�.");
			}
		} catch (Exception e) {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}

	public void winObject() {
		HashSet<Lottery> result = lc.winObject();
		if(result == null) {
			System.out.println("���� ��÷�� �� �����ϴ�.");
			return;
		}
		System.out.println(result.toString());
	}

	public void sortedWinObject() {
		TreeSet<Lottery> win = lc.sortedWinObject();
		Iterator<Lottery> iterator = win.iterator();
		while (iterator.hasNext()) {
			Lottery data = iterator.next();
			System.out.println(data);
		}
	}

	public void searchWinner() {
		try {
			System.out.println("�˻��� ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�ڵ��� ��ȣ('-'����) : ");
			String phone = sc.nextLine();

			Lottery win = new Lottery(name, phone);
			if (lc.searchWinner(win) == true) {
				System.out.println("�����մϴ�. ��÷ ��Ͽ� �����մϴ�.");
			} else {
				System.out.println("��Ÿ������ ��÷ ��Ͽ� �������� �ʽ��ϴ�.");
			}
		} catch (Exception e) {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}
}

