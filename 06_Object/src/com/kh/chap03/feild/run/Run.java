package com.kh.chap03.feild.run;

import com.kh.chap03.feild.FieldTest1;
import com.kh.chap03.feild.FieldTest2;
import com.kh.chap03.feild.FieldTest3;

public class Run {

	public static void main(String[] args) {

//		FieldTest1 f1 = new FieldTest1();
//		
//		f1.method1(10);
//		
//		f1 = null; // f1 �ν��Ͻ� ������ �� �̻� ��ü�� �������� ���� �ʱ� ������ global ������ ���� ��ü �Ҹ�
		
		FieldTest2 f2 = new FieldTest2();
		
		//public = ��𼭵� ���ٰ���
//		System.out.println(f2.pub);
//		//protected = ���� ��Ű�� ���� ���� ���� �ٸ� ��Ű������ ��ӱ����� ����
//		System.out.println(f2.pro);
//		System.out.println(f2.df);
//		System.out.println(f2.pri);
		
		//FieldTest3
		//new FieldTest3()�� ���� ������ ��� �ִ����� �˾ƾ��ϱ� ������ FieldTest3. ���� �����´�
		//��ü ������ �ʿ���� ��? ���α׷� ���۰� ���ÿ� �޸𸮿� �Ҵ� �Ǳ� ������
		
		System.out.println(FieldTest3.str);
		
		System.out.println(FieldTest3.NUM);
		
		FieldTest3.method1();
		
		
	}

}
