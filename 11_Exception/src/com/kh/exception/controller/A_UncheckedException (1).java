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
	 * RuntimeException 관련 예외
	 * 
	 * -조건문으로 해결가능 : 예외 자체가 발생 안되게 개발자가 소스코드로 핸들링 하는것 (예외처리X)
	 * -예외처리구문으로 해결가능 : 예외가 발생했을 때 어떤 처리할것인지 정의해두는것
	 * 
	 * -예측 가능한 상황 : 조건문으로 해결(더 권장) 
	 * -예측이 불가능한 상황 : 예외처리구문으로 해결
	 * 
	 * RuntimeException 계열은 조건문으로 처리할 수 있다면 그 방식을 더 권장한다.
	 * ->예외처리가 필수가 아님 "UncheckedException" 
	 * 
	 * 다중 catch블럭
	 * -작은 범위에서 큰 범위로 catch해야 하는 이유는 
	 * -위에서 부모클래스의 exception으로 다 처리해버리면 아래있는 자식 클래스타입엔 기회가 없기 때문 
	 * -세세하게 오류에 대한 처리를 하고 싶다면 위에서부터 작은 범위로 작성 
	 * -한개의 catch구문을 실행하면 나머지는 뛰어넘고 try catch구문을 빠져나오게 된다.
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
		catch(ArithmeticException e ) {
			System.out.println("0으로는 나눌 수 없어요...");
//			e.printStackTrace();
			}
		catch(InputMismatchException e) {
			System.out.println("정수로 입력해주세요!!!!!제발!!");
//			e.printStackTrace(); 오류 추적
		
		System.out.println("프로그램 종료");
		
		}
	}
	
	public void method3() {
		
		//배열활용
		//ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
		//NegativeArraySizeException : 배열의 크기를 음수로 지정했을때 발생하는 예외
		
		//사용자로부터 배열의 크기를 입력받고 배열 만들기
		//100번 인덱스의 값을 출력하기.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력해주세요 (음수X) : ");
		
		int size = 0;
		
		try {
		size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println(arr[100]);
		}
		catch(RuntimeException e) { //다형성이 적용되어서 위에서 다 잡아버리기 때문에 아래에 자식클래스들에겐 기회가 없음.
			System.out.println("실행할때 오류남");
			
			//만약 한번에 예외처리 후에 타입검사를 하고 싶다면 instanceof 연산자를 사용하면 된다.
//			if(e instanceof InputMismatchException) {
//				System.out.println("InputMismatchException에 해당하는 구문");
//			}else if(e instanceof NegativeArraySizeException) {
//				System.out.println("NegativeArraySizeException에 해당하는 구문");
//			}
		}
//		catch(InputMismatchException e) {
//			System.out.println("정수로 입력해주세요 윤정수아님 ;;");
//		}
//		catch(NegativeArraySizeException e) {
//			System.out.println("배열의 크기는 음수가 될 수 없습니다; ");
////			e.printStackTrace();
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열의 크기를 벗어났습니다."+(size-1)+"인덱스까지 접근해주세요");
//		}
		
		System.out.println("프로그램종료");
		
	}
	
	
	//본인이 아는 exception을 try catch문으로 잡아보기.
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
	
		int arr =0;
		try {
			arr = sc.nextInt();
			int num = sc.nextInt();
			int num2 = sc.nextInt();
			
			
			
			int[] a = new int[arr];
			
			a[0] = num/num2;
		}
		catch(InputMismatchException e){
			System.out.println("정수로 입력해주세요 윤정수아님 ;;");
		}
		catch(NegativeArraySizeException e ) {
			System.out.println("배열의 크기는 음수가 될 수 없습니다; ");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			
			System.out.println("배열의 크기를 벗어났습니다."+(arr-1)+"인덱스까지 접근해주세요");
		}
		
		
	}
	
	
	
	
	
	
}
