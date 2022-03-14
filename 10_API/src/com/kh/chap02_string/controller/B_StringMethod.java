package com.kh.chap02_string.controller;

import java.util.Scanner;

public class B_StringMethod {
	
	
	public void method1() {
	//���ڿ��� ���õ� ������ �޼ҵ��
	
	String str1 = "hello woRld";
	
	// �޼ҵ�� (�Ű�����) : ��ȯ��
	
	//1.���ڿ�.charAt(int index) : ��ȯ�� char
	//->���ڿ����� ���޹��� index ��ġ�� �ִ� ���� �ϳ��� �̾Ƽ� ����
	char ch = str1.charAt(4);
	
	System.out.println("ch : "+ch);
	
	//2.���ڿ�.concat(String str) : ��ȯ�� String
	//���ڿ��� ���޹��� �Ǵٸ� ���ڿ��� �ϳ��� ���ļ� ���� -> ���ڿ� + str
	
	String str2 =str1.concat("~!!");
	
	System.out.println("str2 : "+str2);
	
	//3.���ڿ�.length() : ��ȯ�� int
	//-���ڿ��� ���̸� ��ȯ
	
	System.out.println("str1�� ���� : "+str1.length());
	
	//4.���ڿ�.substring(int beginindex) : ��ȯ�� String
	//-���ڿ��� beginindex�� ��ġ���� ���ڿ� �������� ���ڿ��� �����ؼ� ����
	//���ڿ�.substring(int beginIndex,int endIndex) :��ȯ�� String
	System.out.println(str1.substring(3));
	System.out.println(str2.substring(0,5)); //beginIndex���� endIndex-1���� ���� 
	
	//5.���ڿ�.replace(char old,char new) : ��ȯ�� String
	//-���ڿ����� old ���ڸ� new ���ڷ� �ٲ㼭 ���ڿ� ����
	
	String str3 = str1.replace('o', 'g');
	
	System.out.println("str3 : "+str3);
	
	//6.���ڿ�.trim() : ��ȯ�� String
	//-���ڿ��� �յ� ������ �������ִ� �޼ҵ�
	String str4="    www.na         ver.com      ";
	
	System.out.println("str4 : "+str4.trim());
	System.out.println("�߰��������� : "+str4.replace(" ",""));
	
	//7.���ڿ�.toUpperCase : ��ȯ�� String
	//-���ڿ��� �빮�ڷ� ��ȯ���ִ� �޼ҵ�
	// ���ڿ�.toLowerCase() : ��ȯ�� String
	//-���ڿ��� �ҹ��ڷ� ��ȯ���ִ� �޼ҵ�
	
	System.out.println("toUpperCase : "+str2.toUpperCase());
	
	System.out.println("toLowerCase : "+str2.toLowerCase());
	
	
	//8.���ڿ�.toCharArray() : ��ȯ�� char[]
	//->���ڿ��� �� ���ڵ��� char[] �迭�� �Ű� ���� �� �ش� �迭�� ����
	char[] cArr = str2.toCharArray();
	
	for(int i=0; i<cArr.length;i++) {
		System.out.print(cArr[i]+" ");
	}
	System.out.println();
	//9.static valueOf(char[] c) : ��ȯ�� String
	//���� �迭�� ���ڿ��� ��ȯ�޴� �޼ҵ�
	System.out.println("valueOf : "+String.valueOf(cArr));
	}
	
	public void method2() {
		Scanner sc =new Scanner(System.in);
		
		char answer = sc.nextLine().toUpperCase().charAt(0);
		
		if(answer=='Y') {
			System.out.println("����");
		}
		
	}
	
	
}
