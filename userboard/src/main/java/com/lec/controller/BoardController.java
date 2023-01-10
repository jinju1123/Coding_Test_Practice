package com.lec.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	
	@RequestMapping("*/insertBoard.do")
	public String insertBoard(BoardVO board) throws IOException {
		MultipartFile uploadFile = board.getUploadFile();
		if (!uploadFile.isEmpty()) {
			String ubd_file = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File(uploadFolder + ubd_file));
			board.setUbd_file(ubd_file);
		}	
		boardService.insertBoard(board);
		return "redirect:/getBoardList.do";
	}	
	
	@RequestMapping(value="/updateBoard.do", method=RequestMethod.GET)
	public String updateBoard(Model model, BoardVO board, SearchVO searchVO, @RequestParam int ubd_no) {
		model.addAttribute("searchVO", searchVO);
		model.addAttribute("board", boardService.getBoard(board));
		boardService.updateCount(ubd_no);
		return "board/updateBoard.jsp";
	}
	
	@RequestMapping(value="/updateBoard.do", method=RequestMethod.POST)
	public String updateBoard(BoardVO board) {
		boardService.updateBoard(board);
		return "getBoardList.do";
	}	
	
	
}
