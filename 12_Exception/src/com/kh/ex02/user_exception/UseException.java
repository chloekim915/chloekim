package com.kh.ex02.user_exception;

public class UseException {
	public static void main(String[] args) {
		String userID = "test";
		String userPW = "1234";
		
		String inputID = "test";
		String inputPW = "123411";
		
		try {
			if(userID.equals(inputID) == false) {
				throw new LoginException("아이디가 맞지 않습니다!");
			}
			if(userPW.equals(inputPW) == false) {
				throw new LoginException("비밀번호가 맞지 않습니다!");
			}
			System.out.println("로그인 성공");
		} catch (LoginException e) {
			System.out.println("로그인 예외처리!");
			e.printStackTrace();
		} finally {
			//주로 자원을 정리해주는 곳 성공했든 실패했든 입력받은 값은 지워야징
			inputID = null;
			inputPW = null;
			System.out.println("자원이 정리되었습니다.");
		}
	}

}
