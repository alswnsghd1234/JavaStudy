package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class GenerinRun {

	public static void main(String[] args) {

		/*
		 * 제네릭(Generic) <E>
		 * 컬렉션 안에서 다룰 타입들을 미리 지정해주는 역할 -> 명시적으로 <Music>,<String>,<Integer>
		 * 객체의 형 변환을 할 필요가 없다.
		 * - 내가 사용하고 싶은 타입만 지정해주는 효과
		 * 
		 * 만약 제네릭을  <Music>으로 정해주면 반환되는 Object가 Music이 된다. E ->Music
		 * 별도의 제네릭 제시없이 컬렉션 객체 생성시엔 기본타입이 Object 다 E->Object
		 * 
		 * 
		 * 제네릭을 쓰는 이유 
		 * 1. 저장 할 타입의 제한을 두기 위해
		 * 2. 매번 형변환 하는 절차를 없애기 위해
		 * 
		 * 컬렉션 생성시 제네릭 설정
		 * [표현법]
		 * ArrayList<E> list = new ArrayList<E>();
		 * */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(10);
		list.add(new Integer(5));
		
		System.out.println(list);
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("하이");
		list1.add("하");
		list1.add("이");
		list1.add(new String("헬로"));
		String i = new String("나양나");
		list1.add(i);
		
		list1.remove("하");
		list1.remove(i);
		
		ArrayList<Music> list2 = new ArrayList<Music>();
		//왼쪽에만 제네릭 타입 지정해줘도 사용가능( 선언부에서 지정했으니 초기화 구문에는 생략가능하다.)
		ArrayList<Music> list3 = new ArrayList<>();
		ArrayList<String> list4 = new ArrayList<>();
		
		list2.add(new Music("살다가","SG워너비"));
		
		//향상된 for문 
		//제네릭 타입 지정하기 전
		for(Object o : list2) {
			System.out.println(((Music)o).getTitle());
		}
		//제네릭 Music 타입으로 지정 후
		for(Music m : list2) {
			System.out.println(m.getTitle()); //반환 타입이 Music이기 때문에 강제 형변환 안해도 된다.
		}
	}

}
