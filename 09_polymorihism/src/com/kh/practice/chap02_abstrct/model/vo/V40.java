package com.kh.practice.chap02_abstrct.model.vo;

public class V40 extends SmartPhone implements Notepen{

	public V40() {
		super.setMaker("뷰40");
	}
	@Override
	public String charge() {
		return "고속  충전,  고속  무선  충전";
	}

	@Override
	public String picture() {
		return "1200, 1600만  트리플  카메라";
	}

	@Override
	public String makeCall() {
		return "번호를  누르고  통화버튼을  누름";
	}

	@Override
	public String takeCall() {
		return "수신  버튼을  누름";
	}

	@Override
	public String touch() {
		return "정전식";
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
