package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Testclass222;

public class Testrun222 {

	public static void main(String[] args) {

		Testclass222 man1 = new Testclass222();
		
		man1.setName("�Ƿη�");
		man1.setJob("����");
		man1.setLevel(50);
		man1.setMoney(50000);
		man1.showInfo();
		
		Testclass222 man2 = new Testclass222();
		
		man2.setName("������");
		man2.setJob("������ ");
		man2.setLevel(45);
		man2.setMoney(65000);
		man2.showInfo();
		
		Testclass222 man3 = new Testclass222();
		
		man3.setName("������");
		man3.setJob("���� ");
		man3.setLevel(53);
		man3.setMoney(70000);
		man3.showInfo();
	}

}
