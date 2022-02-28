package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Testclass;

public class Testrun {

	public static void main(String[] args) {
		
		

		Testclass Kim = new Testclass();
		
		Kim.setName("김연아");
		Kim.setKindOf("피겨스케이팅");
		Kim.setGold(3);
		Kim.setSiler(1);
		Kim.setDong(0);
		Kim.showInfo();
		System.out.println("");
		
		Testclass yee = new Testclass();
		
		Kim.setName("이상화");
		Kim.setKindOf("스피드 스케이팅");
		Kim.setGold(2);
		Kim.setSiler(3);
		Kim.setDong(3);
		Kim.showInfo();
		System.out.println("");
		
		Testclass yoon = new Testclass();
		
		Kim.setName("윤성빈");
		Kim.setKindOf("스켈레톤");
		Kim.setGold(1);
		Kim.setSiler(0);
		Kim.setDong(1);
		Kim.showInfo();
	}

}
