package com.kh.ex04.access_modifier;

public class TestAccessModifier {
//AccessModifier�� ���� ��Ű������ ������� ���� �׽�Ʈ
	
	public static void main(String[] args) {
		AccessModifier test = new AccessModifier();
		test.publicValue  		= 1; // OK 
		test.protectedValue  	= 2; // OK
		test.defaultValue  		= 3; // OK 
//		test.privateValue  		= 4; // NG=Fail!! 
		// The field AccessModifier.privateValue is not visible : �������ʾ�! = ���� �Ұ��ϴ�.
		// privateValue cannot be resolved or is not a field : �ʵ忡�� ������� �ʾҴ�.
	}

}
