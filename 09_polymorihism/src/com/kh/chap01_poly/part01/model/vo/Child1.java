package com.kh.chap01_poly.part01.model.vo;

public class Child1 extends Parent {

	private int x;
	private int y;
	public Child1() {
		super();
	}

	public Child1(int x,int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getN() {
		return x;
	}

	public void setN(int x) {
		this.x = x;
	}
	
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void printChild1() {
		System.out.println("�� ù��°��");
	}
	public void printp() {
		System.out.println("�� ù��°��111");
	}
	public void printParent() {
		System.out.println("��  �θ�ƴϾ� �ڽ��̾�");
	}
}
