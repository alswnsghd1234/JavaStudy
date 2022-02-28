package com.kh.chap02.encapsulation.model.vo;

public class Testclass {

	private String name;
	private String kindOf;
	private int gold;
	private int silver;
	private int dong;
	
	//JVM�� �⺻ ������ ������ش� �׻�? �ƴϴ� �ƹ��� �����ڵ� ������ �ʾ�����
	//�� ������ֳ�? heap ������ ��ü�� �����ؾ� �Ǵµ� ������� ������ �ȵǴϱ�.
	//�⺻���̶� �־��ַ��� ����� -> �⺻ �����ڴ� �ʵ带 �⺻������ �ʱ�ȭ �ϴ� �޼ҵ��� �� �� �ִ�.
	
	//�⺻ ������ ����
	//[ǥ����] public Ŭ�����̸�(){}
	
	
	public Testclass(String name,String kindOf,int gold,int silver,int dong) {
		this.name = name;
		this.kindOf = kindOf;
		this.gold = gold;
		this.silver = silver;
		this.dong = dong;
	}
	/*
	 * �Ű������� ���� ������! (������ �� ���� �־��� �� �ִ�.)
	 * [ǥ����] public Ŭ�����̸�(�Ű�����'s){
	 * 	 �ʵ� �ʱ�ȭ ���
	 * }
	 * */
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKindOf() {
		return kindOf;
	}
	public void setKindOf(String kindOf) {
		this.kindOf = kindOf;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getSiler() {
		return silver;
	}
	public void setSiler(int siler) {
		this.silver = siler;
	}
	public int getDong() {
		return dong;
	}
	public void setDong(int dong) {
		this.dong = dong;
	}
	
	public void showInfo() {
		System.out.printf("%s�� %s ��:%d ��:%d ��:%d",name,kindOf,gold,silver,dong);
	}
	
	
}
