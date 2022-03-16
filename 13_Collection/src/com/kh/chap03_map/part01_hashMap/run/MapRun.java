package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		
		//HashMap
		//[표현법] HashMap<제네릭,제네릭> 이름= new HashMap<>();
		
		HashMap<Integer,String> hm = new HashMap<>();
		//Collection 타입 -> add 메소드를 사용(List,Set)
		//Map -> put 메소드(Map 계열) -> key + value 세트로 추가
		
		//1. put(K, key, V value) :Map 공간에 key + value
		hm.put(486, "사랑해");
		hm.put(7942,"친구사이");
		hm.put(4885, "너지");
		hm.put(7942,"친구사이");
		hm.put(012,"영원히");
		hm.put(123,"영원히");
		
		
		//순서유지 X key값 중복 X value값은 중복 O
		//기존 key값에 value값을 넣으면 덮어쓰기 된다.
		System.out.println(hm);
	
		//2. get(Object key) key로 value를 찾아오기
		//해당 key값에 들어잇는 value를 반환한다.
		//key를 식별자로 사용
		System.out.println(hm.get(7942));
		System.out.println(hm.get(012));
		
		//3. size()크기 알아보기
		System.out.println(hm.size());
		
		HashMap<String,Snack> hm2 = new HashMap<>();
		
		hm2.put("썬칩", new Snack("태양의맛",2500));
		hm2.put("누네띠네", new Snack("눈에 띄는 맛",5000));
		hm2.put("포카칩", new Snack("오리지널맛",3000));
		hm2.put("쿠크다스", new Snack("화이트맛",4200));
		
		System.out.println(hm2);
		
		//value값을 변경하고 싶을때
		hm2.replace("포카칩", new Snack("초파맛",5000));
		
		System.out.println(hm2);
		
		hm2.replace("촉촉한 초코칩", new Snack("초코칩맛",3300));
		// 없는 키값을 replace 하려고 하면 변화가 일어나지 않는다.(키값이 없기 때문)
		System.out.println(hm2);
		
		//5. remove(Object key)지우기 해당 key값을 찾아서 key+value를 지워준다.
		
		hm2.remove("포카칩");
		
//		System.out.println(hm2);
		
		//해쉬맵에 잇는 값들에 순차적으로 접근하고 싶다면
		//Map을 Set으로 변경해서 iterator를 사용해서 접근
		
		//1. keySet() 이용
		//HashMap에 있는 메소드로 Set에 HashMap에 key값들만 모아서 담는다.
		// 반환은 Set타입
		
		Set<String> keySet = hm2.keySet();
		
//		System.out.println(keySet); // key들만 모아서 keyset 담아놨다
		
		//2. 모아놓은 keySet을 Iterator로 접근하기
		
		Iterator<String> it = keySet.iterator();
		
		//3. 반복문으로 Iterator 접근하기
		
		while(it.hasNext()) {
//			System.out.println(it.next()); //hashmap(hm)에  하나하나 접근하기
//			it.next(); 키값
			String key = it.next(); //키값1개
			Snack sValue = hm2.get(key);//뽑은 키값으로 value값 뽑기
			
			System.out.println("key 값 :"+key);
			System.out.println("key 값 :"+sValue);
		}
		
		//향상된 for문
//		for(반환 받을 타입 이름 : 반복시킬 collection 또는 배열) 
		for(String keys : keySet ) {
			System.out.println(keys);
			System.out.println(hm2.get(keys));
		}
		//entrySet() 메소드 이용하는 방법
		
		//1) Map에 있는 key + value 세트를 Entry라는 형식으로 Set에 담기
		// [표현법] Set<Entry<Key,Value>> 이름 = 해쉬맵.entrySet();
		Set<Entry<String,Snack>> entrySet = hm2.entrySet();
		
		//2) 향상된 for문으로 뽑기
		for(Entry<String,Snack> e : entrySet) {
			System.out.println(e.getKey()+e.getValue());
		}
		
	}

}
