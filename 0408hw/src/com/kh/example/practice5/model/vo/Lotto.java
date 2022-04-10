package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {
	private int[] lotto;
	{
		lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = new Random().nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				} break;
			}
		}
	}
	
	public Lotto() {
		
	}
	
	public void information() {
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}
}
