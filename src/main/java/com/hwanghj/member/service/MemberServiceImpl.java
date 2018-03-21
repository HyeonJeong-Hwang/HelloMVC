package com.hwanghj.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.hwanghj.member.dao.MemberDao;

@Component
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	@Qualifier("memberDaoImplEnglish")
	private MemberDao memberDao;
	
	
	public String getMemberName() {
		return memberDao.getMemberName();
	}

}
