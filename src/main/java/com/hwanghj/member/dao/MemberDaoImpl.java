package com.hwanghj.member.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberDaoImpl implements MemberDao{

	public String getMemberName() {
		return "황현정";
	}
	
}
