package com.kh.chap01_poly.part01.run;

import com.kh.chap01_poly.part01.model.vo.Child1;
import com.kh.chap01_poly.part01.model.vo.Child2;
import com.kh.chap01_poly.part01.model.vo.Parent;

public class Run {

	public static void main(String[] args) {

		/*
		 * 다형성
		 * 상속을 이용한 기술로 부모클래스로부터 상속받은 자식 클래스 타입의 객체를
		 * 부모 클래스 타입으로 형변환하여 한번에 다룰 수 있는 기술
		 * 객체배열 사용시 용이하다.(배열은 같은 자료형끼리묶인 형태이기 때문에)
		 * 
		 * */
		//1. 부모 타입 참조변수(reference)로 부모 객체를 다루는 경우
		
//		Parent p = new Parent();
//		p.printP();
//		p.printParent();
//		
//		//2. 자식 타입 참조변수(reference)로 자식 객체를 다루는 경우
//		System.out.println("자식 타입 참조변수(reference)로 자식 객체를 다루는 경우");
//		Child1 c1 = new Child1();
//		c1.printp();
//		c1.printChild1();
//		c1.printParent();
//		
//		//자식객체+부모객체 접근가능 c1으로 Child1() Parent()에 있는것들 전부 접근 가능
//		
//		//3. 부모 타입 참조변수(reference)로 자식 객체를 다루는 경우
//		
//		Parent p2 = new Child2();
//		p2.printP();
//		p2.printParent();
//		p2.printChild1();
		
		
		/*
		 * 클래스 간의 형변환
		 * - 상속구조일 때만 형 변환 가능 - 우린 사기꾼 클래스로 확인했음.
		 * 
		 * 1.UpCastion : 자동 형변환
		 * 				-자식타입 -> 부모타입
		 * 				- 생략
		 * 2.DownCasting : 강제 형변환
		 * 				-부모타입->자식타입
		 * 				- 생략 불가
		 * 
		 * */
		
		// 다형성을 사용하는 이유
		// 객체 배열에서 하나의 타입으로 배열을 만들어줘야하니까
		// 부모 클래스 타입으로 자식 객체들을 담을 수 있다. (관리가 수월하다)
		
		//부모 타입의 객체 배열을 만들고 자식 객체를 묶어서 관리해보자.
//		
//		Parent[] arr = new Parent[3];
//		
		
		
		
		Parent[] arr2 = new Parent[3];
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = new Child1();
			
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i] instanceof Child1) {
				((Child1)arr2[i]).printChild1();
			}
			else if(arr2[i] instanceof Child2) {
				((Child2)arr2[i]).printChild2();
			}
		
			}
		
	
		
		
//		for(int i=0;i<arr.length;i++) {
//			arr[i].printP();
//		}
//		
		
	}

}
