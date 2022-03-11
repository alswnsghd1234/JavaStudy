package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController extends Member {

	public static final int SIZE = 10;
	private Member[] m = new Member[SIZE];
	protected int count = 0;
	private int cnt = 0;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int existMemberNum() {
		int count = 0;
		for(int i=0;i<SIZE;i++) {
			if(m[i]!=null) {
				count++;
			}
		}
		return count;
	}
	public boolean checkId(String inputId) {
		for(int i=0;i<existMemberNum();i++) { //���� �����ϴ� �ο� �� ��ŭ�� ������.
			if(m[i].getId().equals(inputId)) {
				return true; //�ߺ� ���̵� �־�
			}
		}
		return false;
	}
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		int num = existMemberNum(); // �̹� ����ִ� �ο� ���� �ε����� Ȱ���Ѵ�.
									// �ƹ��� �ȵ�������� 0�� ��ȯ�ϴϱ� 0�� �ε����� ����
									// �Ѹ��� ���� 1�� ��ȯ�ϴϱ� 1�� �ε����� ���� �� �ִ�.
		//�Ű������� String gender �� ��
		/*
		 * char gen=gender.charAt(0)
		 * �Ʒ��� �����ڿ� gen�� ������ �ȴ�.
		 * */
		m[num] = new Member(id,name,password,email,gender,age);
		
	}
	//id�� ȸ���� ��ȸ�ϴ� �޼ҵ�
	//��ȸ ����� ȸ�������� ��ȯ�Ѵ�.
	public Member searchName(String name) {
		for(int i=0;i<existMemberNum();i++) {
			if(m[i].getName().equals(name)) {
				return m[i];
			}
		}
		return null;
	}
	
		
	
	public String searchId(String Id) {
		for(int i=0;i<existMemberNum();i++) {
			if(m[i].getId().equals(Id)) {
				return m[i].toString();
			}
		}
		return null;
	}
	
	public Member searchEmail(String email) {
		for(int i=0;i<existMemberNum();i++) {
			if(m[i].getEmail().equals(email)) {
				return m[i];
			}
		}
		return null;
	}
	
	public boolean updatePassword(String id, String password) {
		for(int i=0;i<existMemberNum();i++) {
		if(m[i].getId().equals(id)) { // ��ü�� ���̵� �Է¹��� ���̵�� ������
			m[i].setPassword(password);//���͸޼ҵ�� ��й�ȣ ����
			return true; // �� ����Ǿ���.
		}
	}
		return false;
	}
	public boolean updateName(String id, String name) {
		for(int i=0;i<existMemberNum();i++) {
			if(m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
			return false;
		}
	public boolean updateEmail(String id, String email) {
		for(int i=0;i<existMemberNum();i++) {
			if(m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
			return false;
		}
	public boolean delete(String id) {
		
		int temp =0;
		for(int i=0;i<existMemberNum();i++) {
		if(m[i].getId().equals(id)) {
			//�ش��ϴ� �ε����� �ִ� ��ü�� �����Ѵ�(null)
			//�ε��� �߰��� ��ü�� null �� �Ǹ� �ݺ����� ���鼭 null�� �����ϰ� �Ǳ� ������
			//nullpointerCxeption �߻��Ѵ�(null�� ���� �� �� ���� ����)
			m[i]=null;
			temp =i;
			break;
		}
		}
		//2�� �ε����� �ߴٰ� ������
		if(temp!=0) {
		for(int i=temp; i<existMemberNum();i++) {
			m[i] = m[i+1];
		}
		
		return true;
		}
		else {
			return false;
		}
	}
	

	public void delete() {
		for(int i=0;i<existMemberNum();i++) {
			m[i] =null;
		}
	}
	public void printAll() {
		super.inform();
	}
	
}
