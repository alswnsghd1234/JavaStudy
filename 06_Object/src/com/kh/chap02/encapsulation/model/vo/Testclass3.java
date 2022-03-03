package com.kh.chap02.encapsulation.model.vo;

public class Testclass3 {

	private String name;
	private int price;
	private int money;
	public int cnt;
	
	public Testclass3(String name, int price, int money){
		this.name = name;
		this.price = price;
		this.money = money;
	}
	public int method(int cnt) {
		return money += cnt * price;
	}
	public void showInfo() {
		System.out.println(name+" "+price+" "+money);
	}
}
