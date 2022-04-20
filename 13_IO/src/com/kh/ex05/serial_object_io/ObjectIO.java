package com.kh.ex05.serial_object_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectIO {
	// 객체단위로 IO 하는 방법
	
	public static boolean saveObject(File file, Object obj) {
		try ( FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				) {
			oos.writeObject(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static Object loadObject(File file) {
		try (FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				) {
			return ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main2222(String[] args) {
		UserVO user = new UserVO("test", "홍길동", 23, "010-3131-3333");
		File file = new File("./objInfo");
		
		boolean result = ObjectIO.saveObject(file, user); // 직렬화
		System.out.println("result : " + result);
		// 저장 완료
		
		// 읽어 오기
		UserVO user2 = (UserVO) ObjectIO.loadObject(file); // 역직렬화
		System.out.println("user1 : " + user.toString());
		System.out.println("user2 : " + user2.toString());
		System.out.println(user.equals(user2)); // 그냥하면 같지 않다고 나옴!
		// equals를 다시 생성해야함! -> 반드시 이클립스 자동완성 기능으로
		// java.io.NotSerializableException : 직렬화 하지 않을때 발생하는 예외
	}
	
	// 객체 배열 단위로 R/W 하기
	public static void main(String[] args) {
		UserVO user1 = new UserVO("test1", "홍길동3", 23, "010-3131-3333");
		UserVO user2 = new UserVO("test2", "홍길동2", 33, "010-3131-3333");
		UserVO user3 = new UserVO("test3", "홍길동3", 43, "010-3131-3333");
		UserVO user4 = new UserVO("test4", "홍길동4", 53, "010-3131-3333");
		
		UserVO[] userArray = new UserVO[4];
		userArray[0] = user1; 
		userArray[1] = user2; 
		userArray[2] = user3; 
		userArray[3] = user4; 
		
		File file = new File("./objInfo");
		boolean result = ObjectIO.saveObject(file, userArray); // 직렬화
		System.out.println("result : " + result);
		// 저장 완료
		
		// 읽어 오기
		UserVO[] userArray2 =(UserVO[]) ObjectIO.loadObject(file); // 역직렬화
		
		System.out.println("user1 : " + Arrays.toString(userArray));
		System.out.println("user2 : " + Arrays.toString(userArray2));
	}
}

