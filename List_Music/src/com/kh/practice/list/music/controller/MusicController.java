package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<>();

	public MusicController() {
		list.add(new Music("�����", "���"));
		list.add(new Music("ǳ��", "����ű�"));
		list.add(new Music("���", "����ű�"));
		list.add(new Music("�귣��", "��ȭ"));
		list.add(new Music("������", "���"));
		list.add(new Music("�ڹ�", "�����ɽ�"));
		list.add(new Music("�ҳ�ô�", "�ҳ�ô�"));
		list.add(new Music("�ҳ�ô�", "�̽�ö"));
		list.add(new Music("�ٹ̴�", "����Ÿ��"));
		list.add(new Music("�ٹ̴�", "��ȿ��"));
		list.add(new Music("�ٹ̴�", "��ȿ��"));
	}
	
	public int addList(Music music) {
		return list.add(music) == true ? 1 : 0;
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}
	
	public List<Music> printAll() {
		return list;
	}
	
	public List<Music> searchMusic(String title) {
		List<Music> tempList = new ArrayList<>();
		for(Music music : list) {
			if(music.getTitle().contains(title) == true) {
				tempList.add(music);
			}
		}
		return tempList;
	}

	public Music removeMusic(String title) {
		for(Music music : list) {
			if(music.getTitle().equals(title) == true) {
				list.remove(music);
				return music;
			}
		}
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title) == true) {
				// set ��� �ΰ���
				// 1. list set ����
				list.set(i, music);
				return music;
				
//				// 2. ��ü�� ������ ���� �ϴ� ���
//				Music searchMusic = list.get(i);
//				searchMusic.setSinger(music.getSinger());
//				searchMusic.setTitle(music.getTitle());
//				return music;
			}
		}
		return null;
	}
	
	public int ascTitle() {
	//����Ʈ �� �� �������� ����, ������ ������ ���� ������ �������� ����, 1 ����
		Collections.sort(list, new Comparator<Music>() {
			@Override
			public int compare(Music o1, Music o2) {
				int result = o1.getTitle().compareTo(o2.getTitle());
				if(result == 0) {
					result = o1.getSinger().compareTo(o2.getSinger());
				}
				return result;
			}
		});
		return 1;
	}
	
	public int descSinger() {
		// ����Ʈ ���� �� �������� ����, 1 ����
		list.sort(new Comparator<Music>() {
			@Override
			public int compare(Music o1, Music o2) {
				return o2.getSinger().compareTo(o1.getSinger());
			}
		});
		return 1;
	}
}
