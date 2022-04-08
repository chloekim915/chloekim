package com.kh.ex04.access_modifier;

//���� ������
public class AccessModifier { 
	public int 		publicValue;		// ���� ������ ��� ����
	protected int 	protectedValue;		// ��ӵ� �θ� �ڽŰ��� ���� ���� + ��Ű�� ������ ��밡��
	int 			defaultValue;		// ��Ű�� ������ ��밡��
	private int 	privateValue; 		// �ڱ� �ڽŸ� ��� ����

	public void myMethod() {
		publicValue 	= 1; // OK
		protectedValue 	= 2; // OK
		defaultValue 	= 3; // OK
		privateValue 	= 4; // OK
	}
}