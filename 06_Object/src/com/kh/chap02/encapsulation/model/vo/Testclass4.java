package com.kh.chap02.encapsulation.model.vo;

public class Testclass4 {
	
	private String name;
	private int ko;
	private int en;
	private int math;
	private int sum;
	private double avg;
	private int count = 3;
	
	public Testclass4(String name,int ko,int en,int math){
		this.name = name;
		this.ko = ko;
		this.en = en;
		this.math = math;
	}
	public Testclass4() {
		
	}
	public Testclass4(int ko) {
		this.ko = ko;
	}
	public Testclass4(int ko,int en){
		this.ko = ko;
		this.en = en;
	}
	public void method1() {
		if((ko==0)) {
			count -= 1;
		}
		if((en==0)) {
			count -= 1;
		}
		if((math==0)) {
			count -= 1;
		}
		sum = ko + en + math;
	}
	public void method2() {
		if(!(count==0)) {
		avg = sum/count;
		}else {
			return;
		}
	}
	public void method3() {
		System.out.println(name+" "+ko+" "+en+" "+math+" "+sum+" "+avg);
	}
}
