package com.kh.chap01_beforeVSafter.after.model.vo;

	/*
	 *상속
	 *매클래스마다 중복된 필드, 메소드를 하나의 클래스로 모아서(부모클래스) 정의한 후
	 *상속을 받아 (해당 클래스를 내려받아) 사용하는 개념
	 *
	 *
	 **/

public class Product { // 부모클래스 // 조상클래스 //super 클래스

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product() {
		
	}
	
	public Product(String brand, String pCode, String pName, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	protected void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	protected void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	protected void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	protected void setPrice(int price) {
		this.price = price;
	}

	public String info() {
		return brand+pCode+pName+price;
	}
	
	
	
}
