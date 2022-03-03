package com.kh.chap01_oneVsmany.model.vo;

public class Book {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	Book(){
		
	}
	public Book(String title,String publisher,String author,int price,double discountRate){
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	public Book(String title,String publisher,String author){
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public void showInfo() {
		System.out.printf("이 책의 제목은 %s이고 발행자는 %s이고,저자는 %s입니다.가격은 %d이고 할인률은 %f입니다",title,publisher,author,price,discountRate);
	}
	
}
