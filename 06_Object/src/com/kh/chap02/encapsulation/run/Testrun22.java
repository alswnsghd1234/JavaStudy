package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Testclass2;

public class Testrun22 {

	public static void main(String[] args) {

		Testclass2 man1 = new Testclass2();
		man1.name = "아메리카노";
		man1.kindOF = "음료";
		man1.price = 1800;
		man1.eventOr = 'o';
		
		Testclass2 man2 = new Testclass2();
		man2.name = "프라푸치노 ";
		man2.kindOF = "식사";
		man2.price = 3500;
		man2.eventOr = 'x';
		
		Testclass2 man3 = new Testclass2();
		man3.name = "파니니";
		man3.kindOF = "음료";
		man3.price = 2800;
		man3.eventOr = 'o';
		
		Testclass2 man4 = new Testclass2();
		man4.name = "크로크무슈";
		man4.kindOF = "식사";
		man4.price = 3300;
		man4.eventOr = 'x';
		
		man1.showInfo();
		man2.showInfo();
		man3.showInfo();
		man4.showInfo();
	}

}
