package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {
	
	/*
	 * �迭����
	 * 1. ���� ����: �迭�� �ּҰ��� �����Ѵ�. (���� ��ü�� �����Ѵ�.)
	 * 2. ���� ����: ���ο� �迭�� ����� ���� �迭�� �ִ� �����͸� �����Ѵ�.
	 *  
	 * */

	//���� ����
	
	public void method1() {
		
		int[] origin = new int[5];
		
		
		for(int i=0;i<origin.length;i++) {
			origin[i]+=2*i;
		}
		System.out.println("���� �迭 ���===");
		for(int i=0;i<origin.length;i++) {
			System.out.println(origin[i]);
		}
		//�迭 ���� ����
		int[] copy = origin;
		
		System.out.println("���纻 �迭 ���===");
		
		for(int i=0;i<copy.length;i++) {
			System.out.println(copy[i]);
		}
		
		origin[2] =100;
		
		System.out.println("=====���� �迭 ���� �� ���� �迭 �� ���====");
		for(int i=0;i<origin.length;i++) {
			System.out.println(origin[i]);
		}
		System.out.println("===���� �迭 ���� �� ���� �迭 �� ���====");
		for(int i=0;i<copy.length;i++) {
			System.out.println(copy[i]);
			}
		
	}
	public void method2() {
		int[] origin = {1,2,3,4,5};
		
		int[] copy = new int[origin.length];
		
		for(int i=0;i<origin.length;i++) {
			copy[i] = origin[i];
			System.out.println(copy[i]);
		}
		
	}
	public void method3() {
		
		int[] origin = {5,10,15,20,25};
		
		int[] copy = new int[10];
		
//		System.arraycopy(origin, 0, copy, 0, 5);
//		System.arraycopy(origin, 3, copy, 0, 2);
		System.arraycopy(origin, 0, copy, 5, 5);
		for(int i=0;i<origin.length;i++) {
		System.out.println(copy[i]);
	}
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
		}
	public void method4() {
		
		String[] sArr = {"a","b","c","d","e","f"};
		
		//[ǥ����] ���纻 �迭 = Arrays.copyOf(�����迭,���ο�迭����)
		
		//���̸� �������� �۰� �����ϸ� �׸�ŭ�� ����ȴ�.
		String[] copy=Arrays.copyOf(sArr, 10);
		
		for(int i=0; i<copy.length;i++) {
			System.out.println(copy[i]);
		}
		
		System.out.println(sArr.hashCode());
		System.out.println(copy.hashCode());
	}
	/*
	 * System.arraycopy �޼ҵ�
	 * ��� �ε������� ���� ����� �Ұ��� ������ �����ϴ�.
	 * 
	 * Arrays.copyOf �޼ҵ�
	 * �ε��� ������ �Ұ����ϰ� ���� �迭�� 0�� �ε������� ���� ���۵ȴ�.
	 * ���� ������ ������ŭ ����ǰ� �� ������ ���� �� �迭�� ũ��� �����ȴ�.
	 * 
	 * */
	
	//���� ����
	//clone �̿��غ���.
	public void method5() {
		//[ǥ����] ���纻 �迭 = �����迭.clone();
		
		String[] origin = {"��","��","��","��","��"};
		
		String[] copy = origin.clone();
		
		for(int i=0;i<copy.length; i++) {
			System.out.println(copy[i]);
		}
	}
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹε�Ϲ�ȣ(-����) :");
		String num = sc.nextLine();
		
		char[] cArr = new char[14];
		
		//cArr �迭�� num�� ��� �ֹε�� ��ȣ�� ���� �ݺ���.
		for(int i=0;i<14;i++) {
			cArr[i]=num.charAt(i);
		}
		char[] copy=cArr.clone();
		
		for(int i=0; i<copy.length;i++) {
			
			if(i<8) {
				copy[i]=num.charAt(i);
			}else {
				copy[i]='*';
			}
		}
			for(int i=0;i<copy.length;i++) {
				System.out.print(copy[i]);
			}
	}
}


