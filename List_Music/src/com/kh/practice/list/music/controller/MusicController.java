package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<>();

	public MusicController() {
		list.add(new Music("러브미", "디오"));
		list.add(new Music("풍선", "동방신기"));
		list.add(new Music("허그", "동방신기"));
		list.add(new Music("브랜뉴", "신화"));
		list.add(new Music("거짓말", "빅뱅"));
		list.add(new Music("텔미", "원더걸스"));
		list.add(new Music("소녀시대", "소녀시대"));
		list.add(new Music("소녀시대", "이승철"));
		list.add(new Music("텐미닛", "원슈타인"));
		list.add(new Music("텐미닛", "이효리"));
		list.add(new Music("텐미닛", "리효리"));
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
				// set 방법 두가지
				// 1. list set 사용법
				list.set(i, music);
				return music;
				
//				// 2. 객체에 데이터 셋팅 하는 방법
//				Music searchMusic = list.get(i);
//				searchMusic.setSinger(music.getSinger());
//				searchMusic.setTitle(music.getTitle());
//				return music;
			}
		}
		return null;
	}
	
	public int ascTitle() {
	//리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
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
		// 리스트 가수 명 내림차순 정렬, 1 리턴
		list.sort(new Comparator<Music>() {
			@Override
			public int compare(Music o1, Music o2) {
				return o2.getSinger().compareTo(o1.getSinger());
			}
		});
		return 1;
	}
}
