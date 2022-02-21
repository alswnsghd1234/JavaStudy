package com.kh.variable;

public class D_printf {
	

	/*
	 * System.out.printf(출력하고자 하는 형식, 출력하고자 하는 값)
	 * => f 는 format (형식)
	 * 
	 *  %d : 정수
	 *  %f : 실수
	 *  %c : 문자
	 *  %s : 문자열
	 *  
	 *  */
	
	//정수 테스트
public void printfTest() {
	int iNum1 = 10;
	int iNum2 = 20;
	
	//iNum1 : xx, iNum2 : xx 출력
	
	System.out.println("iNum : "+iNum1+" , iNum2 : "+ iNum2);
	
	// printf 사용
	
	System.out.printf("iNum1 : %d, iNum2 : %d \n",iNum1,iNum2);
	
	// 10 + 20 = 30을 출력해보자
	
	// 1.println 사용
	// 2.printf 사용
	
	int jNum1 = 10;
	int jNum2 = 20;
	
	System.out.println("jNum1 : "+jNum1+" , jNum1: "+jNum1);
	System.out.printf("jNum1 : %d, jNum2 : %d \n",jNum1,jNum2);
	
	double dNum = 4.1234514;
	System.out.printf("dNum : %f \n", dNum);
	
	System.out.printf("dNum : %.1f \n", dNum);
	//%.1f : 소수점 아래 2번째 자ㅣ에서 반올림되어 소수점 1번째 자리까지 출력
	// .x로 자리수 제어가능
	
	//printf : 포맷 단 한번 제시로 간편하게 출력 가능.
	//단, 지정된 포맷의 개수와 종류, 뒤에 오는 변수의 개수
	
	

}
}
