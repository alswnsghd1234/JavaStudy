package com.kh.chap03_map.part01_hashMap.model.vo;

public class Snack {

	private String flavor;
	private int price;
	
	public Snack() {
		super();
	}

	public Snack(String flavor, int price) {
		super();
		this.flavor = flavor;
		this.price = price;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", price=" + price + "]";
	}
	
	
}
