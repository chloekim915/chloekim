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
		sb.append("========== KH ����Ʈ ========== \n");
		sb.append("************���θ޴�************ \n");
		sb.append("1. ȸ������\n");
		sb.append("2. �α���\n");
		sb.append("3. ���� �̸� ȸ�� ã��\n");
		sb.append("9. ����\n\n");
		sb.append("�޴� ��ȣ �Է� : ");
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
				System.out.println("����");
				return;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ� �ٽ� �Է����ּ���");
				continue;
			}
		}
	}

	public void memberMenu() {
		while (true) {
			System.out.println("******* ȸ�� �޴� *******");
			System.out.println("1. ��й�ȣ �ٲٱ�");
			System.out.println("2. �̸� �ٲٱ�");
			System.out.println("3. �α׾ƿ�");
			System.out.print("�޴� ��ȣ ���� : ");
			int menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("�α׾ƿ� �Ǿ����ϴ�");
				return;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ� �ٽ� �Է����ּ���");
				continue;
			}
		}
	}

	public void joinMembership() {
		while (true) {
			System.out.println("���̵� �Է� : ");
			String id = sc.nextLine();
			System.out.println("��й�ȣ �Է� : ");
			String password = sc.nextLine();
			System.out.println("�̸� �Է� : ");
			String name = sc.nextLine();

			boolean joinSuccess = mc.joinMembership(id, new Member(id, password, name));

			if (joinSuccess == true) {
				System.out.println("���������� ȸ�������� �Ϸ�Ǿ����ϴ�.");
				return;
			} else {
				System.out.println("�ߺ��� ���̵� �Դϴ� �ٽ��Է����ּ���");
				continue;
			}
		}
	}

	public void logIn() {
		while (true) {
			System.out.println("=====�α���=====");
			System.out.println("id �Է� : ");
			String id = sc.nextLine();
			System.out.println("��й�ȣ �Է� : ");
			String password = sc.nextLine();

			String loginSuccess = mc.logIn(id, password);
			if (loginSuccess == null) {
				System.out.println("Ʋ�����̵� �Ǵ� Ʋ�� ��й�ȣ�Դϴ�. �ٽ� �Է����ּ���");
				continue;
			} else {
				System.out.println(loginSuccess + "�� ȯ���մϴ�.");
				return;
			}
		}
	}

	public void changePassword() {
		while (true) {
			System.out.println("id �Է� : ");
			String id = sc.nextLine();
			System.out.println("���� ��й�ȣ �Է� : ");
			String oldPw = sc.nextLine();
			System.out.println("�����Ͻ� ��й�ȣ �Է� : ");
			String newPassword = sc.nextLine();

			boolean changePw = mc.changePassword(id, oldPw, newPassword);
			if (changePw == true) {
				System.out.println("��й�ȣ ���濡 �����Ͽ����ϴ�.");
				return;
			} else {
				System.out.println("��й�ȣ ���濡 �����߽��ϴ�.");
				continue;
			}
		}
	}

	public void changeName() {
		while (true) {
			System.out.println("id �Է� : ");
			String id = sc.nextLine();
			System.out.println("��й�ȣ �Է� : ");
			String password = sc.nextLine();

			String loginSuccess = mc.logIn(id, password);
			if (loginSuccess == null) {
				System.out.println("�α��ο� �����ϼ̽��ϴ� �ٽ� �Է����ּ���");
				continue;
			} else {
				System.out.println("���� ������ �̸� : " + mc.logIn(id, password));
				System.out.println("������ �̸� : ");
				String newName = sc.nextLine();

				mc.changeName(id, newName);
				System.out.println("�̸� ���漺��");
				return;
			}
		}
	}

	public void sameName() {
		System.out.println("�˻��Ͻ� �̸� : ");
		String name = sc.nextLine();
		// ��ȯ ���� ������ entrySet()�� �̿��Ͽ� ���̸�-���̵� �������� ���
		Map<String, Member> treeMap = new TreeMap<>();
		treeMap = mc.sameName(name); // mc.sameName(name)d�� ��ȯ���� TreeMap�̴�
		Set<Entry<String, Member>> set = treeMap.entrySet();
		for (Map.Entry<String, Member> entry : set) {
			System.out.println("�̸� : " + entry.getValue().getName() + ", ���̵� : " + entry.getKey());
		}

		// �ι�° ��� iterator �ٵ� �ʹ� ���
		// entrySet().iterator()
//		        Iterator<Map.Entry<String, String>> iteratorE = treeMap.entrySet().iterator();
//		        while (iteratorE.hasNext()) {
//		            Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratorE.next();
//		            String key = entry.getKey();
//		            String value = entry.getValue();
//		            System.out.println("�̸� : " + value + ", ���̵� :" + key);
//		        }

	}

}