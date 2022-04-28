package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	// 추첨 대상을 담을 HashSet 객체 생성(lottery) 
	private HashSet<Lottery> lottery = new HashSet<>();

	// 당첨 대상을 담을 HashSet 객체 생성(win)
	private HashSet<Lottery> win = new HashSet<>();

	
	public LotteryController() {
		lottery.add(new Lottery("거제길동", "010-1234-5677"));
		lottery.add(new Lottery("전길동", "010-4321-5677"));
		lottery.add(new Lottery("선길동", "010-5332-5677"));
	}
	
	// 셋에 값 저장 하는 메소드
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}

	// 셋에 있는 값을 삭제하는 메소드
	public boolean deleteObject(Lottery l) {
		return lottery.remove(l);
	}

	// 모든 당첨자를 출력하는 메소드
	public HashSet<Lottery> winObject() {
		ArrayList<Lottery> list = new ArrayList<>(lottery);
		Random r = new Random();
		
		if(list.size() < 4) {
			return null;
		}
		
		Iterator<Lottery> iter = win.iterator();
		while(iter.hasNext()) {
			Lottery lottery = iter.next();
			if(list.contains(lottery) == false) { ///목록에 없는 대상자가 온다면
				win.remove(lottery);
			}
		}
		
		while(true) {
			if(win.size() >= 4) {
				break;
			}
			win.add(list.get(r.nextInt(list.size())));
		}
		return win;
	}

	// 정렬된 당첨자 목록을 출력하는 메소드
	public TreeSet<Lottery> sortedWinObject() {
		if(lottery.size() < 4) {
			return null;
		}
		TreeSet<Lottery> sortSet = new TreeSet<>(new Comparator<Lottery>() {
			@Override
			public int compare(Lottery o1, Lottery o2) {
				int result = o1.getName().compareTo(o2.getName());
				if(result == 0) {
					result = o1.getPhone().compareTo(o2.getPhone());
				}
				return result;
			}
		});
		
		if(win.size() < 4) {
			winObject();
		}
		
		sortSet.addAll(win);
		return sortSet;
	}

	// 특정 당첨자를 검색하는 메소드
	public boolean searchWinner(Lottery l) {
		// 전달 받은 l을 win에서 찾고 찾은 결과인 boolean 값 반환
		
		// 만약 하나의 값이나 특정값으로 조회할때 -> iterator 활용할것
		Iterator<Lottery> iter = win.iterator();
		while(iter.hasNext()) {
			Lottery lottery = iter.next();
			if(lottery.getName().equals(l.getName()) == true 
					&& lottery.getPhone().equals(l.getPhone()) == true) {
				return true;
			}
		}
		
		// 원래는 이렇게 한줄이면 끝
		return win.contains(l);
	}
}