package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	//                ID
	private HashMap<String, Member> idToMemberMap = new HashMap<>();
	
	public MemberController() {
		idToMemberMap.put("test1", new Member("test1", "1234", "ȫ�浿"));
		idToMemberMap.put("test2", new Member("test2", "1234", "�ֱ浿"));
		idToMemberMap.put("test3", new Member("test3", "1234", "��浿"));
		idToMemberMap.put("test4", new Member("test4", "1234", "�̱浿"));
	}

	public boolean joinMembership(String id, Member m) {
		// �ʿ� Ű�� ���� �����Ͽ� ȸ�������ϴ� �޼ҵ�
		if(idToMemberMap.containsKey(id) == true) {
			return false;
		}
		idToMemberMap.put(id, m);
		return true;
	}

	public String logIn(String id, String password) {
		if(idToMemberMap.containsKey(id) == false) { // id ������
			return null;
		}
		
		Member member = idToMemberMap.get(id);
		if(member.getPassword().equals(password) == true) { // pw ������
			return member.getName();
		}else { // pw Ʋ����
			return null;
		}
	}

	public boolean changePassword(String id, String oldPw, String newPw) { 
		Member member = idToMemberMap.get(id);
		
		if(member == null) { // id ����
			return false;
		}
		
		if(member.getPassword().equals(oldPw) == false) {
			return false;
		}
		
		member.setPassword(newPw);
		return true;
	}

	public void changeName(String id, String newName) { 
		// �̸��� �����ϴ� �޼ҵ�
		Member member = idToMemberMap.get(id);
		
		if(member == null) { // id ����
			return;
		}
		member.setName(newName);
	}

	public TreeMap<String, Member> sameName(String name) { 
		// ���� �̸��� ���� ����� �̾Ƴ��� �޼ҵ�
		//        id     
		TreeMap<String, Member> map = new TreeMap<>();
		Iterator<String> iter = idToMemberMap.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Member member = idToMemberMap.get(key);
			if(member.getName().equals(name)) {
				map.put(key, member);
			}
		}
		
		return map;
	}
}
