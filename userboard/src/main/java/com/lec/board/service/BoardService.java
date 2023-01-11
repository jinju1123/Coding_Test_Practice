package com.lec.board.service;

import java.util.List;

import com.lec.board.common.SearchVO;
import com.lec.board.vo.BoardVO;



public interface BoardService {

	BoardVO getBoard(BoardVO vo);
	int getTotalRowCount(SearchVO searchVO);
	List<BoardVO> getBoardList(SearchVO searchVO);
	BoardVO insertBoard(BoardVO board);
	int deleteBoard(BoardVO board);
	int updateBoard(BoardVO board);
	void updateCount(int ubd_no);
	void likeCnt(int ubd_no);
	
}
