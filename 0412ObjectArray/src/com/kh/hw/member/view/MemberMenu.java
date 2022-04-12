package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	Scanner sc = new Scanner(System.in); //����ڷκ��� �Է°��� �޴´�.
	MemberController mc = new MemberController(); //MemberController ��� ��ü�� ����(new) ����̴ϴ�. 
    //�׸��� �׷��� ������� MemberController��� ��ü�� mc�̶�� ������ �����̴ϴ�. 
   //�׸��� mc�̶�� ������ ������ ���� �� ��ü�� �̸�(MemberController)�� �״�� ������ �־���մϴ�. 
   //�׷��� MemberController mc��� ����̴ϴ�.
	
	public MemberMenu() {} //�⺻������
	
	public void mainMenu() { //���� �޴� ��� �޼ҵ�
		while(true) { //���ѷ���
			System.out.println("�ִ� ��� ������ �ο����� " + mc.SIZE + "�Դϴ�"); //���ѷ����� ������ �� �� ���̰� ���´�
			System.out.println("���� ��ϵ� �ο����� " + mc.existMemberNum() + "���Դϴ�" ); //���ѷ����� ������ �� �� ���̰� ���´�
			if(mc.existMemberNum() != mc.SIZE){ //���� ���� �����ϴ� �ο����� 10�� �ƴ϶�� if�� ����
				System.out.println("1. �� ȸ�� ���");
			}else { // ���� ���� �����ϴ� ȸ������ 10���̶�� else�� ����
				System.out.println("ȸ�� ���� ��� �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�");
			}
			System.out.println("2. ȸ�� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ��� ���");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int num = Integer.parseInt(sc.nextLine()); //����ڷκ��� �޴���ȣ�� �Է� �޴´�.
			
			switch(num) { // switch- case�� 
			case 1 : 
				insertMember(); // ȸ������ϱ� ���� �����͸� ����ڿ��� �Է¹޴� �޼ҵ�, �� ȸ�� ���
				continue; // continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			case 2:
				searchMember(); // ã�� ���� �޴� ��� �޼ҵ�, ȸ�� �˻�
				continue; // continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			case 3:
				updateMember(); //���� �޴� ��� �޼ҵ�, ȸ�� ���� ����
				continue; // continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			case 4:
				deleteMember(); // ���� �޴� ��� �޼ҵ�, ȸ�� ����
				continue; // continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			case 5:
				printAll();//// mc�� printAll() �޼ҵ��� ��ȯ ���� ������ ����� ȸ���� �����, ��� ���
				continue; // continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				break; //break�� ������ ��� �ݺ��� ��ü Ż��
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				continue; // continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			}
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
			}
		}
	public void insertMember() { // ȸ������ϱ� ���� �����͸� ����ڿ��� �Է¹޴� �޼ҵ�
		System.out.println("ȸ���� ����մϴ�.");
		
		while(true) { //���ѷ���
			System.out.print("���̵� : ");
			String id = sc.nextLine(); //���̵� �Է� �޴´�.
			if(mc.checkId(id) == true) { // �ߺ��� ���̵� �ִٸ� if�� ����.
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
				return; //�ߺ��� ���̵� �����Ƿ� return���� insertMember()�� ȣ���� ������ ���ư���.
			}
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			System.out.print("�̸��� : ");
			String email = sc.nextLine();
			char gender; //���� gender�� ����
			
			while(true) {
				System.out.println("���� : "); 
				gender = (char)sc.nextLine().charAt(0); //�����Է�
				if(Character.toUpperCase(gender) == 'M' || Character.toUpperCase(gender) == 'F') {
					//toUpperCase�� �Է¹��� ��� ������ �빮�ڷ� �ٲ��ִ� ������ �Ѵ�.
					//�Է¹��� ������ m, M, f ,F ��� if�� ����.
					break; //break�� ������ ��� �ݺ��� ��ü Ż��
				}else {
					System.out.println("�ٽ� �Է����ּ���");
					continue; // continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
				}
			}
			System.out.println("���� : ");
			int age = Integer.parseInt(sc.nextLine()); //�����Է�
			
			mc.insertMember(id, name, password, email, gender, age);
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		}
		
	}	
	public void searchMember() { //ã�� ���� �޴� ��� �޼ҵ�
		if(mc.existMemberNum() == 0) { //���� ���� �����ϴ� ȸ���� ���� 0���̶��
			System.out.println("ȸ������ 0���Դϴ�.");
			return; //return : �Լ��� ��ġ�� ����  //searchMember()�� ȣ���� ������ return���ش�
		}
		System.out.println("1. ���̵�� �˻��ϱ�");
		System.out.println("2. �̸����� �˻��ϱ�");
		System.out.println("3. �̸��Ϸ� �˻��ϱ�");
		System.out.println("9. �������� ���ư���");
		
		System.out.println("�޴���ȣ : ");		
		int num =Integer.parseInt(sc.nextLine());
		
		switch(num) { //switch - case
		case 1 : 
			searchId();  // ���̵�˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�, ���̵�� �˻��ϱ�
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		case 2 : 
			searchName(); // �̸� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�, �̸����� �˻��ϱ�
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		case 3 : 
			searchEmail(); // �̸��� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�, �̸��Ϸ� �˻��ϱ�
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		case 9 : 
			mainMenu();  //���� �޴� ��� �޼ҵ�, �������� ���ư���
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		default :
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		}
	}
	public void searchId(){ // ���̵�˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
		System.out.println("�˻��� ���̵� �Է����ּ���");
		System.out.print("�˻��� ���̵� : ");
		String inputId = sc.nextLine(); // ���̵� �Է¹���
		
		if(mc.searchId(inputId).equals("")) { //id�˻������ ""�̶��
			System.out.println("�˻� ����� �����ϴ�."); 
		}else {
			System.out.println("ã���� ȸ����ȸ ����Դϴ�.");
			System.out.println(mc.searchId(inputId)); // mc�� �ִ� searchId()�� id�� ȸ���� ��ȸ�Ͽ� ���� �޾Ƴ���
		}
		return; //return : �Լ��� ��ġ�� ����  //searchId()�� ȣ���� ������ return���ش�
	}
	public void searchName() { // �̸� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
		System.out.println("�˻��� �̸� �Է����ּ���");
		System.out.print("ã���ô� �̸��� �˻����ּ��� : ");
		String inputName = sc.nextLine(); //�̸��� �Է¹޴´�
		
		if(mc.searchName(inputName) == null) { //mc�� �ִ� searchName()�� ���� �Է��Ͻ� �̸��� ���ٸ� if�� ���� 
			System.out.println("ã���ô� �̸��� �����ϴ�.");
			return; //return : �Լ��� ��ġ�� ����  //searchName()�� ȣ���� ������ return���ش�.
		}else {
			System.out.println("ã���� ȸ���̸� �˻� ��� �Դϴ�.");
			for(int i = 0; i < mc.searchName(inputName).length; i++) {//mc.searchName(inputName).length�� �󸶳� �Ǵ���
				//�ñ��ؼ� System.out.print(i);�� �������Ҵ��� �Ʒ��� ���� ���Դ�.
				//0Member [id=aaa, name=aaa, password=aaa, email=aa, gender=m, age=26]
				//123456789�ִ� ��� ������ �ο����� 10�Դϴ�
				//��� ���Դ�. mc.searchName(inputName).length�� 10�̶�°� ����. �� 10�ϱ�?? �̾������� �̰� �����Բ� ������߾˰� ����.
				//�� �������� mc�� �ִ� searchName�� Ÿ���� Member[]�̰� �� �ȿ��� ������ ��ü�迭�� ũ�Ⱑ mc.SIZE �� 10�̶� �� length�� 10�ΰ� ����
				//�׸��� 0��° �ε������� �ٷ� ���Դ� �̰� �� ���� ���ϱ�?
//				System.out.print(i); 0 1 2 3 4 5 6 7 8 9 
				if(mc.searchName(inputName)[i] == null) { //���� mc.searchName(inputName)�� ���� �̸��� null���ΰ� �ִٸ� if ����
					continue; // continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
				}else {
					System.out.println(mc.searchName(inputName)[i].inform());
					//mc�� �ִ� searchName(inputName)[i]�� ������ inform���� ������ش�.
				}	
			}
		}
		return; //return : �Լ��� ��ġ�� ����  //searchName()�� ȣ���� ������ return���ش�.
	}
	public void searchEmail() { // �̸��� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
		System.out.print("ã���ô� �̸��� �ּҸ� �Է����ּ��� : ");
		String inputEmail = sc.nextLine(); //����ڷκ��� �̸����� �Է� �޴´�.
		
		if(mc.searchEmail(inputEmail) == null) { //mc�� �ִ� searchEmail()�� ���� �Է��Ͻ� �̸����� ���ٸ� if�� ����
			System.out.println("ã���ô� �̸����� �����ϴ�.");
			return; //return : �Լ��� ��ġ�� ����  //searchEmail()�� ȣ���� ������ return���ش�.
		}else {
			System.out.println("ã���ô� �̸��� �˻� ��� �Դϴ�.");
			for(int i = 0; i < mc.searchEmail(inputEmail).length; i++) {
				//mc�� �ִ� searchEmail�� Ÿ���� Member[]�̰� �� �ȿ��� ������ ��ü�迭�� ũ�Ⱑ mc.SIZE �� 10�̶� �� length�� 10�ΰ� ����
				if(mc.searchEmail(inputEmail)[i] == null) { //���� mc.searchEmail(inputEmail)�� ���� �̸����� null���ΰ� �ִٸ� if ����
					continue; // continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
				}else {
					System.out.println(mc.searchEmail(inputEmail)[i].inform());
					//mc�� �ִ� searchEmail(inputEmail)[i]�� ������ inform���� ������ش�.
				}
			}
		}
		return; //return : �Լ��� ��ġ�� ����  //searchEmail()�� ȣ���� ������ return���ش�.
	}
	public void updateMember() { //���� �޴� ��� �޼ҵ�
		System.out.println("1. ��й�ȣ �����ϱ�");
		System.out.println("2. �̸� �����ϱ�");
		System.out.println("3. �̸��� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int menuNum = Integer.parseInt(sc.nextLine()); //�޴���ȣ�� �Է¹޴´�.

		switch (menuNum) {
		case 1:
			updatePassword(); //��й�ȣ ������ ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�, ��й�ȣ �����ϱ�
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		case 2:
			updateName();   // �̸� ������ ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�, �̸� �����ϱ�
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		case 3:
			updateEmail();  // �̸��� ������ ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�, �̸��� �����ϱ�
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		case 9:
			System.out.println("�������� ���ư��ϴ�.");
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		}
	}
	public void updatePassword() {//��й�ȣ ������ ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
		System.out.println("������ ȸ���� ���̵� : ");
		String inputId = sc.nextLine(); //����ڷκ��� ���̵� �Է¹ޱ�
		System.out.println("������ ��й�ȣ : ");
		String inputPassword = sc.nextLine(); //����ڷκ��� �����ϰ���� ��й�ȣ �Է¹ޱ�
		
		boolean result = mc.updatePassword(inputId, inputPassword); // boolean type���� result�� �������־��� 
		                                                           //mc.updatePassword(inputId, inputPassword)�� ���� true || false�� ��ȯ�ɰ��̴�.
		   	// true�� ��ȯ�Ǹ� �н����尡 ���������� ����Ǿ��ٴ� ���̴�. �׷� �ݸ� false�� ��ȯ�Ǹ� �Է��Ͻ� id�� ���� �ʾƼ� ������ �ȵǾ��ٴ� ���� �ȴ�.
		if(result == false) {
			System.out.println("���� ���̵� �Դϴ�.");
		}else {
			System.out.println("�н����� ������ ���������� �Ǿ����ϴ�");
		}
		return; //return : �Լ��� ��ġ�� ����  //updatePassword()�� ȣ���� ������ return���ش�.
	}
	public void updateName() { // �̸� ������ ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
		System.out.print("������ ȸ���� ���̵� �Է����ּ��� : ");
		String inputId = sc.nextLine(); //����ڷκ��� ���̵� �Է¹ޱ�
		System.out.print("�����Ͻ� �̸��� �Է��ϼ��� : ");
		String inputName = sc.nextLine(); //����ڷκ��� �����ϰ���� �̸� �Է¹ޱ�
		
		boolean result = mc.updateName(inputId, inputName);// boolean type���� result�� �������־��� 
                                                           //mc.updateName(inputId, inputName)�� ���� true || false�� ��ȯ�ɰ��̴�.
                             // true�� ��ȯ�Ǹ� �̸��� ���������� ����Ǿ��ٴ� ���̴�. �׷� �ݸ� false�� ��ȯ�Ǹ� �Է��Ͻ� id�� ���� �ʾƼ� ������ �ȵǾ��ٴ� ���� �ȴ�.
		
		if(result == false) {
			System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
		}else {
			System.out.println("�̸������� ���������� �Ϸ� �Ǿ����ϴ�.");
		}
		return; //return : �Լ��� ��ġ�� ����  //updateName()�� ȣ���� ������ return���ش�.
	}
	public void updateEmail() { // �̸��� ������ ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
		System.out.print("������ ȸ���� ���̵� �Է����ּ��� : ");
		String inputId = sc.nextLine(); //����ڷκ��� ���̵� �Է¹ޱ�
		System.out.print("�����Ͻ� ȸ���� �̸����� �Է��ϼ��� : ");
		String inputEmail = sc.nextLine(); //����ڷκ��� �����ϰ���� �̸��� �Է¹ޱ�
		
		boolean result = mc.updateEmail(inputId, inputEmail);  // boolean type���� result�� �������־��� 
        //mc.updateEmail(inputId, inputEmail)�� ���� true || false�� ��ȯ�ɰ��̴�.
        // true�� ��ȯ�Ǹ� �̸����� ���������� ����Ǿ��ٴ� ���̴�. �׷� �ݸ� false�� ��ȯ�Ǹ� �Է��Ͻ� id�� ���� �ʾƼ� ������ �ȵǾ��ٴ� ���� �ȴ�.
		
		if(result == false) {
			System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
		}else {
			System.out.println("�̸��� ������ ���������� �Ǿ����ϴ�");
		}
		return; //return : �Լ��� ��ġ�� ����  //updateEmail()�� ȣ���� ������ return���ش�.
	}
	public void deleteMember() { // ���� �޴� ��� �޼ҵ�
		System.out.println("1.Ư��ȸ�� �����ϱ�");
		System.out.println("2.���ȸ�� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int menuNum = Integer.parseInt(sc.nextLine()); //�޴���ȣ�� �Է¹޴´�.
		
		switch(menuNum) {
		case 1 : 
			deleteOne(); //Ư�� �Ѹ��� ȸ������������ �����ϴ� �޼ҵ�,  Ư��ȸ�� �����ϱ�
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		case 2 : 
			deleteAll(); //���ȸ���� ���������� �����ϴ� �޼ҵ�, ���ȸ�� �����ϱ�
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		case 9:
			System.out.println("�������� ���ư��ϴ�.");
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break; //break�� ������ ��� �ݺ��� ��ü Ż��
		}
	}
	public void deleteOne() { //Ư�� �Ѹ��� ȸ������������ �����ϴ� �޼ҵ�,  Ư��ȸ�� �����ϱ�
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String inputId = sc.nextLine(); //����ڷκ��� ������ ȸ���� ���̵� �Է� �޴´�
		System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
		String yn = sc.nextLine(); // ���� �����Ұ����� y, Y , n , N�� �Է� �޴´�
		
		if(yn.toUpperCase().equals("Y")) { //���� y ,Y�� �Եȴٸ� 
			if(mc.delete(inputId) == false) { //mc.delete(inputId)�� ���� true || false�� ��ȯ�ɰ��̴�.
		        // true�� ��ȯ�Ǹ� ���������� �ش� ���̵� ���� �Ǿ��ٴ� ���̴�. �׷� �ݸ� false�� ��ȯ�Ǹ� �Է��Ͻ� id�� ���� �ʾƼ� ������ �ȵǾ��ٴ� ���� �ȴ�.
				System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
			}else { 
				System.out.println("���������� ���� �Ǿ����ϴ�.");
			}
		}
		return; //return : �Լ��� ��ġ�� ����  //deleteOne()�� ȣ���� ������ return���ش�.
	}
	public void deleteAll() { //���ȸ���� ���������� �����ϴ� �޼ҵ�, ���ȸ�� �����ϱ�
		System.out.println("���� ���� �Ͻðڽ��ϱ�?(y/n)");
		String yn = sc.nextLine(); // ���� �����Ұ����� y, Y , n , N�� �Է� �޴´�
		
		if(yn.toUpperCase().equals("Y")){ //���� y, Y�� �ԷµǾ��ٸ� mc.delete() �����Ͽ� ��� ������ ���� null�� ����
			mc.delete();
			System.out.println("��ü ������ ���������� �����Ǿ����ϴ�.");
		}
		return; //return : �Լ��� ��ġ�� ����  //deleteAll()�� ȣ���� ������ return���ش�.
	}
	public void printAll() { // mc�� printAll() �޼ҵ��� ��ȯ ���� ������ ����� ȸ���� ���
		if(mc.existMemberNum() == 0) {  //���� �����ϴ� ��� ���� 0���̸�
			System.out.println("����� ȸ���� �����ϴ�");
			return; //return : �Լ��� ��ġ�� ����  //printAll()�� ȣ���� ������ return���ش�.
		}
		for(int i = 0; i < mc.printAll().length; i++) {
//			System.out.println(i); mc.printAll().length�� 10�̶�� ���´�
			//mc�� �ִ� printAll�� Ÿ���� Member[]�̰� �� �ȿ��� ������ ��ü�迭�� ũ�Ⱑ mc.SIZE �� 10�̶� �� length�� 10�ΰ� ����
			if(mc.printAll()[i] == null) { //mc.printAll()[i]�� ���� ���ٸ�(null)�̶�� continue
				continue;  // continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			}else {
				System.out.println(mc.printAll()[i].inform());
				//mc.printAll()[i]�� ���� �ִٸ� �����ϴ� ȸ���� ������ inform()�� ���� ���
			}
		}
		return; //return : �Լ��� ��ġ�� ����  //printAll()�� ȣ���� ������ return���ش�.
	}
}

