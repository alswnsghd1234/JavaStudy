package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Testclass2;

public class Testrun22 {

	public static void main(String[] args) {

		Testclass2 man1 = new Testclass2();
		man1.name = "�Ƹ޸�ī��";
		man1.kindOF = "����";
		man1.price = 1800;
		man1.eventOr = 'o';
		
		Testclass2 man2 = new Testclass2();
		man2.name = "����Ǫġ�� ";
		man2.kindOF = "�Ļ�";
		man2.price = 3500;
		man2.eventOr = 'x';
		
		Testclass2 man3 = new Testclass2();
		man3.name = "�Ĵϴ�";
		man3.kindOF = "����";
		man3.price = 2800;
		man3.eventOr = 'o';
		
		Testclass2 man4 = new Testclass2();
		man4.name = "ũ��ũ����";
		man4.kindOF = "�Ļ�";
		man4.price = 3300;
		man4.eventOr = 'x';
		
		man1.showInfo();
		man2.showInfo();
		man3.showInfo();
		man4.showInfo();
	}

}
