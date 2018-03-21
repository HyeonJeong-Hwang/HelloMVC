package com.hwanghj.member.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberDaoImplEnglish implements MemberDao{

	@Override
	public String getMemberName() {
		return "Hwang Hyeon Jeong";
	}
	

}
