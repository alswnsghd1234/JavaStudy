package com.kh.chap01_beforeVSafter.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {

		Desktop d = new Desktop("삼성","d-01","좋은컴퓨터",2000000,true);
		
		Tv t = new Tv("엘지","t-01","초코",350000,60);
		
		SmartPhone sm = new SmartPhone("애플","d-01","아이폰",250000,"SKT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(sm.information());
		/*
		 * 매 클래스마다 중복된 코드들을 일일이 기록하게 되면
		 * 수정과 같이 유지보수를 할 경우에 매번 찾아서 수정을 해야하는 번거로움이 생긴다.
		 * 
		 * 상속이라는 개념을 이용해서
		 * 매 클래스마다 공통된,중복된 필드, 메소드들을 하나의 클래스에 모아서 부모 클래스로 만들어놓고
		 * 그 클래스를 상속받아 사용하면 코드의 유지보수가 용이하다.
		 * 
		 * 
		 * 
		 * */
		
	}
	
}
