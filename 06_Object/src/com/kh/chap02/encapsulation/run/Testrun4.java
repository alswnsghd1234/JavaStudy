package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Testclass4;

public class Testrun4 {

	public static void main(String[] args) {

		Testclass4 tong = new Testclass4("≈Î≈∞",80,85,82);
		tong.method1();
		tong.method2();
		tong.method3();
		
		Testclass4 sudori = new Testclass4("Ω∏µπ¿Ã",55,90,85);
		sudori.method1();
		sudori.method2();
		sudori.method3();
		
		Testclass4 pica = new Testclass4("««ƒ´√Ú",77,65,23);
		pica.method1();
		pica.method2();
		pica.method3();
		
		Testclass4 test = new Testclass4(77);
		test.method1();
		test.method2();
		test.method3();
		
		Testclass4 test1 = new Testclass4();
		test1.method1();
		test1.method2();
		test1.method3();
	}

}
