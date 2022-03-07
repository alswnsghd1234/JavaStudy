package com.kh.hw.member.controller;

import java.util.Arrays;

import com.kh.hw.member.model.vo.Member;

public class MemberController extends Member {

	public int SIZE = 10;
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
		return count+1;
	}
	public boolean checkId(String inputId) {
			if(m.equals(inputId)) {
				return true;
			}
			else{
				return false;
			}
	}
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		m[count++] = new Member(id,name,password,email,gender,age);
		
	}
	public String searchName(String name) {
		String str ="";
		for(int i=0;i<m.length;i++) {
			if(Arrays.asList(m[i]).contains(name)) {
				str = m[i].inform();
			}
		}
		return str;
	}
	
		
	
	public String searchId(String Id) {
		String str ="";
		for(int i=0;i<m.length;i++) {
			if(Arrays.asList(m[i]).contains(Id)) {
				str += m[i].inform();
			}
		}
		return str;
	}
	
	public String searchEmail(String email) {
		String str ="";
		for(int i=0;i<m.length;i++) {
			if(Arrays.asList(m[i]).contains(email)) {
				str = m[i].inform();
			}
		}
		return str;
	}
	public boolean updatePassword(String id, String password) {
		if(m.equals(id)) {
			return true;
		}
		else{
			return false;
		}
	}
	public boolean updateName(String id, String name) {
		if(m.equals(id)) {
			return true;
		}
		else{
			return false;
		}
	}
	public boolean updateEmail(String id, String email) {
		if(m.equals(id)) {
			return true;
		}
		else{
			return false;
		}
	}
	public boolean delete(String id) {
		if(m.equals(id)) {
			return true;
		}
		else{
			return false;
		}
	}
	public void delete() {
		m[cnt++] = new Member(null,null,null,null,'\u0000',0);
	}
	public void printAll() {
		super.inform();
	}
	
}
