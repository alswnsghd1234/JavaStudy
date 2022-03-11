package com.kh.abstract1.PhoneRun;

import com.kh.abstract1.model.vo.Galaxy;
import com.kh.abstract1.model.vo.Iphone;

public class Phonerun {

	public static void main(String[] args) {

		Iphone ip13 = new Iphone();
		Galaxy s22 = new Galaxy();
		
		ip13.call();
		ip13.sms();
		ip13.camera();
		
		s22.call();
		s22.sms();
		s22.camera();
	}

}
