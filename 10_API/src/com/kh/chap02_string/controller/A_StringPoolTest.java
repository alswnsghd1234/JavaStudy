package com.kh.chap02_string.controller;

import java.lang.reflect.Array;

public class A_StringPoolTest {

	//String Ŭ���� -> �Һ� Ŭ����( ������ �ʴ� Ŭ����)
	// �����ϴ� ���� ������ ���� ����ֶ� �������� �������� �ʰ� ���ο� ������ �߰��� ���� ��
	
	public static void main(String[] args) {
		
	
//	String str1 = new String("hello");
//	String str2 = new String("hello");
//	
//	//equals()�޼ҵ�
//	System.out.println(str1.equals(str2));
//	//�ּҰ� �񱳰� �ƴ� ���ڿ� �񱳸� �ϴ� ���(ObjectŬ������ equals�� ��ӹ޾� �������̵��߱� ����)
//	
//	//hashCode() �޼ҵ�
//	System.out.println(str1.hashCode());
//	System.out.println(str2.hashCode());
//	//string Ŭ�������� hashcode�� �ּҰ� ����� �ƴ� ���ڿ� ������� �ؽ��ڵ� ���� ����� ��ȯ
//	//�������̵� �Ǿ�����.
//	
//	System.out.println(System.identityHashCode(str1));
//	System.out.println(System.identityHashCode(str2));
//	//���� �ּҰ��� �ؽ��ڵ带 ��ȯ
//	
//	System.out.println(str1==str2);
//	
//	//2.���ڿ��� ���ͷ��� ����
//	String str11 = "hello";
//	String str22 = "hello";
//	
//	System.out.println(str11.toString());
//	System.out.println(str22.toString());
//	
//	System.out.println(str11.equals(str2));
//	
//	System.out.println(str11.hashCode());
//	System.out.println(str22.hashCode());
//	
//	System.out.println(System.identityHashCode(str11));
//	System.out.println(System.identityHashCode(str22));
//	
//	// ���ڿ��� ������ ���ϸ� ��� �ɱ�
//	
//	String str = "hello";
//	long start = System.currentTimeMillis();
//	for(int i=0;i<60000;i++) {
//		
//		str += "hello";
//		
//		System.out.println(System.identityHashCode(str));
//	}
//	long finish = System.currentTimeMillis();
//	
//	System.out.println("���۽ð� :"+start);
//	
//	System.out.println("����ð� :"+finish);
//	
//	System.out.println(finish-start); //�츮�� �˰� ������ �۾��� �󸶳� �ɷȴ���.
//	
//	//���ڿ��� ����
//	// �Һ� Ŭ�����̱� ������ �ռ��� ������( �� �޸� ������ �Ҵ�޴� �۾��� �̷������ ������)
//	// �׷��� ������ Ŭ������ ����Ѵ�.
	//STringBuffer / StrimgBuilder
	
	StringBuilder sb = new StringBuilder();
	
	
	long start1 = System.currentTimeMillis();
	for(int i=0;i<10000;i++) {
		
		sb.append("hello");
		System.out.println(System.identityHashCode(sb));
		
	}
	long finish1 = System.currentTimeMillis();
	System.out.println(finish1-start1); //�츮�� �˰� ������ �۾��� �󸶳� �ɷȴ���.
	
//		StringBuffer sb = new StringBuffer();
//		
//		long start1 = System.currentTimeMillis();
//		
//		for(int i=0;i<10000;i++) {
//			
//			sb.append("hello");
//			System.out.println(System.identityHashCode(sb));
//		}
//		long finish1 = System.currentTimeMillis();
//		System.out.println(finish1-start1);
}
}
