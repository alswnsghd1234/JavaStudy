package com.kh.chap01_math;

import java.util.Random;

public class MathRun {

	public static void main(String[] args) {
		
		/*Math클래스 (수학과 관련된 기능들)
		 * Math클래스의 특징
		 * -모든 필드와 메소드가 다 static으로 되어있다.
		 * -굳이 생성할 필요가 없으므로 생성자가 private
		 * -java.lang이라는 패키지 안에 존재.
		 * */
		
		//필드
		//파이  
//		System.out.println("파이 : "+Math.PI);
		
		//메소드
		//메소드명(매개변수타입) : 반환형
		
		//1.올림 -> Math.ceil(double) : 반환형 - double
		double num1 = 4.349;
//		System.out.println("올림 : "+Math.ceil(num1)); 
		
		//2.반올림 ->Math.round(double) : 반환형 long
//		System.out.println("반올림 : "+Math.round(num1));
		
		//3. 버림 ->Math.floor(double) : 반환형 double
//		System.out.println("버림 : "+Math.floor(num1));
		
		//4. 절대값 ->Math.abs(int/double/long/float) : 반환형 int/double/long/float
		double num2 = -13.2;
//		System.out.println("절대값 : "+Math.abs(num2));

		//5. 최소값 ->Math.min(int,int) : 반환형 int 타입맞추기 가능타입=int/double/long/float
//		System.out.println("최소값 : "+Math.min(5, 10));
		
		//6. 최대값 ->Math.max(double,double) : 반환형 double 타입맞추기
//		System.out.println("최대값 : "+Math.max(5.5, 50.5));
		
		//7. 제곱근(루트) ->Math.sqrt(double) : 반환형 double
//		System.out.println("4의 제곱근 : "+Math.sqrt(4));
	
		//8. 제곱 -> Math.pow(double,double) : 반환형 double
//		System.out.println("2의 10제곱 : "+Math.pow(2, 10));
		
		//9. 랜덤값 ->Math.random()
		//0.0~0.9999999 정수형으로 바꿨으니까 0~9
		int num;
		
//		for(int i=0; i<10;i++) {
//			num=(int) (Math.random()*100+1);	
//			System.out.println("랜덤값 : "+num);
//		}
		
		/*
		 * 전부 static이기 때문에 객체생성이 필요없음. 
		 * */
		Random r = new Random();
		
		int random=r.nextInt(10/*개수*/)+1;/*~부터*/
		
		
	}
}
