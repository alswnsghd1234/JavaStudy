package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {

		SmartPhone s = new SmartPhone("����","p-22","������",134999,"SKT");
		
//		Desktop d = new Desktop("�Ｚ","p-99","��Ʈ����̹�",350000,true);
		
		Tv t = new Tv("LG","slim","85��ġ ������Ƽ��",600000,85);
		
		System.out.println(s.info());
//		System.out.println(d.info());
		System.out.println(t.info());
		
		/*
		 * 
		 * ����� Ư¡
		 * - Ŭ���� ���� ����� ���� ����� �Ұ����ϴ�.(���� ��Ӹ� ����)
		 * - ��õǾ� ���� ������ ��� ���������� ObjectŬ������ �ļ��̴�.
		 * (��� Ŭ������ �̹� ������� Ŭ����. ���� ���Ӱ� ���� Ŭ������ ��� �����̴�,)
		 * ->Object
		 * 
		 * ����� ����
		 * ���������� ���� �ڵ���� ��
		 * 
		 * 
		 * 
		 * */
	}

}
