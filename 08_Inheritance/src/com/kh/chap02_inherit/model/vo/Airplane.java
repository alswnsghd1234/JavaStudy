package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle{

	private int wing;
	private int tire;

	public Airplane() {
		
	}

	public Airplane(String name, double mileage, String kind, int tire,int wing) {
		super.setName(name);
		super.setMileage(mileage);
		super.setKind(kind);
		this.tire = tire;
		this.wing = wing;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}
	
	
	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public String info() {
		return super.info()+wing;
	}
}
