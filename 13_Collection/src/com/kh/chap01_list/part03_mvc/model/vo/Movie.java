package com.kh.chap01_list.part03_mvc.model.vo;

public class Movie {

	private String title;
	private String openday;
	
	public Movie() {
		super();
	}

	public Movie(String title, String openday) {
		super();
		this.title = title;
		this.openday = openday;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOpenday() {
		return openday;
	}

	public void setOpenday(String openday) {
		this.openday = openday;
	}

	@Override
	public String toString() {
		return "movie [title=" + title + ", openday=" + openday + "]";
	}
	
	
}
