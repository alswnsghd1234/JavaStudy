package com.kh.chap02.encapsulation.model.vo;

public class Testclass222 {

	private String name;
	private String job;
	private int level;
	private int money;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void showInfo() {
		System.out.println(name+" "+job +" "+level +" "+money );
	}
	
}
