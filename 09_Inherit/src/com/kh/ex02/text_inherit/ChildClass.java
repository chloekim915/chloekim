package com.kh.ex02.text_inherit;

public class ChildClass extends SuperClass{ //�ڽ� Ŭ����
	private int privateValue = 105; //�ۿ��� ��� �Ұ�
	protected int protectedValue = 110;
	public int publicValue = 120;
	
	public ChildClass() {
		super(); //�θ��� ������ ȣ��, �����ص� �ڵ����� ���� �����ش�.
				 //���� ���� : �θ��� Ŭ���� -> �ڽ��� Ŭ����
		
		int publicValue = 300;
		
		//�ڽ��� ������� ȣ��
		System.out.println("My privateValue : " + this.privateValue);
		System.out.println("My protectedValue : " + this.protectedValue);
		System.out.println("My publicValue : " + this.publicValue);
		System.out.println("Local publicValue : " + publicValue); //300

		//�θ��� ������� ȣ��
//		System.out.println("Super privateValue : " + super.privateValue); //ȣ�� �Ұ� : private��
		System.out.println("Super privateValue : " + super.getPrivateValue()); //ȣ�� ����
		System.out.println("Super protectedValue : " + super.protectedValue);
		System.out.println("Super publicValue : " + super.publicValue); 
	}

	@Override //��ӵ� �θ𿡼� ������ �޼ҵ��� ���� ǥ��
	public void publicMethod() {
		System.out.println("Call ChildClass's publicMethod");
		super.publicMethod(); //������ �θ��� publicMethod ȣ���ϴ� ��, ��� �ȴ�
	}

}
