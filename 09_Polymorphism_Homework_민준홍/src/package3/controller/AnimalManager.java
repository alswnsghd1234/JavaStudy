package package3.controller;

import package3.Animal;
import package3.Cat;
import package3.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		
		Animal[] a = new Animal[5];
		
		a[0] = new Dog("�ɲ�","��",2);
		a[1] = new Dog("����","��",2);
		a[2] = new Cat("������","��","��õ","�Ͼ�");
		a[3] = new Dog("�ɿ���","��",2);
		a[4] = new Cat("�ɲ���","��","���","����");
		
		
		for(int i=0;i<a.length;i++) {
			a[i].speak();
		}
				
	}
}
