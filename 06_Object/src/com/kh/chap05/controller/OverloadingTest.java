package com.kh.chap05.controller;

public class OverloadingTest {

	/*
	 * �޼ҵ� �����ε�
	 * - �� Ŭ���� �ȿ� ���� �޼ҵ������ ���� �޼ҵ带 ���� �� �� �ִ� ���
	 * - �Ű������� �ڷ����� ���� , ����, ������ �ٸ��� �ۼ��Ǿ���Ѵ�.
	 * ����) �Ű�������
	 * */
	
	// �޼ҵ� �̸��� test�� �����Ͽ� �ۼ�����
	
	public void test() {
		System.out.println("���ڿ�");
		System.out.println(15);
		System.out.println(16.6);
		System.out.println('��');
		System.out.println(true);
		
	}
	public void test(int a) {
		
		
	}
	
	public void test(int a ,String b) {
		
	}
	
	//public void test(int b) {} �Ű����������δ� ���� �Ұ�
	
	public void test(String a) {
		
	}
	
//	public String test(String a) {��ȯ���� �����ε��� ������ ���� ����
//		return a
//	 }
	
//	private void test(String b) {
//		//���������ڴ� �����ε��� ������ ��������
//	}
	
	public void method1() {
		System.out.println("printAll");
	}
	public void method1(String name) {
		System.out.println(name+"name�̿�");
		
	}
	public void method1(String name, int age) {
		System.out.println(name+age);
	}
}
