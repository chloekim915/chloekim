package arrayhw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
	//public static void main(String[] args) {
	
	public void practice1() {
		int[] array1 = new int[10];

		for( int i = 0; i < array1.length; i ++) {
			array1[i] = i+1;
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		return;
	}

	public void pratice2() {
		int[] array1 = new int[10];

		for( int i = 0; i < array1.length; i ++) {
			array1[i] = 10 - i;
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		return;
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� : ");
		int intArr = Integer.parseInt(sc.nextLine());
		int[] numArr = new int [intArr];

		//		int[] numArr = new int[Integer.parseInt(sc.nextLine())];

		for( int i = 0; i < numArr.length; i ++) {
			numArr[i] = i+1;
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		return;
	}
	
	public void practice4() {
		String[] strarr = new String[] {"���", "��", "����", "������", "����"} ;

		System.out.println(strarr[1]);
		return;

	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		System.out.print("���� : ");
		char Char = sc.nextLine().charAt(0); //���ڿ��� ���ڷ�

		char[] char1 = new char[str.length()];
		int count = 0;

		System.out.print(str + "�� " + Char + "�� �����ϴ� ��ġ(�ε���) : ");
		for(int i = 0; i < char1.length; i++ ) {
			char1[i] = str.charAt(i);
			if(char1[i] == Char) {
				System.out.print(i + " ");
				count ++;
			}
		}

		System.out.println("\n" + Char + " �� ���� : " + count);
		return;
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);

		String[] dayArray = {"��", "ȭ", "��", "��", "��", "��", "��"};

		System.out.print("0 ~ 6���� ���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());

		if (num >= 0 && num <=6) {
			System.out.println(dayArray[num]);
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int[] numArr = new int[Integer.parseInt(sc.nextLine())];
		int sum = 0;

		for(int i = 0; i < numArr.length; i++) {
			System.out.print("\n�迭" + i + "��° �ε����� ���� �� : ");
			numArr[i] = Integer.parseInt(sc.nextLine());
		}
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
			sum = sum + numArr[i];
		}
		System.out.print("\n�� �� : " + sum + "\n");
		return;
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		int num;

		while (true) {
			System.out.print("���� : ");
			num = Integer.parseInt(sc.nextLine());

			if (num%2 ==0 || num < 3) {
				System.out.println("�ٽ� �Է��ϼ���");
				continue;
			} break;
		}



		int[] numArr = new int[num];
		int num2 = numArr.length / 2;

		for (int i = 0; i < num2; i++) {
			numArr[i] = i + 1;
			System.out.print(numArr[i] + " ");
		}
		for (int i = num2; i < numArr.length; i++) {
			numArr[i] = num2 + 1;
			num2--;
			System.out.print(numArr[i] + " ");
		}

		System.out.println();
		return;
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String inputname = sc.nextLine();

		String[] name = new String[] {"���", "�Ӵ�", "����", "�Ѹ�Ŭ"};

		for(int i = 0; i < name.length; i++) {
			if(name[i].equals(inputname)) {
				System.out.println(inputname + "ġŲ ��� ����");
				return;
			} else {
				System.out.println(inputname + "ġŲ�� ���� �޴��Դϴ�");
				return;
			}
		}
	}
	
	public void practice10() {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ(- ����) : ");
		String id = sc.nextLine();
		String[] idNum = new String[14];
		
		for (int i = 0; i < idNum.length; i++) {
			if (i > 7) {
				idNum[i] = "*";
			} else {
				idNum[i] = "" + (id.charAt(i));
			}
			System.out.print(idNum[i]);
		}
		System.out.println();
		return;
	}
	
	public void practice11() {
		int[] array1 = new int[10];
		Random random = new Random(System.currentTimeMillis());
		
		for(int i = 0; i < array1.length; i++) {
			array1[i] = random.nextInt(10);
		}
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		return;
	}
	
	public void practice12() {
		int[] array1 = new int[10];
		Random random = new Random(System.currentTimeMillis());
		int max = 0;
		int min = 0;

		for(int i = 0; i < array1.length; i++) {
			array1[i] = random.nextInt(10);
			if (array1[i] > max) {
				max = array1[i];
			} else if (array1[i] < min) {
				min = array1[i];
			}
		}
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		System.out.println("�ִ밪 : " + max );
		System.out.println("�ּҰ� : " + min );
		return;
	}
	
	public void practice13() {
		int[] numArr = new int[10];
		Random ran = new Random(System.currentTimeMillis());

		for (int i = 0; i < 10; i++) {
			numArr[i] = ran.nextInt(10);
			for (int j = 0; j < i; j++) {
				if (numArr[i] == numArr[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}

		System.out.println();
		return;
	}
	
	public void practice14() {
		int[] numArr = new int[6];
		Random ran = new Random();

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (numArr[i] == numArr[j]) {
					i--;
				} break;
			}
		}
		Arrays.sort(numArr);
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}

		System.out.println();
		return;
	}
	
	public void practice15() { //
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		for(int i = 0; i < ch.length; i++ ) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		System.out.println("���� ���� : " );
	}
	
	public void practice16() {
		
	}
}
