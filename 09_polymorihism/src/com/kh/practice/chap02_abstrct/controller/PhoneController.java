package com.kh.practice.chap02_abstrct.controller;

import com.kh.practice.chap02_abstrct.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstrct.model.vo.Phone;
import com.kh.practice.chap02_abstrct.model.vo.SmartPhone;
import com.kh.practice.chap02_abstrct.model.vo.V40;

public class PhoneController {

	private String[] result = new String[2];
	
	public String[] method() {
		
		Phone[] ph = new Phone[2];
		
		ph[0] = new GalaxyNote9();
		ph[1] = new V40();
		
		/*
		 *부모 참조변수에 자식 객체를 담은 경우
		 *- 부모 참조 변수만을 이용해서는 자식 객체에서 생성된 멤버에 접근 불가
		 *- 다운캐스팅으로 접근 
		 * 
		 * */
		
//		((GalaxyNote9)ph[0]).printlnInformation();
//		((SmartPhone)ph[1]).printlnInformation();
		
		for(int i=0;i<ph.length;i++) {
			
			if(ph[i] instanceof GalaxyNote9 ) {
				result[i] = ((GalaxyNote9)ph[i]).printlnInformation();//노트9의 inform 출력
			}else if(ph[i] instanceof V40 ) { //i번재 인덱스가 V40이면
				result[i] = ((V40)ph[i]).printlnInformation();
			}
			
		}
		
		return result;
	}
	
}
