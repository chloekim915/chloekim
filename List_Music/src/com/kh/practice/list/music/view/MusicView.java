package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. ������ ��ġ�� �� �߰�");
			System.out.println("2. ù ��ġ�� �� �߰�");
			System.out.println("3. ��ü �� ��� ���");
			System.out.println("4. Ư�� �� �˻�");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. Ư�� �� ���� ����");
			System.out.println("7. ��� �������� ����");
			System.out.println("8. ������ �������� ����");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: addList(); break;
			case 2: addAtZero(); break;
			case 3: printAll(); break;
			case 4: searchMusic(); break;
			case 5: removeMusic(); break;
			case 6: setMusic(); break;
			case 7: ascTitle(); break;
			case 8: descSinger(); break;
			case 9:
				System.out.println("����");
				return;
			default : 
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		}	
	}
	
	public void addList() {
		System.out.println("****** ������ ��ġ�� �� �߰� ******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		int result = mc.addList(music);
		if(result == 1) {
			System.out.println("�߰� ����");
		}else {
			System.out.println("�߰� ����");
		}		
	}
	
	public void addAtZero() {
		System.out.println("****** ù ��ġ�� �� �߰� ******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		int result = mc.addAtZero(music);
		if(result == 1) {
			System.out.println("�߰� ����");
		}else {
			System.out.println("�߰� ����");
		}
	}
	
	public void printAll() {
		System.out.println("****** ��ü �� ��� ��� ******");
		for(int i = 0; i < mc.printAll().size(); i++) {
			System.out.println(mc.printAll().get(i).toString());
		}
	}
	
	public void searchMusic() {
		System.out.println("****** Ư�� �� �˻� ******");
		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();
		List<Music> musicList = mc.searchMusic(title);
		if(musicList == null || musicList.size() == 0) {
			System.out.println("�˻��� ���� �����ϴ�.");
		}else {
			for(Music music : musicList) {
				System.out.println("�˻��� ���� " + music.getSinger() + " - " + music.getTitle() + "�Դϴ�.");
			}
		}
	}
	
	public void removeMusic() {
		System.out.println("****** Ư�� �� ���� ******");
		System.out.print("������ �� �� : ");
		String title = sc.nextLine();
		Music music = mc.removeMusic(title);
		if(music == null) {
			System.out.println("������ ���� �����ϴ�.");
		}else {
			System.out.println(music.getSinger() + " - " + music.getTitle() + " �� ���� �߽��ϴ�.");
		}
	}
	
	public void setMusic() {
		System.out.println("****** Ư�� �� ���� ���� ******");
		System.out.print("������ �� �� : ");
		String title = sc.nextLine();
		System.out.print("������ �� �� : ");
		String setTitle = sc.nextLine();
		System.out.print("������ ���� �� : ");
		String setSinger = sc.nextLine();
		Music music = mc.setMusic(title, new Music(setTitle, setSinger));
		
		if(music == null) {
			System.out.println("������ ���� �����ϴ�.");
		}else {
			System.out.println(setSinger + " - " + setTitle + " �� ���� ����Ǿ����ϴ�.");
		}
	}
	
	public void ascTitle() {
		System.out.println("****** �� �� �������� ���� ******");
		if(mc.ascTitle() == 1) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
	}
	
	public void descSinger() {
		System.out.println("****** ���� �� �������� ���� ******");
		if(mc.descSinger() == 1) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
	}
	

}
