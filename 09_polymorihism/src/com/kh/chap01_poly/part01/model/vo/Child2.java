package com.kh.chap01_poly.part01.model.vo;

public class Child2 extends Parent{
	
	private int n;
	
	public Child2() {
		super();
	}

	public Child2(int x,int y,int n) {
		super(x,y);
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	
	public void printChild2() {
		System.out.println("�� �ι�°��");
	}
	public void printp() {
		System.out.println("�� �ι�°��222");
	}
	public void printP() {
		System.out.println("��  �θ� �ڽ�1�� �ƴϾ�");
	}
}
