package com.kh.ex04.access_modifier;

public class TestAccessModifier {
//AccessModifier와 같은 패키지에서 멤버변수 접근 테스트
	
	public static void main(String[] args) {
		AccessModifier test = new AccessModifier();
		test.publicValue  		= 1; // OK 
		test.protectedValue  	= 2; // OK
		test.defaultValue  		= 3; // OK 
//		test.privateValue  		= 4; // NG=Fail!! 
		// The field AccessModifier.privateValue is not visible : 보이지않아! = 접근 불가하다.
		// privateValue cannot be resolved or is not a field : 필드에서 선언되지 않았다.
	}

}
