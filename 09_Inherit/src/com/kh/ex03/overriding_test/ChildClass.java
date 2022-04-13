package com.kh.ex03.overriding_test;

public class ChildClass extends SuperClass{
	//접근제한자 별로 상속 실습
	
	//private, final은 상속이 불가능!

	@Override
	public void publicMethod() {
		super.publicMethod();
	}

//	@Override
//	protected void protectedMethod() {
//		super.protectedMethod();
//	}
	
	@Override
	public void protectedMethod() {
		//부모의 메소드보다 접근제한자를 더 넓게 설정 가능하다.
		super.protectedMethod();
	}

	@Override
	void defaultMethod() {
		super.defaultMethod();
	}
}
