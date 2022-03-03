package com.kh.chap03.feild;

//필드에서 사용가능한 접근제한자
public class FieldTest2 {

	
	/*
	 * (+)public  - 어디서든 ( 같은패키지, 다른 패키지 모두) 접근 가능하게 하고 싶을때
	 * (#)protected - 같은 패키지 , 해당 클래스, 다른 패키지라면 상속 관계에서 접근 가능
	 * (~)default - 같은 패키지, 해당 클래스에서 접근 가능
	 * (-)private - 오직 해당 클래스 안에서
	 * 
	 * alt 방향키 위아래 = 한줄 이동
	 * 
	 * 
	 * */
	
	public String pub = "public";
	protected String pro = "protected";
	String df = "default";
	private String pri = "private";
	
	
}
