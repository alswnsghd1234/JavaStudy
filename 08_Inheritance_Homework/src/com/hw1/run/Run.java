package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student[] arr = new Student[3];
		
		
		arr[0] = new Student("홍길동",20,178.2,70.0,1,"정보스시스템공학과");
		arr[1] = new Student("김말똥",21,187.3,80.0,2,"경영학과");
		arr[2] = new Student("강개순",20,167.0,45.0,4,"정보스시스템공학과");
		
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i].information());
		}
		
		Employee[] arr2 = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
	
		while(true) {
				for(int j=0; j<arr2.length;j++) {
					
					System.out.println("이름 입력하시오.");
					String name = sc.next();
					System.out.println("나이 입력하시오.");
					int age = sc.nextInt();
					System.out.println("키 입력하시오.");
					double height = sc.nextDouble();
					System.out.println("몸무게 입력하시오.");
					double weight = sc.nextDouble();
					System.out.println("급여 입력하시오.");
					int salary = sc.nextInt();
					System.out.println("빚 입력하시오.");
					String dept = sc.next();
					arr2[j] = new Employee(name , age , height , weight , salary , dept);
					sc.nextLine();
					System.out.println("y or n?");
					char str = sc.next().charAt(0);
					if(str=='y') {
						continue;
			}
					else {
						for(int i1=0;i1<arr2.length;i1++) {
							if(!(arr2[i1]==null)) {
							System.out.println(arr2[i1].information());
							}
							else {
								return;
							}
						}
						break;
					}
			}
		}
		}
	
}
