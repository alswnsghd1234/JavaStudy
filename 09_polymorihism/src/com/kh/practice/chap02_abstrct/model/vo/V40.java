package com.kh.practice.chap02_abstrct.model.vo;

public class V40 extends SmartPhone implements Notepen{

	public V40() {
		super.setMaker("��40");
	}
	@Override
	public String charge() {
		return "���  ����,  ���  ����  ����";
	}

	@Override
	public String picture() {
		return "1200, 1600��  Ʈ����  ī�޶�";
	}

	@Override
	public String makeCall() {
		return "��ȣ��  ������  ��ȭ��ư��  ����";
	}

	@Override
	public String takeCall() {
		return "����  ��ư��  ����";
	}

	@Override
	public String touch() {
		return "������";
	}

	@Override
	public boolean bluetoothPen() {
		return false;
	}
	@Override
	public String printlnInformation() {
		return makeCall()+ charge()+makeCall()+takeCall()+touch() +bluetoothPen();
	}

}
