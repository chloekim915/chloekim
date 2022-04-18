package com.kh.ex02.user_exception;

public class LoginException extends Exception{
	private static final long serialVerionUID = 1L;
	
	private String cause;
	
	public LoginException(String cause) {
		this.cause = cause;
	}

	@Override
	public void printStackTrace() {
		System.out.println("�α��ο� �����Ͽ����ϴ�.");
		System.out.println("���� : "+cause);
		super.printStackTrace();
	}
	
	

}
