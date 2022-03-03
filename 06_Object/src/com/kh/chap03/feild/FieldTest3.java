package com.kh.chap03.feild;

//클래스 변수(static) 와 상수필드 (static final)
public class FieldTest3 {
	
	//필드
	//[표현법] 접근제한자 예약어(생략가능) 자료형 필드명;
	
	public static String str = "static 변수";
	
	//생성시점 = 프로그램 실행과 동시네 static 영역에 할당
	//소멸시점 = 프로그램 종료시 소멸
	//-> 객체를 생성 안해도 불러올 수 있음(객체 생성 안해도 할당이되어있다)
	
	//static 은 "공유"의 의미가 강하다
	//-> 프로그램 실행과 동시에 메모리 영역에 할당이 되기 때문에 그 값을 공유하기 위해 사용

	/*
	 * 상수필드
	 * [표현법]
	 * public static final 자료형 상수필드명 = 값;
	 * -> 한번 지정된 값을 고정해서 쓴다. 그래서 무조건 초기화 해야함.
	 * ->예약어의 순서는 상관없음 - public final static 으로 사용해도 됨
	 * 
	 * static: 공유의 개념(재사용성)
	 * final:한번 지정된 값 변경x (상수)
	 * 
	 * 값이 변경되어서는 안되는 고정적인 값을 메모리 상에 올려놓고
	 * (프로그램 시작과 동시에 메모리 영역에 할당, 값이 변하지 않음)
	 * 공유하면서 사용할 목적
	 * 주의사항) 상수필드 이름은 모두 대문자로 하여야한다.
	 * 
	 * */
	
	public static final int NUM =10;
	
	public static void method1() {
		System.out.println("스태틱 메소드 실험");
	}
}
