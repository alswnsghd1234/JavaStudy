package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Music;

public class Run {

	public static void main(String[] args) {

		/*
		 * ���׸��� Music��  HashMap �� ���� 5���� �ְ�
		 * keySet �޼ҵ�� iterater�� ���� for���� �̿��ؼ� ����غ��� 
		 * 
		 * */
		
		HashMap<String,Music> ms = new HashMap<>();
		
		ms.put("����", new Music("�����","���"));
		ms.put("�ʲ�", new Music("��","���"));
		ms.put("�츮��", new Music("����","���"));
		ms.put("������", new Music("�߰�","���"));
		ms.put("�����Բ�", new Music("�ٵ�","���"));
		
//		System.out.println(ms);
		Set<String> keySet = ms.keySet();
		
		Iterator<String> it = keySet.iterator();
		
//		Music m = ms.get("����");
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
