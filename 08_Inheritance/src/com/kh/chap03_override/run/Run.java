package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.LunchMenu;
import com.kh.chap03_override.model.vo.Snack;

public class Run {
	public static void main(String[] args) {
		
		LunchMenu lm = new LunchMenu("³¬Áö", 900, true);
		
		System.out.println(lm);
		System.out.println(lm.toString());
				
		System.out.println(lm);
		System.out.println(lm.toString());
		
		Snack s = new Snack();
		s.SnackEat();
	}
}
