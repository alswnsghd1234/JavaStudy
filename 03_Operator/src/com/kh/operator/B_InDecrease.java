package com.kh.operator;

public class B_InDecrease {

	/*
	 * 증감 연산자 : 단항연산자로서 한번에 1씩증가(더하거나) 감소(빼거나) 하는 연산을 한다.
	 * -> 먼저 증감을 할건지, 나중에 증감을 할건지 연산자의 위치에 따라 달라진다.
	 * 
	 * [표현법]
	 * ++ : 값을 1씩만 증가 시키는 연산자.
	 * -- : 값을 1씩만 감시 시키는 연산자.
	 * 
	 * 연자자의 위치
	 * 전위연산 : ++값, --값 -> 먼저 1을 증감또는 감소 시키고 그 값을 처리
	 * 후위연산 : 값++, 값-- -> 먼저 값을 처리하고(타연산자 먼저 실행후) 1 증감 또는 감소
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public void method2() {
		
		int a = 10;
		int b = a++;
		
		int c = 10;
		int d = c;
		
		
	}
	public void method3() {
		int a = 10;
		int b = ++a;
		
		System.out.println("a :"+a);
		System.out.println("a :"+b);
		System.out.println("a :"+--a);
	}
	public void method4() {
		int num1 = 20;
		int result1 = num1++ *3;
		
		System.out.println("num1 : "+num1);
		System.out.println("result1 : "+result1);
		
		int num2 = 20;
		int result2 = ++num2 *3;
		
		System.out.println("num2 :"+num2);
		System.out.println("result2 :"+result2);
	}
}
