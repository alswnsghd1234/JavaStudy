package com.kh.chap01_beforeVSafter.after.tvo;

import com.kh.chap01_beforeVSafter.after.model.vo.Product;

public class Phone extends Product{//�������� ������ �ΰ����� �ڵ������� ���� �� �ִ�
					// �ڵ����̶�� �־���ϴ� ����� �ۼ��Ѵ�.
					//���� ����̱� ������ ��(Phone)Ŭ������ �θ���
					//������ �ڵ��� Ŭ�������� �� (Phone)����� ��ӹ޾� ������ ���
	public String num;
	
	
	public Phone() {
		
	}
	public Phone(String num) {
		this.num=num;
	}

	public void call() {
		System.out.println("��ȭ���");
	}
	public void sms() {
		System.out.println("���ڱ��");
	}
	public void camera() {
		System.out.println("ī�޶� ���");
	}
}
