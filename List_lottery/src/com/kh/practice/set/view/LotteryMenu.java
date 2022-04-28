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
		sb.append("******* 메인 메뉴 *******\n");
		sb.append("1.추첨 대상 추가\n");
		sb.append("2.추첨 대상 삭제\n");
		sb.append("3.당첨 대상 확인\n");
		sb.append("4.정렬된 당첨 대상 확인\n");
		sb.append("5.당첨 대상 검색\n");
		sb.append("9.종료\n\n");
		sb.append("메뉴 번호 선택 : ");
		menu = sb.toString();
	}

	public void mainMenu() {
		System.out.println("========== KH  추첨  프로그램  ==========");
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
				System.out.println("프로그램 종료.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}

	public void insertObject() {
		try {
			System.out.print("추가할 추첨 대상 수 : ");
			int addNum = Integer.parseInt(sc.nextLine());

			for (int i = 0; i < addNum; i++) {
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("핸드폰 번호('-'빼고) : ");
				String phone = sc.nextLine();
				System.out.println();

				Lottery insert = new Lottery(name, phone);
				if (lc.insertObject(insert) == true) {
					lc.insertObject(insert);
				} else {
					System.out.println("중복된 대상입니다. 다시 입력하세요.");
					continue;
				}
			}
			System.out.println(addNum + "명 추가 완료되었습니다.");
		} catch (Exception e) {
			System.out.println("잘못 입력하였습니다.");
		}
	}

	public void deleteObject() {
		try {
			System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("핸드폰 번호('-'빼고) : ");
			String phone = sc.nextLine();

			Lottery delete = new Lottery(name, phone);
			if (lc.deleteObject(delete) == true) {
				lc.deleteObject(delete);
				System.out.println("삭제 완료되었습니다.");
			} else {
				System.out.println("존재하지 않는 대상입니다.");
			}
		} catch (Exception e) {
			System.out.println("잘못 입력하였습니다.");
		}
	}

	public void winObject() {
		HashSet<Lottery> result = lc.winObject();
		if(result == null) {
			System.out.println("아직 추첨할 수 없습니다.");
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
			System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("핸드폰 번호('-'빼고) : ");
			String phone = sc.nextLine();

			Lottery win = new Lottery(name, phone);
			if (lc.searchWinner(win) == true) {
				System.out.println("축하합니다. 당첨 목록에 존재합니다.");
			} else {
				System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
			}
		} catch (Exception e) {
			System.out.println("잘못 입력하였습니다.");
		}
	}
}

