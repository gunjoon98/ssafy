package com.ssafy.ws.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ssafy.ws.dto.Member;

@Repository
public class MemberDaoImpl implements MemberDao {

	private DataSource ds;
	private SqlSession sqlSession;
	
	public MemberDaoImpl(DataSource ds, SqlSession sqlSession) {
		super();
		this.ds = ds;
		this.sqlSession = sqlSession;
	}
	
	@Override
	public Member login(Member member) throws SQLException {
		return sqlSession.selectOne("MemberMapper.login", member);
	}
}
