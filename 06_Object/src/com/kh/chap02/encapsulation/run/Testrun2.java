package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Testclass;

public class Testrun2 {

	public static void main(String[] args) {

		Testclass t = new Testclass("�迬��","�ǰܽ�������",3,2,1);
		t.getName();
		Testclass s = new Testclass("�迬��","�ǰܽ�������",3,2,1);
		Testclass m = new Testclass("�迬��","�ǰܽ�������",3,2,1);
		
		t.showInfo();
		s.showInfo();
		m.showInfo();
	}

}
