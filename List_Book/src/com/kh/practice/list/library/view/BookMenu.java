package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private String menu = "";

	{
		StringBuilder sb = new StringBuilder();
		sb.append("=====***** ���� �޴� *****=====\n");
		sb.append("1.�� ���� �߰�\n");
		sb.append("2.���� ��ü ��ȸ\n");
		sb.append("3.���� �˻� ��ȸ\n");
		sb.append("4.���� ����\n");
		sb.append("5.���� �� �������� ����\n");
		sb.append("9.����\n\n");
		sb.append("�޴� ��ȣ ���� : ");
		menu = sb.toString();
	}

	public void mainMenu() {
		System.out.println("===== Welcome KH Library =====");
		System.out.println();
		while (true) {
			System.out.print(menu);
			int menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
		}
	}

	public void insertBook() {
		System.out.println("===== �� ���� �߰� =====");
		System.out.println("å ������ �Է����ּ���.");
		System.out.print("���� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String author = sc.nextLine();
		System.out.print("�帣(1. �ι� / 2. ���� / 3. �ܱ��� / 4. ��Ÿ) : ");
		int genre = Integer.parseInt(sc.nextLine());

		String category = "";
		switch (genre) {
		case 1:
			category = "�ι�";
			break;
		case 2:
			category = "�ڿ�����";
			break;
		case 3:
			category = "�Ƿ�";
			break;
		case 4:
			category = "��Ÿ";
			break;
		default:

		}
		System.out.print("���� : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println();

		Book bk = new Book(title, author, category, price);
		bc.insertBook(bk);
	}

	public void selectList() {
		ArrayList<Book> bookList = new ArrayList<Book>(bc.selectList());
		if (bookList.isEmpty() == true) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		} else {
			for (int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
	}

	public void searchBook() {
		System.out.println("===== ���� �˻� =====");
		System.out.print("�˻� Ű���� : ");
		String keyword = sc.nextLine();

		ArrayList<Book> searchList = new ArrayList<Book>(bc.searchBook(keyword));

		if (searchList.isEmpty() == true) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			for (int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
		System.out.println();
	}

	public void deleteBook() {
		System.out.println("===== ���� ���� =====");
		System.out.print("������ ���� �� : ");
		String title = sc.nextLine();
		System.out.print("������ ���� �� : ");
		String author = sc.nextLine();

		Book removeBook = bc.deleteBook(title, author);

		if (removeBook != null) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		}
		System.out.println();
		return;
	}

	public void ascBook() {
		if (bc.ascBook() == 1) {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		} else {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		}
	}

}