package com.kh.chap02_string.controller;

public class B_StringMethod {

	
	public void method() {
		String str1 = "hello world";
		
		//메소드명 (매개변수) : 반환형
		
		// 1. 문자열.charAt(int index) : 반환형 char
		// -> 문자열에서 전달받은 index 위치에 있는 문자 하나만 뽑아서 리턴
		char ch = str1.charAt(4);
		
		System.out.println("ch :" +ch);
		
		//2.문자열.concat(String str) :반환형 String
		// 문자열과 전달바은 또 다른 문자열을 하나로 합쳐서 리턴 -> 문자열 +str
		
		String str2 = str1.concat("~!!");
		System.out.println("str2 :"+str1.concat("~!!"));
		
		//4.문자열.substring(int beginindex) : 반환형 String
		//-문자열의 beginindex의 위치부터 문자열 끝까지의 문자열을 추출해서 리터
		// 문자열.substring(int beginindex,int endIndex) :반환형 String
		
		System.out.println(str1.substring(3));
		
		//5. 문자열.replace(char old,char new) : 반환형 String
		//-문자열에서 old 문자를 new 문자로 바꿔서 문자열 리턴
		
		String str3 = str1.replace('l', 'p');
		System.out.println(str3);
		
		//6.문자열.trim() : 반환형 String
		// - 문자열의 앞뒤 공백을 제거해주는 메소드
		
		String str4 ="          www.na         ver.com     ";
		
		System.out.println(str4.trim());
		System.out.println(str4.replace(" ", ""));
		
		//7.문자열.toUpperCase :
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		char[] cArr = str2.toCharArray();
		
		for(int i=0; i<cArr.length;i++) {
			System.out.print(cArr[i]+" ");
		}
		
		System.out.println();
		
		//9.static valueOf(char[] c) : 반환형 String
		//문자 배열을 문자열로 반환받는 메소드
		
		System.out.println(String.valueOf(cArr));
	}
	
}
