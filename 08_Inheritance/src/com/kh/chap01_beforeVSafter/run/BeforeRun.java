package com.kh.chap01_beforeVSafter.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {

		Desktop d = new Desktop("�Ｚ","d-01","������ǻ��",2000000,true);
		
		Tv t = new Tv("����","t-01","����",350000,60);
		
		SmartPhone sm = new SmartPhone("����","d-01","������",250000,"SKT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(sm.information());
		/*
		 * �� Ŭ�������� �ߺ��� �ڵ���� ������ ����ϰ� �Ǹ�
		 * ������ ���� ���������� �� ��쿡 �Ź� ã�Ƽ� ������ �ؾ��ϴ� ���ŷο��� �����.
		 * 
		 * ����̶�� ������ �̿��ؼ�
		 * �� Ŭ�������� �����,�ߺ��� �ʵ�, �޼ҵ���� �ϳ��� Ŭ������ ��Ƽ� �θ� Ŭ������ ��������
		 * �� Ŭ������ ��ӹ޾� ����ϸ� �ڵ��� ���������� �����ϴ�.
		 * 
		 * 
		 * 
		 * */
		
	}
	
}
