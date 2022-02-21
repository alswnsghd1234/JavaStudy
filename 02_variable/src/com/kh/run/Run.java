package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.*;

public class Run {

	public static void main(String[] args) {
		
		A_Variable ab = new A_Variable();
//		ab.calPay();
//		declareVariable();
//		ab.contant();
		
		C_Cast c = new C_Cast();
//		c.autoCasting();
//		c.forceCastion();
		
		D_printf f = new D_printf();
		f.printfTest();
		
		
	}
	// 변수의 선언
	
	public void declareVariable() {
		/*
		 변수의 선언
		 > 값을 넣을 변수를 위한 메모리 공간을 확보하겠다.
		 [표현법] 자료형 변수이름;
		 
		 자료형 : 변수의 타입을 나타내는 부분(크기 또는 종류)
		 변수 이름 : 변수의 이름을 정하는 부분(어떻게 부를건지)
		 
		 변수를 선언 할 때 주의할 점
		 변수이름 항상 소문자로 시작한다.단 카멜표기법은 지킨다.
		 같은 영역안에 {} 안에서 동일한 변수명은 존재 할 수 없다.
		 해당 영역에 선언된 변수는 해당 영역에서만 사용이 가능하다.
		 -> 다른 메소드에서는 사용 불가 => 지역변수 개념
		 
		 */
//		1. 논리형 자료형(논리값 : true / false)
		boolean isTrue; // 1byte
		boolean isFalse;
		
		isTrue = true;
		isFalse = false;
		
		isTrue = 3+3 <9;

//		2. 숫자형 자료형
//		숫자 자료형 같은 경우엔 사이즈에 따라서 저장할 수 있는 수의 범위가 다르다.
		byte bNum; 
		short sNum;
		int iNum;
		long lNum;
		
		bNum =1;
		sNum=2;
		iNum=4;
		lNum=8L;
		
//		3. 실수형
		float fNum = 4.0f;
		double dNum = 8.123456789101112131415; // 소수점 15번째 자리까지 표현 가능(나머진 짤린다)
		
		//문자형
		
		char ch; // 2byte
		ch='a'; //문자 하나는 반드시 홑따음표 안에 넣어야한다.
		ch=65; //변수에는 한가지 값만 들어갈 수 있어서 다른 값을 넣으면 덮어쓰기 된다.(기존값 삭제)
		
		//문자열
		
		String str;
		str = "abc"; // 문자열은 반드시 ""(쌍따음표) 안에 넣어야 한다.
		
		System.out.println(isTrue);
		System.out.println(isFalse);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		
		
		
	}
	
}
