package com.ssafy.ws.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ssafy.ws.dto.Book;

@Repository
public class BookDaoImpl implements BookDao {

	private DataSource ds;
	private SqlSession sqlSession;
	
//	@Autowired	생략가능
	public BookDaoImpl(DataSource ds, SqlSession sqlSession) {
		super();
		this.ds = ds;
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<Book> selectAll() throws SQLException {
		return sqlSession.selectList("BookMapper.selectAll");
	}

	@Override
	public Book selectByNo(int no) throws SQLException {
		return sqlSession.selectOne("BookMapper.selectBook", no);
	}

	@Override
	public int registBook(Book book) throws SQLException {
		return sqlSession.insert("BookMapper.insertBook", book);
	}

	@Override
	public int deleteByNo(int no) throws SQLException {
		return sqlSession.delete("BookMapper.deleteBook", no);
	}
}
