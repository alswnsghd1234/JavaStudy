package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Testclass3;

public class Testrun3 {

	public static void main(String[] args) {

		Testclass3 stage1 = new Testclass3("스노우맨",300,0);
		stage1.method(15);
		stage1.showInfo();
		
		
		Testclass3 stage2 = new Testclass3("보글보글",500,0);
		stage2.method(15);
		stage2.showInfo();
		
		Testclass3 stage3 = new Testclass3("철권",1000,0);
		stage3.method(15);
		stage3.showInfo();
	}

}
