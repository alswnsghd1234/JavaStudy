package com.kh.chap02.encapsulation.model.vo;

public class Student {
	/*
	 	필드부 
	 	각정보를 담는 부분
	 	
	 	필드 == 전역변수 == 멤버변수 == 인스턴스 변수
	 	
	 	접근제한자 자료형 필드명;
	 	
	 * */
	
	//이름 나이 성별 숨겨서
	private String name;
	private int age;
	private char gender;
	public int ane;
	/*
	 * 각 기능들을 담당하는 부분
	 * [표현법]
	 * 접근제한자 반환형 메소드이름(매개변수){
	 * public void method1(){
	 * 	수행하고자 하는 코드
	 * }
	 * 
	 * ->접근제한자는 접근할 수 있는 범위를 제한한다.
	 * ->반환형은 메소드의 결과값의 자료형을 지정한다. void는 돌려주는 값이 없다는 의미
	 * ->매개변수 : 메소드 호출 시 입력값으로 넣어주는 변수. 해당 메소드 실행중에만 사용 가능. (생략도 가능하다)
	 * 
	 * 
	 * */
	
	//데이터를 기록 및 수정하는 메소드 : setter 메소드
	/*
	 * 규칙
	 * 1. setter 메소드는 접근이 가능해야하기 때문에 public 접근제한자로 사용
	 * 2. set필드명 이름으로 짓되 낙타봉 표기법을 지킨다.
	 * ex)setName,setAge,setGender 이런식으로 set 뒤에오는 첫 알파벳 대문자로 해준다.
	 * 3. 모든 필드에 저부 작성해줘야 된다.
	 * 
	 * */
	
	public void setName(String name) {
		
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String information() {
		return name+"님의 나이는"+age+"살이고 성별은"+gender+"입니다";
		
	}
	
}
