package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu extends StudentController{

	private StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println("======�л� ���� ���=======");
		
		
		for(int i=0;i<ssm.printStudent().length;i++) {
			System.out.printf("�̸� : %s / ���� : %s / ���� : %d \n",ssm.printStudent()[i].getName(),ssm.printStudent()[i].getSubject(),ssm.printStudent()[i].getScore());
		}
		
		System.out.println("======�л� ���� ���=======");
		
		System.out.printf("�л� ���� �հ� : %d \n",ssm.sumScore());
		System.out.printf("�л� ���� ��� : %f \n",ssm.avgScore()[1]);
		
		System.out.println("======���� ��� ���=======");
		
		for(int i=0;i<printStudent().length;i++)
			if(ssm.printStudent()[i].getScore()<CUT_LINE) {
				System.out.println(ssm.printStudent()[i].getName()+"�� ����� ���");
			}
			else {
				System.out.println(ssm.printStudent()[i].getName()+"�� ���");
			}
	}
	
	
}
