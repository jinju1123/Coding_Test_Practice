package com.lec.board.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lec.board.vo.BoardVO;

public class BoardRowMapper implements RowMapper<BoardVO>{
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO board = new BoardVO();
		board.setMember_no(rs.getInt("member_no"));
		board.setMember_nick(rs.getString("member_nick"));
		board.setUbd_no(rs.getInt("ubd_no"));
		board.setUbd_dogType(rs.getString("ubd_dogType"));
		board.setUbd_subject(rs.getString("ubd_subject"));
		board.setUbd_content(rs.getString("ubd_content"));
		board.setUbd_readcount(rs.getInt("ubd_readcount"));
		board.setUbd_regdate(rs.getDate("ubd_regdate"));
		board.setUbd_file(rs.getString("ubd_file"));
		board.setUbd_like_cnt(rs.getInt("ubd_like_cnt"));
		return board;
	}
}
