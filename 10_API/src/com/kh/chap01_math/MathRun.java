package com.kh.chap01_math;

import java.util.Random;

import com.kh.chap02_string.controller.B_StringMethod;

public class MathRun {

	public static void main(String[] args) {

		/*
		 * MathŬ���� (���а� ���õ� ��ɵ�)
		 * - ��� �ʵ�� �޼ҵ尡 �� static ���� �Ǿ��ִ�.
		 * - ���� ������ �ʿ䰡 �����Ƿ� �����ڰ� private
		 * - java.lang �̶�� ��Ű�� �ȿ� ����.
		 * 
		 * */
		
		//����
//		System.out.println("���� :"+Math.PI);
//
//		//�޼ҵ�
//		//�޼ҵ��(�Ű�����Ÿ��) : ��ȯ��
//		
//		//1.�ø� -> Math.ceil(double) : ��ȯ�� - double
//		
//		double num1 = 4.3889;
//		System.out.println("�ø� :"+Math.ceil(num1));
//		System.out.println("���� :"+Math.floor(num1));
//		System.out.println("���밪 :"+Math.abs(num1));
//		System.out.println("�ּҰ� :"+Math.min(num1 , 4));
//		System.out.println("������ :"+Math.sqrt(num1));
//		System.out.println("���� :"+Math.pow(3,10));
		
//		System.out.println((Math.random()));
//		
//		Random r = new Random();
//		
//		System.out.println(r.hashCode());
		
		B_StringMethod b = new B_StringMethod();
		
		b.method();
	}

}
