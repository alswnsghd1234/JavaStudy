package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class run {

	public static void main(String[] args) {

		Car c = new Car("우루스",6.6,"suv",4);
		Ship s = new Ship("대게잡이",3,"어선",1);
		Airplane a = new Airplane("아시아나",2,"여객기",8,4);
		
		System.out.println(c.info());
		System.out.println(s.info());
		System.out.println(a.info());
		
		System.out.println(c.toString());
		System.out.println(s.toString());
		System.out.println(a.toString());
		
		/*
		 * toString()메소드 - 해당 객체의 정보를 문자열로 반환하는 object클래스의 메소드
		 * 자동완성 오버라이딩으로 재정의하면 주소값이 아닌 객체 안에 있는 필드값을 반환해준다.
		 * print문에 객체변수 (인스턴스변수)만 입력했을때 나왔던 주소는 toString 메소드가 생략되어 있던것,
		 * 그래서 toString 메소드를 재정의하면 객체변수만 입력해도 재정의한 toString 메소드의 내용이 출력된다.
		 * 
		 * */
		
		System.out.println(c);
		
	}
	

}
