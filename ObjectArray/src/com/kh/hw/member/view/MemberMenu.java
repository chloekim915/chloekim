package com.kh.hw.member.view;

import java.util.Scanner; 

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();

	public MemberMenu() {

	}
	public void mainMenu() {
		while(true) {
			System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "명 입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명 입니다.");

			if(mc.existMemberNum() != mc.SIZE) {
				System.out.println("1.새 회원 등록");
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2.회원 검색");
			System.out.println("3.회원 정보 수정");
			System.out.println("4.회원 삭제");
			System.out.println("5.모두 출력");
			System.out.println("9. 끝내기");

			System.out.print("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine());

			switch(num) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAll(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
		}		
	}
	public void insertMember() {
		System.out.println("새 회원을 등록합니다");
		
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			if(mc.checkId(id) == true) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요");
				return;
			} 
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			System.out.print("이메일 : ");
			String email = sc.nextLine();
			char gender;
			
			while(true) {
				System.out.print("성별 : ");
				gender = (char)sc.nextLine().charAt(0);
				if(Character.toUpperCase(gender) == 'M' || Character.toUpperCase(gender) == 'F') {
					break;
				} else {
					System.out.println("성별을 다시 입력해주세요.");
					continue;
				}
			}
			
			System.out.print("나이 : ");
			int age = Integer.parseInt(sc.nextLine());
			
			mc.insertMember(id, name, password, email, gender, age);
			break;
		}
	}
	
	public void searchMember() {
		System.out.print("1. 아이디로 검색하기");
		System.out.print("2. 이름으로 검색하기");
		System.out.print("3. 이메일로 검색하기");
		System.out.print("9. 메인으로 검색하기");
		
		System.out.println("메뉴 번호 : ");
		int num =Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1 : searchId(); break;
		case 2 : searchName(); break;
		case 3 : searchEmail(); break;
		case 9 : System.out.println("메인으로 돌아갑니다"); mainMenu(); break;
		default : System.out.println("잘못 입력하셨습니다."); mainMenu(); break;
		}
	}
	
	public void searchId() {
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		if(mc.searchId(id).equals("")) { 
			System.out.println("검색 결과가 없습니다."); 
		}else {
			System.out.println("찾으신 회원조회 결과입니다.");
			System.out.println(mc.searchId(id)); 
		}
		return; 
	}
	
	public void searchName() {
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		if(mc.searchName(name).equals("")) { 
			System.out.println("검색 결과가 없습니다."); 
		}else {
			System.out.println("찾으신 회원조회 결과입니다.");
			System.out.println(mc.searchName(name)); 
		}
		return; 
	}
	
	public void searchEmail() {
		System.out.print("이메일을 입력하세요 : ");
		String email = sc.nextLine();
		
		if(mc.searchEmail(email).equals("")) { 
			System.out.println("검색 결과가 없습니다."); 
		}else {
			System.out.println("찾으신 회원조회 결과입니다.");
			System.out.println(mc.searchEmail(email)); 
		}
		return; 
	}
	
	public void updateMember() {
		System.out.println("1.비밀번호 수정하기");
		System.out.println("2.이름 수정하기");
		System.out.println("3.이메일 수정하기");
		System.out.println("9.메인으로 돌아가기");
		
		System.out.println("메뉴 번호 : ");
		int num =Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1 : updatePassword(); break;
		case 2 : updateName(); break;
		case 3 : updateEmail(); break;
		case 9 : System.out.println("메인으로 돌아갑니다"); mainMenu(); break;
		default : System.out.println("잘못 입력하셨습니다."); mainMenu(); break;
		}
	}
	
	public void updatePassword() {
		System.out.println("수정할 회원 id를 입력해주세요 : ");
		String inputId = sc.nextLine();
		System.out.println("수정할 회원 비밀번호를 입력해주세요 : ");
		String inputPw = sc.nextLine();
		
		boolean result = mc.updatePassword(inputId, inputPw);

		if (result == false) {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		} else {
			System.out.println("수정이 성공적으로 되었습니다.");
			return;
		}
	}
	
	public void updateName() {
		System.out.println("수정할 회원 id를 입력해주세요 : ");
		String inputId = sc.nextLine();
		System.out.println("수정할 회원 이름을 입력해주세요 : ");
		String inputName = sc.nextLine();
		
		boolean result = mc.updateName(inputId, inputName);

		if (result == false) {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		} else {
			System.out.println("수정이 성공적으로 되었습니다.");
			return;
		}
	}
	
	public void updateEmail() {
		System.out.println("수정할 회원 id를 입력해주세요 : ");
		String inputId = sc.nextLine();
		System.out.println("수정할 회원 이메일을 입력해주세요 : ");
		String inputEmail = sc.nextLine();
		
		boolean result = mc.updateName(inputId, inputEmail);

		if (result == false) {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		} else {
			System.out.println("수정이 성공적으로 되었습니다.");
			return;
		}
	}
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = Integer.parseInt(sc.nextLine());

		switch (menuNum) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}
	
	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디 : ");
		String inputId = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		String check = sc.nextLine();

		if (check.toUpperCase().equals("N")) {
			return;
		} else {
			if (mc.delete(inputId) == false) {
				System.out.println("존재하지 않는 아이디입니다.");
				return;
			} else {
				System.out.println("성공적으로 삭제하였습니다.");
				return;
			}
		}
	}
	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		String check = sc.nextLine();

		if (check.toUpperCase().equals("N")) {
			return;
		} else {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
			return;
		}
	}
	
	public void printAll() {
		int total = mc.existMemberNum();
		if (total == 0) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		} else {
			
			for (int i = 0; i < total; i++) {
				if (mc.printAll()[i] == null) {
					return;
				} else {
					System.out.println(mc.printAll()[i]);
				}
			}
		}
	}
}
