package com.kh.assist_chap02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{//직렬화 해줘야 함 왜? 객체를 스트림에 보내려고

	private String name;
	private int price;
	
	public Phone() {
		super();
	}

	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
