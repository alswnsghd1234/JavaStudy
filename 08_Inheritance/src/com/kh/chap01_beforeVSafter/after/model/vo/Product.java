package com.kh.chap01_beforeVSafter.after.model.vo;

	/*
	 *���
	 *��Ŭ�������� �ߺ��� �ʵ�, �޼ҵ带 �ϳ��� Ŭ������ ��Ƽ�(�θ�Ŭ����) ������ ��
	 *����� �޾� (�ش� Ŭ������ �����޾�) ����ϴ� ����
	 *
	 *
	 **/

public class Product { // �θ�Ŭ���� // ����Ŭ���� //super Ŭ����

	public String brand;
	public String pCode;
	public String pName;
	public int price;
	
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
	
	
	
}
