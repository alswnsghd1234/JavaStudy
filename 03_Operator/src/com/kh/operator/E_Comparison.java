package com.kh.operator;

public class E_Comparison {
	
	/*
	 * 비교 연산자 (관계 연산자)
	 * 두개의 값을 비교한다. 이항 연산자
	 * 비교 연산을 한 결과 => 참일 경우에 true / 거짓일 경우 false
	 * 특정 조건을 제시할 수 있는 조건문에서 쓰일 예정
	 * 
	 * 종류
	 * 1. 크고 작음을 비교
	 * a < b : a갑 b 보다 작습니까?
	 * a > b : a가 b 보다 큽니까?
	 * a <= b : a가 b보다 작거나 같습니까?
	 * a >= b : a가 b보다 크거나 같습니까?
	 * 
	 * 2. 일치하는지 비교 : 동등비교
	 * a == b : a랑 b가 일치합니까?
	 * a != b : a랑 b가 일치하지 않습니까?
	 * 
	 * 피연산자는 숫자이지만 결과값은 논리값이 나온다.
	 * 
	 * */
	public void method1() {
		int a = 10;
		int b = 25;
		
		System.out.println("a < b: "+(a<b));
		// 비교 연산자보다 산술 연산이 우선순위가 더 높기 때문에 ()괄호를 통해서 우선순위를 높여줘야한다.
		
		System.out.println("a <= b : "+ (a<=b));
		System.out.println("25 <= b : "+(25<=b));
		// 작거나 같냐 크거나 같냐 라고 하면 둘 중 하나라도 만족하면 true
		
		//동등비교
		boolean b1 = a==b;
		System.out.println("b1 :" +b1);
		
		boolean b2 = (a!= b);
		System.out.println("b2 :" +b2);
		//가독성을 위해 소괄호를 해주면 좋다. 대입 연산이 논리 부정 연산보다 우선순위가 낮기 때문에 상관 x
		
		//산술연산 + 비교연산
		System.out.println("a-b < 0 : "+(a-b<0)); //true
		
		//어떤 값을 2로 나누었을때 나머지 값이 1인 경우 : 홀수/ 0인 경우 짝수
		//짝수 홀수 판별 가능
		System.out.println("a가 짝수입니까? : " + (a%2 == 0));
		System.out.println("a가 짝수입니까? : " + (a%2 != 0));
		
		
	}
}
