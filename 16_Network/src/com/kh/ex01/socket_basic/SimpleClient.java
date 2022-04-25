package com.kh.ex01.socket_basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {

	public static void main(String[] args) throws Exception {
		// 1. 접속하는 서버의 IP주소와 Port 번호를 설정
		String ip = "127.0.0.1"; // 서버의 IP.  127.0.0.1 = Loopback = 본인주소
		int port = 9000;
		
		// 2. socket 생성하기
		Socket socket = new Socket(ip, port);
		System.out.println("Client 소켓 생성을 성공했습니다.");
		
		// 3. 서버와 통신 로직 구현
		boolean result = connectServer(socket);
		System.out.println("통신 결과 : " + (result ? "성공" : "실패"));
		
		socket.close();
		System.out.println("Client 소켓을 종료하였습니다.");
	}
	
	private static boolean connectServer(Socket socket) {
		
		System.out.println("연결 성공!\n\tServer IP : "  
							+socket.getInetAddress().getHostAddress());
		System.out.println("\tPort 번호 : " + socket.getPort() );
		
		
		// ECHO 기능 구현
		try (   InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				InputStreamReader isr = new InputStreamReader(is);
				OutputStreamWriter osw = new OutputStreamWriter(os);
				BufferedReader br = new BufferedReader(isr);
				BufferedWriter bw = new BufferedWriter(osw);
				Scanner sc = new  Scanner(System.in);
				) {
			System.out.println("전송할 메세지를 입력하세요.");
			String readText = sc.nextLine();
			System.out.println("read : " + readText);
			bw.append(readText);
			bw.newLine();
			bw.flush();
			
			String recvMessage = br.readLine();
			System.out.println("서버 메세지 : " + recvMessage);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	
}

