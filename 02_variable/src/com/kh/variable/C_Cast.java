package com.kh.variable;

public class C_Cast {

	public void autoCasting() {
		
		int i1 = 10;
		double d1 = i1;
		
		System.out.println("d1 : "+ d1);
		
		int i2 =12;
		double d2 = 3.3;
		
		double result = i2 + d2;
		
		System.out.println("result"+result);
		
		// int(4btye) -> long(8byte)
		int i3 = 1000;
		long l3 = i3; //1000
		
		long l4 = 2000; //L을 붙이지 않아도 문제 발생 X => 자동 형변환
		
		// 특이케이스 long(8byte) -> float(4btye)
		// 정수가 실수로 담길 때 큰 사이즈의 정수가 작은 사이즈의 실수에 대입이 가능!
		// float가 4btye지만 표현 할 수 있는 범위가 더 넓기 때문.
		
		long l5 = 10000000;
		float f5 = l5;
		
		System.out.println("f5 : "+ f5);
		
		//특이케이스. char ->(2btye) -> int(4btye) : 문자랑 int는 양방향으로 형변환이 가능
		//참고 : 아스키코드표
		char ch = 65;
		System.out.println("ch : "+ch);
		ch = 66;
		System.out.println("ch : "+ch);
		
		System.out.println('김');
		System.out.println((int)'김');
		System.out.println((byte)1+'김'+(char)2);
		
	}
	
	public void forceCastion() {
		// 명시적 형변환이라고도 부른다.
		//(바꿀자료형)값
		
		//1.double -> float
		
		float f1 = 4.0f;
		
		double d2 = 8.0;
		
		float f2 = (float) d2;
		
		//2. double -> int
		double d3 = 13.3;
		int i3 = (int)d3;
		
		System.out.println("f2 + "+f2);
		System.out.println("f2+i3 + "+i3);
		
		int iNum = 10;
		double dNum = 15.5;
		
		System.out.println(iNum+dNum);
		
		int result = (int)(iNum+dNum);
		
		System.out.println(result);
	}
	
	
	
	
}
