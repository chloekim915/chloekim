package com.kh.ex03.branch;
import java.util.Random;
import java.util.Scanner;

public class BranchStatement2 {
	public static void main(String[] args) {
		// 숫자 1 ~ 10까지 랜덤으로 숫자 하나를 뽑고,
		// 여러분들이 5번까지 맞춰서 이기고 지는 게임
		Scanner sc = new Scanner(System.in);
		//	int randomInt = new Random().nextInt(10); //0~9까지 랜덤으로 가져올때
		int randomInt = new Random().nextInt(10) + 1; //1~10
		char randomChar = (char)('A' + new Random().nextInt(5)); //랜덤 문자열 뽑을때

		int i = 5; //기회 5번
		boolean isWin = false;//flag
		//boolean의 초기값을 false로 지정을 해놓고 false에서 벗어나서 true이고 안벗어나면 그대로 false로 가는거

		while(i > 0) { // 5 4 3 2 1 ...
			System.out.println("1 ~ 10 까지 숫자 하나를 선택해주세요!");
			int pickNum = sc.nextInt();

			if(pickNum < 1 || pickNum > 10) {
				System.out.println("잘못된 숫자입니다. 다시 선택해주세요. : " + pickNum);
				continue; // count를 감소 시키지 않고 기회를 한번 더준다! 위에 while로 돌ㅇ가가기
			}

			if(pickNum == randomInt) {
				System.out.println("맞췄습니다. 당신이 승리하였습니다.");
				isWin = true;
				break;
			}else {
				System.out.println("틀렸습니다! " + (i-1) + "번 남았습니다.");
			}
			i--;
		}

		if(isWin == false) {
			System.out.println("당신은 루저입니다.");
		}
		System.out.println("선택 된 숫자 : " + randomInt);
	}
}
