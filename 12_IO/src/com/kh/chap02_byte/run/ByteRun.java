package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.duo.FileByteDao;

public class ByteRun {

	public static void main(String[] args) {

		/*
		 * 
		 * 프로그램 상의 데이터를 외부매체(모니터,스피커,파일) 등으로 출력하거나
		 * 입력장치 (키보드,마우스,마이크,"파일")로 입력받는 과정
		 * 
		 * ->IO (Input & Output) 입출력
		 * 
		 * IO 를 진행하려면 
		 * 외부매체와 연결 할 수 있는 통로를 먼저 생성해야 한다.
		 * -> Stream "스트림" 이라고 한다.
		 * 
		 * 스트림의 특징
		 * - 단방향 : 입력이면 입력, 출력이면 출력, 각 스트림이 달라서 동시에 입출력이 하고 싶다면
		 * 			입력 스트림과 출력 스트림 따로 만들어줘야 한다.
		 * - 스트림은 FIFO의 형식이다. Fist In First Out 먼저 들어간게 먼저 나온다(선입선출)
		 * 
		 * 스트림의 구분
		 * - 통로의 사이즈
		 * 	바이트 스트림 : 1btye 짜리가 이동 할 수 있는 통로(입력 : xxInputStream / 출력 : xxxOutputStream
		 *  문자 스트림 : 2btye가 이동 할 수 있는 통로(입력:xxxReader / 출력 : xxxWriter)
		 *  
		 *  - 외부 매체와의 직접적인 연결 여부
		 *  
		 *  기반 스트림 : 외부 매체와 직접적으로 연결되는 통로
		 *  보조 스트림 : 기반 스트림만으로 부족한 성능을 향상시켜주는 용도의 스트림
		 *  		- 단독 사용불가( 기반 스트림을 먼저 만들고 나서 추가하는 형식)
		 *  		- 속도향상, 자료형에 맞춰서 변환, 객체단위로 입출력을 할 수 있도록 보조해준다./
		 *  
		 * 
		 * 
		 * */
		FileByteDao f = new FileByteDao();
		f.method1();
		
	}

}
