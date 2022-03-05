package com.kh.chap01_beforeVSafter.after.model.vo;

	/*
	 *���
	 *��Ŭ�������� �ߺ��� �ʵ�, �޼ҵ带 �ϳ��� Ŭ������ ��Ƽ�(�θ�Ŭ����) ������ ��
	 *����� �޾� (�ش� Ŭ������ �����޾�) ����ϴ� ����
	 *
	 *
	 **/

public class Product { // �θ�Ŭ���� // ����Ŭ���� //super Ŭ����

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
