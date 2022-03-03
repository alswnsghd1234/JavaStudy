package com.kh.chap02.encapsulation.model.vo;

public class Testclass2 {

	public String name;
	public String kindOF;
	public int price;
	public char eventOr;
	
	public void showInfo() {
		System.out.println("현재 메뉴는 "+name+"종류는 "+kindOF+"가격은 "+price+"행사여부는 "+ eventOr+"입니다.");
	}
}
