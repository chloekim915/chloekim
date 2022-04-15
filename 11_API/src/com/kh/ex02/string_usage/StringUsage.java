package com.kh.ex02.string_usage;

import java.util.StringTokenizer;

//String Class ����
public class StringUsage {
	public static void main(String[] args) {
		//1.equals : ���ڿ��� ���ϴ� �Լ�
		String a = "aaa";
		String b = "aaabbb";
		System.out.println(a.equals("aaa"));
		System.out.println(a.equals(b));
		System.out.println(a == new String("aaa")); //== ��������
		System.out.println("----------------------------");
		
		//2.contains : ���ڿ��� ���� ���θ� �˷��ִ� �Լ�
		System.out.println(a.contains("a"));
		System.out.println(a.contains(b)); //a�� b�� �����ϰ� �ִ���
		System.out.println(b.contains(a));
		System.out.println("----------------------------");
		
		//3.compareTo : ���ڿ��� ���縦 Ȯ���ϴ� �Լ�
		//-- ���ڰ� ũ�� Ŭ���� ���缺�� ���� ���ڿ�, 10�̸��� ���� ���絵�� ����.
		a = "Hello";
		b = "Hello!!";//2
//		b = "Hello!!!";//3
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println("----------------------------");
		
		//4. concat : ���ڿ��� �����ϴ� �Լ�
		String str = "ȫ�浿";
		String str1 = "�� �ּ����� �����Դϴ�.";
		String str2 = str.concat(str1);
		str.concat(str1);//�̵��� �ȵ�
		System.out.println(str2);
		System.out.println(str + str1); //���� ���
		System.out.println("----------------------------");
		
		//String API ���� ������
		//-this(����)�� �Һ��ϴ� ��Ģ(immutable = �Һ���)
		//-�ٸ� ��ü�� ���� �޾�����Ѵ�
		
		//5.chatAt() : ���ڿ����� �ϳ��� ���ڸ� ��ȯ�ϴ� ���
		String temp = "abcdef";
		for(int i = 0; i < temp.length(); i++) {
			System.out.println(temp.charAt(i)+" ");
			//charAt(index)
		}
		System.out.println("----------------------------");
		
		//6.indexOf() : ���ڿ� ������ �Ű������� ��ġ�ϴ� ���ڸ� ã�� index�� ��ȯ�ϴ� �Լ�
		//             0 12 345
		String str3 = "�ȳ��ϼ���?";
		System.out.println(str3.indexOf("��")); //2
		System.out.println(str3.indexOf("?")); //2
		System.out.println("----------------------------");
		String str4 = "abcabcabc";
		System.out.println(str4.indexOf("a")); //0
		System.out.println(str4.indexOf("bc")); //1, ������
		System.out.println(str4.indexOf("a", 1)); // 3
		System.out.println(str4.indexOf("a", 4)); // 6
		System.out.println(str4.indexOf("d")); //������ -1
//		int result = str4.indexOf("a", 4); //�� �����ͼ� ����
		System.out.println("----------------------------");
		
		//������
		// '�ȳ�'�̶�� ģ ���ڿ� ������ ã�� �ε����� ����ϼ���!
				String str5 = "�ȳ��ϼ���? ���� ȫ�浿�̰�, �ٽ� �ȳ��ϼ��� �ϴ� "
								+ "����� ���� �ƴϰ� �ȳ��ϼ��� ���ϰ� ���� �ʽ��ϴ�."; 
		String token = "�ȳ�";
		int startIndex = 0;
		int count = 0;
		while(true) {
			int result = str5.indexOf(token, startIndex);
			if(result < 0) {
				break;
			}
			count++;
			System.out.println("ã�� index : " + result);
			startIndex = result + token.length();
		}
		System.out.println("ã�� ���� : " + count);
		System.out.println("----------------------------");
		
		
		//7.lastIndexOf : ���ڿ��� ã�µ� �ڿ������� ã�´�!
		System.out.println(str5.lastIndexOf("�ȳ�"));
		System.out.println(str5.lastIndexOf("�ȳ�", 40-2));//������ ã�� ��ġ-2
		System.out.println(str5.lastIndexOf("�ȳ�", 20-2));//������ ã�� ��ġ-2
		System.out.println("----------------------------");
		
		//8.trim�� : white space�� �����ϴ� �Լ�
		//white space��? ��� ���� ������ �ʴ� ���ڿ� Ȥ�� ����, newline, tab, ��Ÿ ���ڿ�
		final String origin
		= " \r    �̸� : #*ȫ�浿, ���� : #*23, �ּ� : #*����� ������   \u2003\n\t";
		System.out.println(origin);
		System.out.println("----------------------------");
		System.out.println(origin.trim()); //���� ������ ���� ������ white space ����
		System.out.println(origin.strip()); //��� white space ����
		System.out.println(origin.stripLeading()); //���ʸ� �����ϴ� �Լ�
		System.out.println(origin.stripTrailing()); //���ʸ� �����ϴ� �Լ�
		System.out.println(origin.stripIndent()); // white space �߿� \t newline���� ����Ʈ�� �츱 ��
		System.out.println("----------------------------");
		
		String text = origin.strip(); //strip�� ��õ, ���� ������ ���� ���� ��������
		System.out.println(text);
		//Web���� ���Ϻ����ϰ� ���δ�. Ư�� �Խ����̳� �Է� ���� ��
		
		//9.substring : ���ڿ��� ���� ��ġ���� �ڸ� �� ���
		//���� : ���ڿ��� ���̸� �߸� �����ϴ� ��� �״´�.
		System.out.println("----------------------------");
		System.out.println(text.substring(10)); //10���ں���
		System.out.println(text.substring(4, 10)); //4~10����
		System.out.println(text.substring(text.length() - 10, text.length())); //�ڿ��� 10����
		System.out.println("----------------------------");
		
		
		//10.replace : ���ڿ� ��ü �� �� (��ü �� ��)
		//String replace(CharSequence target, CharSequence replacement)
		System.out.println(text.replace("#*", "")); //�ߺ��� ��� ��� ��ü�ȴ�
		System.out.println(text.replace("ȫ�浿", "��浿"));
		System.out.println("----------------------------");
		
		String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]"; // Ư�����ڸ� �����ϴ� ���Խ� ǥ��
		System.out.println(origin.replaceAll(match, ""));//Id, Pw���� Ư������ ������ �� -> ���Ȼ� ó�� �ʼ�
		System.out.println("----------------------------");
		text = text.replace("#*", "");
		
		//11.split : ���ڿ��� Ư�� ����(Delimiter)�� �߶� ��ū(Token)���� ��ȯ�ϴ� �Լ�
		System.out.println("���� = " + text);
		
		String[] strArray = text.split(","); //Delimiter = ','
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println("----------------------------");
		
		String[] outArray = text.split(",");
		for(String s : outArray) { //����� for��, �迭�̳� �÷��ǿ��� ���
			String[] inArray = s.split(":");
			for(String s2 : inArray) {
				System.out.println(s2.strip());
			}
		}
		System.out.println("----------------------------");
		
		//12.join() : �迭�� Ư�� ���ڿ��� �����ִ� ���
		String[] strArray2 = text.split(","); // Delimiter = ,
		System.out.println(strArray2[0]);
		System.out.println(strArray2[1]);
		
		String temp2 = String.join("_", strArray2);
		System.out.println(temp2);
		System.out.println("----------------------------");
		
		//13.StringTokenizer : Split�� ��ü����
		System.out.println(text);
		
		StringTokenizer tokens = new StringTokenizer(text, ",");
		while(tokens.hasMoreElements()) { //������ ������Ʈ�� ���� �ִ�?
			System.out.println(tokens.nextElement()); //���� ������Ʈ��.
		}
		System.out.println("----------------------------");
		
		//14.�빮�� �����ϱ� : toXXXXXCase
		System.out.println("----------------------------");
		String temp3 = "ABC abc AAA bbb";
		System.out.println(temp3.toUpperCase()); //�빮�� ����
		System.out.println(temp3.toLowerCase()); //�ҹ��� ����
		System.out.println("----------------------------");
		
		//15.valueOf : �ٸ� �ڷ������� ��ȯ�ϱ�
		int age = 23;
		String strAge1 = "" + age; //�̰� ��õ ���ڿ��� ��ȯ
		String strAge2 = String.valueOf(age); //�̰� ��õ ���ڿ��� ��ȯ
		System.out.println(strAge1);
		System.out.println(strAge2);
		System.out.println("----------------------------");
		
		//16.repeat : �ݺ��ϱ�
		String repeatText = "ABC".repeat(10);
		System.out.println(repeatText);
		
	}

}
