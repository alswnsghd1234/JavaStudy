package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	//문자열을 문자열 배열로 분리시키는 방법
	//1. 구분자를 제시해서 해당 문자열을 분리시키는 방법 -> 배열
	//2. 분리된 각각의 문자열들을 토큰으로 취급하는 방법 -> 토큰
	
	String str="Java,Oracle,JDBC,HTML,CSS,JavaScript,Server,Spring";
	
	
	public void method1() {
		
		//문자열.split(String 구분자) : 반환형 String[]
		String[] arr = str.split(",");
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//향상된 for문 : 초기식 조건식 증감식이 필요없음!
		//for each문
		//[표현법] for(값을 받아주는 변수 선언문 : 순차적으로 접근할 배열 또는 컬렉션){}
		for(String s : arr) { //배열의 크기만큼 자동으로 반복 실행,배열의 각 항목이 앞의 변수에 담긴다.
			System.out.println(s);
		}
		//단,수정은 불가 , 출력용,값을 꺼내는건 가능하지만 수정은 불가능
	}
	
	public void method2() {
		//각각의 문자열을 토큰으로 처리
		//java.util.StringTokenizer 클래스를 이용하는 방법
		//[표현법]StringTokenizer stn = new StringTokenizer(분리시키고자하는 문자열,구분자);
		//객체를 생성해서 사용
		
		StringTokenizer stn = new StringTokenizer(str,",");
		
		//"Java,Oracle,JDBC,HTML,CSS,JavaScript,Server,Spring"
		System.out.println("분리된 문자열의 개수 : "+stn.countTokens());
		
		//분리된 토큰을 알아보려면
		
//		System.out.println(stn.nextToken()); //Java
//		System.out.println(stn.nextToken()); //Oracle
//		System.out.println(stn.nextToken()); //JDBC
//		System.out.println(stn.nextToken()); //HTML
//		System.out.println(stn.nextToken()); //CSS
//		System.out.println(stn.nextToken()); //JavaScript
//		System.out.println(stn.nextToken()); //Server
//		System.out.println(stn.nextToken()); //Spring
//		
		System.out.println("남아있는 토큰 : "+stn.countTokens()); //nextToken()호출시 해당 토큰을 꺼내고 종료
//		System.out.println(stn.nextToken()); 더이상 토큰이 없을때 nextToken()으로 찾으려고하면
//											   요소를 찾을 수 없어 NoSuchElementException 발생
		
		while(stn.hasMoreTokens()) { //토큰이 남아있다면 true 없으면 false 
		
			System.out.println(stn.nextToken());
			
		}
		
	}
	
	

}
