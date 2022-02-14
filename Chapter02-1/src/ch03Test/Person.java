package ch03Test;

public class Person {
	
	int weight;
	int height;
	String gender;
	String personName;
	int age;
	
	void showInfo()
	{
		System.out.println("키가"+height+"이고 몸무게가 "+weight+"킬로인 "+gender+"가 있습니다. 이름은 "+personName+"이고 나이는"+age+"입니다.");
	}
}
