package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListRun {

	public static void main(String[] args) {
		
		/*
		 * �÷���(Collection)
		 * �ڷᱸ���� ����Ǿ� �ִ� Ŭ����
		 * �ڹٿ��� �����ϴ� "�ڷᱸ��"�� ����ϴ� "�����ӿ�ũ"�̴�.
		 * -�ڷᱸ�� : �����͵��� ȿ�������� �ٷ궧 �ʿ��� ����
		 * -�����ӿ�ũ : ȿ������ ��ɵ��� �̹� ���ǵǾ� �ִ� ��
		 * 
		 * �����غ��� �����͵��� ���Ӱ� �߰��ǰų�, ������ �ǰų�, ������ �Ǵ� ��ɵ���
		 * �̹� ���ǵǾ� �ִ� Ʋ
		 * ->�ٷ��� �����͵��� �����ϰ��� �Ҷ�? �迭�� ������ �� �� �־����� �˰��� ������ �ؾ�����
		 * �� �������� �����Ѱ��� Collection �̴�.
		 * 
		 * �迭�� �÷����� ������
		 * -�迭�� ����
		 * 1.�� Ÿ���� �����͵鸸 ���� ����
		 * 2.�迭�� ������ �� �� ���� ũ�⸦ �����ؾ� ��
		 * ->�ѹ� ������ ũ��� ������ �Ұ� (���ο� ���� �߰��ϰ��� �Ҷ� ũ�Ⱑ Ŀ�� ��� ���ο� ũ���� �迭�� ����� ���� ������ ���� ����)
		 * 3.�迭 �߰� ��ġ�� ���ο� �����͸� �߰�,���� �ϴ°�� - ������ �����͵��� �аų� ���� �ڵ带 �ۼ��ؾ���
		 * 
		 * -�÷����� ����
		 * 1. �⺻������ ���� Ÿ���� �����͵��� ���� ���� ->���� Ÿ���� �����͵鸸 ����� ���尡�� (���׸� ������ ����)
		 * 2. ũ�⿡ ������ ����
		 * ->ũ�� ������ ������ �ʾƵ� �̹� �Ǿ��ְ� ũ�⸦ �Ѿ�� ��쿣 �ڵ����� �þ
		 * 3.�߰��� ���� �߰��ϰų� �����ϴ� ��� ���� �����ְų� �о��ִ� �ڵ尡 �̹� �޼ҵ�� ���ǵǾ� ����
		 * ->�׶��׶� �ʿ��� �޼ҵ带 ȣ���ؼ� ��븸 �ϸ� ��!
		 * 
		 * ����� �����͵��� ���� ��Ƹ� �ΰ� "��ȸ"�� �� �����̶�� �迭 ���
		 * ����� �����͵��� �߰�,����,���� �� ��� �÷��� ���
		 * 
		 * �÷����� ����(3���� �迭)
		 * -List �迭 :����� �ϴ� ��(value)�� ���� / �� ���� �� ���� ����(index����) / �ߺ��� ���
		 * 			ex)ArrayList,Vector,LinkedList -> ArrayList�� ���� ���� ����
		 * -Set �迭 :����� �ϴ� ��(value)�� ���� / �� ���� �� ���� ���� X (index���� ����) / �ߺ��� X
		 *       	ex)HashSet,TreeSet,LinkedHashSet....
		 * -Map �迭 : Ű(key)+��(value) ��Ʈ�� ����/ �� ����� ���� ���� X(index���� ����) / �ߺ�Ű X �ߺ���O 
		 * 			ex)HashMap,HashTable,TreeMap,Properties.....
		 * 
		 * */
		
		//ArrayList�� ���� ��� 
		/*[ǥ����]
		 * ArrayList �̸� = new ArrayList(); ->ũ�� ���� ����
		 * ArrayList �̸� = new ArrayList(ũ��); ->ũ�� ����
		 * */
		
		ArrayList list = new ArrayList(3); 
		
//		System.out.println(list);
		
//		list.add(50);
//		list.add("�ٺ�");
//		list.add(15.5);
//		list.add(true);
//		list.add('A');
//		System.out.println(list);
//		list.remove("�ٺ�"); //��Ұ� ����
//		System.out.println(list);
//		System.out.println(list);
		
		//�� �߰��غ���
		Music m = new Music("�����","���¿�");
		list.add(m);
		list.add(new Music("ȣ������","���ﱹ"));
		
//		System.out.println(list);
		
		list.add(2,new Music("������ħ","������"));
		
//		System.out.println(list);
		
		//�� �����غ��� set()
//		list.set(0, new Music("Lonely","Imagine Dragons"));
		
//		System.out.println(list);
		
		//�� �����غ��� remove()
//		list.remove(1);
		
//		list.remove(5); ���� �ε��� ���ٽ� �迭�� ���������� IndexOutOfBoundsException �߻�
//		System.out.println(list);
		Music m1 =new Music("Lonely","Imagine Dragons");
		
		
		list.add(m1);
		
		System.out.println(list);
		
		//������ ���� 
//		list.remove(m1);
		
		System.out.println(list);
		
		//����Ʈ�� ũ�� size()
		System.out.println(list.size());
		
		
		//����Ʈ�� �ε�����ȣ�� �� ��ȯ�غ��� get(index)
		
		System.out.println(list.get(0));
		Music m3 = (Music)list.get(1); //get()�޼ҵ�� ��ȯ���� Object���̴�
		

//		System.out.println(((Music)list.get(0)).getTitle()); //0���ε����� �ִ� ��ü�� ���� �̱�
//		System.out.println(((Music)list.get(0)).getArtist()); //0���ε����� �ִ� ��ü�� ������ �̱�
		
		//for������ �뷡 ���� �ٻ̾ƺ���
		
//		for(int i=0; i<list.size();i++) {
//			System.out.println(((Music)list.get(i)).getTitle());
//			System.out.println(((Music)list.get(i)).getArtist());
//		}
		
		//���� for������ ��ȸ
		//���������� �迭 �Ǵ� �÷����� �����ִ� for������
		//for(���� ���� Ÿ�� ������ : ������ �迭�Ǵ��÷���)
//		for(Object o : list) {
//			System.out.println(((Music)o).getTitle());
//		}
		
		//����Ʈ�� �κи� �����ϱ�
		//subList(int index1,int index2) index1~index2���� ������ ���
		
		System.out.println(list);
		
		List sub = list.subList(0,3);
		
		System.out.println(sub);
		
		//����Ʈ+����Ʈ addAll()
		
		
		list.addAll(sub);
		
		System.out.println(list);
		
		//����ִ��� Ȯ���ϴ� �޼ҵ� isEmpty() ��������� true �ƴϸ� false
		
		System.out.println(list.isEmpty());
		
		//����Ʈ�� ��°�� ����ִ� �޼ҵ� clear() �����͸� �� ���������� �ֱ⶧���� �����ϰ� ����ϱ� 
		
//		list.clear();
		
//		System.out.println(list.isEmpty());
		
		
		//1���� 45���� ����Ʈ�� �ְ� subList�� 6���� �̾ƺ��� 
		
		
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
