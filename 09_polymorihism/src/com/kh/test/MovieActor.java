package com.kh.test;

public class MovieActor extends Actor{

	int event;
	
	public void cgAct() {
		System.out.println("CG ����");
	}
	
	@Override
	public void cry() {
		System.out.println("�����ϱ�");
	}
}
