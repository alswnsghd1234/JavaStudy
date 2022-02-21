package com.kh.variable;

public class A_Variable {
	
	//변수의 필요성
	// 시급과 근무시간, 근무일수 곱해서 월급을 계산하는 메소드를 만들어 봅시다.
	
	public void calPay() {
		System.out.println("----변수 사용 전----");
		
		System.out.println("시급 : 8980원");
		System.out.println("근무시간 : 6시간");
		System.out.println("근무일수 : 8일");
		
		//월급 = 시급 X 근무시간 X 근무일수
		//이름 :00000원 이런 형태로 출력되기를 원한다.
		//문자를 더할땐 +를 사용한다.
		//숫자와 문자를 같이 더하면 숫자를 문자로 인식한다.
		//그렇기 때문에 숫자연산을 원하는 경우에는 소괄호()를 이용해서 먼저 연산후에 문자열과 더해준다.
		
		System.out.println("아이유: "+(8980*6*8)+"원");
		System.out.println("아이: "+(8980*6*8)+"원");
		System.out.println("아: "+(8980*6*8)+"원");
		
		System.out.println("----변수 사용 후----");
		
		int pay = 8980; //시급
		int time = 6; //시간
		int day = 8; //근무일 수
		
		int total = (pay*time*day);
		
		System.out.println("아이유: "+(total)+"원");
		System.out.println("아이: "+(total)+"원");
		System.out.println("아: "+(total)+"원");
		
		
		// = : 자바에서는 대입, 즉 오른쪽 데이터를 왼쪽에 넣는다.
		
		/*
		 변수를 사용하는 이유
		 1. 변수는 우선적으로 값에 의미를 부여하기 위해 사용 => 가독성 높여줌
		 2. 단 한번 값을 기록하고 필요할 때마다 사용 가능 => 재사용성이 높아짐
		 3. 가독성 + 재사용성 =>유지보수를 쉽게 할 수 있다.
		 */
	}
	
	public void contant() {
		
		//표현법 : final 자료형 상수이름;
		
		//변수 이용시 
		int age = 20;
		System.out.println("age는 "+ age);
		
		age = 21;
		System.out.println("age는"+ age);
		
	}
	
	
}
