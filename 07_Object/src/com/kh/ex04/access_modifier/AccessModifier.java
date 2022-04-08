package com.kh.ex04.access_modifier;

//접근 제한자
public class AccessModifier { 
	public int 		publicValue;		// 공용 누구나 사용 가능
	protected int 	protectedValue;		// 상속된 부모 자신간의 공유 가능 + 패키지 같으면 사용가능
	int 			defaultValue;		// 패키지 같으면 사용가능
	private int 	privateValue; 		// 자기 자신만 사용 가능

	public void myMethod() {
		publicValue 	= 1; // OK
		protectedValue 	= 2; // OK
		defaultValue 	= 3; // OK
		privateValue 	= 4; // OK
	}
}