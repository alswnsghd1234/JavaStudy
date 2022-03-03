package com.kh.chap03.feild.run;

import com.kh.chap03.feild.FieldTest1;
import com.kh.chap03.feild.FieldTest2;
import com.kh.chap03.feild.FieldTest3;

public class Run {

	public static void main(String[] args) {

//		FieldTest1 f1 = new FieldTest1();
//		
//		f1.method1(10);
//		
//		f1 = null; // f1 인스턴스 변수가 더 이상 객체를 참조하지 있지 않기 때문에 global 변수가 속한 객체 소멸
		
		FieldTest2 f2 = new FieldTest2();
		
		//public = 어디서든 접근가능
//		System.out.println(f2.pub);
//		//protected = 같은 패키지 내는 접근 가능 다른 패키지에선 상속구조일 때만
//		System.out.println(f2.pro);
//		System.out.println(f2.df);
//		System.out.println(f2.pri);
		
		//FieldTest3
		//new FieldTest3()은 하지 않지만 어디에 있는지는 알아야하기 때문에 FieldTest3. 으로 가져온다
		//객체 생성이 필요없다 왜? 프로그램 시작과 동시에 메모리에 할당 되기 때문에
		
		System.out.println(FieldTest3.str);
		
		System.out.println(FieldTest3.NUM);
		
		FieldTest3.method1();
		
		
	}

}
