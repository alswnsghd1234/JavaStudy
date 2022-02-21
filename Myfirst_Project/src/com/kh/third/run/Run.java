package com.kh.third.run;

import com.kh.third.MethodTest; //import문은 해당 패키지에 있는 클래스를 가져다 쓰겠다고 선언!!

public class Run {

	public static void main(String[] args) {
		
		// MethodTest 클래스로부터 mt라는 이름을 가진 객체를 생성하는 구문!
		MethodTest mt = new MethodTest();
		mt.methodA();
		
		/*
		 같은 클래스 안에 있는 메소드들을 호출할 때는
		 호출하고자 하는 메소드명();
		 
		 *다른 클래스에 있는 메소드들을 호출할 때는
		 *1.호출할 메소드가 있는 클래스를 생성(new)해야한다.
		 *	[표현법] 클래스이름 그 클래스를 부를 이름 = new 클래스이름();
		 *
		 *2.현재 패키지 안에 내가 쓰고자 하는 클래스가 존재하지 않기 때문에
		 *	해당하는 클래스를 가져다 쓰겠따고 선언
		 *	[표현법] import 해당클래스의 풀네임(경로)
		 *
		 *3. 이제 해당 클래스에 있는 메소드를 호출(실행)
		 *	[표현법] 별명 .메소드리름();
		 */
		
	}

}
