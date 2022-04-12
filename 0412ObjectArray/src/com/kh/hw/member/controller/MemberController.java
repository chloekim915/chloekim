package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10; // 10으로 상수 지정 public이기 때문에 전역에서 사용가능
	Member[] m = new Member[SIZE]; // Member type의  m 객체배열 크기를 10으로 선언후 초기화
	
	public int existMemberNum() {  // 현재 존재하는 멤버 수 반환
		int memcount = 0;  //초기 맴버수는 0으로 시작
		for(int i = 0; i < m.length; i++) { //객체배열m의 length는 10이다. 0부터 9까지 for문을 돌려서 현재 존재하는 회원이 있는지 확인 
			if(m[i] != null) { //m[i]값이 null이 아니면 맴버가 있다는 것이므로 count++ 
				memcount++; //맴버수 1씩 증가 
			}
		}
		return memcount; // existMemberNum()를 호출하면 return으로 memcount를 int type으로 반환한다.
	}
	public boolean checkId(String inputId) { // 아이디의 중복을 확인하는 메소드
		boolean isSame = false;  //초기 boolean 값을 false로 지정
		for(int i = 0; i < m.length; i++) { //객체배열m의 length는 10이다. 0부터 9까지 for문을 돌려서 입력한 아이디가 존재하는지 확인
			if(m[i] == null) { //아이디가 null 값이면 다시 입력하라고 돌려보낸다
				continue; // continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			}
			if(m[i].getId().equals(inputId)) { //같은 아이디가 있다면 true를 반환
				isSame = true;// 같은 아이디가 있으므로 isSame을 true로 변환
			}
		}
		return isSame; //checkId(String inputId); 를 누가 호출하면 boolean type으로 isSame을 반환한다.
	}
	public void insertMember(String id, String name, String password, String email, char gender, int age) { 
		// Member 객체를 객체배열에 저장하는 메소드
		for(int i = 0; i < m.length; i++) {//객체배열m의 length는 10이다. 0부터 9까지 for문을 돌려서 m[i]에 값이 존재하는지 확인
			if(m[i] == null) { //만약 [i]에 암것도 안들어가있으면 입력 ㄱㄱ
				m[i] = new Member(id, name, password, email, gender, age); //new를 통해 생성 // 객체배열의 특징
				return; //return함수를 마치는 역할  //insertMember를 호출한 쪽으로 return해준다
			} 
		}
	}
	public String searchId(String id) { // id로 회원을 조회하는 메소드
		String result = "";     //결과값을 리턴해줄려고 String type의 ""을 result로 만듦
		
		for(int i = 0; i < m.length; i++) {//객체배열m의 length는 10이다. 0부터 9까지 for문을 돌려서 m[i]에 값이 존재하는지 확인
			if(m[i] == null) { //m[i]에 값이 없다면 continue로 다음반복 실행
				continue; // continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			}
			else if(m[i].getId().equals(id)) { //찾고싶은 아이디(id)를 입력하셨는데 .equals로 비교후 만약 있으면 실행되는 부분
				result = m[i].inform(); //찾으신 아이디(id)의 inform을 String type의 reselt에 대입한다.
			}
		}
		return result; // 입력된 m[i]를 searchId를 호출한곳으로 반환한다.
		
	}
	public Member[] searchName(String name) {// 이름으로 회원을 조회하는 메소드
		Member[] sn = new Member[SIZE]; //type이 Member인 sn이라는 객체배열 생성
		int count = 0; // sn 객체배열에 인덱스를 넣어주기 위헤 생성
		for(int i = 0; i < m.length; i++) { //객체배열m의 length는 10이다. 0부터 9까지 for문을 돌려서 m[i]에 값이 존재하는지 확인
			if(m[i] == null) { //만약 m[i]에 값이 없다면 continue
				continue; //continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			}else if(m[i].getName().equals(name)) { //만약 찾고자 하는 이름이 있다면
				sn[count] = m[i];                   //우리가 생성한 sn 객체 배열에 할당후 count++ 시행
				count++; //0 -> 1 -> 2 ......
				continue; //continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			}
		}
		return sn; // m[i]가 할당된 객체배열 sn을 searchName()을 호출한곳으로 반환!
	}
	public Member[] searchEmail(String email) {//이메일로 회원을 조회하는 메소드
		Member[] sn = new Member[SIZE]; //type이 Member인 sn이라는 객체배열 생성
		int count = 0; // sn 객체배열의 인덱스를 넣어주기 위헤 생성
		for(int i = 0; i < m.length; i++) {//객체배열m의 length는 10이다. 0부터 9까지 for문을 돌려서 m[i]에 값이 존재하는지 확인
			if(m[i] == null) { //만약 m[i]에 값이 없다면 continue
				continue;      //continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			}else if(m[i].getEmail().equals(email)) { //만약 찾고자 하는 이메일이 있다면
				sn[count] = m[i];     //우리가 생성한 sn 객체 배열에 할당후 count++ 시행
				count++;   //0 -> 1 -> 2 ......
				continue;  //continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			}
		}
		return sn;  // m[i]가 할당된 객체배열 sn을 searchEmail()을 호출한곳으로 반환!
	}
	public boolean updatePassword(String id, String password) { // 비밀번호 변경 메소드
		boolean ch = false; //boolean ch의 초기값 false 지정
		
		for(int i = 0; i < m.length; i++) {//객체배열m의 length는 10이다. 0부터 9까지 for문을 돌려서 m[i]에 값이 존재하는지 확인
			if(m[i] == null) { //만약 m[i]에 값이 없다면 continue
				continue;  //continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			}
			else if(m[i].getId().equals(id)) { //입력하신 아이디가 있다면 비밀번호를 변경할수있도록 아래 구문실행
				ch = true; //ch의 값을 true로 변환
				m[i].setPassword(password); //입력하신 아이디의 비밀번호를 m[i].setPassword로 비밀번호를 재세팅해주고  
				
			}
		}
		return ch; // boolean type으로 ch를 updatePassword()를 호출한 곳으로 반환 시킨다.
	}
	public boolean updateName(String id, String name) { // 이름 변경 메소드
		boolean ch = false; //boolean ch의  초기값 false 지정

		for(int i = 0; i < m.length; i++) {//객체배열m의 length는 10이다. 0부터 9까지 for문을 돌려서 m[i]에 값이 존재하는지 확인
			if(m[i] == null) { //만약 m[i]에 값이 없다면 continue
				continue;      //continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			}else if(m[i].getId().equals(id)){ //입력하신 아이디가 있다면 이름을 수정할수있도록 아래 로직 실행
				m[i].setName(name); //입력하신 아이디의 비밀번호를 m[i].setName으로 이름을 재세팅해주고
				ch = true;  //ch의 값을 true로 변환
			}
		}
		return ch; // boolean type으로 ch를 updateName()를 호출한 곳으로 반환 시킨다.
	}
	public boolean updateEmail(String id, String email) {// 이메일 변경 메소드
		boolean ch = false; //boolean ch의  초기값 false 지정
		
		for(int i = 0; i < m.length; i++) {//객체배열m의 length는 10이다. 0부터 9까지 for문을 돌려서 m[i]에 값이 존재하는지 확인
			if(m[i] == null) { //만약 m[i]에 값이 없다면 continue
				continue;      //continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			}else if(m[i].getId().equals(id)){ //입력하신 아이디가 있다면 이메일을 수정할수있도록 아래 로직 실행
				m[i].setEmail(email); //입력하신 아이디의 비밀번호를 m[i].setEmail로 이메일을 재세팅해주고
				ch = true; //ch의 값을 true로 변환
			}
		}
		return ch; // boolean type으로 ch를 updateEmail()를 호출한 곳으로 반환 시킨다.
	}
	public boolean delete(String id) {// 한 회원만 삭제하는 메소드
		boolean ch = false; //boolean ch의  초기값 false 지정

		for(int i = 0; i < m.length; i++) {//객체배열m의 length는 10이다. 0부터 9까지 for문을 돌려서 m[i]에 값이 존재하는지 확인
			if(m[i] == null) { //만약 m[i]에 값이 없다면 continue
				continue;      //continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			}else if(m[i].getId().equals(id)) { //입력하신 아이디가 있다면 아이디를 삭제 할수있도록 아래 로직 실행
				m[i] = null; // m[i]의 값을 null값으로 만들어 줘서 삭제 시킴
				ch = true;   //ch의 값을 true로 변환
			}
		}
		return ch; // boolean type으로 ch를 delete(매개변수)를 호출한 곳으로 반환 시킨다.
	}
	public void delete() { //전체 회원을 삭제하는 메소드
		for(int i = 0; i < m.length; i++) { //객체배열m의 length는 10이다. 0부터 9까지 for문을 돌려준다.
			m[i] = null; //모든 m[i]의 값을 null로 만들어서 없앤다
		}
		return; //return함수를 마치는 역할  //delete()를 호출한 쪽으로 return해준다
	}
	public Member[] printAll() { // 저장된 모든 회원의 정보 출력

		Member[] sn = new Member[SIZE]; //type이 Member인 sn이라는 객체배열 생성
		int count = 0; // sn 객체배열에 인덱스를 넣어주기 위헤 생성
		
		for(int i = 0; i < m.length; i++) {//객체배열m의 length는 10이다. 0부터 9까지 for문을 돌려준다.
			if(m[i] != null) {// 만약 m[i] 안에 null값이 아닌 뭐라도 있다면 아래로직 실행
				sn[count] = m[i]; //객체배열 sn에 m[i] 값을 0 ~ 9까지 돌려가면서 있는 데이터를 대입해준다.
				count++; // 0 -> 1 -> 2 ....
			}
		}
		return sn; // m[i]가 할당된 객체배열 sn을 printAll()을 호출한곳으로 반환!
	}
}
