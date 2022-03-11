package com.kh.practice.chap02_abstrct.controller.run;

import com.kh.practice.chap02_abstrct.controller.PhoneController;

public class Run {

	public static void main(String[] args) {

		PhoneController pc =new PhoneController();
		
		String[] sArr = pc.method();
		
		for(int i=0;i<sArr.length;i++) {
			System.out.println(sArr[i]);
			System.out.println();
		}
	}

}
