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
	 * equals와 hashCode를 오버라이딩해서 같은 클래스인지 비교하기
	 * 문자열.equals(비교할 문자열);
	 * */
	
	
	//기존 set에서 같은 객체인지 확인하는 방법
//	@Override
//	public boolean equals(Object obj) {
//		if(this==obj) { //현재객체와 비교객체의 주소값이 일치(같은 곳을 참조하고 있음 == 같은 객체다(필드값이 당연히 같다)
//			return true; //중복값이니까 추가하면 안됨 
//		}
//		return false;
//	}
	
//	객체가 주소값 말고 같은 필드초기화 값을 가지고 있을때도 중복제거를 하고 싶어요 
//	그럴려면 위에있는 저 주소값만 비교하는 구문으로는 할수가 없잖아요? 
//	그래서 새롭게 재정의를 해서 조건들을 추가하는겁니다 .
	
	//단지 주소값만 비교하고 싶은게 아니라 내부 요소들을 비교하고 싶어서 새롭게 재정의 하는중 (목적은 같은 값을 가진 객체인지 확인)
	//중복인지 비교하는 로직 = equals 와 hashcode비교가 전부 true여야 같은 객체라고 판단함 
	//같은객체라고 판단되면 추가하지 않음 
	/*
	
	@Override 
	public boolean equals(Object obj) {
		
		//모든 내용물을 비교해보기 
		//현재 객체와 전달받은 객체 비교
		if(this==obj) { //현재객체와 비교객체의 주소값이 일치(같은 곳을 참조하고 있음 == 같은 객체다(필드값이 당연히 같다)
			return true; //중복값이니까 추가하면 안됨 
		}
		if(obj==null) { //비교대상이 null일경우 -> Student랑 null이랑 같냐고 물으면 당연히 아니다
			return false; //중복값이 아니니까 추가할수있다.
		}
		if(getClass()!=obj.getClass()) { // 타입 비교해서 타입이 다르면 당연히 다른 객체이기 때문 
										 //  (getClass 메소드로 타입을 반환해서 비교)
			return false; //중복값이 아니니까 추가할수있다. 
		}
		//Object 의 equals = 객체 주소비교 
		//String 의 equals = 문자열값 비교 (Object의 equals를 재정의(overriding)함 
		//지금하는 equals = 객체 내부 요소값 비교 (Object의 equals를 재정의(overriding)함
		
		//여기까지 내려온다면 같은 객체(주소값이 같은)가 아니고 비교대상이 null이 아니고 클래스 타입이 같은 경우
		//여기부턴 내부 요소를 비교해볼 가치가 있다.
		
		//각 내부 요소를 비교해보자 
		Student other = (Student)obj;
		
		//null 일 경우 비교
		if(name==null) { //현재 객체의 name필드가 null일 경우
			if(other.name!=null) { //입력받은 객체의 name이 null이 아닐경우 같지 않으니까 false 반환으로 끝
				return false;
			}
		}else if(!name.equals(other.name)) {// 현재 객체의 name과 비교대상의 name이 다르다면 false반환
			return false;
		}
		if(age != other.age) {
			return false;
		}
		if(score != other.score) {
			return false;
		}
		return true; //모든 조건을 충족하면 같은 값을 가진 객체로 판단되니 true를 반환

	}
	@Override
	public int hashCode() {
		
		//모든 필드값을 하나의 문자열로 만들어서 hashCode 후 반환
		return (name+age+score).hashCode(); // String 클래스의 hashcode를 사용
	}
	*/
	
	
	

}
