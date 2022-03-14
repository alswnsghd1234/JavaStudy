package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	//���ڿ��� ���ڿ� �迭�� �и���Ű�� ���
	//1. �����ڸ� �����ؼ� �ش� ���ڿ��� �и���Ű�� ��� -> �迭
	//2. �и��� ������ ���ڿ����� ��ū���� ����ϴ� ��� -> ��ū
	
	String str="Java,Oracle,JDBC,HTML,CSS,JavaScript,Server,Spring";
	
	
	public void method1() {
		
		//���ڿ�.split(String ������) : ��ȯ�� String[]
		String[] arr = str.split(",");
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//���� for�� : �ʱ�� ���ǽ� �������� �ʿ����!
		//for each��
		//[ǥ����] for(���� �޾��ִ� ���� ���� : ���������� ������ �迭 �Ǵ� �÷���){}
		for(String s : arr) { //�迭�� ũ�⸸ŭ �ڵ����� �ݺ� ����,�迭�� �� �׸��� ���� ������ ����.
			System.out.println(s);
		}
		//��,������ �Ұ� , ��¿�,���� �����°� ���������� ������ �Ұ���
	}
	
	public void method2() {
		//������ ���ڿ��� ��ū���� ó��
		//java.util.StringTokenizer Ŭ������ �̿��ϴ� ���
		//[ǥ����]StringTokenizer stn = new StringTokenizer(�и���Ű�����ϴ� ���ڿ�,������);
		//��ü�� �����ؼ� ���
		
		StringTokenizer stn = new StringTokenizer(str,",");
		
		//"Java,Oracle,JDBC,HTML,CSS,JavaScript,Server,Spring"
		System.out.println("�и��� ���ڿ��� ���� : "+stn.countTokens());
		
		//�и��� ��ū�� �˾ƺ�����
		
//		System.out.println(stn.nextToken()); //Java
//		System.out.println(stn.nextToken()); //Oracle
//		System.out.println(stn.nextToken()); //JDBC
//		System.out.println(stn.nextToken()); //HTML
//		System.out.println(stn.nextToken()); //CSS
//		System.out.println(stn.nextToken()); //JavaScript
//		System.out.println(stn.nextToken()); //Server
//		System.out.println(stn.nextToken()); //Spring
//		
		System.out.println("�����ִ� ��ū : "+stn.countTokens()); //nextToken()ȣ��� �ش� ��ū�� ������ ����
//		System.out.println(stn.nextToken()); ���̻� ��ū�� ������ nextToken()���� ã�������ϸ�
//											   ��Ҹ� ã�� �� ���� NoSuchElementException �߻�
		
		while(stn.hasMoreTokens()) { //��ū�� �����ִٸ� true ������ false 
		
			System.out.println(stn.nextToken());
			
		}
		
	}
	
	

}
