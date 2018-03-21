package com.hwanghj.member.web;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hwanghj.member.service.MemberService;

public class MemberController {
	
	public static void main(String[] args) {
		
		
		AbstractXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
		
		MemberService memberService = 
				ctx.getBean("memberServiceImpl", MemberService.class);
		
		
		
		String memberName = memberService.getMemberName();
		System.out.println(memberName);
	}

}
