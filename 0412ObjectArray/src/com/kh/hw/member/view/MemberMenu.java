package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	Scanner sc = new Scanner(System.in); //사용자로부터 입력값을 받는다.
	MemberController mc = new MemberController(); //MemberController 라는 객체를 새로(new) 만든겁니다. 
    //그리고 그렇게 만들어진 MemberController라는 객체를 mc이라는 변수에 담은겁니다. 
   //그리고 mc이라는 변수의 데이터 형은 그 객체의 이름(MemberController)을 그대로 가지고 있어야합니다. 
   //그래서 MemberController mc라고 생긴겁니다.
	
	public MemberMenu() {} //기본생성자
	
	public void mainMenu() { //메인 메뉴 출력 메소드
		while(true) { //무한루프
			System.out.println("최대 등록 가능한 인원수는 " + mc.SIZE + "입니다"); //무한루프의 시작은 늘 이 아이가 나온다
			System.out.println("현재 등록된 인원수는 " + mc.existMemberNum() + "명입니다" ); //무한루프의 시작은 늘 이 아이가 나온다
			if(mc.existMemberNum() != mc.SIZE){ //만약 현재 존재하는 인원수가 10이 아니라면 if문 실행
				System.out.println("1. 새 회원 등록");
			}else { // 만약 현재 존재하는 회원수가 10명이라면 else문 실행
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine()); //사용자로부터 메뉴번호를 입력 받는다.
			
			switch(num) { // switch- case문 
			case 1 : 
				insertMember(); // 회원등록하기 위한 데이터를 사용자에게 입력받는 메소드, 새 회원 등록
				continue; // continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			case 2:
				searchMember(); // 찾는 서비스 메뉴 출력 메소드, 회원 검색
				continue; // continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			case 3:
				updateMember(); //수정 메뉴 출력 메소드, 회원 정보 수정
				continue; // continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			case 4:
				deleteMember(); // 삭제 메뉴 출력 메소드, 회원 삭제
				continue; // continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			case 5:
				printAll();//// mc의 printAll() 메소드의 반환 값을 가지고 저장된 회원을 출력하, 모두 출력
				continue; // continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break; //break을 만나는 즉시 반복문 전체 탈출
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue; // continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			}
			break; //break을 만나는 즉시 반복문 전체 탈출
			}
		}
	public void insertMember() { // 회원등록하기 위한 데이터를 사용자에게 입력받는 메소드
		System.out.println("회원을 등록합니다.");
		
		while(true) { //무한루프
			System.out.print("아이디 : ");
			String id = sc.nextLine(); //아이디를 입력 받는다.
			if(mc.checkId(id) == true) { // 중복된 아이디가 있다면 if문 실행.
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				return; //중복된 아이디가 있으므로 return으로 insertMember()를 호출한 곳으로 돌아간다.
			}
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			System.out.print("이메일 : ");
			String email = sc.nextLine();
			char gender; //성별 gender로 선언
			
			while(true) {
				System.out.println("성별 : "); 
				gender = (char)sc.nextLine().charAt(0); //성별입력
				if(Character.toUpperCase(gender) == 'M' || Character.toUpperCase(gender) == 'F') {
					//toUpperCase란 입력받은 영어를 무조건 대문자로 바꿔주는 역할을 한다.
					//입력받은 성별이 m, M, f ,F 라면 if문 실행.
					break; //break을 만나는 즉시 반복문 전체 탈출
				}else {
					System.out.println("다시 입력해주세요");
					continue; // continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
				}
			}
			System.out.println("나이 : ");
			int age = Integer.parseInt(sc.nextLine()); //나이입력
			
			mc.insertMember(id, name, password, email, gender, age);
			break; //break을 만나는 즉시 반복문 전체 탈출
		}
		
	}	
	public void searchMember() { //찾는 서비스 메뉴 출력 메소드
		if(mc.existMemberNum() == 0) { //만약 현재 존재하는 회원의 수가 0명이라면
			System.out.println("회원수가 0명입니다.");
			return; //return : 함수를 마치는 역할  //searchMember()를 호출한 쪽으로 return해준다
		}
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		
		System.out.println("메뉴번호 : ");		
		int num =Integer.parseInt(sc.nextLine());
		
		switch(num) { //switch - case
		case 1 : 
			searchId();  // 아이디검색을 위한 데이터를 사용자에게 입력 받는 메소드, 아이디로 검색하기
			break; //break을 만나는 즉시 반복문 전체 탈출
		case 2 : 
			searchName(); // 이름 검색을 위한 데이터를 사용자에게 입력 받는 메소드, 이름으로 검색하기
			break; //break을 만나는 즉시 반복문 전체 탈출
		case 3 : 
			searchEmail(); // 이메일 검색을 위한 데이터를 사용자에게 입력 받는 메소드, 이메일로 검색하기
			break; //break을 만나는 즉시 반복문 전체 탈출
		case 9 : 
			mainMenu();  //메인 메뉴 출력 메소드, 메인으로 돌아가기
			break; //break을 만나는 즉시 반복문 전체 탈출
		default :
			System.out.println("잘못입력하셨습니다.");
			break; //break을 만나는 즉시 반복문 전체 탈출
		}
	}
	public void searchId(){ // 아이디검색을 위한 데이터를 사용자에게 입력 받는 메소드
		System.out.println("검색할 아이디를 입력해주세요");
		System.out.print("검색할 아이디 : ");
		String inputId = sc.nextLine(); // 아이디를 입력받음
		
		if(mc.searchId(inputId).equals("")) { //id검색결과가 ""이라면
			System.out.println("검색 결과가 없습니다."); 
		}else {
			System.out.println("찾으신 회원조회 결과입니다.");
			System.out.println(mc.searchId(inputId)); // mc에 있는 searchId()로 id로 회원을 조회하여 값을 받아낸다
		}
		return; //return : 함수를 마치는 역할  //searchId()를 호출한 쪽으로 return해준다
	}
	public void searchName() { // 이름 검색을 위한 데이터를 사용자에게 입력 받는 메소드
		System.out.println("검색할 이름 입력해주세요");
		System.out.print("찾으시는 이름을 검색해주세요 : ");
		String inputName = sc.nextLine(); //이름을 입력받는다
		
		if(mc.searchName(inputName) == null) { //mc에 있는 searchName()을 통해 입력하신 이름이 없다면 if문 실행 
			System.out.println("찾으시는 이름이 없습니다.");
			return; //return : 함수를 마치는 역할  //searchName()를 호출한 쪽으로 return해준다.
		}else {
			System.out.println("찾으신 회원이름 검색 결과 입니다.");
			for(int i = 0; i < mc.searchName(inputName).length; i++) {//mc.searchName(inputName).length가 얼마나 되는지
				//궁금해서 System.out.print(i);를 돌려보았더니 아래와 같이 나왔다.
				//0Member [id=aaa, name=aaa, password=aaa, email=aa, gender=m, age=26]
				//123456789최대 등록 가능한 인원수는 10입니다
				//라고 나왔다. mc.searchName(inputName).length는 10이라는것 같다. 왜 10일까?? 미안하지만 이건 선생님께 물어봐야알거 같다.
				//내 생각에는 mc에 있는 searchName의 타입이 Member[]이고 그 안에서 생성한 객체배열의 크기가 mc.SIZE 즉 10이라서 저 length가 10인거 같다
				//그리고 0번째 인덱스에서 바로 나왔다 이건 또 무슨 뜻일까?
//				System.out.print(i); 0 1 2 3 4 5 6 7 8 9 
				if(mc.searchName(inputName)[i] == null) { //만약 mc.searchName(inputName)을 통해 이름이 null값인게 있다면 if 실행
					continue; // continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
				}else {
					System.out.println(mc.searchName(inputName)[i].inform());
					//mc에 있는 searchName(inputName)[i]의 정보를 inform으로 출력해준다.
				}	
			}
		}
		return; //return : 함수를 마치는 역할  //searchName()를 호출한 쪽으로 return해준다.
	}
	public void searchEmail() { // 이메일 검색을 위한 데이터를 사용자에게 입력 받는 메소드
		System.out.print("찾으시는 이메일 주소를 입력해주세요 : ");
		String inputEmail = sc.nextLine(); //사용자로부터 이메일을 입력 받는다.
		
		if(mc.searchEmail(inputEmail) == null) { //mc에 있는 searchEmail()을 통해 입력하신 이메일이 없다면 if문 실행
			System.out.println("찾으시는 이메일이 없습니다.");
			return; //return : 함수를 마치는 역할  //searchEmail()를 호출한 쪽으로 return해준다.
		}else {
			System.out.println("찾으시는 이메일 검색 결과 입니다.");
			for(int i = 0; i < mc.searchEmail(inputEmail).length; i++) {
				//mc에 있는 searchEmail의 타입이 Member[]이고 그 안에서 생성한 객체배열의 크기가 mc.SIZE 즉 10이라서 저 length가 10인거 같다
				if(mc.searchEmail(inputEmail)[i] == null) { //만약 mc.searchEmail(inputEmail)을 통해 이메일이 null값인게 있다면 if 실행
					continue; // continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
				}else {
					System.out.println(mc.searchEmail(inputEmail)[i].inform());
					//mc에 있는 searchEmail(inputEmail)[i]의 정보를 inform으로 출력해준다.
				}
			}
		}
		return; //return : 함수를 마치는 역할  //searchEmail()를 호출한 쪽으로 return해준다.
	}
	public void updateMember() { //수정 메뉴 출력 메소드
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = Integer.parseInt(sc.nextLine()); //메뉴번호를 입력받는다.

		switch (menuNum) {
		case 1:
			updatePassword(); //비밀번호 수정을 위한 데이터를 사용자에게 입력 받는 메소드, 비밀번호 수정하기
			break; //break을 만나는 즉시 반복문 전체 탈출
		case 2:
			updateName();   // 이름 수정을 위한 데이터를 사용자에게 입력 받는 메소드, 이름 수정하기
			break; //break을 만나는 즉시 반복문 전체 탈출
		case 3:
			updateEmail();  // 이메일 수정을 위한 데이터를 사용자에게 입력 받는 메소드, 이메일 수정하기
			break; //break을 만나는 즉시 반복문 전체 탈출
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break; //break을 만나는 즉시 반복문 전체 탈출
		default:
			System.out.println("잘못 입력하셨습니다.");
			break; //break을 만나는 즉시 반복문 전체 탈출
		}
	}
	public void updatePassword() {//비밀번호 수정을 위한 데이터를 사용자에게 입력 받는 메소드
		System.out.println("수정할 회원의 아이디 : ");
		String inputId = sc.nextLine(); //사용자로부터 아이디 입력받기
		System.out.println("수정할 비밀번호 : ");
		String inputPassword = sc.nextLine(); //사용자로부터 변경하고싶은 비밀번호 입력받기
		
		boolean result = mc.updatePassword(inputId, inputPassword); // boolean type으로 result를 선언해주었다 
		                                                           //mc.updatePassword(inputId, inputPassword)의 값은 true || false가 반환될것이다.
		   	// true가 반환되면 패스워드가 성공적으로 변경되었다는 뜻이다. 그런 반면 false가 반환되면 입력하신 id가 있지 않아서 변경이 안되었다는 뜻이 된다.
		if(result == false) {
			System.out.println("없는 아이디 입니다.");
		}else {
			System.out.println("패스워드 수정이 성공적으로 되었습니다");
		}
		return; //return : 함수를 마치는 역할  //updatePassword()를 호출한 쪽으로 return해준다.
	}
	public void updateName() { // 이름 수정을 위한 데이터를 사용자에게 입력 받는 메소드
		System.out.print("수정할 회원의 아이디를 입력해주세요 : ");
		String inputId = sc.nextLine(); //사용자로부터 아이디 입력받기
		System.out.print("수정하실 이름을 입력하세요 : ");
		String inputName = sc.nextLine(); //사용자로부터 변경하고싶은 이름 입력받기
		
		boolean result = mc.updateName(inputId, inputName);// boolean type으로 result를 선언해주었다 
                                                           //mc.updateName(inputId, inputName)의 값은 true || false가 반환될것이다.
                             // true가 반환되면 이름이 성공적으로 변경되었다는 뜻이다. 그런 반면 false가 반환되면 입력하신 id가 있지 않아서 변경이 안되었다는 뜻이 된다.
		
		if(result == false) {
			System.out.println("존재하지 않는 아이디 입니다.");
		}else {
			System.out.println("이름수정이 성공적으로 완료 되었습니다.");
		}
		return; //return : 함수를 마치는 역할  //updateName()를 호출한 쪽으로 return해준다.
	}
	public void updateEmail() { // 이메일 수정을 위한 데이터를 사용자에게 입력 받는 메소드
		System.out.print("수정할 회원의 아이디를 입력해주세요 : ");
		String inputId = sc.nextLine(); //사용자로부터 아이디 입력받기
		System.out.print("수정하실 회원의 이메일을 입력하세요 : ");
		String inputEmail = sc.nextLine(); //사용자로부터 변경하고싶은 이메일 입력받기
		
		boolean result = mc.updateEmail(inputId, inputEmail);  // boolean type으로 result를 선언해주었다 
        //mc.updateEmail(inputId, inputEmail)의 값은 true || false가 반환될것이다.
        // true가 반환되면 이메일이 성공적으로 변경되었다는 뜻이다. 그런 반면 false가 반환되면 입력하신 id가 있지 않아서 변경이 안되었다는 뜻이 된다.
		
		if(result == false) {
			System.out.println("존재하지 않는 아이디 입니다.");
		}else {
			System.out.println("이메일 수정이 성공적으로 되었습니다");
		}
		return; //return : 함수를 마치는 역할  //updateEmail()를 호출한 쪽으로 return해준다.
	}
	public void deleteMember() { // 삭제 메뉴 출력 메소드
		System.out.println("1.특정회원 삭제하기");
		System.out.println("2.모든회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = Integer.parseInt(sc.nextLine()); //메뉴번호를 입력받는다.
		
		switch(menuNum) {
		case 1 : 
			deleteOne(); //특정 한명의 회원개인정보를 삭제하는 메소드,  특정회원 삭제하기
			break; //break을 만나는 즉시 반복문 전체 탈출
		case 2 : 
			deleteAll(); //모든회원의 개인정보를 삭제하는 메소드, 모든회원 삭제하기
			break; //break을 만나는 즉시 반복문 전체 탈출
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break; //break을 만나는 즉시 반복문 전체 탈출
		default:
			System.out.println("잘못 입력하셨습니다.");
			break; //break을 만나는 즉시 반복문 전체 탈출
		}
	}
	public void deleteOne() { //특정 한명의 회원개인정보를 삭제하는 메소드,  특정회원 삭제하기
		System.out.print("삭제할 회원의 아이디를 입력하세요 : ");
		String inputId = sc.nextLine(); //사용자로부터 삭제할 회원의 아이디를 입력 받는다
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		String yn = sc.nextLine(); // 정말 삭제할것인지 y, Y , n , N을 입력 받는다
		
		if(yn.toUpperCase().equals("Y")) { //만약 y ,Y가 입된다면 
			if(mc.delete(inputId) == false) { //mc.delete(inputId)의 값은 true || false가 반환될것이다.
		        // true가 반환되면 성공적으로 해당 아이디가 삭제 되었다는 뜻이다. 그런 반면 false가 반환되면 입력하신 id가 있지 않아서 변경이 안되었다는 뜻이 된다.
				System.out.println("존재하지 않는 아이디 입니다.");
			}else { 
				System.out.println("성공적으로 삭제 되었습니다.");
			}
		}
		return; //return : 함수를 마치는 역할  //deleteOne()를 호출한 쪽으로 return해준다.
	}
	public void deleteAll() { //모든회원의 개인정보를 삭제하는 메소드, 모든회원 삭제하기
		System.out.println("정말 삭제 하시겠습니까?(y/n)");
		String yn = sc.nextLine(); // 정말 삭제할것인지 y, Y , n , N을 입력 받는다
		
		if(yn.toUpperCase().equals("Y")){ //만약 y, Y가 입력되었다면 mc.delete() 실핼하여 모든 데이터 값을 null로 설정
			mc.delete();
			System.out.println("전체 정보가 성공적으로 삭제되었습니다.");
		}
		return; //return : 함수를 마치는 역할  //deleteAll()를 호출한 쪽으로 return해준다.
	}
	public void printAll() { // mc의 printAll() 메소드의 반환 값을 가지고 저장된 회원을 출력
		if(mc.existMemberNum() == 0) {  //현재 존재하는 멤버 수가 0명이면
			System.out.println("저장된 회원이 없습니다");
			return; //return : 함수를 마치는 역할  //printAll()를 호출한 쪽으로 return해준다.
		}
		for(int i = 0; i < mc.printAll().length; i++) {
//			System.out.println(i); mc.printAll().length는 10이라고 나온다
			//mc에 있는 printAll의 타입이 Member[]이고 그 안에서 생성한 객체배열의 크기가 mc.SIZE 즉 10이라서 저 length가 10인거 같다
			if(mc.printAll()[i] == null) { //mc.printAll()[i]의 값이 없다면(null)이라면 continue
				continue;  // continue를 만나면 해당 반복부분 탈출 후 다음 반복실행
			}else {
				System.out.println(mc.printAll()[i].inform());
				//mc.printAll()[i]에 값이 있다면 존재하는 회원의 정보를 inform()을 통해 출력
			}
		}
		return; //return : 함수를 마치는 역할  //printAll()를 호출한 쪽으로 return해준다.
	}
}

