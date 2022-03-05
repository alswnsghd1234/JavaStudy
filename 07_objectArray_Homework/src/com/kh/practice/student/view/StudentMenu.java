package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu extends StudentController{

	private StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println("======학생 정보 출력=======");
		
		
		for(int i=0;i<ssm.printStudent().length;i++) {
			System.out.printf("이름 : %s / 과목 : %s / 점수 : %d \n",ssm.printStudent()[i].getName(),ssm.printStudent()[i].getSubject(),ssm.printStudent()[i].getScore());
		}
		
		System.out.println("======학생 정보 출력=======");
		
		System.out.printf("학생 점수 합계 : %d \n",ssm.sumScore());
		System.out.printf("학생 점수 평균 : %f \n",ssm.avgScore()[1]);
		
		System.out.println("======성적 결과 출력=======");
		
		for(int i=0;i<printStudent().length;i++)
			if(ssm.printStudent()[i].getScore()<CUT_LINE) {
				System.out.println(ssm.printStudent()[i].getName()+"은 재시험 대상");
			}
			else {
				System.out.println(ssm.printStudent()[i].getName()+"은 통과");
			}
	}
	
	
}
