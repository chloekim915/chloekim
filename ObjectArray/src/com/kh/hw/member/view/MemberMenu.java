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
			System.out.println("�ִ� ��� ������ ȸ�� ���� " + mc.SIZE + "�� �Դϴ�.");
			System.out.println("���� ��ϵ� ȸ�� ���� " + mc.existMemberNum() + "�� �Դϴ�.");

			if(mc.existMemberNum() != mc.SIZE) {
				System.out.println("1.�� ȸ�� ���");
			} else {
				System.out.println("ȸ�� ���� ��� �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�.");
			}
			System.out.println("2.ȸ�� �˻�");
			System.out.println("3.ȸ�� ���� ����");
			System.out.println("4.ȸ�� ����");
			System.out.println("5.��� ���");
			System.out.println("9. ������");

			System.out.print("�޴� ��ȣ : ");
			int num = Integer.parseInt(sc.nextLine());

			switch(num) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAll(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
			}
		}		
	}
	public void insertMember() {
		System.out.println("�� ȸ���� ����մϴ�");
		
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			if(mc.checkId(id) == true) {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���");
				return;
			} 
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			System.out.print("�̸��� : ");
			String email = sc.nextLine();
			char gender;
			
			while(true) {
				System.out.print("���� : ");
				gender = (char)sc.nextLine().charAt(0);
				if(Character.toUpperCase(gender) == 'M' || Character.toUpperCase(gender) == 'F') {
					break;
				} else {
					System.out.println("������ �ٽ� �Է����ּ���.");
					continue;
				}
			}
			
			System.out.print("���� : ");
			int age = Integer.parseInt(sc.nextLine());
			
			mc.insertMember(id, name, password, email, gender, age);
			break;
		}
	}
	
	public void searchMember() {
		System.out.print("1. ���̵�� �˻��ϱ�");
		System.out.print("2. �̸����� �˻��ϱ�");
		System.out.print("3. �̸��Ϸ� �˻��ϱ�");
		System.out.print("9. �������� �˻��ϱ�");
		
		System.out.println("�޴� ��ȣ : ");
		int num =Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1 : searchId(); break;
		case 2 : searchName(); break;
		case 3 : searchEmail(); break;
		case 9 : System.out.println("�������� ���ư��ϴ�"); mainMenu(); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); mainMenu(); break;
		}
	}
	
	public void searchId() {
		System.out.print("���̵� �Է��ϼ��� : ");
		String id = sc.nextLine();
		
		if(mc.searchId(id).equals("")) { 
			System.out.println("�˻� ����� �����ϴ�."); 
		}else {
			System.out.println("ã���� ȸ����ȸ ����Դϴ�.");
			System.out.println(mc.searchId(id)); 
		}
		return; 
	}
	
	public void searchName() {
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		if(mc.searchName(name).equals("")) { 
			System.out.println("�˻� ����� �����ϴ�."); 
		}else {
			System.out.println("ã���� ȸ����ȸ ����Դϴ�.");
			System.out.println(mc.searchName(name)); 
		}
		return; 
	}
	
	public void searchEmail() {
		System.out.print("�̸����� �Է��ϼ��� : ");
		String email = sc.nextLine();
		
		if(mc.searchEmail(email).equals("")) { 
			System.out.println("�˻� ����� �����ϴ�."); 
		}else {
			System.out.println("ã���� ȸ����ȸ ����Դϴ�.");
			System.out.println(mc.searchEmail(email)); 
		}
		return; 
	}
	
	public void updateMember() {
		System.out.println("1.��й�ȣ �����ϱ�");
		System.out.println("2.�̸� �����ϱ�");
		System.out.println("3.�̸��� �����ϱ�");
		System.out.println("9.�������� ���ư���");
		
		System.out.println("�޴� ��ȣ : ");
		int num =Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1 : updatePassword(); break;
		case 2 : updateName(); break;
		case 3 : updateEmail(); break;
		case 9 : System.out.println("�������� ���ư��ϴ�"); mainMenu(); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); mainMenu(); break;
		}
	}
	
	public void updatePassword() {
		System.out.println("������ ȸ�� id�� �Է����ּ��� : ");
		String inputId = sc.nextLine();
		System.out.println("������ ȸ�� ��й�ȣ�� �Է����ּ��� : ");
		String inputPw = sc.nextLine();
		
		boolean result = mc.updatePassword(inputId, inputPw);

		if (result == false) {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			return;
		} else {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
			return;
		}
	}
	
	public void updateName() {
		System.out.println("������ ȸ�� id�� �Է����ּ��� : ");
		String inputId = sc.nextLine();
		System.out.println("������ ȸ�� �̸��� �Է����ּ��� : ");
		String inputName = sc.nextLine();
		
		boolean result = mc.updateName(inputId, inputName);

		if (result == false) {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			return;
		} else {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
			return;
		}
	}
	
	public void updateEmail() {
		System.out.println("������ ȸ�� id�� �Է����ּ��� : ");
		String inputId = sc.nextLine();
		System.out.println("������ ȸ�� �̸����� �Է����ּ��� : ");
		String inputEmail = sc.nextLine();
		
		boolean result = mc.updateName(inputId, inputEmail);

		if (result == false) {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			return;
		} else {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
			return;
		}
	}
	public void deleteMember() {
		System.out.println("1. Ư�� ȸ�� �����ϱ�");
		System.out.println("2. ��� ȸ�� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int menuNum = Integer.parseInt(sc.nextLine());

		switch (menuNum) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			System.out.println("�������� ���ư��ϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
	}
	
	public void deleteOne() {
		System.out.print("������ ȸ���� ���̵� : ");
		String inputId = sc.nextLine();
		System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
		String check = sc.nextLine();

		if (check.toUpperCase().equals("N")) {
			return;
		} else {
			if (mc.delete(inputId) == false) {
				System.out.println("�������� �ʴ� ���̵��Դϴ�.");
				return;
			} else {
				System.out.println("���������� �����Ͽ����ϴ�.");
				return;
			}
		}
	}
	public void deleteAll() {
		System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
		String check = sc.nextLine();

		if (check.toUpperCase().equals("N")) {
			return;
		} else {
			mc.delete();
			System.out.println("���������� �����Ͽ����ϴ�.");
			return;
		}
	}
	
	public void printAll() {
		int total = mc.existMemberNum();
		if (total == 0) {
			System.out.println("����� ȸ���� �����ϴ�.");
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
