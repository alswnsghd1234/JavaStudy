package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		
		/*
		 * Date Ŭ����
		 * ��¥�� �ð��� ���� ������ ���� �� �ִ� Ŭ����
		 * java.util ��Ű�� �ȿ� ����
		 * ->�ڹ� ���� ����⿡ ���ϰ� ������� Ŭ���� �ϼ����� ����
		 * ->jdk �������Ǹ鼭 ���� �޼ҵ���� deprecate �ƴ� (�������� ����)
		 * (�߿䵵�� �������ϱ� ���̻� ������ �ʰ� ������ ������Ե� �޼ҵ�� ��� �����) 
		 *  
		 * */
		//�⺻ �����ڸ� �̿��ؼ� Date ��ü�� ����->���� ��¥ �� �ð�
		Date today = new Date();
		
		System.out.println("�⺻������ : "+today);
		
		//���� ���ϴ� ��¥(2022�� 07�� 29��)
		//���1. �Ű����� �����ڸ� ���� ����
		
		Date date1 = new Date(2022,7,29,18,20,00); //deprecated �������� ����
		
		System.out.println("�Ű����� ������ date1 : "+date1);
		
		Date date2 = new Date(2022-1900,7-1,29,18,20,00);
		
		System.out.println("�Ű����� ������ ���� �ľ� date2 :"+date2);
		
		//���2. �� ����� ������ �����ؼ� ����ϱ�
		//SimpleDateFormat Ŭ���� ���
		//java.text ��Ű��
		
		
		//2022�� 07�� 29�� 18�� 20��
		
		//1. ������ �����ϸ鼭 SimpleDateFormat ��ü ����
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		
		String gradu=sdf.format(date2);
		
		System.out.println(gradu);
		
	}

}
