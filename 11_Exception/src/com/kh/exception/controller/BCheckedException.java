package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BCheckedException {

	/*
	 * CheckedException
	 * ���������� �ݵ�� ����ó���� ����� �ϴ� ���ܵ�
	 * (��, ���� �Ұ��� ������ �߻��ϱ� ������ �̸� ���� ó�� ������ �ۼ��ؾ���)
	 * -> �ַ� �ܺ� ��ü�� � ����� �� �߻�!
	 * 
	 * */
	
	public void method1() {
		
	}
	//method2 ���� �߻��� ���ܸ� method1�� ���Ѱܺ���
	//throws ����Ŭ�����̸�
	public void method2() throws IOException {
	//Scanner�� ���� Ű����� ���� �Է¹��� �� �ִ� ��ü(���ڿ��� ����)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		try {
//			String str = br.readLine(); //�� �޼ҵ带 ȣ�� �� IOException�� �߻������� �𸣴� ����ó���ض�.
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		String string = br.readLine();
	}
	public void method3() {
		
		throw new RuntimeException();
		
	}
	public void method4() throws Exception{
		
	}
}
