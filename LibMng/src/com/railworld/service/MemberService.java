package com.railworld.service;


import java.security.Guard;
import java.util.List;

import com.railworld.dao.MemberDaoImp;
import com.railworld.model.Member;

public class MemberService {
	private MemberDaoImp mdi;
	public MemberService(MemberDaoImp mdi) 
	{
		this.mdi=mdi;
		
	}
	public  List<Member> Memdata()
	{
		return mdi.Memdata();
		
	}
	public void createGuard(Guard guard)
	{
		mdi.createGuard(guard);
		
	}
	public void addMembers(Member mem)
	{
		mdi.addMembers(mem);;
	}
	public void updateMem(Member mem)
	{
		mdi.updateMem(mem);
	}
	public void deleteGuard(int gId)
	{
		mdi.deleteMem(gId);
	}
}
	
