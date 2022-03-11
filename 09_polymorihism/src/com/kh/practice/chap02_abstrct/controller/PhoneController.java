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
		 *�θ� ���������� �ڽ� ��ü�� ���� ���
		 *- �θ� ���� �������� �̿��ؼ��� �ڽ� ��ü���� ������ ����� ���� �Ұ�
		 *- �ٿ�ĳ�������� ���� 
		 * 
		 * */
		
//		((GalaxyNote9)ph[0]).printlnInformation();
//		((SmartPhone)ph[1]).printlnInformation();
		
		for(int i=0;i<ph.length;i++) {
			
			if(ph[i] instanceof GalaxyNote9 ) {
				result[i] = ((GalaxyNote9)ph[i]).printlnInformation();//��Ʈ9�� inform ���
			}else if(ph[i] instanceof V40 ) { //i���� �ε����� V40�̸�
				result[i] = ((V40)ph[i]).printlnInformation();
			}
			
		}
		
		return result;
	}
	
}
