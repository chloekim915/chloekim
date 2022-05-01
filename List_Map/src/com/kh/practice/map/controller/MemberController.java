package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	//                ID
	private HashMap<String, Member> idToMemberMap = new HashMap<>();
	
	public MemberController() {
		idToMemberMap.put("test1", new Member("test1", "1234", "홍길동"));
		idToMemberMap.put("test2", new Member("test2", "1234", "최길동"));
		idToMemberMap.put("test3", new Member("test3", "1234", "김길동"));
		idToMemberMap.put("test4", new Member("test4", "1234", "이길동"));
	}

	public boolean joinMembership(String id, Member m) {
		// 맵에 키와 값을 저장하여 회원가입하는 메소드
		if(idToMemberMap.containsKey(id) == true) {
			return false;
		}
		idToMemberMap.put(id, m);
		return true;
	}

	public String logIn(String id, String password) {
		if(idToMemberMap.containsKey(id) == false) { // id 없을때
			return null;
		}
		
		Member member = idToMemberMap.get(id);
		if(member.getPassword().equals(password) == true) { // pw 맞으면
			return member.getName();
		}else { // pw 틀리면
			return null;
		}
	}

	public boolean changePassword(String id, String oldPw, String newPw) { 
		Member member = idToMemberMap.get(id);
		
		if(member == null) { // id 없음
			return false;
		}
		
		if(member.getPassword().equals(oldPw) == false) {
			return false;
		}
		
		member.setPassword(newPw);
		return true;
	}

	public void changeName(String id, String newName) { 
		// 이름을 변경하는 메소드
		Member member = idToMemberMap.get(id);
		
		if(member == null) { // id 없음
			return;
		}
		member.setName(newName);
	}

	public TreeMap<String, Member> sameName(String name) { 
		// 같은 이름을 가진 사람들 뽑아내는 메소드
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
