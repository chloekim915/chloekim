import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		// �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : ");
		int a = sc.nextInt();
		
		System.out.print("B����� ���� : ");
		int b = sc.nextInt();
		
		System.out.print("C����� ���� : ");
		int c = sc.nextInt();
		
		System.out.println();
		
		double aa = a*0.4;
		double bb = b*0;
		double cc = c*0.15;
		
		double totala = a + aa;
		double totalb = b + bb;
		double totalc = c + cc;
		
		System.out.println("A��� ����/����+a : " + a + "/" + totala);
		if (totala >= 3000) {
			System.out.println("3000�̻�");
		} else {
			System.out.println("3000�̸�");
		}
		System.out.println("B��� ����/����+a : " + b + "/" + totalb);
		if (totalb >= 3000) {
			System.out.println("3000�̻�");
		} else {
			System.out.println("3000�̸�");
		}
		System.out.println("C��� ����/����+a : " + c + "/" + totalc);
		if (totalc >= 3000) {
			System.out.println("3000�̻�");
		} else {
			System.out.println("3000�̸�");
		}
				
		
	}
 }
