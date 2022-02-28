package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Student.Student2;

public class run2 {

	public void main(String[] args) {
		
		Student2 s = new Student2();
		s.name = "¹ÎÁØÈ«";
		s.height = 183;
		s.gender = 'm';
		System.out.printf("%d %d %s",s.age,s.height,s.gender);
	}
}

