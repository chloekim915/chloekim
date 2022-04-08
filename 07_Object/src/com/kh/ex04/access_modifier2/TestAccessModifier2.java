package com.kh.ex04.access_modifier2;

import com.kh.ex04.access_modifier.AccessModifier;

public class TestAccessModifier2 {
//AccessModifier와 다른 패키지 = 외부에서 멤버변수 접근 테스트
	
	public static void main(String[] args) {
		AccessModifier test = new AccessModifier();
		test.publicValue  		= 1; // OK public은 어디서든지 접근가능
//		test.protectedValue  	= 2; // NG 패키지도 다른데 상속도 안해서
//		test.defaultValue  		= 3; // NG 다른 패키지라
//		test.privateValue  		= 4; // NG private
		// The field AccessModifier.privateValue is not visible : 보이지않아! = 접근 불가하다.
		// privateValue cannot be resolved or is not a field : 필드에서 선언되지 않았다.
	}

}
