package com.kh.chap01_beforeVSafter.before.model.vo;

public class Tv {
	public String brand;
	public String pCode;
	public String pName;
	public int price;
	public int inch;
	
	public Tv() {
		
	}
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		this.brand=brand;
		this.pCode=pCode;
		this.pName=pName;
		this.price=price;
		this.inch=inch;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	public String information() {
		return brand+pCode+pName+price+inch;
	}
	
}
