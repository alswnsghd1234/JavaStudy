package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		/*
		 * 추상화 -> 캡슐화
		 * 
		 * 캡슐화 과정을 통해서 완벽한 클래스의 형태를 갖추게 하자.
		 * 
		 * 캡슐화를 하지 않으면 외부로부터 직접 접근이 가능하기 때문에
		 * 함부로 값이 변질되거나 조회를 하는것을 막지 못하는 문제가 생긴다.
		 * 
		 * -> 캡슐화 작업 : 정보은닉 기술 중 하나로 데이터의 접근제한을 원칙으로 하여 외부로부터
		 * 				직접 접근을 막는것. 단, 접근을 할 수 없으면 아노디기 때문에 간접 접근을 허용하자
		 * 				간접 접근은 메소드로
		 * 
		 * 캡슐화 작업 1단계 : 값을 숨기기. 2단계 값에 간접적으로 접근하는 메소드 생성.
		 * 1) 값을 ㅅ무기는 방법 = 속성앞에 붙는 접근제한자를 public에서 private로 변경한다. (나만 접근가능)
		 * 2)간접적으로 접근 할 수 있는 메소드들을 생성해준다. setter/getter
		 * setter 메소드 = 속성에 값을 세팅(대입)해주는 메소드
		 * getter 메소드 = 속성에 담긴 값을 꺼내오는 (조회) 메소드
		 * -> 주의할점( 메소드부에 작성,모든 필드 변수에 만들어줘야함, 명명규칙 = 낙타봉 표기법 ex) setName
		 * 
		 * */
		
		Student Kim = new Student();
		Kim.ane = 20;
		
		System.out.println(Kim.ane);
		
		Kim.setName("민준홍");
		Kim.setAge(29);
		Kim.setGender('M');
		System.out.println(Kim.getName());
		System.out.println(Kim.getAge());
		System.out.println(Kim.getGender());
		System.out.println(Kim.getClass());
		System.out.println(Kim.information());
		
		Student a = new Student();
		a.setName("에이");
		a.setAge(32);
		a.setGender('F');
		System.out.println(a.information());
		
		Student b = new Student();
		b.setName("비");
		b.setAge(23);
		b.setGender('M');
		System.out.println(b.information());
		
		
	
	}

}
