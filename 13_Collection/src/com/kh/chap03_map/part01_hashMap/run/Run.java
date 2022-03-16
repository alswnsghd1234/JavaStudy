package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Music;

public class Run {

	public static void main(String[] args) {

		/*
		 * 제네릭이 Music인  HashMap 을 만들어서 5곡을 넣고
		 * keySet 메소드와 iterater와 향상된 for문을 이용해서 출력해보기 
		 * 
		 * */
		
		HashMap<String,Music> ms = new HashMap<>();
		
		ms.put("내꺼", new Music("양다일","고백"));
		ms.put("너꺼", new Music("신","라면"));
		ms.put("우리꺼", new Music("포맨","고백"));
		ms.put("가족꺼", new Music("뜨감","고백"));
		ms.put("선생님꺼", new Music("다듀","고백"));
		
//		System.out.println(ms);
		Set<String> keySet = ms.keySet();
		
		Iterator<String> it = keySet.iterator();
		
//		Music m = ms.get("내꺼");
//		System.out.println(m);
		for(String hs : keySet) {
			System.out.println(hs);
			System.out.println(ms.get(hs));
		}
		while(it.hasNext()) {
			
			String key = it.next();
			Music value = ms.get(key);
			System.out.println(key);
			System.out.println(value);
		}
	
	}

}
