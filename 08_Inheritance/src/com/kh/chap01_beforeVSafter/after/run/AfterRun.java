package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {

		SmartPhone s = new SmartPhone("애플","p-22","아이폰",134999,"SKT");
		
//		Desktop d = new Desktop("삼성","p-99","울트라게이밍",350000,true);
		
		Tv t = new Tv("LG","slim","85인치 벽걸이티비",600000,85);
		
		System.out.println(s.info());
//		System.out.println(d.info());
		System.out.println(t.info());
		
		/*
		 * 
		 * 상속의 특징
		 * - 클래스 간의 상속은 다중 상속이 불가능하다.(단일 상속만 가능)
		 * - 명시되어 있지 않지만 모든 ㅋ르래스는 Object클래스의 후손이다.
		 * (모든 클래스는 이미 만들어진 클래스. 내가 새롭게 만들 클래스들 모두 포함이다,)
		 * ->Object
		 * 
		 * 상속의 장점
		 * 유지보수가 좋다 코드관리 편리
		 * 
		 * 
		 * 
		 * */
	}

}
