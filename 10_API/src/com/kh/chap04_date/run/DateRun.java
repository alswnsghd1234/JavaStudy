package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		
		/*
		 * Date 클래스
		 * 날짜와 시간에 대한 정보를 담을 수 있는 클래스
		 * java.util 패키지 안에 존재
		 * ->자바 개발 초장기에 급하게 만들어진 클래스 완성도가 낮다
		 * ->jdk 버전업되면서 많은 메소드들이 deprecate 됐다 (권장하지 않음)
		 * (중요도가 떨어지니까 더이상 사용되지 않고 앞으로 사라지게될 메소드다 라고 변경됨) 
		 *  
		 * */
		//기본 생성자를 이용해서 Date 객체를 생성->현재 날짜 및 시간
		Date today = new Date();
		
		System.out.println("기본생성자 : "+today);
		
		//내가 원하는 날짜(2022년 07월 29일)
		//방법1. 매개변수 생성자를 통해 변경
		
		Date date1 = new Date(2022,7,29,18,20,00); //deprecated 권장하지 않음
		
		System.out.println("매개변수 생성자 date1 : "+date1);
		
		Date date2 = new Date(2022-1900,7-1,29,18,20,00);
		
		System.out.println("매개변수 생성자 문제 파악 date2 :"+date2);
		
		//방법2. 내 맘대로 포멧을 지정해서 사용하기
		//SimpleDateFormat 클래스 사용
		//java.text 패키지
		
		
		//2022년 07월 29일 18시 20분
		
		//1. 형식을 지정하면서 SimpleDateFormat 객체 생성
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String gradu=sdf.format(date2);
		
		System.out.println(gradu);
		
	}

}
