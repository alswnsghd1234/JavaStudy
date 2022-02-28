package com.kh.chap02.encapsulation.model.vo;

public class Testclass {

	private String name;
	private String kindOf;
	private int gold;
	private int silver;
	private int dong;
	
	//JVM이 기본 생성자 만들어준다 항상? 아니다 아무런 생성자도 만들지 않았을때
	//왜 만들어주나? heap 영역에 객체를 생성해야 되는데 빈공간이 있으면 안되니까.
	//기본값이라도 넣어주려고 만든다 -> 기본 생성자는 필드를 기본값으로 초기화 하는 메소드라고 볼 수 있다.
	
	//기본 생성자 형태
	//[표현법] public 클래스이름(){}
	
	
	public Testclass(String name,String kindOf,int gold,int silver,int dong) {
		this.name = name;
		this.kindOf = kindOf;
		this.gold = gold;
		this.silver = silver;
		this.dong = dong;
	}
	/*
	 * 매개변수를 가진 생성자! (생성될 때 값을 넣어줄 수 있다.)
	 * [표현법] public 클래스이름(매개변수's){
	 * 	 필드 초기화 블록
	 * }
	 * */
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKindOf() {
		return kindOf;
	}
	public void setKindOf(String kindOf) {
		this.kindOf = kindOf;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getSiler() {
		return silver;
	}
	public void setSiler(int siler) {
		this.silver = siler;
	}
	public int getDong() {
		return dong;
	}
	public void setDong(int dong) {
		this.dong = dong;
	}
	
	public void showInfo() {
		System.out.printf("%s님 %s 금:%d 은:%d 동:%d",name,kindOf,gold,silver,dong);
	}
	
	
}
