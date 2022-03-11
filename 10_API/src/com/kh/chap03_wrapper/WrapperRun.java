package com.kh.chap03_wrapper;

public class WrapperRun {

	public static void main(String[] args) {
		
		/*
		 * Wrapper Ŭ����
		 * ->�⺻�ڷ����� ��ü�� �������ִ� Ŭ�������� ����Ŭ������� �մϴ�
		 * 
		 * �⺻�ڷ���							WrapperŬ����
		 * boolean            <-----> 	     Boolean    
		 * char								 Character			
		 * byte								 Byte
		 * short						     Short
		 * int								 Integer
		 * long								 Long
		 * float						     Float
		 * double							 Double
		 * 
		 * */
		
		int num1 = 10;
		int num2 = 15;
		
		//���࿡ num1�� num2�� ����� �ϰ�ʹ�?
		System.out.println(num1==num2);//����� ������ ���
//		System.out.println(num1.equals(num2)); �̷��� �޼ҵ带 ȣ���ؼ� ����ϰ� �;��...
		
		//Wrapper Ŭ������ ��ȯ�ϸ� �޼ҵ� ��밡��!
		//�⺻�ڷ��� -> WrapperŬ���� �ڷ������� ��ȯ�ϴ°� (Boxing)
		
		Integer i1 = num1;
		Integer i2 = num2;
		
		System.out.println(i1.equals(i2));
		//a.compareTo(b)  a�� b���� ũ�� 1��ȯ b�� �� ũ�� -1 ��ȯ ������ 0�� ��ȯ�ϴ� �޼ҵ�
		System.out.println(i1.compareTo(i2)); 
		
		//Wrapper Ŭ�����ڷ��� -> �⺻�ڷ���(Unboxing)
		int num3 =i1; //int������ 10
		int num4 =i2; //15
		
		System.out.println("num3 + num4 : "+(num3+num4));
	
		//�⺻�ڷ��� <->String(���ڿ�)
		
		String str1 ="10"; //int������ 
		String str2 ="20.5"; // double������
		
		System.out.println("str1+str2 : "+(str1+str2));
		
		//1.String ���� �⺻�ڷ������� : �Ľ��Ѵ� 
		//[ǥ����] �ش�WrapperŬ�����̸�.parseXXX(��ȯ�ҹ��ڿ�);
		int i=Integer.parseInt(str1);  //"10" -> 10
		double d =Double.parseDouble(str2); //"20.5" -> 20.5
		
		System.out.println("���� ���ڷ� ���߳���? i+d : "+(i+d));
		
		//2.�⺻�ڷ����� String������
		//->String.valuOf(��ȯ�ұ⺻�ڷ�����) : ��ȯ�� String
		String strI = String.valueOf(i); //10 -> "10"
		String strD = String.valueOf(d); //20.5 -> "20.5"
		
		System.out.println("strI+strD : ���� ���ڿ��� �Ǿ��°� "+(strI+strD));
		
	}

}
