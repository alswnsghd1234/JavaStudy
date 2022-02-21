package com.kh.operator;

public class C_Compound {
	
	/*
	 * 복합 대입 연산자 : 다른 산술 연산자랑 대입 연산자가 결합한것, 이항연산자
	 * => 자기 자신과 해당 산술 연산 후에 그 결과를 자기 자신에게 덮어 씌우는것.
	 * 
	 * +=
	 * -=
	 * *=
	 * %=
	 * 
	 * ex) a += 3; -> 기존에 a라는 값에 3을 더하고 a에 그 결과값을 덮어 씌우겠다.
	 * 풀어서 적으면 a = a+3
	 * 
	 * 
	 * */
	
	public void method1() {
		int num = 12;
		
		System.out.println("현재 num : " + num);
		
		num = num +3;
		System.out.println("3을 증가시킨 num :" + num);
		
		//num을 3만큼 증가시켜보자
		
		num -= 3;
		System.out.println("3을 증가시킨 num :" + num);
		num *= 3;
		System.out.println("3을 증가시킨 num :" + num);
		num -= 2;
		System.out.println("3을 증가시킨 num :" + num);
		num %= 2;
		System.out.println("3을 증가시킨 num :" + num);
	}

}
