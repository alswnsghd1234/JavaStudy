package Test;

	public class Info {
		
		public int orderId;
		public long phoneNum;
		public String address;
		public int date;
		public int time;
		public int price;
		public int menuNum;
			
		public String showInfo() {
			
			return ("주문 접수 번호 :" + orderId+ "주문 핸드폰 번호 :" + phoneNum +"주문 집 주소 :"+address +"주문 날짜 :"+date +"주문 시간 :"+time +"주문 가격 :"+price +"주문 번호 :"+menuNum);
			}
}