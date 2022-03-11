package com.kh.chap03_wrapper;

public class WrapperRun {

	public static void main(String[] args) {
		
		/*
		 * Wrapper 클래스
		 * ->기본자료형을 객체로 포장해주는 클래스들을 래퍼클래스라고 합니다
		 * 
		 * 기본자료형							Wrapper클래스
		 * boolean            <-----> 	     Boolean    
		 * char								 Character			
		 * byte								 Byte
		 * short						     Short
		 * int								 Integer
		 * long								 Long
		 * float						     Float
		 * double							 Double
		 * 
		 * */
		
		int num1 = 10;
		int num2 = 15;
		
		//만약에 num1과 num2를 동등비교 하고싶다?
		System.out.println(num1==num2);//동등비교 연산자 사용
//		System.out.println(num1.equals(num2)); 이렇게 메소드를 호출해서 사용하고 싶어요...
		
		//Wrapper 클래스로 변환하면 메소드 사용가능!
		//기본자료형 -> Wrapper클래스 자료형으로 변환하는것 (Boxing)
		
		Integer i1 = num1;
		Integer i2 = num2;
		
		System.out.println(i1.equals(i2));
		//a.compareTo(b)  a가 b보다 크면 1반환 b가 더 크면 -1 반환 같으면 0을 반환하는 메소드
		System.out.println(i1.compareTo(i2)); 
		
		//Wrapper 클래스자료형 -> 기본자료형(Unboxing)
		int num3 =i1; //int형으로 10
		int num4 =i2; //15
		
		System.out.println("num3 + num4 : "+(num3+num4));
	
		//기본자료형 <->String(문자열)
		
		String str1 ="10"; //int형으로 
		String str2 ="20.5"; // double형으로
		
		System.out.println("str1+str2 : "+(str1+str2));
		
		//1.String 형을 기본자료형으로 : 파싱한다 
		//[표현법] 해당Wrapper클래스이름.parseXXX(변환할문자열);
		int i=Integer.parseInt(str1);  //"10" -> 10
		double d =Double.parseDouble(str2); //"20.5" -> 20.5
		
		System.out.println("정말 숫자로 변했나요? i+d : "+(i+d));
		
		//2.기본자료형을 String형으로
		//->String.valuOf(변환할기본자료형값) : 반환형 String
		String strI = String.valueOf(i); //10 -> "10"
		String strD = String.valueOf(d); //20.5 -> "20.5"
		
		System.out.println("strI+strD : 정말 문자열이 되었는가 "+(strI+strD));
		
	}

}
