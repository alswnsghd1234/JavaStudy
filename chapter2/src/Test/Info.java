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
			
			return ("�ֹ� ���� ��ȣ :" + orderId+ "�ֹ� �ڵ��� ��ȣ :" + phoneNum +"�ֹ� �� �ּ� :"+address +"�ֹ� ��¥ :"+date +"�ֹ� �ð� :"+time +"�ֹ� ���� :"+price +"�ֹ� ��ȣ :"+menuNum);
			}
}