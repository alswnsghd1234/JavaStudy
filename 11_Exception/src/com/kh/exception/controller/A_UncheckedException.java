package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	
	/*
	 * RuntimeException
	 * 프로그램 실행시 발생되는 예외
	 * 
	 * RuntimeException의 자식 클래스들
	 * -ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근할때 발생하는 예외
	 * -ClassCastException : 허용할 수 없는 형변환이 진행될 경우 발생하는 예외
	 * -NullPointerException : 참조하는곳이 없을경우 null임에도 접근하려고 할때 발생하는 예외
	 * -ArithmeticException : 0으로 나누려고 할때 발생하는 예외
	 * 
	 * 이러한 RuntimeException과 관련된 예외는 충분히 예측 가능한 상황이기 때문에
	 * 예외 자체가 발생이 안되게 조건문으로도 처리 가능
	 * 굳이 예외처리까진 필요없음
	 * 
	 * */
	
	//ArithmeticException 
	public void method1() {
		
		//사용자에게 두개의 정수값을 입력받아 나눗셈 결과 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		//방법 1. 조건문으로 처리(애초에 예외가 발생하지 않게 처리)
		
//		if(num2!=0) {
//			System.out.println("나눗셈 결과 : "+(num1/num2)); 
//		}else {
//			System.out.println("0으로는 나눌 수 없습니다.");
//		}
//		System.out.println("프로그램 종료");
		
		
		//방법 2. 예외 처리 구문을 사용해서 해결해보자
				//예외가 발생했을 경우에 실행할 내용을 정의하기.
				/* try ~ catch구문 
				 * [표현법]
				 * 
				 * try{
				 *   
				 *   예외가 발생할것 같은 구문 
				 * 
				 * }catch(발생할 예외클래스명 클래스변수명){
				 *  //해당 예외가 발생했을때 실행할 구문.
				 * 	
				 * }
				 * */
				
				try {
					System.out.println("나눗셈 결과 : "+(num1/num2));
					//ArithmeticException이 발생하면?
				}catch(ArithmeticException e) {
					System.out.println("0으로 나눌 수 없습니다.");
					e.printStackTrace();//예외가 어디에서 발생했는지 파악할 수있게 메세지를 남긴다.
					//현재 오류가 어디서 발생했는지,경로도 다 알려준다.
					//개발단계에서만 사용해야함 why? 사용자에게 보여주면 놀람(문제가 생겼다는걸 알게되기 때문)
				}
				
				System.out.println("프로그램 종료");
				
	}
	
	//다중 catch블록
	public void method2() {
		
		/*
		 * 다중 catch 블록
		 * catch할 예외가 여러개일 경우 사용
		 * 예외 나열 순서 : 범위가 작은 자식타입의 예외클래스부터 나열
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력(0제외) : ");
		
		try {
		int num = sc.nextInt(); //num에 정수형이 아닌 타입이 들어오면 InputMismatchException발생
		
		System.out.println("나눗셈 결과 : "+(20/num)); //num이 0이면 ArithmeticException발생
		}
		catch(InputMismatchException e) {
			System.out.println("정수로 입력해주세요!!!!!제발!!");
		}catch(ArithmeticException e ) {
			System.out.println("0으로는 나눌 수 없어요...");
		}
		
		System.out.println("프로그램 종료");
		
	}
	

	}
	
	
	
	
	

}
