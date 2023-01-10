package com.lec.board.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lec.board.common.SearchVO;
import com.lec.board.mapper.BoardRowMapper;
import com.lec.board.vo.BoardVO;


@Repository("boardDAO")
@PropertySource("classpath:config/boardsql.properties")
public class BoardDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	Environment environment;
	
	private String sql = "";
	private String selectByUbdNo = "select * from bdtest where ubd_no = ?";
	private String selectBoardList = "select * from bdtest order by ubd_no desc limit ?, ?";
	private String selectBoardListByUbdSubject = "select * from bdtest where 1=1 and ubd_subject like ? order by ubd_no desc limit ?, ?";
	private String selectBoardListByMemberNick = "select * from bdtest where 1=1 and member_nick like ? order by ubd_no desc limit ?, ?";
	private String selectBoardListByUbdContent = "select * from bdtest where 1=1 and ubd_content like ? order by ubd_no desc limit ?, ?";
	private String boardTotalRowCount = "select count(*) from bdtest where 1=1";
	private String insertBoard = "insert into bdtest(ubd_dogType, ubd_subject, ubd_content, ubd_file) values(?, ?, ?, ?)";
	private String updateCount = "update bdtest set ubd_readcount = ubd_readcount + 1 where ubd_no=?";
	private String updateBoard = "update bdtest set ubd_subject=?, ubd_content=? where ubd_no=?";

	public BoardVO getBoard(BoardVO board) {
		Object[] args = { board.getUbd_no() };		
		return (BoardVO) jdbcTemplate.queryForObject(selectByUbdNo, args, new BoardRowMapper());
	}

	public BoardVO insertBoard(BoardVO board) {
		jdbcTemplate.update(insertBoard, board.getUbd_dogType(), board.getUbd_subject(), board.getUbd_content(), board.getUbd_file());
		return board;
	}

	public int deleteBoard(BoardVO board) {
		return 0;
	}

	public int updateBoard(BoardVO board) {
		return jdbcTemplate.update(updateBoard, board.getUbd_subject(), board.getUbd_content(), board.getUbd_no());
	}

	public void updateCount(int ubd_no) {
		jdbcTemplate.update(updateCount, ubd_no);
	}

	public int getTotalRowCount(SearchVO searchVO) {
		
		if(searchVO.getSearchType()==null || searchVO.getSearchType().isEmpty() ||
				searchVO.getSearchWord()==null || searchVO.getSearchWord().isEmpty()) {
			sql = boardTotalRowCount;
			searchVO.setSearchType("ubd_subject");
		} else {			
			if(searchVO.getSearchType().equalsIgnoreCase("ubd_subject")) {
				sql = boardTotalRowCount + " and title like '%" + searchVO.getSearchWord() + "%'";
			} else if(searchVO.getSearchType().equalsIgnoreCase("member_nick")) {
				sql = boardTotalRowCount + " and writer like '%" + searchVO.getSearchWord() + "%'";
			} else if(searchVO.getSearchType().equalsIgnoreCase("ubd_content")) {
				sql = boardTotalRowCount + " and content like '%" + searchVO.getSearchWord() + "%'";
			}	
		}
		return jdbcTemplate.queryForInt(sql);
	}

	public List<BoardVO> getBoardList(SearchVO searchVO) {
		if(searchVO.getSearchType()==null || searchVO.getSearchType().isEmpty() ||
				searchVO.getSearchWord()==null || searchVO.getSearchWord().isEmpty()) {
			sql = selectBoardListByUbdSubject;
			searchVO.setSearchType("ubd_subject");
		} else {
			if(searchVO.getSearchType().equalsIgnoreCase("ubd_subject")) {
				sql = selectBoardListByUbdSubject;
			} else if(searchVO.getSearchType().equalsIgnoreCase("member_nick")) {
				sql = selectBoardListByMemberNick;
			} else if(searchVO.getSearchType().equalsIgnoreCase("ubd_content")) {
				sql = selectBoardListByUbdContent;
			} 					
		}
		
		String searchWord = "%" + searchVO.getSearchWord() + "%";					
		Object[] args = {searchWord, searchVO.getFirstRow(), searchVO.getRowSizePerPage()};
		return jdbcTemplate.query(sql, args, new BoardRowMapper());
	}
	
	
	
}
