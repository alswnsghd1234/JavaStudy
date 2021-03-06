package com.kh.interface1.model.vo;

public interface Basic {

	/*
	 * 인터페이스
	 * [표현법]
	 * 접근제한자 interface 인터페이스 이름{
	 * 상수필드
	 * 
	 * 추상메소드
	 * 
	 * }
	 * 
	 * - 상수 필드와 추상메소드로만 이루어진 추상 클래스의 변형체
	 * - 인터페이스에서 필드는 상수 필드만 가능하다(static final)
	 * - 인터페이스에서 메소드는 무조건 추상메소드이다.
	 * - 무조건 구현해야하는 기능이 있을때 인터페이스에 추상메소드로 만들어놓고 상속받는다.
	 * - 인터페이스는 다중 상속을 허용한다.
	 * - 메소드가 겹치더라도 결국은 최종구현에서 달라지기 때문에!
	 * - 추상 클래스보다 좀 더 강한 규칙성, 강제성을 가진다.
	 * 
	 *  추상클래스와 인터페이스
	 *  공통점
	 * - 객체 생성은 안되지만, 참조변수로는 사용가능하다(다형성)
	 * - 상속하는 클래스에 추상 메소드를 오버라이딩 하도록 강제한다.
	 * 
	 *  차이점
	 *  추상 클래스 : 클래스 내에 필드, 일반 메소드 생성이 가능하고 추상 메소드가 포함되어 있거나, abstract 키워드를 통해 정의한다.
	 *  
	 *  인터페이스: 모든 필드는 상수 필드, 모든 메소드는 추상 메소드로 정의해야만 한다.
	 *  - 존재하는 목적이 다름
	 *    추상 클래슨느 추상 클래스를 상속받아서 기능을 이용하고, 클래스를 확장해서 쓸 것
	 *    인터패이스는 클래스의 기능 구현을 강제하기 위해서 사용
	 *  - 구현을 강제하기 때문에 상속 받은 객체들의 같은 동작을 보장 할 수 있음.
	 *  
	 *  extends 와 implements
	 *  - 클래스간의 상속관계 : 자식 클래스명 extends 부모 클래스명
	 *  - 클래스와 인터페이스의 관계 : 클래스명 implements 인터페이스명
	 *  - 인터페이스와 인터페이스의 관계 : 인터페이스명 extends 부모 인터페이스명
	 *  
	 *  
	 * 
	 * 
	 * 
	 * */
	
	//사람이라면 필요한 기능( 규칙처럼 강제하기)
	public abstract void eat();
	
	public abstract void sleep();
	
	//학생이라면 필요한 기능을 (규칙처럼 강제하기) interface로
	
	public abstract void study();
	
	public abstract void fly();
}
