package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class Setrun {

	public static void main(String[] args) {

		/*
		 * 
		 * 값만 저장, index 개념이 X ,중복 X
		 * [표현법]
		 * HashSet 이름 = new HashSet();
		 * 
		 * [제네릭설정표현법]
		 * HashSet<String> 이름 = new HashSet<>();
		 * 
		 * */
		
		HashSet<String> a = new HashSet();
		
		a.add("가나");
		a.add("안녕");
		a.add("오옹");
		a.add("고래애");
		a.add("안녕");
		a.add(null);
		a.add(null);
//		System.out.println(a);
		//값 삭제 remove()
		a.remove("안녕");
//		System.out.println(a.remove("안녕"));
//		System.out.println(a);
		
		//모든값 삭제
		a.clear();
//		System.out.println(a);
//		
//		System.out.println(a.size());
		
		HashSet<Student> hs = new HashSet<>();
		
		hs.add(new Student("송강",20,100));
		hs.add(new Student("박민영",22,99));
		hs.add(new Student("민준홍",19,100));
		hs.add(new Student("민준홍",19,100));
		
		Student s1 = new Student("민준홍",19,100);
		Student s2 = new Student("박민영",22,99);
		
		hs.add(s1);
		hs.add(s2);
		
		System.out.println(hs);
		
		/*
		 * 저장순서 유지 X 확인완료
		 * 중복 저장은 O
		 * 왜 중복 저장이 될까?
		 * HashSet 특징 : 값이 추가될때마다 equals 메소드와 hashCode로 비교 후 둘다 결과가 true면 동일 객체로 판단한다.
		 * 
		 * equals() : 현재 객체의 주소값을 비교해서 결과 반환 (같으면 true)
		 * hashCode() : 현재 객체의 주소값을 10진수화 해서 반환
		 * 
		 * Student클래스에서 equals 메소드를 오버라이딩 한다고 했을때
		 * equals() : 각 필드값이 모두 일치하면 true 반환 아니면 false
		 * hashCode : 각 필드값을 모두 더해서 문자열로 만들고 그것을 hashCode로 해서 반환
		 * */
		
		//HashSet에 있는 값들을 다 출력해보자
		System.out.println("===========");
		
		//1.반복문 -> 인덱스 개념이 없기 때문에 향상된 for문으로 출력
		
		for(Student s : hs) {
			System.out.println(s);
		}
		
		//2.HashSet을 ArrayList에 담아서 뽑기
		
		
		//1. ArrayList 생성
		ArrayList<Student> list = new ArrayList<>();
		//2. hs에 있는 값들 list에 통째로 추가
		list.addAll(hs);
		
		for(int i =0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		
		//1+2 한번에 하기
		ArrayList<Student> list2 = new ArrayList<>(hs);
		
		System.out.println("====set 데이터 list에 넣어서 만들기===");
		
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("===============");
		//3 Iterator(반복자) -> HashSet 클래스에서 제공
		
		Iterator<Student> it =hs.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}//StringTokenizer와 비슷한 원리
		//iterator 메소드는 list와 set에서 사용 가능 Map은 불가
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		//순서를 유지하면서 set의 특것을 사용하고 싶다면 LinkedHashSet을 사용하면 된다.
		//HashSet<String> lhs = new HashSet<>();
		lhs.add("안녕하세요");
		lhs.add("반가하세요");
		lhs.add("쭈욱하세요");
		lhs.add("안녕하세요");
		lhs.add("싹둑하세요");
		lhs.add("진행하세요");
		lhs.add("안녕하세요");
		
		System.out.println(lhs);
		
//		System.out.println(s1.getClass());
		
		ArrayList<String> b = new ArrayList();
		
		b.add("가나");
		b.add("안녕");
		b.add("오옹");
		b.add("고래애");
		b.add("안녕");
		b.add(null);
		b.add(null);
		
//		System.out.println(b);
//		//크기 구하기 size()
//		System.out.println(b.size());
		
	}

}
