package com.railworld.model;

public class Librarian {
	private int lId;
	private String name;
	private int workdays;
	@Override
	public String toString() {
		return "Librarian [lId=" + lId + ", name=" + name + ", workdays=" + workdays + "]";
	}
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWorkdays() {
		return workdays;
	}
	public void setWorkdays(int workdays) {
		this.workdays = workdays;
	}
	public Librarian(int lId, String name, int workdays) {
		super();
		this.lId = lId;
		this.name = name;
		this.workdays = workdays;
	}
	public Librarian() {
		
		// TODO Auto-generated constructor stub
	}
	

}
