package com.kh.practice.chap01.ControlPractice;

import java.util.Scanner;

public class OperatorPracticeHard {
	public static void main(String[] args) {
		//public void practice11(){
		//������ �̿��ؼ� 4�ڸ� ��й�ȣ�� ������� �ϴµ�
		//�� �� 4�ڸ� ������ �Է¹޾� �� �ڸ����� �ߺ��Ǵ� ���� ���� ��� '���� ����'
		//�ߺ� ���� ������ ���ߺ� �� ������
		//�ڸ����� �� ������ ���ڸ� �� �� ������ ���
		//��, ���� ���ڸ� ���� ���� 1~9 ���� ����

		Scanner sc = new Scanner(System.in);

		System.out.print("��й�ȣ �Է�(1000~9999) : ");
		String pw = sc.nextLine();

		if(pw.length() >= 5) {
			System.out.println("�ڸ��� �ȸ���");
		} else if(pw.contains((pw)) == true) {
			System.out.println("�ߺ� �� ����"); 
		} else { 
				System.out.println("����");
			}
		}

}
