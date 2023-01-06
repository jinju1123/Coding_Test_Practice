package com.lec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lec.board.common.SearchVO;
import com.lec.board.service.BoardService;
import com.lec.board.vo.BoardVO;



@Controller
@PropertySource("classpath:config/uploadpath.properties")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@Autowired
	Environment environment;

	private String uploadFolder = "";
	
	@RequestMapping("getBoardList.do")
	public String getBoardList(Model model, SearchVO searchVO,
			@RequestParam(defaultValue="1") int curPage,
			@RequestParam(defaultValue="10") int rowSizePerPage,
			@RequestParam(defaultValue="") String searchCategory,
			@RequestParam(defaultValue="") String searchType,
			@RequestParam(defaultValue="") String searchWord) {
		
		searchVO.setTotalRowCount(boardService.getTotalRowCount(searchVO));
		searchVO.setCurPage(curPage);
		searchVO.setRowSizePerPage(rowSizePerPage);
		searchVO.setSearchCategory(searchCategory);
		searchVO.setSearchType(searchType);
		searchVO.setSearchWord(searchWord);
		searchVO.pageSetting();
	
		List<BoardVO> boardList = boardService.getBoardList(searchVO);
		model.addAttribute("searchVO", searchVO);
		model.addAttribute("boardList", boardList);		
		return "board/getBoardList.jsp";
	}
	
	
	
}
