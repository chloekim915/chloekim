package com.kh.ex04.access_modifier2;

import com.kh.ex04.access_modifier.AccessModifier;

// extends : ��� Ű����, AccessModifier�� ����� �ڽ��� ����
public class ExtendsTestAccessModifier extends AccessModifier {
	//AccessModifier ���� ���� : �ܺ� ��Ű������ ����� �ڽ� Ŭ����
	
	public void myMethod() {
		publicValue = 1; //
		protectedValue = 2; // ok ��ӵ� �ڽĿ��� ��밡���� ���������ڶ� ����
//		defaultValue = 3; // ng �ܺ� ��Ű���� ���Ұ�
//		privateValue = 4; // ���� Ŭ����(�ڽ�)�� ��밡��
	}

}
