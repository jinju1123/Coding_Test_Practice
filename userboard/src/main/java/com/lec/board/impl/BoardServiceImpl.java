package com.lec.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lec.board.common.SearchVO;
import com.lec.board.dao.BoardDAO;
import com.lec.board.service.BoardService;
import com.lec.board.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	@Override
	public BoardVO insertBoard(BoardVO board) {
		return boardDAO.insertBoard(board);
	}

	@Override
	public int deleteBoard(BoardVO board) {
		return boardDAO.deleteBoard(board);
	}

	@Override
	public int updateBoard(BoardVO board) {
		return boardDAO.updateBoard(board);
	}

	@Override
	public void updateCount(BoardVO board) {
		boardDAO.updateCount(board);
	}

	@Override
	public int getTotalRowCount(SearchVO searchVO) {
		return boardDAO.getTotalRowCount(searchVO);
	}

	@Override
	public List<BoardVO> getBoardList(SearchVO searchVO) {
		return boardDAO.getBoardList(searchVO);
	}

}
