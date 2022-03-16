package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student {
	
	private String name;
	private int age;
	private int score;
	public Student() {
		super();
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
	/*
	 * equals�� hashCode�� �������̵��ؼ� ���� Ŭ�������� ���ϱ�
	 * ���ڿ�.equals(���� ���ڿ�);
	 * */
	
	
	//���� set���� ���� ��ü���� Ȯ���ϴ� ���
//	@Override
//	public boolean equals(Object obj) {
//		if(this==obj) { //���簴ü�� �񱳰�ü�� �ּҰ��� ��ġ(���� ���� �����ϰ� ���� == ���� ��ü��(�ʵ尪�� �翬�� ����)
//			return true; //�ߺ����̴ϱ� �߰��ϸ� �ȵ� 
//		}
//		return false;
//	}
	
//	��ü�� �ּҰ� ���� ���� �ʵ��ʱ�ȭ ���� ������ �������� �ߺ����Ÿ� �ϰ� �;�� 
//	�׷����� �����ִ� �� �ּҰ��� ���ϴ� �������δ� �Ҽ��� ���ݾƿ�? 
//	�׷��� ���Ӱ� �����Ǹ� �ؼ� ���ǵ��� �߰��ϴ°̴ϴ� .
	
	//���� �ּҰ��� ���ϰ� ������ �ƴ϶� ���� ��ҵ��� ���ϰ� �; ���Ӱ� ������ �ϴ��� (������ ���� ���� ���� ��ü���� Ȯ��)
	//�ߺ����� ���ϴ� ���� = equals �� hashcode�񱳰� ���� true���� ���� ��ü��� �Ǵ��� 
	//������ü��� �ǴܵǸ� �߰����� ���� 
	/*
	
	@Override 
	public boolean equals(Object obj) {
		
		//��� ���빰�� ���غ��� 
		//���� ��ü�� ���޹��� ��ü ��
		if(this==obj) { //���簴ü�� �񱳰�ü�� �ּҰ��� ��ġ(���� ���� �����ϰ� ���� == ���� ��ü��(�ʵ尪�� �翬�� ����)
			return true; //�ߺ����̴ϱ� �߰��ϸ� �ȵ� 
		}
		if(obj==null) { //�񱳴���� null�ϰ�� -> Student�� null�̶� ���İ� ������ �翬�� �ƴϴ�
			return false; //�ߺ����� �ƴϴϱ� �߰��Ҽ��ִ�.
		}
		if(getClass()!=obj.getClass()) { // Ÿ�� ���ؼ� Ÿ���� �ٸ��� �翬�� �ٸ� ��ü�̱� ���� 
										 //  (getClass �޼ҵ�� Ÿ���� ��ȯ�ؼ� ��)
			return false; //�ߺ����� �ƴϴϱ� �߰��Ҽ��ִ�. 
		}
		//Object �� equals = ��ü �ּҺ� 
		//String �� equals = ���ڿ��� �� (Object�� equals�� ������(overriding)�� 
		//�����ϴ� equals = ��ü ���� ��Ұ� �� (Object�� equals�� ������(overriding)��
		
		//������� �����´ٸ� ���� ��ü(�ּҰ��� ����)�� �ƴϰ� �񱳴���� null�� �ƴϰ� Ŭ���� Ÿ���� ���� ���
		//������� ���� ��Ҹ� ���غ� ��ġ�� �ִ�.
		
		//�� ���� ��Ҹ� ���غ��� 
		Student other = (Student)obj;
		
		//null �� ��� ��
		if(name==null) { //���� ��ü�� name�ʵ尡 null�� ���
			if(other.name!=null) { //�Է¹��� ��ü�� name�� null�� �ƴҰ�� ���� �����ϱ� false ��ȯ���� ��
				return false;
			}
		}else if(!name.equals(other.name)) {// ���� ��ü�� name�� �񱳴���� name�� �ٸ��ٸ� false��ȯ
			return false;
		}
		if(age != other.age) {
			return false;
		}
		if(score != other.score) {
			return false;
		}
		return true; //��� ������ �����ϸ� ���� ���� ���� ��ü�� �ǴܵǴ� true�� ��ȯ

	}
	@Override
	public int hashCode() {
		
		//��� �ʵ尪�� �ϳ��� ���ڿ��� ���� hashCode �� ��ȯ
		return (name+age+score).hashCode(); // String Ŭ������ hashcode�� ���
	}
	*/
	
	
	

}
