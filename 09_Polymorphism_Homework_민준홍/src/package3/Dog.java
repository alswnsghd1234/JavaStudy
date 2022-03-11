package package3;

public class Dog extends Animal {

	public static final String PLACE ="애견카페";
	private int weight;
	
	
	public Dog() {
		super();
	}
	
	public Dog(String name,String kinds,int weight) {
		super(name,kinds);
		this.weight=weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void speak(){
		System.out.println(super.toString()+ weight + "kg 입니다.");
	}
	
	
}
