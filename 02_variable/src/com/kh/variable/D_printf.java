package com.kh.variable;

public class D_printf {
	

	/*
	 * System.out.printf(����ϰ��� �ϴ� ����, ����ϰ��� �ϴ� ��)
	 * => f �� format (����)
	 * 
	 *  %d : ����
	 *  %f : �Ǽ�
	 *  %c : ����
	 *  %s : ���ڿ�
	 *  
	 *  */
	
	//���� �׽�Ʈ
public void printfTest() {
	int iNum1 = 10;
	int iNum2 = 20;
	
	//iNum1 : xx, iNum2 : xx ���
	
	System.out.println("iNum : "+iNum1+" , iNum2 : "+ iNum2);
	
	// printf ���
	
	System.out.printf("iNum1 : %d, iNum2 : %d \n",iNum1,iNum2);
	
	// 10 + 20 = 30�� ����غ���
	
	// 1.println ���
	// 2.printf ���
	
	int jNum1 = 10;
	int jNum2 = 20;
	
	System.out.println("jNum1 : "+jNum1+" , jNum1: "+jNum1);
	System.out.printf("jNum1 : %d, jNum2 : %d \n",jNum1,jNum2);
	
	double dNum = 4.1234514;
	System.out.printf("dNum : %f \n", dNum);
	
	System.out.printf("dNum : %.1f \n", dNum);
	//%.1f : �Ҽ��� �Ʒ� 2��° �ڤӿ��� �ݿø��Ǿ� �Ҽ��� 1��° �ڸ����� ���
	// .x�� �ڸ��� �����
	
	//printf : ���� �� �ѹ� ���÷� �����ϰ� ��� ����.
	//��, ������ ������ ������ ����, �ڿ� ���� ������ ����
	
	

}
}