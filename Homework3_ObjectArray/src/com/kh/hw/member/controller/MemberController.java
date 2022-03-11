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
		for(int i=0;i<existMemberNum();i++) { //현재 존재하는 인원 수 만큼만 돌리기.
			if(m[i].getId().equals(inputId)) {
				return true; //중복 아이디가 있어
			}
		}
		return false;
	}
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		int num = existMemberNum(); // 이미 들어있는 인원 수를 인덱스로 활용한다.
									// 아무도 안들어있으면 0을 반환하니까 0번 인덱스에 들어가고
									// 한명이 들어가면 1을 반환하니까 1번 인덱스에 넣을 수 있다.
		//매개변수가 String gender 일 때
		/*
		 * char gen=gender.charAt(0)
		 * 아래에 생성자에 gen을 넣으면 된다.
		 * */
		m[num] = new Member(id,name,password,email,gender,age);
		
	}
	//id로 회원을 조회하는 메소드
	//조회 결과는 회원정보를 반환한다.
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
		if(m[i].getId().equals(id)) { // 객체의 아이디가 입력받은 아이디랑 같을때
			m[i].setPassword(password);//세터메소드로 비밀번호 변경
			return true; // 잘 변경되었다.
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
			//해당하는 인덱스에 있는 객체를 삭제한다(null)
			//인덱스 중간에 객체가 null 이 되면 반복문이 돌면서 null을 참조하게 되기 때문에
			//nullpointerCxeption 발생한다(null은 참조 할 수 없음 오류)
			m[i]=null;
			temp =i;
			break;
		}
		}
		//2번 인덱스로 했다고 했을때
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
