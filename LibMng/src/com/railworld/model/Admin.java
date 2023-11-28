package com.railworld.model;

public class Admin {
	private int aid;
	private String Name;
	private String password;
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public Admin(int aid, String name, String password) {
		super();
		this.aid = aid;
		Name = name;
		this.password = password;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", Name=" + Name + ", password=" + password + "]";
	}
	
	

}
