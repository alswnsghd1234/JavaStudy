package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		
		//HashMap
		//[ǥ����] HashMap<���׸�,���׸�> �̸�= new HashMap<>();
		
		HashMap<Integer,String> hm = new HashMap<>();
		//Collection Ÿ�� -> add �޼ҵ带 ���(List,Set)
		//Map -> put �޼ҵ�(Map �迭) -> key + value ��Ʈ�� �߰�
		
		//1. put(K, key, V value) :Map ������ key + value
		hm.put(486, "�����");
		hm.put(7942,"ģ������");
		hm.put(4885, "����");
		hm.put(7942,"ģ������");
		hm.put(012,"������");
		hm.put(123,"������");
		
		
		//�������� X key�� �ߺ� X value���� �ߺ� O
		//���� key���� value���� ������ ����� �ȴ�.
		System.out.println(hm);
	
		//2. get(Object key) key�� value�� ã�ƿ���
		//�ش� key���� ����մ� value�� ��ȯ�Ѵ�.
		//key�� �ĺ��ڷ� ���
		System.out.println(hm.get(7942));
		System.out.println(hm.get(012));
		
		//3. size()ũ�� �˾ƺ���
		System.out.println(hm.size());
		
		HashMap<String,Snack> hm2 = new HashMap<>();
		
		hm2.put("��Ĩ", new Snack("�¾��Ǹ�",2500));
		hm2.put("���׶��", new Snack("���� ��� ��",5000));
		hm2.put("��īĨ", new Snack("�������θ�",3000));
		hm2.put("��ũ�ٽ�", new Snack("ȭ��Ʈ��",4200));
		
		System.out.println(hm2);
		
		//value���� �����ϰ� ������
		hm2.replace("��īĨ", new Snack("���ĸ�",5000));
		
		System.out.println(hm2);
		
		hm2.replace("������ ����Ĩ", new Snack("����Ĩ��",3300));
		// ���� Ű���� replace �Ϸ��� �ϸ� ��ȭ�� �Ͼ�� �ʴ´�.(Ű���� ���� ����)
		System.out.println(hm2);
		
		//5. remove(Object key)����� �ش� key���� ã�Ƽ� key+value�� �����ش�.
		
		hm2.remove("��īĨ");
		
//		System.out.println(hm2);
		
		//�ؽ��ʿ� �մ� ���鿡 ���������� �����ϰ� �ʹٸ�
		//Map�� Set���� �����ؼ� iterator�� ����ؼ� ����
		
		//1. keySet() �̿�
		//HashMap�� �ִ� �޼ҵ�� Set�� HashMap�� key���鸸 ��Ƽ� ��´�.
		// ��ȯ�� SetŸ��
		
		Set<String> keySet = hm2.keySet();
		
//		System.out.println(keySet); // key�鸸 ��Ƽ� keyset ��Ƴ���
		
		//2. ��Ƴ��� keySet�� Iterator�� �����ϱ�
		
		Iterator<String> it = keySet.iterator();
		
		//3. �ݺ������� Iterator �����ϱ�
		
		while(it.hasNext()) {
//			System.out.println(it.next()); //hashmap(hm)��  �ϳ��ϳ� �����ϱ�
//			it.next(); Ű��
			String key = it.next(); //Ű��1��
			Snack sValue = hm2.get(key);//���� Ű������ value�� �̱�
			
			System.out.println("key �� :"+key);
			System.out.println("key �� :"+sValue);
		}
		
		//���� for��
//		for(��ȯ ���� Ÿ�� �̸� : �ݺ���ų collection �Ǵ� �迭) 
		for(String keys : keySet ) {
			System.out.println(keys);
			System.out.println(hm2.get(keys));
		}
		//entrySet() �޼ҵ� �̿��ϴ� ���
		
		//1) Map�� �ִ� key + value ��Ʈ�� Entry��� �������� Set�� ���
		// [ǥ����] Set<Entry<Key,Value>> �̸� = �ؽ���.entrySet();
		Set<Entry<String,Snack>> entrySet = hm2.entrySet();
		
		//2) ���� for������ �̱�
		for(Entry<String,Snack> e : entrySet) {
			System.out.println(e.getKey()+e.getValue());
		}
		
	}

}
