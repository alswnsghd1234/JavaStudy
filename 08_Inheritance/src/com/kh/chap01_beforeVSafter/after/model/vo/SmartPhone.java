package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product {

	private String modelAgency;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String brand,String pCode,String pName,int price,String modelAgency) {
		super(brand,pCode,pName,price);
		this.modelAgency = modelAgency;
	}
	
	public String info() {
		return super.info()+modelAgency;
	}
}
