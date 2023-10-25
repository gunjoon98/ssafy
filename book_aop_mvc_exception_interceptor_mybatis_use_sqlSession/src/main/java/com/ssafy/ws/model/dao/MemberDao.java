package com.ssafy.ws.model.dao;

import java.sql.SQLException;

import com.ssafy.ws.dto.Member;

public interface MemberDao {

	Member login(Member member) throws SQLException;
}
