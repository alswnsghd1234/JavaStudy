package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product{

	//부모로부터 상속받을 부분은 기술하지 않는다.
	//단, 내가 오버라이딩 할 메소드는 기술해도 된다.
	
	//[필드부]
	//brand,pCode,pName,price //상속
	
	private boolean allInOne;
	
	public Desktop() {
		
	}
	
	public Desktop(String brand,String pCode,String pName,int price,boolean allInOne) {
		//초기화 방법 3가지
		//1. 부모클래스의 필드들의 접근 제한자를 private에서 protected로 변경
		//2. 부모 클래스의 setter를 이용하여 초기화 시키는 방법
		//3. 부모 클래스의 생성자를 호출해서 초기화 하는 방법 super()
		
		//1번방법으로 초기화해보기
		super.brand=brand;
		super.pCode=pCode;
		super.pName=pName;
		super.price=price;
		this.allInOne=allInOne;
	}
	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne=allInOne;
	}
	//일단 여기까지가 필수로 구현해야하는 부분
	
	//오버라이딩
	
	@Override
	public String info() {
		return super.info()+",allInOne "+allInOne;
	}
}
