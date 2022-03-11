package com.kh.chap01_math;

import java.util.Random;

import com.kh.chap02_string.controller.B_StringMethod;

public class MathRun {

	public static void main(String[] args) {

		/*
		 * Math클래스 (수학과 관련되 기능들)
		 * - 모든 필드와 메소드가 다 static 으로 되어있다.
		 * - 굳이 생성할 필요가 없으므로 생성자가 private
		 * - java.lang 이라는 패키지 안에 존재.
		 * 
		 * */
		
		//파이
//		System.out.println("파이 :"+Math.PI);
//
//		//메소드
//		//메소드명(매개변수타입) : 반환형
//		
//		//1.올림 -> Math.ceil(double) : 반환형 - double
//		
//		double num1 = 4.3889;
//		System.out.println("올림 :"+Math.ceil(num1));
//		System.out.println("버림 :"+Math.floor(num1));
//		System.out.println("절대값 :"+Math.abs(num1));
//		System.out.println("최소값 :"+Math.min(num1 , 4));
//		System.out.println("제곱근 :"+Math.sqrt(num1));
//		System.out.println("제곱 :"+Math.pow(3,10));
		
//		System.out.println((Math.random()));
//		
//		Random r = new Random();
//		
//		System.out.println(r.hashCode());
		
		B_StringMethod b = new B_StringMethod();
		
		b.method();
	}

}
