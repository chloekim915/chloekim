package com.kh.ex04.access_modifier2;

import com.kh.ex04.access_modifier.AccessModifier;

public class TestAccessModifier2 {
//AccessModifier�� �ٸ� ��Ű�� = �ܺο��� ������� ���� �׽�Ʈ
	
	public static void main(String[] args) {
		AccessModifier test = new AccessModifier();
		test.publicValue  		= 1; // OK public�� ��𼭵��� ���ٰ���
//		test.protectedValue  	= 2; // NG ��Ű���� �ٸ��� ��ӵ� ���ؼ�
//		test.defaultValue  		= 3; // NG �ٸ� ��Ű����
//		test.privateValue  		= 4; // NG private
		// The field AccessModifier.privateValue is not visible : �������ʾ�! = ���� �Ұ��ϴ�.
		// privateValue cannot be resolved or is not a field : �ʵ忡�� ������� �ʾҴ�.
	}

}
