package com.kh.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product {

	private int inch;
	
	public Tv() {
		
	}
	public Tv(String brand,String pCode,String pName,int price,int inch) {
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		this.inch=inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	public String info() {
		return super.info()+inch;
	}
	
	
	
}
