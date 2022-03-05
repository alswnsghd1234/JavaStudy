package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.tvo.Galaxy;
import com.kh.chap01_beforeVSafter.after.tvo.Iphone;
import com.kh.chap01_beforeVSafter.after.tvo.Myphone;

public class Testrun {

	public static void main(String[] args) {

		Iphone ip23 = new Iphone();
		Galaxy s22 = new Galaxy();
		Myphone my = new Myphone();
		
		System.out.println("--아이폰--");
		ip23.call();
		ip23.sms();
		ip23.camera();
		ip23.iCloud();
		
		System.out.println("--갤럭시--");
		
		s22.call();
		s22.sms();
		s22.camera();
		s22.samsumPay();
		
		System.out.println("--마이폰--");
		
		my.application();
	}

}
