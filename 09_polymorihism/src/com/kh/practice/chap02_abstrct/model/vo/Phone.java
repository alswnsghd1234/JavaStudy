package com.kh.practice.chap02_abstrct.model.vo;

public interface Phone {

	public static final char NUMVERPAD[] = {'1', '2', '3', '4','5', '6', '7','8','9', '*','0', '#'};
	String makeCall();
	
	String takeCall();
}