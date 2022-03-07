package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu extends MemberController {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void MainMenu() {
	
		while(true) {
			
		System.out.println("최대  등록  가능한  회원  수는  10명입니다.");
		System.out.println("현재  등록된  회원  수는  "+mc.existMemberNum()+"명입니다. ");
		
		System.out.println("1. 새  회원  등록 ");
		System.out.println("2. 회원  검색");
		System.out.println("3. 회원  정보  수정 ");
		System.out.println("4. 회원  삭제");
		System.out.println("5. 모두  출력 ");
		System.out.println("9. 끝내기 ");
		System.out.println("메뉴  번호   :");
		
		
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
		System.out.println("아이디:");
		String id = sc.nextLine();
		sc.nextLine();
		System.out.println("이름:");
		String name = sc.nextLine();
		System.out.println("패스워드:");
		String password = sc.nextLine();
		System.out.println("이메일:");
		String email = sc.nextLine();
		System.out.println("성별:");
		char gender = sc.nextLine().charAt(0);
		System.out.println("나이:");
		int age = sc.nextInt();
				
		
		if(mc.checkId(id)) {
			System.out.println("중복 된 아이디입니다. 다시 입력해주세요.");
			insertMember();
		}
		else {
			if(((gender=='M')||(gender=='m')||(gender=='F')||(gender=='f'))){
				mc.insertMember(id, name, password, email, gender, age);
				sc.nextLine();
			}
			else {
				System.out.println("성별을 다시 입력해주세요.");
				insertMember();
			}
			
		}
		
	}
	public void searchMember() {
		System.out.println("1.아이디로  검색하기");
		System.out.println("2.이름으로  검색하기");
		System.out.println("3.이메일로  검색하기");
		System.out.println("9.메인으로  돌아가기");
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
			System.out.println("메인으로 돌아갑니다.");
			MainMenu();
		}
		}
	}
	
	public void searchId() {
		System.out.println("아이디를 입력하세요.");
		String str = sc.next();
		if(!(mc.searchId(str)==null)) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchId(str));
		}
		else {
			System.out.println("검색 결과가 없습니다.");
			MainMenu();
		}
	}
	public void searchName() {
		System.out.println("이름을 입력하세요.");
		String str = sc.next();
		if(!(mc.searchName(str)==null)) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchName(str));
		}
		else {
			System.out.println("검색 결과가 없습니다.");
			MainMenu();
		}
	}
	public void searchEamil() {
		System.out.println("이메일을 입력하세요.");
		String str = sc.next();
		if(!(mc.searchEmail(str)==null)) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchEmail(str));
		}
		else {
			System.out.println("검색 결과가 없습니다.");
			MainMenu();
		}
	}
	public void updateMember() {
		System.out.println("1.비밀번호 수정하기");
		System.out.println("2.이름 수정하기");
		System.out.println("3.이메일 수정하기");
		System.out.println("9.메인으로  돌아가기");
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
			System.out.println("메인으로 돌아갑니다.");
			MainMenu();
		}
		}
	

	}
	public void updatePassword() {
	
		System.out.println("아이디와 비번 입력하세요");
		String str = sc.next();
		int num = sc.nextInt();
		if(!(mc.searchName(str)==null)) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchName(str));
		}
		else {
			System.out.println("검색 결과가 없습니다.");
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
			System.out.println("저장된 회원이 없습니다.");
	}
		else{
			mc.printAll();
		}
	
}
	}
