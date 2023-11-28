package com.railworld.model;

public class Books {

	private int bId;
	private String name;
	private String author;
	private int copies;
	@Override
	public String toString() {
		return "Books [bId=" + bId + ", name=" + name + ", author=" + author + ", copies=" + copies + "]";
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	public Books() {
		
		// TODO Auto-generated constructor stub
	}
	public Books(int bId, String name, String author, int copies) {
		super();
		this.bId = bId;
		this.name = name;
		this.author = author;
		this.copies = copies;
	}
	
}
