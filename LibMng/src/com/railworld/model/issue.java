package com.railworld.model;

public class issue {
	private int isId;
	private String isDate;
	private String subDate;
	public int getIsId() {
		return isId;
	}
	public void setIsId(int isId) {
		this.isId = isId;
	}
	public String getIsDate() {
		return isDate;
	}
	public void setIsDate(String isDate) {
		this.isDate = isDate;
	}
	public String getSubDate() {
		return subDate;
	}
	public void setSubDate(String subDate) {
		this.subDate = subDate;
	}
	@Override
	public String toString() {
		return "issue [isId=" + isId + ", isDate=" + isDate + ", subDate=" + subDate + "]";
	}
	public issue(int isId, String isDate, String subDate) {
		super();
		this.isId = isId;
		this.isDate = isDate;
		this.subDate = subDate;
	}
	public issue() {
		
		// TODO Auto-generated constructor stub
	}
	

}
