package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu extends MemberController {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void MainMenu() {
	
		while(true) {
			
		System.out.println("�ִ�  ���  ������  ȸ��  ����  10���Դϴ�.");
		System.out.println("����  ��ϵ�  ȸ��  ����  "+mc.existMemberNum()+"���Դϴ�. ");
		
		System.out.println("1. ��  ȸ��  ��� ");
		System.out.println("2. ȸ��  �˻�");
		System.out.println("3. ȸ��  ����  ���� ");
		System.out.println("4. ȸ��  ����");
		System.out.println("5. ���  ��� ");
		System.out.println("9. ������ ");
		System.out.println("�޴�  ��ȣ   :");
		
		
		if(mc.existMemberNum()<11) {
		int num = sc.nextInt();
		
		switch (num) {
		case 1: {
			insertMember();
			continue;
			
			}
		case 2:{
			searchMember();
			}
		case 3:{
			updateMember();
			}
		case 4:{
			deleteMember();
			}
		case 5:{
			printAll();
			}
		case 9:{
			break;
			}
		}
	}
		}
		}
	public void insertMember() {
		System.out.println("���̵�:");
		String id = sc.nextLine();
		sc.nextLine();
		System.out.println("�̸�:");
		String name = sc.nextLine();
		System.out.println("�н�����:");
		String password = sc.nextLine();
		System.out.println("�̸���:");
		String email = sc.nextLine();
		System.out.println("����:");
		char gender = sc.nextLine().charAt(0);
		System.out.println("����:");
		int age = sc.nextInt();
				
		
		if(mc.checkId(id)) {
			System.out.println("�ߺ� �� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
			insertMember();
		}
		else {
			if(((gender=='M')||(gender=='m')||(gender=='F')||(gender=='f'))){
				mc.insertMember(id, name, password, email, gender, age);
				sc.nextLine();
			}
			else {
				System.out.println("������ �ٽ� �Է����ּ���.");
				insertMember();
			}
			
		}
		
	}
	public void searchMember() {
		System.out.println("1.���̵��  �˻��ϱ�");
		System.out.println("2.�̸�����  �˻��ϱ�");
		System.out.println("3.�̸��Ϸ�  �˻��ϱ�");
		System.out.println("9.��������  ���ư���");
		int num= sc.nextInt();
		
		switch(num) {
		case 1:{
			searchId();
		}
		case 2:{
			searchName();
		}
		case 3:{
			searchEamil();
		}
		case 9:{
			System.out.println("�������� ���ư��ϴ�.");
			MainMenu();
		}
		}
	}
	
	public void searchId() {
		System.out.println("���̵� �Է��ϼ���.");
		String str = sc.next();
		if(!(mc.searchId(str)==null)) {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			System.out.println(mc.searchId(str));
		}
		else {
			System.out.println("�˻� ����� �����ϴ�.");
			MainMenu();
		}
	}
	public void searchName() {
		System.out.println("�̸��� �Է��ϼ���.");
		String str = sc.next();
		if(!(mc.searchName(str)==null)) {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			System.out.println(mc.searchName(str));
		}
		else {
			System.out.println("�˻� ����� �����ϴ�.");
			MainMenu();
		}
	}
	public void searchEamil() {
		System.out.println("�̸����� �Է��ϼ���.");
		String str = sc.next();
		if(!(mc.searchEmail(str)==null)) {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			System.out.println(mc.searchEmail(str));
		}
		else {
			System.out.println("�˻� ����� �����ϴ�.");
			MainMenu();
		}
	}
	public void updateMember() {
		System.out.println("1.��й�ȣ �����ϱ�");
		System.out.println("2.�̸� �����ϱ�");
		System.out.println("3.�̸��� �����ϱ�");
		System.out.println("9.��������  ���ư���");
		int num= sc.nextInt();
		
		switch(num) {
		case 1:{
			updatePassword();
		}
		case 2:{
			updateName();
		}
		case 3:{
			updateEmail();
		}
		case 9:{
			System.out.println("�������� ���ư��ϴ�.");
			MainMenu();
		}
		}
	

	}
	public void updatePassword() {
	
		System.out.println("���̵�� ��� �Է��ϼ���");
		String str = sc.next();
		int num = sc.nextInt();
		if(!(mc.searchName(str)==null)) {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			System.out.println(mc.searchName(str));
		}
		else {
			System.out.println("�˻� ����� �����ϴ�.");
			MainMenu();
		}
	}
	
	public void updateName() {
		
	}
	public void updateEmail() {
		
	}
	public void deleteMember() {
		
	}
	public void deleteOne() {
		
	}
	public void deleteAll() {
		
	}
	public void printAll() {
		if(mc.existMemberNum()==0) {
			System.out.println("����� ȸ���� �����ϴ�.");
	}
		else{
			mc.printAll();
		}
	
}
	}
