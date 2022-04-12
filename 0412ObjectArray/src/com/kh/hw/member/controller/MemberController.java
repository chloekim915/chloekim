package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10; // 10���� ��� ���� public�̱� ������ �������� ��밡��
	Member[] m = new Member[SIZE]; // Member type��  m ��ü�迭 ũ�⸦ 10���� ������ �ʱ�ȭ
	
	public int existMemberNum() {  // ���� �����ϴ� ��� �� ��ȯ
		int memcount = 0;  //�ʱ� �ɹ����� 0���� ����
		for(int i = 0; i < m.length; i++) { //��ü�迭m�� length�� 10�̴�. 0���� 9���� for���� ������ ���� �����ϴ� ȸ���� �ִ��� Ȯ�� 
			if(m[i] != null) { //m[i]���� null�� �ƴϸ� �ɹ��� �ִٴ� ���̹Ƿ� count++ 
				memcount++; //�ɹ��� 1�� ���� 
			}
		}
		return memcount; // existMemberNum()�� ȣ���ϸ� return���� memcount�� int type���� ��ȯ�Ѵ�.
	}
	public boolean checkId(String inputId) { // ���̵��� �ߺ��� Ȯ���ϴ� �޼ҵ�
		boolean isSame = false;  //�ʱ� boolean ���� false�� ����
		for(int i = 0; i < m.length; i++) { //��ü�迭m�� length�� 10�̴�. 0���� 9���� for���� ������ �Է��� ���̵� �����ϴ��� Ȯ��
			if(m[i] == null) { //���̵� null ���̸� �ٽ� �Է��϶�� ����������
				continue; // continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			}
			if(m[i].getId().equals(inputId)) { //���� ���̵� �ִٸ� true�� ��ȯ
				isSame = true;// ���� ���̵� �����Ƿ� isSame�� true�� ��ȯ
			}
		}
		return isSame; //checkId(String inputId); �� ���� ȣ���ϸ� boolean type���� isSame�� ��ȯ�Ѵ�.
	}
	public void insertMember(String id, String name, String password, String email, char gender, int age) { 
		// Member ��ü�� ��ü�迭�� �����ϴ� �޼ҵ�
		for(int i = 0; i < m.length; i++) {//��ü�迭m�� length�� 10�̴�. 0���� 9���� for���� ������ m[i]�� ���� �����ϴ��� Ȯ��
			if(m[i] == null) { //���� [i]�� �ϰ͵� �ȵ������� �Է� ����
				m[i] = new Member(id, name, password, email, gender, age); //new�� ���� ���� // ��ü�迭�� Ư¡
				return; //return�Լ��� ��ġ�� ����  //insertMember�� ȣ���� ������ return���ش�
			} 
		}
	}
	public String searchId(String id) { // id�� ȸ���� ��ȸ�ϴ� �޼ҵ�
		String result = "";     //������� �������ٷ��� String type�� ""�� result�� ����
		
		for(int i = 0; i < m.length; i++) {//��ü�迭m�� length�� 10�̴�. 0���� 9���� for���� ������ m[i]�� ���� �����ϴ��� Ȯ��
			if(m[i] == null) { //m[i]�� ���� ���ٸ� continue�� �����ݺ� ����
				continue; // continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			}
			else if(m[i].getId().equals(id)) { //ã����� ���̵�(id)�� �Է��ϼ̴µ� .equals�� ���� ���� ������ ����Ǵ� �κ�
				result = m[i].inform(); //ã���� ���̵�(id)�� inform�� String type�� reselt�� �����Ѵ�.
			}
		}
		return result; // �Էµ� m[i]�� searchId�� ȣ���Ѱ����� ��ȯ�Ѵ�.
		
	}
	public Member[] searchName(String name) {// �̸����� ȸ���� ��ȸ�ϴ� �޼ҵ�
		Member[] sn = new Member[SIZE]; //type�� Member�� sn�̶�� ��ü�迭 ����
		int count = 0; // sn ��ü�迭�� �ε����� �־��ֱ� ���� ����
		for(int i = 0; i < m.length; i++) { //��ü�迭m�� length�� 10�̴�. 0���� 9���� for���� ������ m[i]�� ���� �����ϴ��� Ȯ��
			if(m[i] == null) { //���� m[i]�� ���� ���ٸ� continue
				continue; //continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			}else if(m[i].getName().equals(name)) { //���� ã���� �ϴ� �̸��� �ִٸ�
				sn[count] = m[i];                   //�츮�� ������ sn ��ü �迭�� �Ҵ��� count++ ����
				count++; //0 -> 1 -> 2 ......
				continue; //continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			}
		}
		return sn; // m[i]�� �Ҵ�� ��ü�迭 sn�� searchName()�� ȣ���Ѱ����� ��ȯ!
	}
	public Member[] searchEmail(String email) {//�̸��Ϸ� ȸ���� ��ȸ�ϴ� �޼ҵ�
		Member[] sn = new Member[SIZE]; //type�� Member�� sn�̶�� ��ü�迭 ����
		int count = 0; // sn ��ü�迭�� �ε����� �־��ֱ� ���� ����
		for(int i = 0; i < m.length; i++) {//��ü�迭m�� length�� 10�̴�. 0���� 9���� for���� ������ m[i]�� ���� �����ϴ��� Ȯ��
			if(m[i] == null) { //���� m[i]�� ���� ���ٸ� continue
				continue;      //continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			}else if(m[i].getEmail().equals(email)) { //���� ã���� �ϴ� �̸����� �ִٸ�
				sn[count] = m[i];     //�츮�� ������ sn ��ü �迭�� �Ҵ��� count++ ����
				count++;   //0 -> 1 -> 2 ......
				continue;  //continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			}
		}
		return sn;  // m[i]�� �Ҵ�� ��ü�迭 sn�� searchEmail()�� ȣ���Ѱ����� ��ȯ!
	}
	public boolean updatePassword(String id, String password) { // ��й�ȣ ���� �޼ҵ�
		boolean ch = false; //boolean ch�� �ʱⰪ false ����
		
		for(int i = 0; i < m.length; i++) {//��ü�迭m�� length�� 10�̴�. 0���� 9���� for���� ������ m[i]�� ���� �����ϴ��� Ȯ��
			if(m[i] == null) { //���� m[i]�� ���� ���ٸ� continue
				continue;  //continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			}
			else if(m[i].getId().equals(id)) { //�Է��Ͻ� ���̵� �ִٸ� ��й�ȣ�� �����Ҽ��ֵ��� �Ʒ� ��������
				ch = true; //ch�� ���� true�� ��ȯ
				m[i].setPassword(password); //�Է��Ͻ� ���̵��� ��й�ȣ�� m[i].setPassword�� ��й�ȣ�� �缼�����ְ�  
				
			}
		}
		return ch; // boolean type���� ch�� updatePassword()�� ȣ���� ������ ��ȯ ��Ų��.
	}
	public boolean updateName(String id, String name) { // �̸� ���� �޼ҵ�
		boolean ch = false; //boolean ch��  �ʱⰪ false ����

		for(int i = 0; i < m.length; i++) {//��ü�迭m�� length�� 10�̴�. 0���� 9���� for���� ������ m[i]�� ���� �����ϴ��� Ȯ��
			if(m[i] == null) { //���� m[i]�� ���� ���ٸ� continue
				continue;      //continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			}else if(m[i].getId().equals(id)){ //�Է��Ͻ� ���̵� �ִٸ� �̸��� �����Ҽ��ֵ��� �Ʒ� ���� ����
				m[i].setName(name); //�Է��Ͻ� ���̵��� ��й�ȣ�� m[i].setName���� �̸��� �缼�����ְ�
				ch = true;  //ch�� ���� true�� ��ȯ
			}
		}
		return ch; // boolean type���� ch�� updateName()�� ȣ���� ������ ��ȯ ��Ų��.
	}
	public boolean updateEmail(String id, String email) {// �̸��� ���� �޼ҵ�
		boolean ch = false; //boolean ch��  �ʱⰪ false ����
		
		for(int i = 0; i < m.length; i++) {//��ü�迭m�� length�� 10�̴�. 0���� 9���� for���� ������ m[i]�� ���� �����ϴ��� Ȯ��
			if(m[i] == null) { //���� m[i]�� ���� ���ٸ� continue
				continue;      //continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			}else if(m[i].getId().equals(id)){ //�Է��Ͻ� ���̵� �ִٸ� �̸����� �����Ҽ��ֵ��� �Ʒ� ���� ����
				m[i].setEmail(email); //�Է��Ͻ� ���̵��� ��й�ȣ�� m[i].setEmail�� �̸����� �缼�����ְ�
				ch = true; //ch�� ���� true�� ��ȯ
			}
		}
		return ch; // boolean type���� ch�� updateEmail()�� ȣ���� ������ ��ȯ ��Ų��.
	}
	public boolean delete(String id) {// �� ȸ���� �����ϴ� �޼ҵ�
		boolean ch = false; //boolean ch��  �ʱⰪ false ����

		for(int i = 0; i < m.length; i++) {//��ü�迭m�� length�� 10�̴�. 0���� 9���� for���� ������ m[i]�� ���� �����ϴ��� Ȯ��
			if(m[i] == null) { //���� m[i]�� ���� ���ٸ� continue
				continue;      //continue�� ������ �ش� �ݺ��κ� Ż�� �� ���� �ݺ�����
			}else if(m[i].getId().equals(id)) { //�Է��Ͻ� ���̵� �ִٸ� ���̵� ���� �Ҽ��ֵ��� �Ʒ� ���� ����
				m[i] = null; // m[i]�� ���� null������ ����� �༭ ���� ��Ŵ
				ch = true;   //ch�� ���� true�� ��ȯ
			}
		}
		return ch; // boolean type���� ch�� delete(�Ű�����)�� ȣ���� ������ ��ȯ ��Ų��.
	}
	public void delete() { //��ü ȸ���� �����ϴ� �޼ҵ�
		for(int i = 0; i < m.length; i++) { //��ü�迭m�� length�� 10�̴�. 0���� 9���� for���� �����ش�.
			m[i] = null; //��� m[i]�� ���� null�� ���� ���ش�
		}
		return; //return�Լ��� ��ġ�� ����  //delete()�� ȣ���� ������ return���ش�
	}
	public Member[] printAll() { // ����� ��� ȸ���� ���� ���

		Member[] sn = new Member[SIZE]; //type�� Member�� sn�̶�� ��ü�迭 ����
		int count = 0; // sn ��ü�迭�� �ε����� �־��ֱ� ���� ����
		
		for(int i = 0; i < m.length; i++) {//��ü�迭m�� length�� 10�̴�. 0���� 9���� for���� �����ش�.
			if(m[i] != null) {// ���� m[i] �ȿ� null���� �ƴ� ���� �ִٸ� �Ʒ����� ����
				sn[count] = m[i]; //��ü�迭 sn�� m[i] ���� 0 ~ 9���� �������鼭 �ִ� �����͸� �������ش�.
				count++; // 0 -> 1 -> 2 ....
			}
		}
		return sn; // m[i]�� �Ҵ�� ��ü�迭 sn�� printAll()�� ȣ���Ѱ����� ��ȯ!
	}
}
