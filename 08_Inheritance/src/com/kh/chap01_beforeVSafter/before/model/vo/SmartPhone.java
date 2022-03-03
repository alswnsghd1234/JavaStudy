package com.kh.chap01_beforeVSafter.before.model.vo;

public class SmartPhone {

	public String brand;
	public String pCode;
	public String pName;
	public int price;
	public String mobileAgency;
	
	SmartPhone(){
		
	}
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		this.brand=brand;
		this.pCode=pCode;
		this.pName=pName;
		this.price=price;
		this.mobileAgency=mobileAgency;
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

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	public String information() {
		return brand+pCode+pName+price+mobileAgency;
	}
	
}
