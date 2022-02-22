package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {

	/*
	 * switch문
	 * 
	 * [표현식]
	 * 
	 * switch(아래에 기술할 값들과 동등 비교를 할 대상자){
	 * 
	 * case 값1 : 실행 할 코드1; //대상자 ==값1 과 동등 할 때 즉 true일 때 실행 할 코드
	 * break; // switch 영역을 빠져나간다.
	 * 
	 * case 값2 : 실행 할 코드2; // 대상자 == 값2와 동등할 때 즉 true 일 때 실행 할 코드
	 * break;
	 * 
	 * case 값 n : 실행할 코드n ; //대상자 == 값n과 동등할 때 즉 true일 때 실행 할 코드
	 * 
	 * default : 실행할 코드; // if-else 문에서 else의 역할과 동일하게 작동되는 기본 실행 부분
	 * 						(case1~N까지 대상자와 일치하지 않는 경우 실행한다. break 적지 않음)
	 * }
	 * 
	 * switch문과 if문의 차이점
	 * if(조건식) => 조건식을 복잡하게 기술 가능, 값을 범위를 설정 가능
	 * switch => 조건식 X , 확실한 값만 기술 가능.(동등비교만 수행할 수 있습니다.)
	 * 
	 * */
	public void method1() {
		//홀수 짝수 판별(양수 음수는 판단하지 않겠다)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오. : ");
		
		int num = sc.nextInt();
		
		int isNum = num%2;
		
		switch(isNum) {
		
		case 0 : System.out.println("짝수입니다.");
		break;
		
		case 1 : System.out.println("홀수입니다.");
		break;
		
		// 0일 경우는 짝수로 판단이 되기 때문에 default를 사용할 수 없습니다.
		//0일경우를 생각하면 switch문을 사용하는게 적절하지 않다.
		}
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요. : ");
		
		
		String personId = sc.nextLine();
		
		char gender =personId.charAt(7);
		
		switch (gender) {
		
		case '1' : case '3' : System.out.println("남자입니다.");
		break;
		case '2' : case '4' : System.out.println("여자입니다.");
		break;
		default : System.out.println("잘못된 주민번호입니다.");
		}
	}
	public void method3() {
		//사용자에게 구매할 과일의 이름을 입력받아 각 과일의 가격을 출력할 것.
		
		// 사과 1000원 오렌지 2000원 망고 5000원
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구매할 과일을 입력하세요(사과, 오렌지, 망고)");
		
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		
		case "사과" : price =1000;
					System.out.println("사과의 가격은 "+price+"원 입니다.");
		break;
		
		case "오렌지" : price = 2000;
					System.out.println("오렌지의 가격은"+price+"원 입니다.");
		break;
		
		default : System.out.println("판매하고 있는 과일이 아닙니다.");
		}
		
		System.out.printf("%s의 가격은 %d원 입니다", fruit,price);

	}
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 : ");
		int ko = sc.nextInt();
		System.out.println("수학점수 : ");
		int math = sc.nextInt();
		System.out.println("영어점수 : ");
		int en = sc.nextInt();
		
		int result = ko+math+en;
		double avg = result/3;
		
		if((ko>40) && (math>40) && (en>40) &&(avg>60)) {
						System.out.println("국어점수 : "+ko+"\n수학점수 : "+math+"\n영어점수 : "+en+"\n합계 :" + result+"\n평균 :" +avg+"\n축하합니다. 합격입니다.");
					}
	
		else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하시오");
		int month = sc.nextInt();
		String season = "";
		
		switch (month) {
		case 1 : case 2 : case 12:
			System.out.println(season="겨울");
		break;
		case 4 : case 5 : case 3:
			System.out.println(season="봄");
		break;
		case 6 : case 7 : case 8:
			System.out.println(season="여름");
		break;
		case 9 : case 10 : case 11:
			System.out.println(season="가을");
		break;
		default :{
			System.out.println("해당값이 없습니다.");
		
		}
	}
	}
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		String userId = sc.nextLine();
		System.out.println("아이디를 입력하세요 : ");
		String userpw = sc.nextLine();
		
		
	}
}