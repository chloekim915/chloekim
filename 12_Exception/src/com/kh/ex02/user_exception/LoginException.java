package com.kh.ex02.user_exception;

public class LoginException extends Exception{
	private static final long serialVerionUID = 1L;
	
	private String cause;
	
	public LoginException(String cause) {
		this.cause = cause;
	}

	@Override
	public void printStackTrace() {
		System.out.println("로그인에 실패하였습니다.");
		System.out.println("원인 : "+cause);
		super.printStackTrace();
	}
	
	

}
