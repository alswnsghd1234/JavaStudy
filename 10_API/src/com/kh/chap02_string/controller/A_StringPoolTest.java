package com.kh.chap02_string.controller;

import java.lang.reflect.Array;

public class A_StringPoolTest {

	//String 클래스 -> 불변 클래스( 변하지 않는 클래스)
	// 수정하는 순간 기존의 값이 담겨있떤 공간에서 수정되지 않고 새로운 공간에 추가된 갑이 들어감
	
	public static void main(String[] args) {
		
	
//	String str1 = new String("hello");
//	String str2 = new String("hello");
//	
//	//equals()메소드
//	System.out.println(str1.equals(str2));
//	//주소값 비교가 아닌 문자열 비교를 하는 기능(Object클래싀의 equals를 상속받아 오버라이딩했기 때문)
//	
//	//hashCode() 메소드
//	System.out.println(str1.hashCode());
//	System.out.println(str2.hashCode());
//	//string 클래스에서 hashcode는 주소값 기반이 아닌 문자열 기반으로 해시코드 값을 만들어 반환
//	//오버라이딩 되어있음.
//	
//	System.out.println(System.identityHashCode(str1));
//	System.out.println(System.identityHashCode(str2));
//	//실제 주소값의 해시코드를 반환
//	
//	System.out.println(str1==str2);
//	
//	//2.문자열을 리터럴로 생성
//	String str11 = "hello";
//	String str22 = "hello";
//	
//	System.out.println(str11.toString());
//	System.out.println(str22.toString());
//	
//	System.out.println(str11.equals(str2));
//	
//	System.out.println(str11.hashCode());
//	System.out.println(str22.hashCode());
//	
//	System.out.println(System.identityHashCode(str11));
//	System.out.println(System.identityHashCode(str22));
//	
//	// 문자열을 여러번 더하면 어떻게 될까
//	
//	String str = "hello";
//	long start = System.currentTimeMillis();
//	for(int i=0;i<60000;i++) {
//		
//		str += "hello";
//		
//		System.out.println(System.identityHashCode(str));
//	}
//	long finish = System.currentTimeMillis();
//	
//	System.out.println("시작시간 :"+start);
//	
//	System.out.println("종료시간 :"+finish);
//	
//	System.out.println(finish-start); //우리가 알고 싶은건 작업이 얼마나 걸렸는지.
//	
//	//문자열의 단점
//	// 불변 클래스이기 때문에 합성이 느리다( 새 메모리 영역을 할당받는 작업이 이루어지기 때문에)
//	// 그래서 가변형 클래스를 사용한다.
	//STringBuffer / StrimgBuilder
	
	StringBuilder sb = new StringBuilder();
	
	
	long start1 = System.currentTimeMillis();
	for(int i=0;i<10000;i++) {
		
		sb.append("hello");
		System.out.println(System.identityHashCode(sb));
		
	}
	long finish1 = System.currentTimeMillis();
	System.out.println(finish1-start1); //우리가 알고 싶은건 작업이 얼마나 걸렸는지.
	
//		StringBuffer sb = new StringBuffer();
//		
//		long start1 = System.currentTimeMillis();
//		
//		for(int i=0;i<10000;i++) {
//			
//			sb.append("hello");
//			System.out.println(System.identityHashCode(sb));
//		}
//		long finish1 = System.currentTimeMillis();
//		System.out.println(finish1-start1);
}
}
