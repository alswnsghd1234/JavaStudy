package com.kh.chap03_override.model.vo;

public class LunchMenu extends Food {

	private String name;
	private int price;
	private boolean hobul;
	
	public LunchMenu() {
		
	}
	
	public LunchMenu(String name, int price, boolean hobul) {
		super();
		this.name = name;
		this.price = price;
		this.hobul = hobul;
	}
	
	public String toString() {
		return name+price+hobul;
	}
	
	
	
	
}
