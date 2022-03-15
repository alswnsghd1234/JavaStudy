package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListRun {

	public static void main(String[] args) {
		
		/*
		 * 컬렉션(Collection)
		 * 자료구조가 내장되어 있는 클래스
		 * 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"이다.
		 * -자료구조 : 데이터들을 효율적으로 다룰때 필요한 개념
		 * -프레임워크 : 효율적인 기능들이 이미 정의되어 있는 툴
		 * 
		 * 정리해보면 데이터들이 새롭게 추가되거나, 삭제가 되거나, 수정이 되는 기능들이
		 * 이미 정의되어 있는 틀
		 * ->다량의 데이터들을 관리하고자 할때? 배열을 가지고 할 수 있었지만 알고리즘 구현을 해야했음
		 * 그 단점들을 보완한것이 Collection 이다.
		 * 
		 * 배열과 컬렉션의 차이점
		 * -배열의 단점
		 * 1.한 타입의 데이터들만 저장 가능
		 * 2.배열을 쓰고자 할 때 먼저 크기를 지정해야 함
		 * ->한번 지정된 크기는 변경이 불가 (새로운 값을 추가하고자 할때 크기가 커질 경우 새로운 크기의 배열을 만들고 기존 내용을 깊은 복사)
		 * 3.배열 중간 위치에 새로운 데이터를 추가,삭제 하는경우 - 기존의 데이터들을 밀거나 당기는 코드를 작성해야함
		 * 
		 * -컬렉션의 장점
		 * 1. 기본적으로 여러 타입의 데이터들을 저장 가능 ->같은 타입의 데이터들만 묶어서도 저장가능 (제네릭 설정을 통해)
		 * 2. 크기에 제약이 없음
		 * ->크기 지정을 해주지 않아도 이미 되어있고 크기를 넘어서는 경우엔 자동으로 늘어남
		 * 3.중간에 값을 추가하거나 삭제하는 경우 값을 땡겨주거나 밀어주는 코드가 이미 메소드로 정의되어 있음
		 * ->그때그때 필요한 메소드를 호출해서 사용만 하면 끝!
		 * 
		 * 방대한 데이터들을 단지 담아만 두고 "조회"만 할 목적이라면 배열 사용
		 * 방대한 데이터들이 추가,수정,삭제 될 경우 컬렉션 사용
		 * 
		 * 컬렉션의 종류(3가지 계열)
		 * -List 계열 :담고자 하는 값(value)만 저장 / 값 저장 시 순서 유지(index개념) / 중복값 허용
		 * 			ex)ArrayList,Vector,LinkedList -> ArrayList가 가장 많이 쓰임
		 * -Set 계열 :담고자 하는 값(value)만 저장 / 값 저장 시 순서 유지 X (index개념 없음) / 중복값 X
		 *       	ex)HashSet,TreeSet,LinkedHashSet....
		 * -Map 계열 : 키(key)+값(value) 세트로 저장/ 값 저장시 순서 유지 X(index개념 없음) / 중복키 X 중복값O 
		 * 			ex)HashMap,HashTable,TreeMap,Properties.....
		 * 
		 * */
		
		//ArrayList의 선언 방법 
		/*[표현법]
		 * ArrayList 이름 = new ArrayList(); ->크기 지정 안함
		 * ArrayList 이름 = new ArrayList(크기); ->크기 지정
		 * */
		
		ArrayList list = new ArrayList(3); 
		
//		System.out.println(list);
		
//		list.add(50);
//		list.add("바보");
//		list.add(15.5);
//		list.add(true);
//		list.add('A');
//		System.out.println(list);
//		list.remove("바보"); //요소값 삭제
//		System.out.println(list);
//		System.out.println(list);
		
		//값 추가해보기
		Music m = new Music("사랑비","김태우");
		list.add(m);
		list.add(new Music("호랑나비","김흥국"));
		
//		System.out.println(list);
		
		list.add(2,new Music("가을아침","아이유"));
		
//		System.out.println(list);
		
		//값 수정해보기 set()
//		list.set(0, new Music("Lonely","Imagine Dragons"));
		
//		System.out.println(list);
		
		//값 삭제해보기 remove()
//		list.remove(1);
		
//		list.remove(5); 없는 인덱스 접근시 배열과 마찬가지로 IndexOutOfBoundsException 발생
//		System.out.println(list);
		Music m1 =new Music("Lonely","Imagine Dragons");
		
		
		list.add(m1);
		
		System.out.println(list);
		
		//지정값 삭제 
//		list.remove(m1);
		
		System.out.println(list);
		
		//리스트의 크기 size()
		System.out.println(list.size());
		
		
		//리스트의 인덱스번호로 값 반환해보기 get(index)
		
		System.out.println(list.get(0));
		Music m3 = (Music)list.get(1); //get()메소드는 반환형이 Object형이다
		

//		System.out.println(((Music)list.get(0)).getTitle()); //0번인덱스에 있는 객체의 제목 뽑기
//		System.out.println(((Music)list.get(0)).getArtist()); //0번인덱스에 있는 객체의 가수명 뽑기
		
		//for문으로 노래 가수 다뽑아보기
		
//		for(int i=0; i<list.size();i++) {
//			System.out.println(((Music)list.get(i)).getTitle());
//			System.out.println(((Music)list.get(i)).getArtist());
//		}
		
		//향상된 for문으로 조회
		//순차적으로 배열 또는 컬렉션을 돌려주는 for문형태
		//for(값을 받을 타입 변수명 : 접근할 배열또는컬렉션)
//		for(Object o : list) {
//			System.out.println(((Music)o).getTitle());
//		}
		
		//리스트의 부분만 추출하기
		//subList(int index1,int index2) index1~index2까지 데이터 출력
		
		System.out.println(list);
		
		List sub = list.subList(0,3);
		
		System.out.println(sub);
		
		//리스트+리스트 addAll()
		
		
		list.addAll(sub);
		
		System.out.println(list);
		
		//비어있는지 확인하는 메소드 isEmpty() 비어있으면 true 아니면 false
		
		System.out.println(list.isEmpty());
		
		//리스트를 통째로 비워주는 메소드 clear() 데이터를 다 날려버릴수 있기때문에 신중하게 사용하기 
		
//		list.clear();
		
//		System.out.println(list.isEmpty());
		
		
		//1부터 45까지 리스트에 넣고 subList로 6개만 뽑아보기 
		
		
		ArrayList num = new ArrayList();
		
		
		for(int i=1;i<=45;i++) {
			
			num.add(i);
		}
		
		
		System.out.println(num);
		
		Collections.shuffle(num);
		
		System.out.println(num);
		
		List lotto=num.subList(0, 6);
		
		System.out.println(lotto);
		
		Collections.sort(lotto);
		
		System.out.println(lotto);
		
		
		
		
	}

}
