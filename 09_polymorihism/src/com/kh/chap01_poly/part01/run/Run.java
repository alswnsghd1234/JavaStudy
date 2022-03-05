package com.kh.chap01_poly.part01.run;

import com.kh.chap01_poly.part01.model.vo.Child1;
import com.kh.chap01_poly.part01.model.vo.Child2;
import com.kh.chap01_poly.part01.model.vo.Parent;

public class Run {

	public static void main(String[] args) {

		/*
		 * ������
		 * ����� �̿��� ����� �θ�Ŭ�����κ��� ��ӹ��� �ڽ� Ŭ���� Ÿ���� ��ü��
		 * �θ� Ŭ���� Ÿ������ ����ȯ�Ͽ� �ѹ��� �ٷ� �� �ִ� ���
		 * ��ü�迭 ���� �����ϴ�.(�迭�� ���� �ڷ����������� �����̱� ������)
		 * 
		 * */
		//1. �θ� Ÿ�� ��������(reference)�� �θ� ��ü�� �ٷ�� ���
		
//		Parent p = new Parent();
//		p.printP();
//		p.printParent();
//		
//		//2. �ڽ� Ÿ�� ��������(reference)�� �ڽ� ��ü�� �ٷ�� ���
//		System.out.println("�ڽ� Ÿ�� ��������(reference)�� �ڽ� ��ü�� �ٷ�� ���");
//		Child1 c1 = new Child1();
//		c1.printp();
//		c1.printChild1();
//		c1.printParent();
//		
//		//�ڽİ�ü+�θ�ü ���ٰ��� c1���� Child1() Parent()�� �ִ°͵� ���� ���� ����
//		
//		//3. �θ� Ÿ�� ��������(reference)�� �ڽ� ��ü�� �ٷ�� ���
//		
//		Parent p2 = new Child2();
//		p2.printP();
//		p2.printParent();
//		p2.printChild1();
		
		
		/*
		 * Ŭ���� ���� ����ȯ
		 * - ��ӱ����� ���� �� ��ȯ ���� - �츰 ���� Ŭ������ Ȯ������.
		 * 
		 * 1.UpCastion : �ڵ� ����ȯ
		 * 				-�ڽ�Ÿ�� -> �θ�Ÿ��
		 * 				- ����
		 * 2.DownCasting : ���� ����ȯ
		 * 				-�θ�Ÿ��->�ڽ�Ÿ��
		 * 				- ���� �Ұ�
		 * 
		 * */
		
		// �������� ����ϴ� ����
		// ��ü �迭���� �ϳ��� Ÿ������ �迭�� ���������ϴϱ�
		// �θ� Ŭ���� Ÿ������ �ڽ� ��ü���� ���� �� �ִ�. (������ �����ϴ�)
		
		//�θ� Ÿ���� ��ü �迭�� ����� �ڽ� ��ü�� ��� �����غ���.
//		
//		Parent[] arr = new Parent[3];
//		
		
		
		
		Parent[] arr2 = new Parent[3];
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = new Child1();
			
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i] instanceof Child1) {
				((Child1)arr2[i]).printChild1();
			}
			else if(arr2[i] instanceof Child2) {
				((Child2)arr2[i]).printChild2();
			}
		
			}
		
	
		
		
//		for(int i=0;i<arr.length;i++) {
//			arr[i].printP();
//		}
//		
		
	}

}
