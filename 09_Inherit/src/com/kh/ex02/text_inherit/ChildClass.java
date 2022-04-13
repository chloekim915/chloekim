package com.kh.ex02.text_inherit;

public class ChildClass extends SuperClass{ //자식 클래스
	private int privateValue = 105; //밖에서 사용 불가
	protected int protectedValue = 110;
	public int publicValue = 120;
	
	public ChildClass() {
		super(); //부모의 생성자 호출, 생략해도 자동으로 생성 시켜준다.
				 //생성 순서 : 부모의 클래스 -> 자식의 클래스
		
		int publicValue = 300;
		
		//자신의 멤버변수 호출
		System.out.println("My privateValue : " + this.privateValue);
		System.out.println("My protectedValue : " + this.protectedValue);
		System.out.println("My publicValue : " + this.publicValue);
		System.out.println("Local publicValue : " + publicValue); //300

		//부모의 멤버변수 호출
//		System.out.println("Super privateValue : " + super.privateValue); //호출 불가 : private라서
		System.out.println("Super privateValue : " + super.getPrivateValue()); //호출 가능
		System.out.println("Super protectedValue : " + super.protectedValue);
		System.out.println("Super publicValue : " + super.publicValue); 
	}

	@Override //상속된 부모에서 가져온 메소드라는 것을 표시
	public void publicMethod() {
		System.out.println("Call ChildClass's publicMethod");
		super.publicMethod(); //강제로 부모의 publicMethod 호출하는 법, 없어도 된다
	}

}
