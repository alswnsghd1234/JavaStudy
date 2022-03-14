package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	/*
	 * CheckedException
	 * ���������� �ݵ�� ����ó���� ����� �ϴ� ���ܵ�
	 * (��, ���� �Ұ��� ������ �߻��ϱ� ������ �̸� ���� ó�� ������ �ۼ��ؾ���)
	 * ->�ַ� �ܺ� ��ü�� � ����� �� �߻�!
	 * 
	 * CheckedException�� RuntimeException�� ������ Exception��
	 * ���α׷� ���� �� �߻� - ������ ������ ���� - ����ó�� �ʼ��� ����� ���α׷��� �����ų �� ����.
	 * 
	 * 
	 * */

	public void method1() throws Exception { //���� throws�� ���ѱ涧 � �����̴� �ѱ�� �ʹٸ� 
										     //exception�� �ְ������� Exception�� �����ָ� �ȴ�.
//		���⼭ ����ó������ try catch�� �ϴ��� 
//		try {
//			method2();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		���⼭�� ���������� 
		method2();
		
	}
	
	//method2���� �߻��� ���ܸ� method1�� ���Ѱܺ��� 
	//throws ����Ŭ�����̸�
	public void method2() throws Exception { //���� ȣ���� ������ ���ܸ� ����������.
	//Scanner�� ���� Ű����� ���� �Է¹��� �� �ִ� ��ü(���ڿ��� ����)
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
//	try {
//		String str = br.readLine(); //�� �޼ҵ带 ȣ�� �� IOException�� �߻������� �𸣴� ����ó���ض�.
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	String str = br.readLine();
	str=null;
		
	System.out.println(str.length());
	}
	
	
	//�޼ҵ带 ���� ���ܸ� �߻���Ű�� throws�� �Ѱܺ��� 
	//throws new exception�̸� ���ϴ°�
	
	public void method3() {
		throw new RuntimeException();
	}
	
	public void method4() throws Exception {
		method3();
		throw new Exception();
	
	}
	
}
