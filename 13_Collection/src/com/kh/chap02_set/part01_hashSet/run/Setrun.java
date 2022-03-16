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
		 * ���� ����, index ������ X ,�ߺ� X
		 * [ǥ����]
		 * HashSet �̸� = new HashSet();
		 * 
		 * [���׸�����ǥ����]
		 * HashSet<String> �̸� = new HashSet<>();
		 * 
		 * */
		
		HashSet<String> a = new HashSet();
		
		a.add("����");
		a.add("�ȳ�");
		a.add("����");
		a.add("����");
		a.add("�ȳ�");
		a.add(null);
		a.add(null);
//		System.out.println(a);
		//�� ���� remove()
		a.remove("�ȳ�");
//		System.out.println(a.remove("�ȳ�"));
//		System.out.println(a);
		
		//��簪 ����
		a.clear();
//		System.out.println(a);
//		
//		System.out.println(a.size());
		
		HashSet<Student> hs = new HashSet<>();
		
		hs.add(new Student("�۰�",20,100));
		hs.add(new Student("�ڹο�",22,99));
		hs.add(new Student("����ȫ",19,100));
		hs.add(new Student("����ȫ",19,100));
		
		Student s1 = new Student("����ȫ",19,100);
		Student s2 = new Student("�ڹο�",22,99);
		
		hs.add(s1);
		hs.add(s2);
		
		System.out.println(hs);
		
		/*
		 * ������� ���� X Ȯ�οϷ�
		 * �ߺ� ������ O
		 * �� �ߺ� ������ �ɱ�?
		 * HashSet Ư¡ : ���� �߰��ɶ����� equals �޼ҵ�� hashCode�� �� �� �Ѵ� ����� true�� ���� ��ü�� �Ǵ��Ѵ�.
		 * 
		 * equals() : ���� ��ü�� �ּҰ��� ���ؼ� ��� ��ȯ (������ true)
		 * hashCode() : ���� ��ü�� �ּҰ��� 10����ȭ �ؼ� ��ȯ
		 * 
		 * StudentŬ�������� equals �޼ҵ带 �������̵� �Ѵٰ� ������
		 * equals() : �� �ʵ尪�� ��� ��ġ�ϸ� true ��ȯ �ƴϸ� false
		 * hashCode : �� �ʵ尪�� ��� ���ؼ� ���ڿ��� ����� �װ��� hashCode�� �ؼ� ��ȯ
		 * */
		
		//HashSet�� �ִ� ������ �� ����غ���
		System.out.println("===========");
		
		//1.�ݺ��� -> �ε��� ������ ���� ������ ���� for������ ���
		
		for(Student s : hs) {
			System.out.println(s);
		}
		
		//2.HashSet�� ArrayList�� ��Ƽ� �̱�
		
		
		//1. ArrayList ����
		ArrayList<Student> list = new ArrayList<>();
		//2. hs�� �ִ� ���� list�� ��°�� �߰�
		list.addAll(hs);
		
		for(int i =0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		
		//1+2 �ѹ��� �ϱ�
		ArrayList<Student> list2 = new ArrayList<>(hs);
		
		System.out.println("====set ������ list�� �־ �����===");
		
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("===============");
		//3 Iterator(�ݺ���) -> HashSet Ŭ�������� ����
		
		Iterator<Student> it =hs.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}//StringTokenizer�� ����� ����
		//iterator �޼ҵ�� list�� set���� ��� ���� Map�� �Ұ�
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		//������ �����ϸ鼭 set�� Ư���� ����ϰ� �ʹٸ� LinkedHashSet�� ����ϸ� �ȴ�.
		//HashSet<String> lhs = new HashSet<>();
		lhs.add("�ȳ��ϼ���");
		lhs.add("�ݰ��ϼ���");
		lhs.add("�޿��ϼ���");
		lhs.add("�ȳ��ϼ���");
		lhs.add("�ϵ��ϼ���");
		lhs.add("�����ϼ���");
		lhs.add("�ȳ��ϼ���");
		
		System.out.println(lhs);
		
//		System.out.println(s1.getClass());
		
		ArrayList<String> b = new ArrayList();
		
		b.add("����");
		b.add("�ȳ�");
		b.add("����");
		b.add("����");
		b.add("�ȳ�");
		b.add(null);
		b.add(null);
		
//		System.out.println(b);
//		//ũ�� ���ϱ� size()
//		System.out.println(b.size());
		
	}

}
