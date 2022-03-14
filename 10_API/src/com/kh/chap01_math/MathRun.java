package com.kh.chap01_math;

import java.util.Random;

public class MathRun {

	public static void main(String[] args) {
		
		/*MathŬ���� (���а� ���õ� ��ɵ�)
		 * MathŬ������ Ư¡
		 * -��� �ʵ�� �޼ҵ尡 �� static���� �Ǿ��ִ�.
		 * -���� ������ �ʿ䰡 �����Ƿ� �����ڰ� private
		 * -java.lang�̶�� ��Ű�� �ȿ� ����.
		 * */
		
		//�ʵ�
		//����  
//		System.out.println("���� : "+Math.PI);
		
		//�޼ҵ�
		//�޼ҵ��(�Ű�����Ÿ��) : ��ȯ��
		
		//1.�ø� -> Math.ceil(double) : ��ȯ�� - double
		double num1 = 4.349;
//		System.out.println("�ø� : "+Math.ceil(num1)); 
		
		//2.�ݿø� ->Math.round(double) : ��ȯ�� long
//		System.out.println("�ݿø� : "+Math.round(num1));
		
		//3. ���� ->Math.floor(double) : ��ȯ�� double
//		System.out.println("���� : "+Math.floor(num1));
		
		//4. ���밪 ->Math.abs(int/double/long/float) : ��ȯ�� int/double/long/float
		double num2 = -13.2;
//		System.out.println("���밪 : "+Math.abs(num2));

		//5. �ּҰ� ->Math.min(int,int) : ��ȯ�� int Ÿ�Ը��߱� ����Ÿ��=int/double/long/float
//		System.out.println("�ּҰ� : "+Math.min(5, 10));
		
		//6. �ִ밪 ->Math.max(double,double) : ��ȯ�� double Ÿ�Ը��߱�
//		System.out.println("�ִ밪 : "+Math.max(5.5, 50.5));
		
		//7. ������(��Ʈ) ->Math.sqrt(double) : ��ȯ�� double
//		System.out.println("4�� ������ : "+Math.sqrt(4));
	
		//8. ���� -> Math.pow(double,double) : ��ȯ�� double
//		System.out.println("2�� 10���� : "+Math.pow(2, 10));
		
		//9. ������ ->Math.random()
		//0.0~0.9999999 ���������� �ٲ����ϱ� 0~9
		int num;
		
//		for(int i=0; i<10;i++) {
//			num=(int) (Math.random()*100+1);	
//			System.out.println("������ : "+num);
//		}
		
		/*
		 * ���� static�̱� ������ ��ü������ �ʿ����. 
		 * */
		Random r = new Random();
		
		int random=r.nextInt(10/*����*/)+1;/*~����*/
		
		
	}
}
