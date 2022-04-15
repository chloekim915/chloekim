package com.kh.ex02.string_usage;

import java.util.StringTokenizer;

//String Class 사용법
public class StringUsage {
	public static void main(String[] args) {
		//1.equals : 문자열을 비교하는 함수
		String a = "aaa";
		String b = "aaabbb";
		System.out.println(a.equals("aaa"));
		System.out.println(a.equals(b));
		System.out.println(a == new String("aaa")); //== 쓰지말것
		System.out.println("----------------------------");
		
		//2.contains : 문자열의 포함 여부를 알려주는 함수
		System.out.println(a.contains("a"));
		System.out.println(a.contains(b)); //a가 b를 포함하고 있는지
		System.out.println(b.contains(a));
		System.out.println("----------------------------");
		
		//3.compareTo : 문자열의 유사를 확인하는 함수
		//-- 숫자가 크면 클수록 유사성이 없는 문자열, 10미만일 경우는 유사도가 높다.
		a = "Hello";
		b = "Hello!!";//2
//		b = "Hello!!!";//3
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println("----------------------------");
		
		//4. concat : 문자열을 결합하는 함수
		String str = "홍길동";
		String str1 = "의 주소지는 서울입니다.";
		String str2 = str.concat(str1);
		str.concat(str1);//이딴거 안됨
		System.out.println(str2);
		System.out.println(str + str1); //같은 기능
		System.out.println("----------------------------");
		
		//String API 사용시 주의점
		//-this(본인)은 불변하는 원칙(immutable = 불변성)
		//-다른 객체로 값을 받아줘야한다
		
		//5.chatAt() : 문자열에서 하나의 문자만 반환하는 기능
		String temp = "abcdef";
		for(int i = 0; i < temp.length(); i++) {
			System.out.println(temp.charAt(i)+" ");
			//charAt(index)
		}
		System.out.println("----------------------------");
		
		//6.indexOf() : 문자열 내에서 매개변수와 일치하는 문자를 찾아 index를 반환하는 함수
		//             0 12 345
		String str3 = "안녕하세요?";
		System.out.println(str3.indexOf("하")); //2
		System.out.println(str3.indexOf("?")); //2
		System.out.println("----------------------------");
		String str4 = "abcabcabc";
		System.out.println(str4.indexOf("a")); //0
		System.out.println(str4.indexOf("bc")); //1, 시작점
		System.out.println(str4.indexOf("a", 1)); // 3
		System.out.println(str4.indexOf("a", 4)); // 6
		System.out.println(str4.indexOf("d")); //없으면 -1
//		int result = str4.indexOf("a", 4); //값 가져와서 사용법
		System.out.println("----------------------------");
		
		//응용편
		// '안녕'이라고 친 문자열 개수를 찾고 인덱스를 출력하세요!
				String str5 = "안녕하세요? 저는 홍길동이고, 다시 안녕하세요 하는 "
								+ "사람은 제가 아니고 안녕하세요 말하고 있지 않습니다."; 
		String token = "안녕";
		int startIndex = 0;
		int count = 0;
		while(true) {
			int result = str5.indexOf(token, startIndex);
			if(result < 0) {
				break;
			}
			count++;
			System.out.println("찾은 index : " + result);
			startIndex = result + token.length();
		}
		System.out.println("찾은 갯수 : " + count);
		System.out.println("----------------------------");
		
		
		//7.lastIndexOf : 문자열을 찾는데 뒤에서부터 찾는다!
		System.out.println(str5.lastIndexOf("안녕"));
		System.out.println(str5.lastIndexOf("안녕", 40-2));//마지막 찾은 위치-2
		System.out.println(str5.lastIndexOf("안녕", 20-2));//마지막 찾은 위치-2
		System.out.println("----------------------------");
		
		//8.trim류 : white space를 제거하는 함수
		//white space란? 사람 눈에 보이지 않는 문자열 혹은 공백, newline, tab, 기타 문자열
		final String origin
		= " \r    이름 : #*홍길동, 나이 : #*23, 주소 : #*서울시 강남구   \u2003\n\t";
		System.out.println(origin);
		System.out.println("----------------------------");
		System.out.println(origin.trim()); //문자 쓰레기 값을 제외한 white space 제거
		System.out.println(origin.strip()); //모든 white space 제거
		System.out.println(origin.stripLeading()); //앞쪽만 제거하는 함수
		System.out.println(origin.stripTrailing()); //뒤쪽만 제거하는 함수
		System.out.println(origin.stripIndent()); // white space 중에 \t newline제외 인텐트를 살릴 때
		System.out.println("----------------------------");
		
		String text = origin.strip(); //strip를 추천, 가장 빠르고 가장 많이 제거해줌
		System.out.println(text);
		//Web에서 비일비재하게 쓰인다. 특히 게시판이나 입력 들어올 때
		
		//9.substring : 문자열을 정한 위치에서 자를 때 사용
		//주의 : 문자열의 길이를 잘못 지정하는 경우 죽는다.
		System.out.println("----------------------------");
		System.out.println(text.substring(10)); //10글자부터
		System.out.println(text.substring(4, 10)); //4~10까지
		System.out.println(text.substring(text.length() - 10, text.length())); //뒤에서 10글자
		System.out.println("----------------------------");
		
		
		//10.replace : 문자열 대체 할 때 (교체 할 때)
		//String replace(CharSequence target, CharSequence replacement)
		System.out.println(text.replace("#*", "")); //중복된 경우 모두 교체된다
		System.out.println(text.replace("홍길동", "고길동"));
		System.out.println("----------------------------");
		
		String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]"; // 특수문자를 제거하는 정규식 표현
		System.out.println(origin.replaceAll(match, ""));//Id, Pw에서 특수문자 제거할 때 -> 보안상 처리 필수
		System.out.println("----------------------------");
		text = text.replace("#*", "");
		
		//11.split : 문자열을 특정 인자(Delimiter)로 잘라서 토큰(Token)으로 반환하는 함수
		System.out.println("원문 = " + text);
		
		String[] strArray = text.split(","); //Delimiter = ','
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println("----------------------------");
		
		String[] outArray = text.split(",");
		for(String s : outArray) { //단축된 for문, 배열이나 컬렉션에서 사용
			String[] inArray = s.split(":");
			for(String s2 : inArray) {
				System.out.println(s2.strip());
			}
		}
		System.out.println("----------------------------");
		
		//12.join() : 배열을 특정 문자열로 합쳐주는 기능
		String[] strArray2 = text.split(","); // Delimiter = ,
		System.out.println(strArray2[0]);
		System.out.println(strArray2[1]);
		
		String temp2 = String.join("_", strArray2);
		System.out.println(temp2);
		System.out.println("----------------------------");
		
		//13.StringTokenizer : Split의 객체버전
		System.out.println(text);
		
		StringTokenizer tokens = new StringTokenizer(text, ",");
		while(tokens.hasMoreElements()) { //다음의 엘리먼트를 갖고 있니?
			System.out.println(tokens.nextElement()); //다음 엘리먼트야.
		}
		System.out.println("----------------------------");
		
		//14.대문자 변경하기 : toXXXXXCase
		System.out.println("----------------------------");
		String temp3 = "ABC abc AAA bbb";
		System.out.println(temp3.toUpperCase()); //대문자 변경
		System.out.println(temp3.toLowerCase()); //소문자 변경
		System.out.println("----------------------------");
		
		//15.valueOf : 다른 자료형으로 변환하기
		int age = 23;
		String strAge1 = "" + age; //이거 추천 문자열로 변환
		String strAge2 = String.valueOf(age); //이거 추천 문자열로 변환
		System.out.println(strAge1);
		System.out.println(strAge2);
		System.out.println("----------------------------");
		
		//16.repeat : 반복하기
		String repeatText = "ABC".repeat(10);
		System.out.println(repeatText);
		
	}

}
