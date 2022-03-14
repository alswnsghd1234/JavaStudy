package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	//String 클래스 -> 불변클래스 (변하지 않는 클래스)
	//수정하는 순간 기존의 값이 담겨있던 공간에서 수정되지 않고 새로운 공간에 추가된 값이 들어감
	
	/* String 클래스 사용법
	 * 1)대입연산자로 값 넣기
	 * 2)new String("") 생성자 호출
	 * */
	
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		
		//toString() 메소드
		//String 클래스에선 실제 담겨있는 문자열을 반환하도록 재정의 되어있음
		System.out.println(str1/*.toString()*/);
		System.out.println(str2);
		
		//equals()메소드
		System.out.println(str1.equals(str2));
		//주소값 비교가 아닌 문자열 비교를 하는 기능(Object클래스의 equals를 상속받아 오버라이딩했기때문)
		//Object의 equals는 주소값 비교
		
		//hashCode() 메소드
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//string 클래스에서 hashcode는 주소값 기반이 아닌 문자열 기반으로 해시코드값을 만들어 반환
		//오버라이딩 되어있음.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//실제 주소값의 해시코드를 반환
		
		System.out.println(str1==str2);
	}
	
	//2.문자열을 리터럴로 생성
	public void method2() {
		
		String str1="hello";
		String str2="hello";
		
		//toString메소드
		
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		
		//equals 메소드
		System.out.println(str1.equals(str2));
		
		//hashCode 메소드
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		//System.identityHashCode()메소드 
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	//불변클래스와 String Pool
	
	public void method3() {
		
		String str ="hello";
		//리터럴값을 대입하면 String pool(상수풀) 영역에 올라감
		//String pool에는 중복 문자열이 존재할 수 없기 때문에 이미 들어있는 문자열을 참조한다.
		
		System.out.println(System.identityHashCode(str)); //1829164700
		
		str=str+" world";
		
		System.out.println(System.identityHashCode(str)); //2018699554
		
		//불변클래스이기 때문에 해당위치에서 변경되는게 아니라 새로운 영역에서 변경된 값이 들어가게 된다.
	}
	
	public void method4() {
		
		//문자열을 여러번 더하면 어떻게 될까
		
		String str="hello";
		//만번 더하기
		
		//시간 측정하기 
		long start = System.currentTimeMillis(); //1970년 1월 1일 부터 지금까지 얼마나 흘렀는지 0.001초단위 
		for(int i=0; i<100000;i++) { //6만번 4161  1만번 = 181  10만번 =11415
			
			str+="hello";
			System.out.println(System.identityHashCode(str));
			System.out.println();
		}
		
		long finish = System.currentTimeMillis();
		
		System.out.println("시작시간 : "+start);
		
		System.out.println("종료시간 : "+finish);
		
		System.out.println(finish-start); //우리가 알고싶은건 작업이 얼마나 걸렸는지이니까 작업 끝나는시점 - 작업시작전 하면 
										  //작업시간을 알수있다.
	}
	
	public void method5() {
		//문자열의 단점
		//불변클래스이기떄문에 합성이 느리다(새 메모리영역을 할당받는 작업이 이루어지기 때문에)
		//그래서 가변형클래스를 사용한다
		//StringBuffer/StringBuilder
		//차이점 
		//StringBuffer는 순서가 있어서 조금 느리지만(안전하다)
		//StringBuilder는 순서가 없어서 빠르지만 안전하지 않다.
		
		
		StringBuilder sb = new StringBuilder();
//		StringBuffer sb = new StringBuffer(); 
		
		long start = System.currentTimeMillis(); //시작 시각
		for(int i=0; i<1000000; i++) {
			
			sb.append("hello");
			
			System.out.println(System.identityHashCode(sb));
		}
		long finish = System.currentTimeMillis(); //종료 시각
		
		System.out.println("작업하는데 걸린 시간 : "+(finish-start));
	}
}
