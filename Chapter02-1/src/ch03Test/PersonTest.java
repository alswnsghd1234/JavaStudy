package ch03Test;

public class PersonTest {

	public static void main(String[] args) {

		Person person = new Person();
		
		person.height = 180;
		person.weight = 78;
		person.gender = "³²¼º";
		person.personName = "Tomas";
		person.age = 37;
		
		person.showInfo();
	}

}
