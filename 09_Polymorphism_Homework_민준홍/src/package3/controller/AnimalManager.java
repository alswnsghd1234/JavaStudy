package package3.controller;

import package3.Animal;
import package3.Cat;
import package3.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		
		Animal[] a = new Animal[5];
		
		a[0] = new Dog("ÂÉ²¿","¿©",2);
		a[1] = new Dog("µþ±â","¿©",2);
		a[2] = new Cat("ºü³ª³ª","¿©","ÀÎÃµ","ÇÏ¾ç");
		a[3] = new Dog("ÂÉ¿À²¿","¿©",2);
		a[4] = new Cat("ÂÉ²¿¸Å","¿©","°æ±â","°ËÁ¤");
		
		
		for(int i=0;i<a.length;i++) {
			a[i].speak();
		}
				
	}
}
