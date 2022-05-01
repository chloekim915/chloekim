package com.kh.practice.map.view;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	private String menu = "";

	{
		StringBuilder sb = new StringBuilder();
		sb.append("========== KH 사이트 ========== \n");
		sb.append("************메인메뉴************ \n");
		sb.append("1. 회원가입\n");
		sb.append("2. 로그인\n");
		sb.append("3. 같은 이름 회원 찾기\n");
		sb.append("9. 종료\n\n");
		sb.append("메뉴 번호 입력 : ");
		menu = sb.toString();
	}

	public void mainMenu() {
		while (true) {
			System.out.println(menu);
			int menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				joinMembership();
				break;
			case 2:
				logIn();
				memberMenu();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못입력하셨습니다 다시 입력해주세요");
				continue;
			}
		}
	}

	public void memberMenu() {
		while (true) {
			System.out.println("******* 회원 메뉴 *******");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다");
				return;
			default:
				System.out.println("잘못입력하셨습니다 다시 입력해주세요");
				continue;
			}
		}
	}

	public void joinMembership() {
		while (true) {
			System.out.println("아이디 입력 : ");
			String id = sc.nextLine();
			System.out.println("비밀번호 입력 : ");
			String password = sc.nextLine();
			System.out.println("이름 입력 : ");
			String name = sc.nextLine();

			boolean joinSuccess = mc.joinMembership(id, new Member(id, password, name));

			if (joinSuccess == true) {
				System.out.println("성공적으로 회원가입이 완료되었습니다.");
				return;
			} else {
				System.out.println("중복된 아이디 입니다 다시입력해주세요");
				continue;
			}
		}
	}

	public void logIn() {
		while (true) {
			System.out.println("=====로그인=====");
			System.out.println("id 입력 : ");
			String id = sc.nextLine();
			System.out.println("비밀번호 입력 : ");
			String password = sc.nextLine();

			String loginSuccess = mc.logIn(id, password);
			if (loginSuccess == null) {
				System.out.println("틀린아이디 또는 틀린 비밀번호입니다. 다시 입력해주세요");
				continue;
			} else {
				System.out.println(loginSuccess + "님 환영합니다.");
				return;
			}
		}
	}

	public void changePassword() {
		while (true) {
			System.out.println("id 입력 : ");
			String id = sc.nextLine();
			System.out.println("현재 비밀번호 입력 : ");
			String oldPw = sc.nextLine();
			System.out.println("변경하실 비밀번호 입력 : ");
			String newPassword = sc.nextLine();

			boolean changePw = mc.changePassword(id, oldPw, newPassword);
			if (changePw == true) {
				System.out.println("비밀번호 변경에 성공하였습니다.");
				return;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다.");
				continue;
			}
		}
	}

	public void changeName() {
		while (true) {
			System.out.println("id 입력 : ");
			String id = sc.nextLine();
			System.out.println("비밀번호 입력 : ");
			String password = sc.nextLine();

			String loginSuccess = mc.logIn(id, password);
			if (loginSuccess == null) {
				System.out.println("로그인에 실패하셨습니다 다시 입력해주세요");
				continue;
			} else {
				System.out.println("현재 설정된 이름 : " + mc.logIn(id, password));
				System.out.println("변경할 이름 : ");
				String newName = sc.nextLine();

				mc.changeName(id, newName);
				System.out.println("이름 변경성공");
				return;
			}
		}
	}

	public void sameName() {
		System.out.println("검색하실 이름 : ");
		String name = sc.nextLine();
		// 반환 값을 가지고 entrySet()을 이용하여 ‘이름-아이디’ 형식으로 출력
		Map<String, Member> treeMap = new TreeMap<>();
		treeMap = mc.sameName(name); // mc.sameName(name)d의 반환값아 TreeMap이다
		Set<Entry<String, Member>> set = treeMap.entrySet();
		for (Map.Entry<String, Member> entry : set) {
			System.out.println("이름 : " + entry.getValue().getName() + ", 아이디 : " + entry.getKey());
		}

		// 두번째 방법 iterator 근데 너무 길다
		// entrySet().iterator()
//		        Iterator<Map.Entry<String, String>> iteratorE = treeMap.entrySet().iterator();
//		        while (iteratorE.hasNext()) {
//		            Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratorE.next();
//		            String key = entry.getKey();
//		            String value = entry.getValue();
//		            System.out.println("이름 : " + value + ", 아이디 :" + key);
//		        }

	}

}