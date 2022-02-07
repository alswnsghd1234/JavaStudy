package ch07;

import java.io.Console;

public class Birthday {

	private int day;
	private int month;
	private int year;
	
	private boolean isValid;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month <1 || month >12)
		{
			isValid = false;
		}
		else{
			isValid= true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		switch(year/1) {
			case (12):
				System.out.println("year 의 범위를 벗어났습니다.")
				break;
			default:
				System.out.println("default");
		}
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year+"년"+ month+ "월"+ day +"일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 값입니다.");
		}
	}
}
