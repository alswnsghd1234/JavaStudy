class Parent {
	void parentMethod() { }

	void parentmethod() {
		// TODO Auto-generated method stub
		
	}
}

class Child extends Parent {
	@Override
	void parentmethod() { } // 조상 메서드의 이름을 잘못 적었음. 
}