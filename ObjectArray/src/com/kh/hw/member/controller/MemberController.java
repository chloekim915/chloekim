package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static int SIZE = 10;
	
	public int existMemberNum() {
		int memberCount = 0;
		for(int i = 0; i < this.m.length; i++) {
			if(this.m[i] != null) {
				memberCount++;
			}
		}
		return memberCount;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i = 0; i < this.m.length; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				return;
			}
		}
	}
	
	public boolean checkId(String inputId) {
		boolean isSame = false;
		for(int i = 0; i < this.m.length; i++) {
			if(this.m[i] == null) {
				continue;
			}
			if(this.m[i].getId().equals(inputId)) {
				isSame = true;
				return isSame;
			}
		}
		return isSame;
	}
	
	public String searchId(String id) {
		String strResult = "";

		for(int i = 0; i < this.m.length; i++) {
			if(m[i].getId().equals(id)) {
				strResult = m[i].inform();
				return strResult;
			}
		}
		return strResult;
	}
	public Member[] searchName(String name) {
		Member[] sn = new Member[SIZE]; 
		int count = 0; 
		for(int i = 0; i < m.length; i++) { 
			if(m[i] == null) { 
				continue; 
			}else if(m[i].getName().equals(name)) { 
				sn[count] = m[i];                  
				count++; 
				continue; 
			}
		}
		return sn;
	}
	public Member[] searchEmail(String email) {
		Member[] se = new Member[SIZE]; 
		int count = 0; 
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) { 
				continue;     
			}else if(m[i].getEmail().equals(email)) { 
				se[count] = m[i];     
				count++;   
				continue;  
			}
		}
		return se;
	}
	
	public boolean updatePassword(String id, String password) {
		boolean up = false; 

		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) { 
				continue;  
			}
			else if(m[i].getId().equals(id)) { 
				up = true; 
				m[i].setPassword(password);  
			}
		}
		return up;
	}
	
	public boolean updateName(String id, String name) {
		boolean un = false; 

		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) { 
				continue;     
			}else if(m[i].getId().equals(id)){ 
				m[i].setName(name); 
				un = true;  
			}
		}
		return un;
	}
	
	public boolean updateEmail(String id, String email) {
		boolean ue = false;

		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) { 
				continue;     
			}else if(m[i].getId().equals(id)){
				m[i].setEmail(email); 
				ue = true; 
			}
		}
		return ue;
	}
	public boolean delete(String id) {
		boolean del = false; 

		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) { 
				continue;     
			}else if(m[i].getId().equals(id)) { 
				m[i] = null; 
				del = true;  
			}
		}
		return del;
	}
	public void delete() {
		for(int i = 0; i < m.length; i++) {
			m[i] = null; 
		}
		return;
	}

	public Member[] printAll() {
		Member[] mc = new Member[SIZE]; 
		int count = 0; 

		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				mc[count] = m[i]; 
				count++; 
			}
		}
		return mc; 
	}
}
