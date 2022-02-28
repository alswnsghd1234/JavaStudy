package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		/*
		 * �߻�ȭ -> ĸ��ȭ
		 * 
		 * ĸ��ȭ ������ ���ؼ� �Ϻ��� Ŭ������ ���¸� ���߰� ����.
		 * 
		 * ĸ��ȭ�� ���� ������ �ܺηκ��� ���� ������ �����ϱ� ������
		 * �Ժη� ���� �����ǰų� ��ȸ�� �ϴ°��� ���� ���ϴ� ������ �����.
		 * 
		 * -> ĸ��ȭ �۾� : �������� ��� �� �ϳ��� �������� ���������� ��Ģ���� �Ͽ� �ܺηκ���
		 * 				���� ������ ���°�. ��, ������ �� �� ������ �Ƴ��� ������ ���� ������ �������
		 * 				���� ������ �޼ҵ��
		 * 
		 * ĸ��ȭ �۾� 1�ܰ� : ���� �����. 2�ܰ� ���� ���������� �����ϴ� �޼ҵ� ����.
		 * 1) ���� ������� ��� = �Ӽ��տ� �ٴ� ���������ڸ� public���� private�� �����Ѵ�. (���� ���ٰ���)
		 * 2)���������� ���� �� �� �ִ� �޼ҵ���� �������ش�. setter/getter
		 * setter �޼ҵ� = �Ӽ��� ���� ����(����)���ִ� �޼ҵ�
		 * getter �޼ҵ� = �Ӽ��� ��� ���� �������� (��ȸ) �޼ҵ�
		 * -> ��������( �޼ҵ�ο� �ۼ�,��� �ʵ� ������ ����������, ����Ģ = ��Ÿ�� ǥ��� ex) setName
		 * 
		 * */
		
		Student Kim = new Student();
		Kim.ane = 20;
		
		System.out.println(Kim.ane);
		
		Kim.setName("����ȫ");
		Kim.setAge(29);
		Kim.setGender('M');
		System.out.println(Kim.getName());
		System.out.println(Kim.getAge());
		System.out.println(Kim.getGender());
		System.out.println(Kim.getClass());
		System.out.println(Kim.information());
		
		Student a = new Student();
		a.setName("����");
		a.setAge(32);
		a.setGender('F');
		System.out.println(a.information());
		
		Student b = new Student();
		b.setName("��");
		b.setAge(23);
		b.setGender('M');
		System.out.println(b.information());
		
		
	
	}

}
