package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	//String Ŭ���� -> �Һ�Ŭ���� (������ �ʴ� Ŭ����)
	//�����ϴ� ���� ������ ���� ����ִ� �������� �������� �ʰ� ���ο� ������ �߰��� ���� ��
	
	/* String Ŭ���� ����
	 * 1)���Կ����ڷ� �� �ֱ�
	 * 2)new String("") ������ ȣ��
	 * */
	
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		
		//toString() �޼ҵ�
		//String Ŭ�������� ���� ����ִ� ���ڿ��� ��ȯ�ϵ��� ������ �Ǿ�����
		System.out.println(str1/*.toString()*/);
		System.out.println(str2);
		
		//equals()�޼ҵ�
		System.out.println(str1.equals(str2));
		//�ּҰ� �񱳰� �ƴ� ���ڿ� �񱳸� �ϴ� ���(ObjectŬ������ equals�� ��ӹ޾� �������̵��߱⶧��)
		//Object�� equals�� �ּҰ� ��
		
		//hashCode() �޼ҵ�
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//string Ŭ�������� hashcode�� �ּҰ� ����� �ƴ� ���ڿ� ������� �ؽ��ڵ尪�� ����� ��ȯ
		//�������̵� �Ǿ�����.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//���� �ּҰ��� �ؽ��ڵ带 ��ȯ
		
		System.out.println(str1==str2);
	}
	
	//2.���ڿ��� ���ͷ��� ����
	public void method2() {
		
		String str1="hello";
		String str2="hello";
		
		//toString�޼ҵ�
		
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		
		//equals �޼ҵ�
		System.out.println(str1.equals(str2));
		
		//hashCode �޼ҵ�
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		//System.identityHashCode()�޼ҵ� 
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	//�Һ�Ŭ������ String Pool
	
	public void method3() {
		
		String str ="hello";
		//���ͷ����� �����ϸ� String pool(���Ǯ) ������ �ö�
		//String pool���� �ߺ� ���ڿ��� ������ �� ���� ������ �̹� ����ִ� ���ڿ��� �����Ѵ�.
		
		System.out.println(System.identityHashCode(str)); //1829164700
		
		str=str+" world";
		
		System.out.println(System.identityHashCode(str)); //2018699554
		
		//�Һ�Ŭ�����̱� ������ �ش���ġ���� ����Ǵ°� �ƴ϶� ���ο� �������� ����� ���� ���� �ȴ�.
	}
	
	public void method4() {
		
		//���ڿ��� ������ ���ϸ� ��� �ɱ�
		
		String str="hello";
		//���� ���ϱ�
		
		//�ð� �����ϱ� 
		long start = System.currentTimeMillis(); //1970�� 1�� 1�� ���� ���ݱ��� �󸶳� �귶���� 0.001�ʴ��� 
		for(int i=0; i<100000;i++) { //6���� 4161  1���� = 181  10���� =11415
			
			str+="hello";
			System.out.println(System.identityHashCode(str));
			System.out.println();
		}
		
		long finish = System.currentTimeMillis();
		
		System.out.println("���۽ð� : "+start);
		
		System.out.println("����ð� : "+finish);
		
		System.out.println(finish-start); //�츮�� �˰������ �۾��� �󸶳� �ɷȴ����̴ϱ� �۾� �����½��� - �۾������� �ϸ� 
										  //�۾��ð��� �˼��ִ�.
	}
	
	public void method5() {
		//���ڿ��� ����
		//�Һ�Ŭ�����̱⋚���� �ռ��� ������(�� �޸𸮿����� �Ҵ�޴� �۾��� �̷������ ������)
		//�׷��� ������Ŭ������ ����Ѵ�
		//StringBuffer/StringBuilder
		//������ 
		//StringBuffer�� ������ �־ ���� ��������(�����ϴ�)
		//StringBuilder�� ������ ��� �������� �������� �ʴ�.
		
		
		StringBuilder sb = new StringBuilder();
//		StringBuffer sb = new StringBuffer(); 
		
		long start = System.currentTimeMillis(); //���� �ð�
		for(int i=0; i<1000000; i++) {
			
			sb.append("hello");
			
			System.out.println(System.identityHashCode(sb));
		}
		long finish = System.currentTimeMillis(); //���� �ð�
		
		System.out.println("�۾��ϴµ� �ɸ� �ð� : "+(finish-start));
	}
}
