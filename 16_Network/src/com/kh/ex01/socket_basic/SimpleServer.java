package com.kh.ex01.socket_basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) throws Exception {
		// 1. port 설정 : int형 숫자로 정하고, 범위 규칙이 존재 1023 이상 셋팅
		int port = 9000; // 컴퓨터 내부의 프로그램의 주소
		
		// 2. ServerSocket 객체 생성하기
		//  - OS로부터 네트워크 포트 자원을 요청함 -> Bind 과정
		//  - 성공하면 객체 반환, 실패하면 예외 발생
		ServerSocket serverSocket = new ServerSocket(port); // IOException // 대표 번호
		System.out.println("Server 소켓을 생성하였습니다. port : " + port);
		
		// 3. Accept 클라이언트의 요청을 기다림
		//   -> Accept는 Blocking 함수로 요청이 있을때까지 대기함 (단, Time out 존재)
		Socket socket = serverSocket.accept(); //  새로운 port 번호로 통신 -> 상담원으로 연결
		
		// 4. Client 요청 수락 성공
		System.out.println("연결 성공");
		System.out.println("\t Client IP : "+ socket.getInetAddress().getHostAddress());
		System.out.println("\t Client Port : "+ socket.getPort());
		
		// 5. Client 통신을 받고 전용 Socket을 통해 통신로직 구성
		boolean result = connectClient(socket);
		System.out.println("통신 결과 : " + (result ? "성공" : "실패"));
		
		// 6. 통신 완료 이후 Socket Close
		socket.close();
		
		// 7. 서버 소켓을 종료
		serverSocket.close();
		System.out.println("서버를 종료합니다.");
	}

	private static boolean connectClient(Socket socket) {
		// ECHO 기능 구현
		try (   InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				InputStreamReader isr = new InputStreamReader(is);
				OutputStreamWriter osw = new OutputStreamWriter(os);
				BufferedReader br = new BufferedReader(isr);
				BufferedWriter bw = new BufferedWriter(osw);
				) {
			String readStr = br.readLine(); // Blocking 함수 -> 대기상태. Client에서 메세지 보낼때 까지 대기
			System.out.println("수신된 메세지 : " + readStr);
			// 해석부
			bw.append(readStr);
			bw.newLine();
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}