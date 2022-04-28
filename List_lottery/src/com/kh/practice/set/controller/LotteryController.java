package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	// ��÷ ����� ���� HashSet ��ü ����(lottery) 
	private HashSet<Lottery> lottery = new HashSet<>();

	// ��÷ ����� ���� HashSet ��ü ����(win)
	private HashSet<Lottery> win = new HashSet<>();

	
	public LotteryController() {
		lottery.add(new Lottery("�����浿", "010-1234-5677"));
		lottery.add(new Lottery("���浿", "010-4321-5677"));
		lottery.add(new Lottery("���浿", "010-5332-5677"));
	}
	
	// �¿� �� ���� �ϴ� �޼ҵ�
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}

	// �¿� �ִ� ���� �����ϴ� �޼ҵ�
	public boolean deleteObject(Lottery l) {
		return lottery.remove(l);
	}

	// ��� ��÷�ڸ� ����ϴ� �޼ҵ�
	public HashSet<Lottery> winObject() {
		ArrayList<Lottery> list = new ArrayList<>(lottery);
		Random r = new Random();
		
		if(list.size() < 4) {
			return null;
		}
		
		Iterator<Lottery> iter = win.iterator();
		while(iter.hasNext()) {
			Lottery lottery = iter.next();
			if(list.contains(lottery) == false) { ///��Ͽ� ���� ����ڰ� �´ٸ�
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

	// ���ĵ� ��÷�� ����� ����ϴ� �޼ҵ�
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

	// Ư�� ��÷�ڸ� �˻��ϴ� �޼ҵ�
	public boolean searchWinner(Lottery l) {
		// ���� ���� l�� win���� ã�� ã�� ����� boolean �� ��ȯ
		
		// ���� �ϳ��� ���̳� Ư�������� ��ȸ�Ҷ� -> iterator Ȱ���Ұ�
		Iterator<Lottery> iter = win.iterator();
		while(iter.hasNext()) {
			Lottery lottery = iter.next();
			if(lottery.getName().equals(l.getName()) == true 
					&& lottery.getPhone().equals(l.getPhone()) == true) {
				return true;
			}
		}
		
		// ������ �̷��� �����̸� ��
		return win.contains(l);
	}
}