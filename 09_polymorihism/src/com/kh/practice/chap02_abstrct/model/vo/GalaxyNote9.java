package com.kh.practice.chap02_abstrct.model.vo;

public class GalaxyNote9 extends SmartPhone implements Notepen {

	public GalaxyNote9() {
		super.setMaker("�Ｚ");
	}
	
	@Override
	public String charge() {
		return "��� ����, ���� ����";
	}

	@Override
	public String picture() {
		return "1200��  ���  ī�޶� ";
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
		return "������,  ������  ����";
	}

	@Override
	public boolean bluetoothPen() {
		return true;
	}

	@Override
	public String printlnInformation() {
		return makeCall()+ charge()+makeCall()+takeCall()+touch() +bluetoothPen();
	}

	
	
}
