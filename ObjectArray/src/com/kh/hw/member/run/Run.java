package com.kh.hw.member.run;

import com.kh.hw.member.view.MemberMenu;

public class Run {

	public static void main(String[] args) {
		MemberMenu mbm = new MemberMenu(); //MemberMenu 라는 객체를 새로(new) 만든겁니다. 
		                                   //그리고 그렇게 만들어진 MemberMenu라는 객체를 mbm이라는 변수에 담은겁니다. 
		                                  //그리고 mbm이라는 변수의 데이터 형은 그 객체의 이름(MemberMenu)을 그대로 가지고 있어야합니다. 
		                                  //그래서 MemberMenu mbm 이라고 생긴겁니다.
		mbm.mainMenu(); // mbm(MemberMenu)에 있는 mainMenu를 실행시킨다.
	}

}