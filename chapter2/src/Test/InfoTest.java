package Test;

public class InfoTest {
	
	public static void main(String[] args) {
		
		Info orderIfo = new Info();
		
		orderIfo.orderId = 202023131;
		orderIfo.phoneNum = 01023233323;
		orderIfo.address = "서울시 강남구 역삼동";
		orderIfo.date = 2020323;
		orderIfo.time = 130234;
		orderIfo.price = 35000;
		orderIfo.menuNum = 0003;
		
	System.out.println(orderIfo.showInfo());{
	}
	}
}