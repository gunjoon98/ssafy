package com.ssafy.ws.model.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.ssafy.ws.dto.Member;
import com.ssafy.ws.model.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	MemberMapper memberMapper;
	
	public MemberServiceImpl(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
	@Override
	public Member login(Member member) throws SQLException {
		return memberMapper.login(member);
	}
}
