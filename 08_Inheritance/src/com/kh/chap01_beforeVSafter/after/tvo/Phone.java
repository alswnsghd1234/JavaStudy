package com.kh.chap01_beforeVSafter.after.tvo;

import com.kh.chap01_beforeVSafter.after.model.vo.Product;

public class Phone extends Product{//아이폰과 갤럭시 두가지를 핸드폰으로 묶을 수 있다
					// 핸드폰이라면 있어야하는 기능을 작성한다.
					//공통 기능이기 때문에 이(Phone)클래스를 부른다
					//나머지 핸드폰 클래스들은 이 (Phone)기능을 상속받아 공통기능 사용
	public String num;
	
	
	public Phone() {
		
	}
	public Phone(String num) {
		this.num=num;
	}

	public void call() {
		System.out.println("전화기능");
	}
	public void sms() {
		System.out.println("문자기능");
	}
	public void camera() {
		System.out.println("카메라 기능");
	}
}
