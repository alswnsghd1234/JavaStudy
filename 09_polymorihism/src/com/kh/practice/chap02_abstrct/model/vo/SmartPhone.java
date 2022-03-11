package com.kh.practice.chap02_abstrct.model.vo;

public abstract class SmartPhone implements CellPhone,TouchDispaly{

	

	public SmartPhone() {
		super();
	}
	
	

	public SmartPhone(String maker) {
		super();
		this.maker = maker;
	}



	private String maker; //제조사 정보
	
	public abstract String printlnInformation();

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
	
}
