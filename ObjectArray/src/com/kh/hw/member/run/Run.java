package com.kh.hw.member.run;

import com.kh.hw.member.view.MemberMenu;

public class Run {

	public static void main(String[] args) {
		MemberMenu mbm = new MemberMenu(); //MemberMenu ��� ��ü�� ����(new) ����̴ϴ�. 
		                                   //�׸��� �׷��� ������� MemberMenu��� ��ü�� mbm�̶�� ������ �����̴ϴ�. 
		                                  //�׸��� mbm�̶�� ������ ������ ���� �� ��ü�� �̸�(MemberMenu)�� �״�� ������ �־���մϴ�. 
		                                  //�׷��� MemberMenu mbm �̶�� ����̴ϴ�.
		mbm.mainMenu(); // mbm(MemberMenu)�� �ִ� mainMenu�� �����Ų��.
	}

}