package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class run {

	public static void main(String[] args) {

		Car c = new Car("��罺",6.6,"suv",4);
		Ship s = new Ship("�������",3,"�",1);
		Airplane a = new Airplane("�ƽþƳ�",2,"������",8,4);
		
		System.out.println(c.info());
		System.out.println(s.info());
		System.out.println(a.info());
		
		System.out.println(c.toString());
		System.out.println(s.toString());
		System.out.println(a.toString());
		
		/*
		 * toString()�޼ҵ� - �ش� ��ü�� ������ ���ڿ��� ��ȯ�ϴ� objectŬ������ �޼ҵ�
		 * �ڵ��ϼ� �������̵����� �������ϸ� �ּҰ��� �ƴ� ��ü �ȿ� �ִ� �ʵ尪�� ��ȯ���ش�.
		 * print���� ��ü���� (�ν��Ͻ�����)�� �Է������� ���Դ� �ּҴ� toString �޼ҵ尡 �����Ǿ� �ִ���,
		 * �׷��� toString �޼ҵ带 �������ϸ� ��ü������ �Է��ص� �������� toString �޼ҵ��� ������ ��µȴ�.
		 * 
		 * */
		
		System.out.println(c);
		
	}
	

}
