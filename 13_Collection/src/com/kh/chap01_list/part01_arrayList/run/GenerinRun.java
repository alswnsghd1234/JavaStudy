package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class GenerinRun {

	public static void main(String[] args) {

		/*
		 * ���׸�(Generic) <E>
		 * �÷��� �ȿ��� �ٷ� Ÿ�Ե��� �̸� �������ִ� ���� -> ��������� <Music>,<String>,<Integer>
		 * ��ü�� �� ��ȯ�� �� �ʿ䰡 ����.
		 * - ���� ����ϰ� ���� Ÿ�Ը� �������ִ� ȿ��
		 * 
		 * ���� ���׸���  <Music>���� �����ָ� ��ȯ�Ǵ� Object�� Music�� �ȴ�. E ->Music
		 * ������ ���׸� ���þ��� �÷��� ��ü �����ÿ� �⺻Ÿ���� Object �� E->Object
		 * 
		 * 
		 * ���׸��� ���� ���� 
		 * 1. ���� �� Ÿ���� ������ �α� ����
		 * 2. �Ź� ����ȯ �ϴ� ������ ���ֱ� ����
		 * 
		 * �÷��� ������ ���׸� ����
		 * [ǥ����]
		 * ArrayList<E> list = new ArrayList<E>();
		 * */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(10);
		list.add(new Integer(5));
		
		System.out.println(list);
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("����");
		list1.add("��");
		list1.add("��");
		list1.add(new String("���"));
		String i = new String("���糪");
		list1.add(i);
		
		list1.remove("��");
		list1.remove(i);
		
		ArrayList<Music> list2 = new ArrayList<Music>();
		//���ʿ��� ���׸� Ÿ�� �������൵ ��밡��( ����ο��� ���������� �ʱ�ȭ �������� ���������ϴ�.)
		ArrayList<Music> list3 = new ArrayList<>();
		ArrayList<String> list4 = new ArrayList<>();
		
		list2.add(new Music("��ٰ�","SG���ʺ�"));
		
		//���� for�� 
		//���׸� Ÿ�� �����ϱ� ��
		for(Object o : list2) {
			System.out.println(((Music)o).getTitle());
		}
		//���׸� Music Ÿ������ ���� ��
		for(Music m : list2) {
			System.out.println(m.getTitle()); //��ȯ Ÿ���� Music�̱� ������ ���� ����ȯ ���ص� �ȴ�.
		}
	}

}
