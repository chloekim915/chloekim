package com.kh.ex02.text_inherit;

public class SuperClass { //����(�θ�) Ŭ����
	private int privateValue = 5; //�ۿ��� ��� �Ұ�
	protected int protectedValue = 10;
	public int publicValue = 20;
	
	public SuperClass() {
		System.out.println("I am a super class!");
	}
	
	public void publicMethod() {
		System.out.println("Call SuperClass's publicMethod!");
	}

	public int getPrivateValue() {
		return privateValue;
	}

	public void setPrivateValue(int privateValue) {
		this.privateValue = privateValue;
	}
	
}
