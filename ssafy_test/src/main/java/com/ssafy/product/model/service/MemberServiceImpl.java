package com.ssafy.product.model.service;

import org.springframework.stereotype.Service;

import com.ssafy.product.dto.Member;
import com.ssafy.product.model.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	private final MemberMapper memberMapper;

	public MemberServiceImpl(MemberMapper memberMapper) {
		super();
		this.memberMapper = memberMapper;
	}
	
	public Member login(Member member) {
		return memberMapper.login(member);
	}
}
