package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;

public class Run {

	public static void main(String[] args) {
		/*
		 * 에러(오류)의 종류
		 * -시스템 에러 : 컴퓨터의 오작동으로 인해 발생하는 에러 
		 * 				->소스코드로 해결이 안됨 (심각한 에러)
		 * -컴파일 에러 : 프로그램 실행 전 소스코드상의 문법적인 문제로 발생하는 에러
		 * 				->소스코드 수정으로 해결(빨간줄로 오류)
		 * -런타임 에러 : 프로그램 실행 중 발생하는 에러
		 * 				-소스코드상의 문제가 없는데도 발생(사용자의 잘못 또는 개발자가 경우의 수 처리를 
		 * 											안 해놓는 경우)
		 * -논리 에러 : 소스코드상의 문법적인 오류도 없고 실행했을 때도 문제가 되진 않지만 
		 * 			 프로그램의 의도상 맞지 않는 것(기획과 설계가 잘못된 경우)
		 * 
		 * 예외 : 시스템 에러를 제외한 나머지 컴파일, 논리 에러와 같은 비교적 덜 심각한 에러들 
		 * 		 특히나 런타임 에러를 주로 예외로 다룸
		 * 
		 * 예외 처리 : 예외들이 발생했을 경우를 대비해서 처리하는 방법을 정의해두는 것
		 * 
		 * 예외 처리 이유 : 예외 발생시 프로그램이 비정상적으로 종료되는것을 막기 위해.
		 * 
		 * 방법
		 * 1. try ~ catch 문을 이용
		 * 2. throws 로 예외 던지기 (미루기) ->오류가 발생한 메소드에 예외를 그 메소드를 호출한 곳으로 넘긴다.
		 * 								 마지막까지 넘기면 main에서 처리해줘야함
		 * */
		
		A_UncheckedException a = new A_UncheckedException();
		
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
		
		B_CheckedException b = new B_CheckedException();
//		try {
////			b.method1();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println("처리됐나");
//					e.printStackTrace();
//		}
			try {
				b.method4();
			} catch (Exception e) {
				System.out.println("잘처리됐나");
				e.printStackTrace();
			}
	
	
	}
	
	
}
