package com.railworld.model;

public class Member {
	private int mId;
	private String name;
	private long contact;
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Member [mId=" + mId + ", name=" + name + ", contact=" + contact + "]";
	}
	public Member(int mId, String name, long contact) {
		super();
		this.mId = mId;
		this.name = name;
		this.contact = contact;
	}
	public Member() {
		
		// TODO Auto-generated constructor stub
	}
	

}
