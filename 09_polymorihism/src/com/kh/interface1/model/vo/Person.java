package com.kh.interface1.model.vo;

public class Person {
	
	private String name;
	private double weight;
	private int health;
	
	public Person() {
		super();
	}

	public Person(String name, double weight, int health) {
		super();
		this.name = name;
		this.weight = weight;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", health=" + health + "]";
	}

	// 잠 자기
//	public abstract void eat();
//	public abstract void sleep();
	
	//추상 메소드만 따로 모아서 그걸 상속받자.
	
}
