package com.kh.test;

public class MovieActor extends Actor{

	int event;
	
	public void cgAct() {
		System.out.println("CG 연기");
	}
	
	@Override
	public void cry() {
		System.out.println("오열하기");
	}
}
