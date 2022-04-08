package com.kh.ex04.access_modifier2;

import com.kh.ex04.access_modifier.AccessModifier;

// extends : 상속 키워드, AccessModifier를 상속한 자식을 생성
public class ExtendsTestAccessModifier extends AccessModifier {
	//AccessModifier 와의 관계 : 외부 패키지에서 선언된 자식 클래스
	
	public void myMethod() {
		publicValue = 1; //
		protectedValue = 2; // ok 상속된 자식에서 사용가능한 접근제한자라 가능
//		defaultValue = 3; // ng 외부 패키지라 사용불가
//		privateValue = 4; // 같은 클래스(자신)만 사용가능
	}

}
