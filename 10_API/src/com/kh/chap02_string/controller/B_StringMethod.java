package com.kh.chap02_string.controller;

public class B_StringMethod {

	
	public void method() {
		String str1 = "hello world";
		
		//�޼ҵ�� (�Ű�����) : ��ȯ��
		
		// 1. ���ڿ�.charAt(int index) : ��ȯ�� char
		// -> ���ڿ����� ���޹��� index ��ġ�� �ִ� ���� �ϳ��� �̾Ƽ� ����
		char ch = str1.charAt(4);
		
		System.out.println("ch :" +ch);
		
		//2.���ڿ�.concat(String str) :��ȯ�� String
		// ���ڿ��� ���޹��� �� �ٸ� ���ڿ��� �ϳ��� ���ļ� ���� -> ���ڿ� +str
		
		String str2 = str1.concat("~!!");
		System.out.println("str2 :"+str1.concat("~!!"));
		
		//4.���ڿ�.substring(int beginindex) : ��ȯ�� String
		//-���ڿ��� beginindex�� ��ġ���� ���ڿ� �������� ���ڿ��� �����ؼ� ����
		// ���ڿ�.substring(int beginindex,int endIndex) :��ȯ�� String
		
		System.out.println(str1.substring(3));
		
		//5. ���ڿ�.replace(char old,char new) : ��ȯ�� String
		//-���ڿ����� old ���ڸ� new ���ڷ� �ٲ㼭 ���ڿ� ����
		
		String str3 = str1.replace('l', 'p');
		System.out.println(str3);
		
		//6.���ڿ�.trim() : ��ȯ�� String
		// - ���ڿ��� �յ� ������ �������ִ� �޼ҵ�
		
		String str4 ="          www.na         ver.com     ";
		
		System.out.println(str4.trim());
		System.out.println(str4.replace(" ", ""));
		
		//7.���ڿ�.toUpperCase :
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		char[] cArr = str2.toCharArray();
		
		for(int i=0; i<cArr.length;i++) {
			System.out.print(cArr[i]+" ");
		}
		
		System.out.println();
		
		//9.static valueOf(char[] c) : ��ȯ�� String
		//���� �迭�� ���ڿ��� ��ȯ�޴� �޼ҵ�
		
		System.out.println(String.valueOf(cArr));
	}
	
}
